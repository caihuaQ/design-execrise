package design.tutorials_19_0_2.mediator;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Resource {

    public static Reader getResourceAsReader(String resourcce) throws IOException{
        return new InputStreamReader(getResourceAsStream(resourcce));
    }

    private static InputStream getResourceAsStream(String resource) throws IOException{
        ClassLoader[] classLoaders = getClassLoders();
        for (ClassLoader classLoader : classLoaders) {
            InputStream inputStream = classLoader.getResourceAsStream(resource);
            if(null != inputStream){
                return inputStream;
            }
        }
        throw new IOException("Could not find resource" + resource);
    }

    private static ClassLoader[] getClassLoders(){
        return new ClassLoader[]{
                ClassLoader.getSystemClassLoader(),
                Thread.currentThread().getContextClassLoader()
        };
    }
}

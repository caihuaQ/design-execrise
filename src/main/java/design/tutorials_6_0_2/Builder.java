package design.tutorials_6_0_2;


import design.tutorials_6_0_0.ceiling.LevelOneCeiling;
import design.tutorials_6_0_0.ceiling.LevelTwoCeiling;
import design.tutorials_6_0_0.coat.DuluxCoat;
import design.tutorials_6_0_0.coat.LiBangCoat;
import design.tutorials_6_0_0.floor.ShengXiangFloor;
import design.tutorials_6_0_0.tile.DongPengTile;
import design.tutorials_6_0_0.tile.MarcoPoloTile;
import sun.java2d.loops.BlitBg;

public class Builder {

    public IMenu levelOne(Double area) {
        return new DecorationPackageMenu(area,"豪华欧式")
                .appendCeiling(new LevelTwoCeiling()) //吊顶，二级顶
                .appendCoat(new DuluxCoat())          //涂料，多乐士
                .appendFloor(new ShengXiangFloor());  //地板，圣象
    }

    public IMenu levelTwo(Double area) {
        return new DecorationPackageMenu(area,"轻奢田园")
                .appendCeiling(new LevelTwoCeiling()) //吊顶，二级顶
                .appendCoat(new LiBangCoat())         //涂料，立邦
                .appendFloor(new MarcoPoloTile());    //地板，马可波罗
    }

    public IMenu levelThree(Double area) {
        return new DecorationPackageMenu(area,"现代简约")
                .appendCeiling(new LevelOneCeiling()) //吊顶，一级顶
                .appendCoat(new LiBangCoat())         //涂料，立邦
                .appendFloor(new DongPengTile());     //地板，东鹏
    }
}

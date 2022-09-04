package design.tutorials_19_0_2.dao;

import design.tutorials_19_0_2.po.School;

public interface ISchoolDao {

    School querySchoolInfoById(Long treeId);

}

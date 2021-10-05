package com.Java8.mappertwoobjects;

import com.Java8.mappertwoobjects.models.QuestionnierCM;
import com.Java8.mappertwoobjects.models.SettingsCM;
import com.Java8.mappertwoobjects.models.SurveyCM;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ResourceMapper {


    public static List<QuestionnierCM> getQuestionniers(){
        List<QuestionnierCM> questionnierCMS = new ArrayList<>();
        questionnierCMS.add(new QuestionnierCM("2", "PHILIPS_SERVICE", "QUESTIONNAIRE", "Survey 2"));
        questionnierCMS.add(new QuestionnierCM("1", "STANDARD", "FORM", "Survey 1"));
        questionnierCMS.add(new QuestionnierCM("3", "CUSTOM", "FORM", "Survey 3"));

        return questionnierCMS;
    }

    public static List<SettingsCM> getSettings(){
        List<SettingsCM> settingsCMS = new ArrayList<>();
        settingsCMS.add(new SettingsCM("1", false, false, "survey"));
        settingsCMS.add(new SettingsCM("2", true, false, "survey"));
        settingsCMS.add(new SettingsCM("3", true, true, "survey"));

        return settingsCMS;
    }

    public static void main(String[] args) {
           List<SurveyCM> surveyCMS = surveyMapper(getSettings(), getQuestionniers());
         /*  for(SurveyCM surveyCM : surveyCMS){
               System.out.println(surveyCM.toString());
           }*/
    }


    public static List<SurveyCM> surveyMapper(List<SettingsCM> settingsCMS, List<QuestionnierCM> questionnierCMS){

/*         settingsCMS.forEach(e ->{
             questionnierCMS.forEach( q -> {
                 if (q.getQuestionnierId().equals(e.getSettingId())) {
                     surveyCMS.addAll(surveyMapper(e,q));
                 }
             });
         });*/

        Stream<List<SurveyCM>> listStream = settingsCMS.stream().map(e -> {
            List<SurveyCM> surveyCMS = new ArrayList<>();
            questionnierCMS.stream().filter(q -> q.getQuestionnierId().equals(e.getSettingId())).forEach(q -> {
                surveyCMS.add(surveyMapper(e, q));
            });
            return surveyCMS;
        });
        List<SurveyCM> surveyCMS = listStream.flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(surveyCMS);
        return surveyCMS;
    }

    private static SurveyCM surveyMapper(SettingsCM e, QuestionnierCM p) {
//        List<SurveyCM> surveyCMS = new ArrayList<>();
        SurveyCM surveyCM = new SurveyCM();
        surveyCM.setCategory(e.getCategory());
        surveyCM.setEnable(e.isEnable());
        surveyCM.setOverridden(e.isOverridden());
        surveyCM.setUsage(p.getUsage());
        surveyCM.setName(p.getName());
        surveyCM.setId(e.getSettingId());
        surveyCM.setType(p.getType());
//        surveyCMS.add(surveyCM);
        return surveyCM;
    }

}

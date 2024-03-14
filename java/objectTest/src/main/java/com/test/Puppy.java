package com.test;

public class Puppy {

    /* 강아지의 속성 : 이름(String), 재주(String[]) */
    private String name;
    private String [] skill;

    public Puppy() {}

    public Puppy(String name) {
        this.name = name;
    }

    public Puppy(String name, String[] skill) {
        this.name = name;
        this.skill = skill;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSkill(String[] skill) {
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public String[] getSkill() {
        return skill;
    }

    public void learnAblity(String[] ability) {
        this.skill = ability;

    }

    /* Dog의 반환 타입인 void인 메소드 호출 */
    public void doSomeThingVoid(String order){
        /* switch문 사용 작성 */

        //강아지는 할 수 있는 재주면 해당 재주를 출력하고,
        // 그렇지 않으면 '아직 못배운 재주에요'를 출력한다. (=Dog의 메소드 동작 내용)
        //{"앉아", "빵!!", "기다려"}
//        String name1 = getName();
        String name1 = this.name;
        String[] skillArr1 = getSkill();

        /* switch */
        switch (order) {
            case "앉아" :
                System.out.println(name1 + "는 '앉아'를 할 수 있어요. :) ");
                break;
            case "빵!!" :
                System.out.println(name1 + "는 '빵!!'을 할 수 있어요. :) ");
                break;
            case "기다려" :
                System.out.println(name1 + "는 '기다려'를 할 수 있어요. :) ");
                break;
            default :
                System.out.println(name1 + "는 " + order + "를 배우지 않았어요. :( ");
                break;
        }

        /* for */
        for(int i = 0; i < skillArr1.length; i++) {
            if(skillArr1[i].contains(order)) {
                System.out.println(name1 + "는 " + order + "를 할 수 있어요. :) ");
                return;
            }
        }
        System.out.println(name1 + "는 " + order + "를 배우지 않았어요. :( ");

    }

    /* Dog의 반환 타입을 String으로 변경한 메소드 호출 */
    public String doSomeThingString(String order){
        /* switch문 사용 작성 */

        //강아지는 할 수 있는 재주면 해당 재주를 출력하고,
        // 그렇지 않으면 '아직 못배운 재주에요'를 출력한다. (=Dog의 메소드 동작 내용)
        //{"앉아", "빵!!", "기다려"}
//        String name2 = getName();
        String name2 = this.name;
        String result = "";

        /* switch */
        switch (order) {
            case "앉아" :
                result = name2 + "는 '앉아'를 할 수 있어요. :) ";
                break;
            case "빵!!" :
                result = name2 + "는 '빵!!'을 할 수 있어요. :) ";
                break;
            case "기다려" :
                result = name2 + "는 '기다려'를 할 수 있어요. :) ";
                break;
            default :
                result = name2 + "는 " + order + "를 배우지 않았어요. :( ";
                break;
        }
        return result;

    }

    /* Dog의 반환 타입을 String으로 변경한 메소드 호출 */
    public boolean doSomeThingBoolean(String order){
        /* switch문 사용 작성 */

        //강아지는 할 수 있는 재주면 해당 재주를 출력하고,
        // 그렇지 않으면 '아직 못배운 재주에요'를 출력한다. (=Dog의 메소드 동작 내용)
        //{"앉아", "빵!!", "기다려"}
        boolean result;

        /* switch */
        switch (order) {
            case "앉아" :
                result = true;
                break;
            case "빵!!" :
                result = true;
                break;
            case "기다려" :
                result = true;
                break;
            default :
                result = false;
                break;
        }
        return result;

    }

}

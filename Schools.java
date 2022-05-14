public class Schools {
    private String[] schools = new String[10];
    private String[] scores = new String[10];
    int[] intscores = new int[scores.length];


    public Schools(String[] schools, String[] score){
        this.schools = schools;
        this.scores = score ;
    }

    public String averageSchool(){
        int averageScore = 0;
        int result =0 ;
        for(int i = 0 ;i<scores.length;i++){
            intscores[i] = Integer.parseInt(scores[i]);
            averageScore += Integer.parseInt(scores[i]);
            result = averageScore/scores.length;
        }
        return "The average score of 10 schools is : "+result;
    }

    public String highestScorewithSchools(){
        int max = 0 ;
        int ind = 0;
        for (int i = 0; i < scores.length-1; i++) {
            if(max < intscores[i]) {
                max = intscores[i];
                ind = i;
            }
        }
        return "The Higest scorer in the quiz is :"+schools[ind]+" with a score of :"+max;
    }




}

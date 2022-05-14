public class SchoolsMain {
    public static void main(String[] args) {
        String[] schools = {"a","b","c","d","e","f","g","h","i","j"};
        String[] scores = {"23","64","98","34","45","26","78","88","60","30"};

        Schools schools1 = new Schools(schools,scores);
        System.out.println(schools1.averageSchool());
        System.out.println(schools1.highestScorewithSchools());
    }
}

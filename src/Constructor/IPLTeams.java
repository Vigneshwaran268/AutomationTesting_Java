package Constructor;

public class IPLTeams {

    String captain;
    String teamName;
    int trophies;

    IPLTeams(String a, String b, int c){
        captain = a;
        teamName = b;
        trophies = c;
    }

    public static void main(String[] args) {
        IPLTeams obj = new IPLTeams("Ruthuraj", "CSK",5);
        IPLTeams obj1 = new IPLTeams("Hardhik", "MI", 5);
        IPLTeams obj2 = new IPLTeams("Patidar", "RCB", 1);
        IPLTeams obj3 = new IPLTeams("Rahane", "KKR", 3);
        IPLTeams obj4 = new IPLTeams("Gill", "GT", 0);

        System.out.println("============================================");
        System.out.println("Name\t\tCaptain\t\ttrophies\t\t");
        System.out.println("============================================");
        System.out.println(obj.captain+"\t"+obj.teamName+"\t\t"+obj.trophies);
        System.out.println(obj1.captain+"\t\t"+obj1.teamName+"\t\t"+obj1.trophies);
        System.out.println(obj2.captain+"\t\t"+obj2.teamName+"\t\t"+obj2.trophies);
        System.out.println(obj3.captain+"\t\t"+obj3.teamName+"\t\t"+obj3.trophies);
        System.out.println(obj4.captain+"\t\t"+obj4.teamName+"\t\t"+obj4.trophies);
    }
}

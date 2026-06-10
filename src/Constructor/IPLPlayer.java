package Constructor;

public class IPLPlayer {

    String name;
    String team;
    int runs;
    int balls;

    IPLPlayer(String name, String team, int runs, int balls){
        this.name = name;
        this.team = team;
        this.runs = runs;
        this.balls = balls;
    }

    public static void main(String[] args) {
        IPLPlayer obj = new IPLPlayer("Sanju", "CSK", 101, 51);
        IPLPlayer obj1 = new IPLPlayer("Vaibav", "RR", 101, 47);
        IPLPlayer obj2 = new IPLPlayer("Rahul", "DC", 152 , 61);
        IPLPlayer obj3 = new IPLPlayer("Shreyas", "PK", 66, 33);

        System.out.println("================================================================");
        System.out.println("Name\t\t\tTeam\t\t\tRuns\t\t\tBalls");
        System.out.println("================================================================");

        System.out.println(obj.name+"\t\t\t"+obj.team+"\t\t\t"+obj.runs+"\t\t\t"+obj.balls+"\t\t\t");
        System.out.println(obj1.name+"\t\t\t"+obj1.team+"\t\t\t"+obj1.runs+"\t\t\t"+obj1.balls+"\t\t\t");
        System.out.println(obj2.name+"\t\t\t"+obj2.team+"\t\t\t"+obj2.runs+"\t\t\t"+obj2.balls+"\t\t\t");
        System.out.println(obj3.name+"\t\t\t"+obj3.team+"\t\t\t"+obj3.runs+"\t\t\t"+obj3.balls+"\t\t\t");

    }
}

package Constructor;

public class Faculty {

    String name;
    String subject;
    int age;
    static String cname;
    static String caddress;


    Faculty(String name, String subject, int age, String cname, String caddress) {
        this.name = name;
        this.subject = subject;
        this.age = age;
        Faculty.cname = cname;
        Faculty.caddress = caddress;

    }

    public static void main(String[] args) {
        Faculty.cname = "PSNA College of Engineering and Technology";
        Faculty.caddress = "Dindigul";

        Faculty obj = new Faculty("Vikki", "Physics", 35, Faculty.cname, Faculty.caddress);
        Faculty obj1 = new Faculty("Sri", "Chemistry", 30, Faculty.cname, Faculty.caddress);
        Faculty obj2 = new Faculty("Jegan", "Maths", 45, Faculty.cname, Faculty.caddress);
        Faculty obj3 = new Faculty("Ram", "English", 35, Faculty.cname, Faculty.caddress);
        Faculty obj4 = new Faculty("Sam", "Physics", 37, Faculty.cname, Faculty.caddress);

        System.out.println("===========================================================================");
        System.out.println("Name\t\tSubject\t\tAge\t\tcname\t\tcaddress");
        System.out.println("===========================================================================");
        System.out.println(obj.name+"\t\t"+obj.subject+"\t\t"+obj.age+"\t\t"+cname+"\t\t"+caddress);
        System.out.println(obj1.name+"\t\t"+obj1.subject+"\t\t"+obj1.age+"\t\t"+cname+"\t\t"+caddress);
        System.out.println(obj2.name+"\t\t"+obj2.subject+"\t\t"+obj2.age+"\t\t"+cname+"\t\t"+caddress);
        System.out.println(obj3.name+"\t\t"+obj3.subject+"\t\t"+obj3.age+"\t\t"+cname+"\t\t"+caddress);
        System.out.println(obj4.name+"\t\t"+obj4.subject+"\t\t"+obj4.age+"\t\t"+cname+"\t\t"+caddress);
    }
}

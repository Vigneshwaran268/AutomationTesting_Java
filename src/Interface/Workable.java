/*Employee Work Tracking System

Create an employee task tracking application.

Requirements:

Interface: Workable
Methods:
doWork()
takeBreak()
Classes:

Developer
Tester
Manager
Bonus:

Store all employees in a single array/list using interface type.

 */

package Interface;

interface Workable {
    void doWork();
    void takeBreak();

}

class Developer implements Workable{
    public void doWork() {
        System.out.println("Developer is working");
    }

    public void takeBreak() {
        System.out.println("Developer is taking break");
    }
}

class Tester implements Workable{
    public void doWork() {
        System.out.println("Tester is working");
    }

    public void takeBreak() {
        System.out.println("Tester is taking break");
    }
}

class Manager implements Workable{
    public void doWork() {
        System.out.println("Manager is working");
    }

    public void takeBreak() {
        System.out.println("Manager is taking break");
    }
}

class MainEmployee{
    public static void main(String[] args) {
        Workable[] employees = {
                new Developer(),
                new Tester(),
                new Manager(),
        };
        for(Workable obj: employees){
            obj.doWork();
            obj.takeBreak();
        }
    }
}

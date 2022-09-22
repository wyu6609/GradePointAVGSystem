public class Driver {
    public static void main(String[] args) {
        Student andy = new Student("Andy");
        andy.add("Mathematics",'C');
        andy.add("History", 'B');
        andy.add("Geography", 'D');

        System.out.println(andy.getName() + " has a GPA of " + andy.getGPA());

        System.out.println("It is obtained " + " from these subjects:");
        for (String str: andy.getSubjects()){
            System.out.println(str);
        }
    }
}

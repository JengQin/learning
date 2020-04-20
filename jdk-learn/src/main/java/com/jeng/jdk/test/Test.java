package com.jeng.jdk.test;

public class Test {
    private String oName;

    public Test(String oName) {
        this.oName = oName;
    }

    public static void main(String[] args) {
//        File file = new File("test.txt");
//        try (FileInputStream fileInputStream = new FileInputStream(file)) {
//            byte[] arr = new byte[1024];
//            int read = fileInputStream.read(arr);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        Test test1 = new Test("user1");
        Test test2 = new Test("user2");
        InnerClass innerClass1 = test1.new InnerClass();
        InnerClass innerClass2 = test2.new InnerClass();

        System.out.println(innerClass1.getName());
        System.out.println(innerClass2.getName());

        System.out.println(innerClass1.getClass()==innerClass2.getClass());

    }

    public class InnerClass{
        private String name = oName;
        private int id;

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }
    }
}

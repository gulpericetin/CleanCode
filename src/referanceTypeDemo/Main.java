package referanceTypeDemo;

public class Main {
    public static void main(String[] args) {
        int sayi1=20;
        int sayi2=25;
        sayi1=sayi2;
        sayi2=30;
        System.out.println(sayi1);

        int[] sayilar1=new int[] {1,2,3,4};
        int[] sayilar2=new int[] {5,6,7,8};
        sayilar1=sayilar2;
        sayilar2[0] =30;
        System.out.println(sayilar1[0]);


        Customer customer=new Customer();
        Customer customer2=customer;
        Product product=new Product();

        Person person1 = (Person) customer2;
        Person person2 = new Person();

        PersonDal personDal =new PersonDal();
        personDal.add(new Employee());
        personDal.add(new Visitor());


    }
}

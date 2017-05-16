
public class BuilderPattern {
    public static void main(String[] args) {
        // ���� ��ü�� �ϳ� ����ϴ�.
        PersonInfoBuilder personInfoBuilder = new PersonInfoBuilder();
        // ���� ��ü�� ���ϴ� �����͸� �Է��մϴ�. ������ ��� �����ϴ�.
        PersonInfo result = personInfoBuilder
                .setName("MISTAKE")
                .setAge(20)
                .setFavoriteAnimal("cat")
                .setFavoriteColor("black")
                .setName("JDM") // �ٽ� ���� �޼ҵ带 ȣ���Ѵٸ� ���߿� ȣ���� ���� ���ϴ�.
                .setFavoriteNumber(7)
                // �������� .build() �޼ҵ带 ȣ���ؼ� �������� ������� ����� ��ȯ�մϴ�.
                .build();
        // print is "name:JDM, age:20, favoriteColor:black, favoriteAnimal:cat, favoriteNumber:7"
        System.out.println(result.getPersonInfo());
        
        PersonInfo p = PersonInfo.Builder().setName("JDM").setAge(20).build();
        System.out.println(p.getPersonInfo());
    }
}
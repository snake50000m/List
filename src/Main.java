import java.util.*;

public class Main {
    public static void main(String[] args) {
        HeavyBox firstBox = new HeavyBox("Aliexpress", 25.85);
        HeavyBox secondBox = new HeavyBox("Wildberries", 2.96);
        HeavyBox thirdBox = new HeavyBox("lalafo", 5.45);

        ArrayList<HeavyBox> arrayList = new ArrayList<>();
        arrayList.add(firstBox);
        arrayList.add(secondBox);
        arrayList.add(thirdBox);

        for (HeavyBox box: arrayList) {
            System.out.println(box.toString());
        }

        arrayList.set(0, new HeavyBox("Aliexpress", 1));    //Изменить вес первого ящика на 1.
        arrayList.remove(arrayList.size()-1);     //Удалить последний ящик.

        HeavyBox[] heavyBoxes1 = new HeavyBox[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {               //1 способ
            heavyBoxes1[i] = arrayList.get(i);
        }

        HeavyBox[] heavyBoxes2 = arrayList.toArray(new HeavyBox[0]); //2 способ
        HeavyBox[] heavyBoxes3 = arrayList.stream().toArray(HeavyBox[]::new); //3 способ

        System.out.println("\n------------1 способ------------");
        System.out.println(Arrays.toString(heavyBoxes1));
        System.out.println("\n------------2 способ------------");
        System.out.println(Arrays.toString(heavyBoxes2));
        System.out.println("\n------------3 способ------------");
        System.out.println(Arrays.toString(heavyBoxes3));

        arrayList.clear();



//        for (HeavyBox box: heavyBoxes1) {
//            System.out.println(box.toString());
//        }
    }
}
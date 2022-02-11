package com.andersen.pre_intensive.task1;

public class Tests {

    private static int indexForRemove = 2;
    private static int firstListInitialSize = 7;
    private static int secListInitialSize = 11;
    private static int addedElement = 99;
    private static int addedIndex = 3;
    private static int getElIndex = 3;

    public static void main(String[] args) {
        TestInts();
    }

    public static void TestInts() {
        System.out.println("Test for Integers");
        MyArrayList<Integer> al1 = new MyArrayListImplementation<>();
        System.out.println("List #1 size = " + al1.size());

        System.out.println("Filling first list:");
        fillingList(al1, firstListInitialSize);
        System.out.println("List #1 size = " + al1.size() + System.lineSeparator());

        testOfRemove(al1, indexForRemove);
        System.out.println("List #1 size after removing = " + al1.size() + System.lineSeparator());

        MyArrayList<Integer> al2 = new MyArrayListImplementation<>(secListInitialSize);
        System.out.println("List #2 size = " + al2.size());
        System.out.println("Filling second list:");
        fillingList(al2, secListInitialSize);
        System.out.println("List #2 size = " + al2.size() + System.lineSeparator());

        System.out.println("Test of concat");
        al1.concat(al2);
        System.out.println("Concated list size = " + al1.size());
        print(al1);
        System.out.println(System.lineSeparator());

        System.out.println("Test of adding " + addedElement + " into " + addedIndex + " index");
        al1.add(addedElement, addedIndex);
        print(al1);
        System.out.println();
        System.out.println("List size after adding = " + al1.size() + System.lineSeparator());

        System.out.println("Test of getting element by " + getElIndex + " index");
        System.out.println(al1.get(getElIndex) + System.lineSeparator());

        System.out.println("Test of sorting");
        al1.sort();
        print(al1);

    }

    private static void testOfRemove(MyArrayList<Integer> al, int index) {
        System.out.println("Test of remove el with index = " + index);
        al.delete(index);
        print(al);
        System.out.println();
    }

    private static void fillingList(MyArrayList<Integer> al, int size) {
        for (int i = 0; i < size; i++) {
            al.add(i);
        }
        print(al);
        System.out.println();
    }

    public static <T> void print(MyArrayList<T> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}

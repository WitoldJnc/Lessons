public class Main {
    public static void main(String[] args) {
        FunctionalList functional = new FunctionalList();
//        System.out.println(functional.returnRandomMark());
//        System.out.println(functional.returnSumAllMark());
//        System.out.println(functional.returnAverageMark());
//
//        FunctionalMap functionalMap = new FunctionalMap();
//        functionalMap.addMark("one", 7);
//        functionalMap.addMark("two", 2);
//        functionalMap.addMark("three", 3);
//        functionalMap.addMark("four", 4);
//        functionalMap.addMark("five", 5);
//
//        System.out.println(functionalMap.getSumOfMap() + "   : all summ");
//        System.out.println(functionalMap.getAverageMarkOfMapForEach() + "   : average for each");
//        System.out.println(functionalMap.getAllAverage() + "   : average for all");
        int s = functional.sum(5);
        System.out.println(s);

    }
}

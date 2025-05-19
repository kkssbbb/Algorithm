class Note{

    public static void test(){
        String s = "";
        Long startTime = System.currentTimeMillis();
        for(int i=0; i<100000; i++){
            s += "a";
        }

        Long endTime = System.currentTimeMillis();
        System.out.println("test1() endTime = " + ((endTime-startTime) /1000.0) + "초 입니다.");
    }

    public static void test2(){
    
        StringBuilder s = new StringBuilder();
        Long startTime = System.currentTimeMillis();
        for(int i=0; i<100000; i++){
            s.append("s");
        }

        Long endTime = System.currentTimeMillis();
        System.out.println("test2() endTime = " + ((endTime-startTime) /1000.0) + "초 입니다.");
    }

    public static void main(String[] args){
            test();
            test2();
    }


}
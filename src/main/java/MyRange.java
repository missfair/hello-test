public class MyRange {
    private final  String input;
    private  final int ASCIL_VALUE_1 = 48;
    public  MyRange(String input){
        this.input = input;
    }

    public  boolean isStartWithInclude(){
        return  this.input.startsWith("[");
    }
    public  boolean isStartWithExclude(){
        return this.input.startsWith("(");
    }
    public int getStart(){
        if (isStartWithInclude()){
            return  this.input.charAt(1) - ASCIL_VALUE_1;
        }
        else {
            return  -1;
        }
    }
}

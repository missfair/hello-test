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
    public  boolean isEndWithInclude(){
        return  this.input.endsWith("]");
    }
    public  boolean isEndWithExclude(){
        return this.input.endsWith(")");
    }
    public int getStart(){
        if (isStartWithInclude()){
            return  this.input.charAt(1) - ASCIL_VALUE_1;
        }
        else {
            return  -1;
        }
    }

    public int getEnd(){
        if (isStartWithInclude()){
            return  this.input.charAt(3) - 48;
        }
        return  this.input.charAt(3) - 49;
    }
}

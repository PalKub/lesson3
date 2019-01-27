package figure;

class Bottle<T extends Alcohol> {
    private T alcoholType;

    void fill(T t){
        alcoholType = t;
    }
    void describe(){
        if(alcoholType!=null){
            System.out.println(alcoholType.getName());
            System.out.println(alcoholType.getPercentage());
        }
    }
}

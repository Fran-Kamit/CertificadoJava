public interface Cola {
    void encolar(Integer o);
    Integer desencolar();
    default void encolarMultiple (Integer o, int repeticion){
        for (int i = 0; i < repeticion; i++){
            encolar(o);
        }
    }
}
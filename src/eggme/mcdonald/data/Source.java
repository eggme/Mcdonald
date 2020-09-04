package eggme.mcdonald.data;

public enum Source {
    BULGOGI("BULGOGI"),
    SOUR_CREAM("SOURCREAM"),
    CHILI("CHILI"),
    GARLIC("GARLIC"),
    KETCHUP("KETCHUP"),
    MAYONNAISE("MAYONNAISE");
    
	private String source; 
    Source(String data){
    	source = data;
    }
    
    public String getSource() {
    	return source;
    }
}

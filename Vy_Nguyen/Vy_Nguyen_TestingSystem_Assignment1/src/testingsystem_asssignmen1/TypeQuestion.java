package testingsystem_asssignmen1;

public class TypeQuestion {
    public int typeId;
    public String typeName;

    public TypeQuestion(int typeId, String typeName){
        this.typeId = typeId;
        this.typeName = typeName;
    }
    @Override
    public String toString() {
        return "TypeQuestion{id=" + typeId + ", name='" + typeName + "'}";
    }
}


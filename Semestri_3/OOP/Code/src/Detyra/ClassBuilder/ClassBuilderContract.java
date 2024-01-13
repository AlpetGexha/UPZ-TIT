package Detyra.ClassBuilder;

import java.util.List;

public interface ClassBuilderContract {
    List<AttributeObject> getAttributes();
    String getClassName();
}
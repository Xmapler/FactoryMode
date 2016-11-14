package com.xhf.design.iter.Visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {  
    private List<Person> elements = new ArrayList<Person>();  
  
    public void attach(Person element){  
        elements.add(element);  
    }  
      
    public void detach(Person element){  
        elements.remove(elements);  
    }  
      
    /**
     * �������־���Ԫ�ز�ִ�����ǵ�accept����  
     * @param visitor
     */
    public void display(Visitor visitor){  
        for(Person p:elements){  
            p.accept(visitor);  
        }  
    }  
}  

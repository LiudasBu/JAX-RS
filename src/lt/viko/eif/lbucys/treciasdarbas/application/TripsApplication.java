/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.lbucys.treciasdarbas.application;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
/**
 *
 * @author Admin
 */
@ApplicationPath("api")
public class TripsApplication extends Application {
    
    private final Set<Class<?>> classes;

    public TripsApplication() {
        Set<Class<?>> classesSet = new HashSet();
        classesSet.add(TripsService.class);
        
        this.classes = Collections.unmodifiableSet(classesSet);
    }

    @Override
    public Set<Class<?>> getClasses() {
        return classes;
    }
    
    
}

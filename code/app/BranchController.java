package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class BranchController {
       
    @Autowired
    BranchConnector storage;
    //BranchConnector b = context.getBean(BranchConnector.class);
    
    @RequestMapping("/api/list-branch")
    BranchDetail[] m1() {
        return storage.getAll();
    }
    
}

class BranchDetail {
    public String name;
    public double area;
}

@Repository
class BranchConnector {
    
    BranchDetail[] data;
    
    BranchConnector() {
        data = new BranchDetail[3];
        data[0] = new BranchDetail();
        data[0].name = "New York";
        data[0].area = 180.0;
        
        data[1] = new BranchDetail();
        data[1].name = "London";
        data[1].area = 150.0;
        
        data[2] = new BranchDetail();
        data[2].name = "Atlanta";
        data[2].area = 200.0;
    }
    
    BranchDetail[] getAll() {
        return data;
    }
}

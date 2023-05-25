package app;

import org.springframework.stereotype.Repository;

class BranchController {
    
}

class BranchDetail {
    String name;
    double area;
}

@Repository
class BranchConnector {
    
    BranchDetail[] data;
    
    BranchConnector() {
        data = new BranchDetail[3];
        data[0] = new BranchDetail();
        data[0].name = "New York";
        data[0].area = 180.0;
        
        data[0] = new BranchDetail();
        data[0].name = "London";
        data[0].area = 150.0;
        
        data[0] = new BranchDetail();
        data[0].name = "Atlanta";
        data[0].area = 200.0;
    }
    
    BranchDetail[] getAll() {
        return data;
    }
}

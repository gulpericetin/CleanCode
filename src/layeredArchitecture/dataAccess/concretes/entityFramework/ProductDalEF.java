package layeredArchitecture.dataAccess.concretes.entityFramework;

import layeredArchitecture.dataAccess.abstracts.ProductDal;
import layeredArchitecture.entities.concretes.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDalEF implements ProductDal {
    @Override
    public List<Product> getAll() {
        return new ArrayList<>();
    }
}

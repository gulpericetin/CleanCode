package layeredArchitecture.business.concretes;


import layeredArchitecture.business.abstracts.ProductService;
import layeredArchitecture.dataAccess.abstracts.ProductDal;
import layeredArchitecture.entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {
    ProductDal ProductDal;
    public ProductManager(layeredArchitecture.dataAccess.abstracts.ProductDal ProductDal)
    {
        this.ProductDal=ProductDal;
    }

    @Override
    public List<Product> getAll() {
        return ProductDal.getAll();
    }
}

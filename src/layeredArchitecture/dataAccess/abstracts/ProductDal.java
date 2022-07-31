package layeredArchitecture.dataAccess.abstracts;

import layeredArchitecture.entities.concretes.Product;

import java.util.List;

public interface ProductDal {
    List<Product> getAll();
}

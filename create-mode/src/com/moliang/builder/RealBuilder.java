package com.moliang.builder;

/**
 * @author zhang qing
 * @date 2021/8/5 19:57
 */
public class RealBuilder extends Builder {

    private Product product = new Product();;

    @Override
    public void builderFirst() {
        product.setFirst("first");
    }

    @Override
    public void builderSecond() {
        product.setSecond("second");
    }

    @Override
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}

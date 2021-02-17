public class Shopping implements Comparable<Shopping> {
    private String nameProduct;
    private Integer sumProduct;

    public Shopping(String nameProduct, Integer sumProduct) {
        this.nameProduct = nameProduct;
        this.sumProduct = sumProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Integer getSumProduct() {
        return sumProduct;
    }

    public void setSumProduct(Integer sumProduct) {
        this.sumProduct = sumProduct;
    }

    @Override
    public String toString() {
        return nameProduct + " " + getSumProduct();
    }

    @Override
    public int compareTo(Shopping o) {
        if(this.getNameProduct().compareTo(o.getNameProduct()) > 0){
            return 1;
        }else if (this.getNameProduct().compareTo(o.getNameProduct()) < 0){
            return -1;
        }else {
            return 0;
        }
    }

}

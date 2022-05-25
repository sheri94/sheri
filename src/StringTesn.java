public class StringTesn {
    private String re;
    private String im;

    public StringTesn() {
    }

    public StringTesn(String re, String im) {
        this.re = re;
        this.im = im;
    }

    public String getRe() {
        return re;
    }

    public String getIm() {
        return im;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StringTesn that = (StringTesn) o;

        if (re != null ? !re.equals(that.re) : that.re != null) return false;
        return im != null ? im.equals(that.im) : that.im == null;
    }

    @Override
    public int hashCode() {
        int result = re != null ? re.hashCode() : 0;
        System.out.println("ht"+result);
        result = 31 * result + (im != null ? im.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {
        StringTesn s1 = new StringTesn("Dima", "Java");
        StringTesn s2 = new StringTesn("Dima", "Java");
        System.out.println(s1.hashCode());
    }
}

public class getShop {
    String ShopName,Building,OpenHours;
    getShop(String name,String buil,String oph)
    {
        this.ShopName=name;
        this.Building=buil;
        this.OpenHours=oph;
    }
    public String getShopName() {
        return ShopName;
    }
    public void setShopName(String shopName) {
        ShopName = shopName;
    }
    public String getBuilding() {
        return Building;
    }
    public void setBuilding(String building) {
        Building = building;
    }
    public String getOpenHours() {
        return OpenHours;
    }
    public void setOpenHours(String openHours) {
        OpenHours = openHours;
    }
}

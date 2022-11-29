package Shop;

import Shop.dish.*;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Admin  extends Person{

    private List<Dish> dishes = new ArrayList<>();
    private Americano americano = new Americano();
    private ClassicCoffee classicCoffee = new ClassicCoffee();
    private CoffeeWithMilk coffeeWithMilk = new CoffeeWithMilk();
    private BountyRoll bountyRoll = new BountyRoll();
    private CaesarSalad caesarSalad = new CaesarSalad();
    private Cake cake = new Cake();
    private Cheesecake cheesecake = new Cheesecake();
    private KharchoSoup kharchoSoup = new KharchoSoup();
    private PeaSoup peaSoup = new PeaSoup();
    private RainbowSalad rainbowSalad = new RainbowSalad();
    private RoyalSalad royalSalad = new RoyalSalad();
    private RussianSalad russianSalad = new RussianSalad();
    private Solyanka solyanka = new Solyanka();
    public Admin(int id, String name, int age) {
        super(id,name, age);
        dishes.add(americano);
        dishes.add(classicCoffee);
        dishes.add(coffeeWithMilk);
        dishes.add(bountyRoll);
        dishes.add(caesarSalad);
        dishes.add(cake);
        dishes.add(cheesecake);
        dishes.add(kharchoSoup);
        dishes.add(peaSoup);
        dishes.add(rainbowSalad);
        dishes.add(royalSalad);
        dishes.add(russianSalad);
        dishes.add(solyanka);
    }

    public Menu printMenu () {
        Menu menu = new Menu(dishes);
        return menu;
    }
    public void printCheck () {
        for () {

        }
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    public Americano getAmericano() {
        return americano;
    }

    public void setAmericano(Americano americano) {
        this.americano = americano;
    }

    public ClassicCoffee getClassicCoffee() {
        return classicCoffee;
    }

    public void setClassicCoffee(ClassicCoffee classicCoffee) {
        this.classicCoffee = classicCoffee;
    }

    public CoffeeWithMilk getCoffeeWithMilk() {
        return coffeeWithMilk;
    }

    public void setCoffeeWithMilk(CoffeeWithMilk coffeeWithMilk) {
        this.coffeeWithMilk = coffeeWithMilk;
    }

    public BountyRoll getBountyRoll() {
        return bountyRoll;
    }

    public void setBountyRoll(BountyRoll bountyRoll) {
        this.bountyRoll = bountyRoll;
    }

    public CaesarSalad getCaesarSalad() {
        return caesarSalad;
    }

    public void setCaesarSalad(CaesarSalad caesarSalad) {
        this.caesarSalad = caesarSalad;
    }

    public Cake getCake() {
        return cake;
    }

    public void setCake(Cake cake) {
        this.cake = cake;
    }

    public Cheesecake getCheesecake() {
        return cheesecake;
    }

    public void setCheesecake(Cheesecake cheesecake) {
        this.cheesecake = cheesecake;
    }

    public KharchoSoup getKharchoSoup() {
        return kharchoSoup;
    }

    public void setKharchoSoup(KharchoSoup kharchoSoup) {
        this.kharchoSoup = kharchoSoup;
    }

    public PeaSoup getPeaSoup() {
        return peaSoup;
    }

    public void setPeaSoup(PeaSoup peaSoup) {
        this.peaSoup = peaSoup;
    }

    public RainbowSalad getRainbowSalad() {
        return rainbowSalad;
    }

    public void setRainbowSalad(RainbowSalad rainbowSalad) {
        this.rainbowSalad = rainbowSalad;
    }

    public RoyalSalad getRoyalSalad() {
        return royalSalad;
    }

    public void setRoyalSalad(RoyalSalad royalSalad) {
        this.royalSalad = royalSalad;
    }

    public RussianSalad getRussianSalad() {
        return russianSalad;
    }

    public void setRussianSalad(RussianSalad russianSalad) {
        this.russianSalad = russianSalad;
    }

    public Solyanka getSolyanka() {
        return solyanka;
    }

    public void setSolyanka(Solyanka solyanka) {
        this.solyanka = solyanka;
    }
}

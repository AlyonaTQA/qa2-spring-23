import org.openqa.selenium.By;

public class Locators {
    private final By BOOKING_HEADER_LOGO = By.xpath(".//span[@data-testid='header-logo']");
    private final By BOOKING_HEADER_CURRENCY_PICKER = By.xpath(".//button[@data-testid='header-currency-picker-trigger']");
    private final By BOOKING_HEADER_BELL = By.xpath(".//span[@class='b6dc9a9e69 ec1b6253a6']");
    private final By BOOKING_HEADER_GENIUS_LEVEL = By.xpath(".//span[@class='d8eab2cf7f a2552429ab']");
    private final By BOOKING_AIRPORT_TAXIS = By.id("airport_taxis");
    private final By BOOKING_HERO_BANNER_TITLE1 = By.xpath(".//span[@data-testid='herobanner-title1']");
    private final By BOOKING_BUTTON_DATE_FIELD_END = By.xpath(".//button[@data-testid='date-display-field-end']");
    private final By BOOKING_BUTTON_SUBMIT = By.xpath(".//button[@type='submit']");
    private final By BOOKING_ONLY_HOTELS_FOR_WORK = By.xpath(".//div[contains(text(), \"I'm travelling for work\")]");
    private final By BOOKING_GLOBAL_ALERT_TITLE = By.xpath(".//div[@data-testid='global-alert-interactive-title']");
    private final By BOOKING_RECENT_SEARCHES = By.xpath(".//span[@class='bui-title__text']");

    private final By GOOGLE_SEARCH_FIELD = By.xpath(".//div[@class='RNNXgb']");
    private final By GOOGLE_SETTINGS_ICON = By.xpath(".//span[@class='z1asCe E9hVAb']");
    private final By GOOGLE_PROFILE_AVATAR = By.xpath(".//div[@id='gb']//div[@class='gb_e gb_7a gb_3f gb_v']");
    private final By GOOGLE_MORE_DROPDOWN = By.xpath(".//span[@class='MbEPDb z1asCe SaPW2b']");
    private final By GOOGLE_TOOLS_BUTTON = By.id("hdtb-tls");
    private final By GOOGLE_RESULT_STATES = By.id("result-stats");
    private final By GOOGLE_ABOUT_THIS_RESULT = By.xpath(".//span[@class='D6lY4c mBswFe'][1]") ;
    private final By GOOGLE_COMPLEMENTARY_RESULTS = By.id("_8hBRZO3nO4uorgTysL6oCg_32");

    private final By AMAZON_LOGO = By.id("nav-logo-sprites");
    private final By AMAZON_SEARCH_FIELD = By.id("nav-search-bar-form");
    private final By AMAZON_ACCOUNT_LIST = By.id("nav-link-accountList-nav-line-1");
    private final By AMAZON_SHOPPING_BASKET = By.id("nav-cart-text-container");
    private final By AMAZON_ALL_HAMBURGER_MENU = By.id("nav-hamburger-menu");
    private final By AMAZON_NEXT_RIGHT_ARROW = By.xpath(".//i[@class='a-icon a-icon-next-rounded']");
    private final By AMAZON_TOP_IDEALS = By.id("CardInstanceUfdBh3FEA4h_XvgFj8_ntw");

    private final By A_BUSINESS_OFFER = By.xpath(".//a[contains(text(), 'Piedāvājums biznesam')]");
    private final By A_GOODS_PICK_UP_LOCATIONS = By.xpath(".//a[@href='/stores']");
    private final By A_LANGUAGE_LV = By.xpath(".//a[contains(@class, language) and @href='/']");
    private final By A_LANGUAGE_RU = By.xpath(".//a[contains(@class, language) and @href='/ru/']");
    private final By A_MAIN_LOGO = By.xpath(".//a[@class='main-logo']");
    private final By A_BUTTON_SUBMIT = By.xpath(".//button[@type='submit']");
    private final By A_CART = By.xpath(".//div[@class='cart-block']//a[@href='/cart']");
    private final By A_SMART_NET_IMAGE = By.xpath(".//img[@class='smart-net-banner__logo']");
    private final By A_IMAGE_GIFT = By.xpath(".//div[@class='smart-net-banner__images']/img[2]");
    private final By A_GOODS_CATALOGUE_MENU = By.xpath(".//i[@class='main-menu__handle-icon icon-svg']");
}

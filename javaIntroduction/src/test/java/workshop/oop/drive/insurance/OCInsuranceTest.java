package workshop.oop.drive.insurance;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.*;

@DisplayName("Counts insurance price")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OCInsuranceTest {

  @Order(1)
  @Test
  @DisplayName("Standard price")
  public void shouldHaveDefaultInsurance() {
    //given
    OCInsurance ocInsurance = new OCInsurance(300);

    //when
    int finalPrice = ocInsurance.calculateFinalPrice();

    //then
    assertThat(finalPrice).isEqualTo(300);
  }

  @Order(2)
  @Test
  public void calculatePriceWithAbsoluteDiscount() {
    //given
    OCInsurance ocInsurance = new OCInsurance(300);

    //when
    ocInsurance.addAbsoluteDiscount(20);

    //then
    assertThat(ocInsurance.calculateFinalPrice()).isEqualTo(280);
  }

  @Order(3)
  @Test
  public void calculatePriceWithAbsoluteAndRelativeDiscount() {
    //given
    OCInsurance ocInsurance = new OCInsurance(300);
    //when
    ocInsurance.addAbsoluteDiscount(20);
    ocInsurance.addRelativeDiscount(10);

    //then
    assertThat(ocInsurance.calculateFinalPrice()).isEqualTo(252);
  }

  @Order(4)
  @Test
  public void calculatePriceWithRemovedAbsoluteDiscounts() {
    //given
    OCInsurance ocInsurance = new OCInsurance(300);
    //when
    ocInsurance.addAbsoluteDiscount(20);
    ocInsurance.addRelativeDiscount(10);
    ocInsurance.removeAbsoluteDiscounts();

    //then
    assertThat(ocInsurance.calculateFinalPrice()).isEqualTo(270);
  }

  @Order(5)
  @Test
  public void addVipDiscountWhichApplies() {
    //given
    OCInsurance ocInsurance = new OCInsurance(10000);
    //when
    ocInsurance.addAbsoluteDiscount(1000);
    ocInsurance.addVIPRelativeDiscount(50);

    //then
    assertThat(ocInsurance.calculateFinalPrice()).isEqualTo(4500);
  }

  @Order(6)
  @Test
  public void addVipDiscountWhichDoesntApply() {
    //given
    OCInsurance ocInsurance = new OCInsurance(300);
    //when
    ocInsurance.addAbsoluteDiscount(20);
    ocInsurance.addVIPRelativeDiscount(50);

    //then
    assertThat(ocInsurance.calculateFinalPrice()).isEqualTo(280);
  }

  @Order(6)
  @Test
  public void addMixedDiscounts() {
    //given
    OCInsurance ocInsurance = new OCInsurance(300);
    //when
    ocInsurance.addAbsoluteDiscount(20);
    ocInsurance.addRelativeDiscount(10);
    ocInsurance.addAbsoluteDiscount(52);

    //then
    assertThat(ocInsurance.calculateFinalPrice()).isEqualTo(200);
  }

  @Order(8)
  @Test
  public void addFemaleDiscount() {
    //given
    OCInsurance ocInsurance = new OCInsurance(Sex.FEMALE, 300);

    //when
    ocInsurance.addAbsoluteDiscount(20);
    ocInsurance.addSexDiscount(Sex.FEMALE, 20); //in percents

    //then
    assertThat(ocInsurance.calculateFinalPrice()).isEqualTo(224);
  }

  @Order(9)
  @Test
  public void addFemaleDiscountThatDoesntWork() {
    //given
    OCInsurance ocInsurance = new OCInsurance(Sex.MALE, 300);
    //when
    ocInsurance.addAbsoluteDiscount(20);
    ocInsurance.addSexDiscount(Sex.FEMALE, 20);

    //then
    assertThat(ocInsurance.calculateFinalPrice()).isEqualTo(280);
  }



}

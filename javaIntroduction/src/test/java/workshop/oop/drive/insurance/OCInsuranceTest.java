package workshop.oop.drive.insurance;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.*;

@DisplayName("Counts insurance price")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OCInsuranceTest {

  @Test
  @Order(1)
  @DisplayName("Standard price")
  public void shouldHaveDefaultInsurance() {
    //given
    OCInsurance ocInsurance = new OCInsurance(300);
    //when

    //then
    assertThat(ocInsurance.calculateFinalPrice()).isEqualTo(300);
  }

  @Order(2)
  @Test
  public void calculatePriceWithAbsoluteDiscount() {
    //given
    OCInsurance ocInsurance = new OCInsurance(300);
    //when
    //ocInsurance.addAbsoluteDiscount(20);

    //then
    assertThat(ocInsurance.calculateFinalPrice()).isEqualTo(280);
  }

  @Order(3)
  @Test
  public void calculatePriceWithAbsoluteAndRelativeDiscount() {
    //given
    OCInsurance ocInsurance = new OCInsurance(300);
    //when
    //ocInsurance.addAbsoluteDiscount(20);
    //ocInsurance.addRelativeDiscount(10);

    //then
    assertThat(ocInsurance.calculateFinalPrice()).isEqualTo(252);
  }


  @Order(4)
  @Test
  public void calculatePriceWithRemovedAbsoluteDiscounts() {
    //given
    OCInsurance ocInsurance = new OCInsurance(300);
    //when
    //ocInsurance.addAbsoluteDiscount(20);
    //ocInsurance.addRelativeDiscount(10);
    //ocInsurance.removeAbsoluteDiscounts();

    //then
    assertThat(ocInsurance.calculateFinalPrice()).isEqualTo(270);
  }

  @Order(5)
  @Test
  public void calculatePriceWithMixOfDiscounts() {
    //given
    OCInsurance ocInsurance = new OCInsurance(300);
    //when
    //ocInsurance.addAbsoluteDiscount(20);
    //ocInsurance.addRelativeDiscount(10);
    //ocInsurance.addAbsoluteDiscount(30);

    //then
    assertThat(ocInsurance.calculateFinalPrice()).isEqualTo(222);
  }

  @Order(6)
  @Test
  public void addVipDiscountWhichApplies() {
    //given
    OCInsurance ocInsurance = new OCInsurance(10000);
    //when
    //ocInsurance.addAbsoluteDiscount(1000);
    //ocInsurance.addVIPDiscount(50);

    //then
    assertThat(ocInsurance.calculateFinalPrice()).isEqualTo(4500);
  }

  @Order(7)
  @Test
  public void addVipDiscountWhichDoesntApply() {
    //given
    OCInsurance ocInsurance = new OCInsurance(300);
    //when
    //ocInsurance.addAbsoluteDiscount(20);
    //ocInsurance.addVIPDiscount(50);

    //then
    assertThat(ocInsurance.calculateFinalPrice()).isEqualTo(280);
  }

  @Order(8)
  @Test
  public void addDiscountForNoClaimsThatWorks() {
    //given
    OCInsurance ocInsurance = new OCInsurance(300);
    //when
    //ocInsurance.addAbsoluteDiscount(20);
    //ocInsurance.addSexDiscount(Sex.FEMALE, 20); //in percents

    //then
    assertThat(ocInsurance.calculateFinalPrice()).isEqualTo(224);
  }

  @Order(9)
  @Test
  public void addDiscountForNoClaimsThatDoesntWork() {
    //given
    OCInsurance ocInsurance = new OCInsurance( 300);
    //ocInsurance.register(new Claim());
    //when
    //ocInsurance.addAbsoluteDiscount(20);
    //ocInsurance.addSexDiscount(Sex.FEMALE, 20);

    //then
    assertThat(ocInsurance.calculateFinalPrice()).isEqualTo(280);
  }



}

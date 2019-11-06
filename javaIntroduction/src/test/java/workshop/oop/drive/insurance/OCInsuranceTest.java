package workshop.oop.drive.insurance;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class OCInsuranceTest {

  @Test
  public void shouldHaveDefaultInsurance() {
    //given
    OCInsurance ocInsurance = new OCInsurance(300);
    //when

    //then
    assertThat(ocInsurance.calculateFinalPrice()).isEqualTo(300);
  }

  @Test
  public void calculatePriceWithAbsoluteDiscount() {
    //given
    OCInsurance ocInsurance = new OCInsurance(300);
    //when
    ocInsurance.addAbsoluteDiscount(20);

    //then
    assertThat(ocInsurance.calculateFinalPrice()).isEqualTo(280);
  }

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

  @Test
  public void addVipDiscountWhichApplies() {
    //given
    OCInsurance ocInsurance = new OCInsurance(10000);
    //when
    ocInsurance.addAbsoluteDiscount(1000);
    //ocInsurance.addVIPDiscount(50);

    //then
    assertThat(ocInsurance.calculateFinalPrice()).isEqualTo(4500);
  }

  @Test
  public void addVipDiscountWhichNotApplies() {
    //given
    OCInsurance ocInsurance = new OCInsurance(300);
    //when
    ocInsurance.addAbsoluteDiscount(1000);
    //ocInsurance.addVIPDiscount(50);

    //then
    assertThat(ocInsurance.calculateFinalPrice()).isEqualTo(280);
  }

  @Test
  public void addFemaleDiscount() {
    //given
    OCInsurance ocInsurance = new OCInsurance(/*Sex.FEMALE, */300);
    //when
    ocInsurance.addAbsoluteDiscount(20);
    //ocInsurance.addSexDiscount(Sex.FEMALE, 20);

    //then
    assertThat(ocInsurance.calculateFinalPrice()).isEqualTo(224);
  }

  @Test
  public void addFemaleDiscountThatDoesntWork() {
    //given
    OCInsurance ocInsurance = new OCInsurance(/*Sex.MALE,*/ 300);
    //when
    ocInsurance.addAbsoluteDiscount(20);
    //ocInsurance.addSexDiscount(Sex.FEMALE, 20);

    //then
    assertThat(ocInsurance.calculateFinalPrice()).isEqualTo(280);
  }



}

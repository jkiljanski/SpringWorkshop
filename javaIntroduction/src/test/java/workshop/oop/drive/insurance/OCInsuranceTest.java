package workshop.oop.drive.insurance;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OCInsuranceTest {

    @Test
    public void ex1_shouldHaveDefaultInsurance(){
        //given
        OCInsurance ocInsurance = new OCInsurance(300);
        //when

        //then
        assertThat(ocInsurance.calculateFinalPrice()).isEqualTo(300);
    }

    @Test
    public void ex2_calculatePriceWithAbsoluteDiscount(){
        //given
        OCInsurance ocInsurance = new OCInsurance(300);
        //when

        ocInsurance.addDiscout(new InsuranceAbsoluteDiscount(20));

        //then
        assertThat(ocInsurance.calculateFinalPrice()).isEqualTo(280);
    }

    @Test
    public void ex3_calculatePriceWithAbsoluteAndRelativeDiscount(){
        //given
        OCInsurance ocInsurance = new OCInsurance(300);
        //when

        ocInsurance.addDiscout(new InsuranceAbsoluteDiscount(20));
        ocInsurance.addDiscout(new InsuranceRelativeDiscount(10));

        //then
        assertThat(ocInsurance.calculateFinalPrice()).isEqualTo(252);
    }

    @Test
    public void ex4_calculatePriceWithRemovedAbsoluteDiscounts(){
        //given
        OCInsurance ocInsurance = new OCInsurance(300);
        //when

        ocInsurance.addDiscout(new InsuranceAbsoluteDiscount(20));
        ocInsurance.addDiscout(new InsuranceRelativeDiscount(10));
        ocInsurance.removeAbsoluteDiscounts();

        //then
        assertThat(ocInsurance.calculateFinalPrice()).isEqualTo(270);
    }

    @Test
    public void ex5_addVipDiscountWhichApplies(){
        //given
        OCInsurance ocInsurance = new OCInsurance(10000);
        //when

        ocInsurance.addDiscout(new InsuranceAbsoluteDiscount(1000));

        ocInsurance.addDiscout(new InsuranceVipRelativeDiscount(50));

        //then
        assertThat(ocInsurance.calculateFinalPrice()).isEqualTo(4500);
    }

    @Test
    public void ex6_addVipDiscountWhichNotApplies(){
        //given
        OCInsurance ocInsurance = new OCInsurance( 300);
        //when

        ocInsurance.addDiscout(new InsuranceAbsoluteDiscount(20));

        ocInsurance.addDiscout(new InsuranceVipRelativeDiscount(50));

        //then
        assertThat(ocInsurance.calculateFinalPrice()).isEqualTo(280);
    }

    @Test
    public void ex7_addFemaleDiscount(){
        //given
        OCInsurance ocInsurance = new OCInsurance(Sex.FEMALE, 300);
        //when

        ocInsurance.addDiscout(new InsuranceAbsoluteDiscount(20));

        ocInsurance.addDiscout(new InsuranceSexDiscount(20, Sex.FEMALE));

        //then
    assertThat(ocInsurance.calculateFinalPrice()).isEqualTo(224);
    }
    @Test
    public void ex8_addFemaleDiscountThatDoesntWork(){
        //given
        OCInsurance ocInsurance = new OCInsurance(Sex.MALE, 300);
        //when

        ocInsurance.addDiscout(new InsuranceAbsoluteDiscount(20));

        InsuranceSexDiscount discount = new InsuranceSexDiscount(20, Sex.FEMALE);
        ocInsurance.addDiscout(discount);

        //then
        assertThat(ocInsurance.calculateFinalPrice()).isEqualTo(280);
    }

    @Test
    public void ex9_sexChangeToObtainDiscount(){
        //given
        OCInsurance ocInsurance = new OCInsurance(Sex.MALE, 300);
        //when

        ocInsurance.addDiscout(new InsuranceAbsoluteDiscount(20));

        InsuranceSexDiscount discount = new InsuranceSexDiscount(20, Sex.FEMALE);
        ocInsurance.addDiscout(discount);

        ocInsurance.sexChanged(Sex.FEMALE);

        //then
        assertThat(ocInsurance.calculateFinalPrice()).isEqualTo(224);

    }



}
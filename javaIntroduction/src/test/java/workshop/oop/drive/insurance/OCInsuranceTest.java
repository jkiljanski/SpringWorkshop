package workshop.oop.drive.insurance;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OCInsuranceTest {

    @Test
    public void shouldHaveDefaultInsurance(){
        //given
        OCInsurance ocInsurance = new OCInsurance(300);
        //when

        //then
        assertThat(ocInsurance.calculateFinalPrice()).isEqualTo(300);
    }

    @Test
    public void calculatePriceWithAbsoluteDiscount(){
        //given
        OCInsurance ocInsurance = new OCInsurance(300);
        //when
        OCOperation ocOperation = new AbsoluteDiscountOCOperation(20);
        ocInsurance.addOperation(ocOperation);

        //then
        assertThat(ocInsurance.calculateFinalPrice()).isEqualTo(280);
    }

    @Test
    public void calculatePriceWithAbsoluteAndRelativeDiscount(){
        //given
        OCInsurance ocInsurance = new OCInsurance( 300);
        //when
        ocInsurance.addOperation(new AbsoluteDiscountOCOperation(20));
        ocInsurance.addOperation(new RelativeDiscountOCOperation(10));

        //then
        assertThat(ocInsurance.calculateFinalPrice()).isEqualTo(252);
    }

    @Test
    public void calculatePriceWithRemovedAbsoluteDiscounts(){
        //given
        OCInsurance ocInsurance = new OCInsurance(300);
        //when
        ocInsurance.addOperation(new AbsoluteDiscountOCOperation(20));
        ocInsurance.addOperation(new RelativeDiscountOCOperation(10));
        ocInsurance.removeAbsoluteDiscounts();

        //then
        assertThat(ocInsurance.calculateFinalPrice()).isEqualTo(270);
    }

    @Test
    public void addVipDiscountWhichApplies(){
        //given
        OCInsurance ocInsurance = new OCInsurance(10000);
        //when
        ocInsurance.addOperation(new AbsoluteDiscountOCOperation(1000));
        ocInsurance.addOperation(new VipDiscountOCOperation(50));

        //then
        assertThat(ocInsurance.calculateFinalPrice()).isEqualTo(4500);
    }

    @Test
    public void addVipDiscountWhichNotApplies(){
        //given
        OCInsurance ocInsurance = new OCInsurance( 300);
        //when
        ocInsurance.addOperation(new AbsoluteDiscountOCOperation(20));
        ocInsurance.addOperation(new VipDiscountOCOperation(50));

        //then
        assertThat(ocInsurance.calculateFinalPrice()).isEqualTo(280);
    }

    @Test
    public void addFemaleDiscount(){
        //given
        OCInsurance ocInsurance = new OCInsurance(Sex.FEMALE, 300);
        //when
        ocInsurance.addOperation(new AbsoluteDiscountOCOperation(20));
        ocInsurance.addOperation(new SexDiscountOCOperation(Sex.FEMALE, 20));

        //then
        assertThat(ocInsurance.calculateFinalPrice()).isEqualTo(224);
    }
    @Test
    public void addFemaleDiscountThatDoesntWork(){
        //given
        OCInsurance ocInsurance = new OCInsurance(Sex.MALE, 300);
        //when
        ocInsurance.addOperation(new AbsoluteDiscountOCOperation(20));
        ocInsurance.addOperation(new SexDiscountOCOperation(Sex.FEMALE, 20));

        //then
        assertThat(ocInsurance.calculateFinalPrice()).isEqualTo(280);
    }



}
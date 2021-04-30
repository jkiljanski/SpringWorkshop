package workshop.oop.drive.insurance;

import java.util.List;

public class InsuranceReport {
    private final List<Claim> claims;

    public InsuranceReport(List<Claim> claims) {
        this.claims = claims;
    }

    public List<Claim> getClaims() {
        return claims;
    }
}

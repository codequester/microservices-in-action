package com.thoughtmechanix.licenses;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/organization/{organizationId}/licenses")
class LicenseServiceController {

    @RequestMapping(value = "/{licenseId}", method = RequestMethod.GET)
    License getLicense(@PathVariable("organizationId") String organizationID, @PathVariable("licenseId") String licenseId) {
        return new License()
                .withId(licenseId)
                .withOrganizationId(organizationID)
                .withProductName("Telco")
                .withLicenseType("Seat");
    }
}

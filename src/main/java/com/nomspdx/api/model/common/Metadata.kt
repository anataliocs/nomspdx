package com.nomspdx.api.model.common

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.nomspdx.api.model.strains.StrainData

/**
 * https://www.cannabisreports.com/api/v1.0/strains?sort=name&page=3

 * {
 * "data": [StrainDataObject],

 * "meta": {
 * "pagination": {
 * "total": 9006,
 * "count": 10,
 * "per_page": 10,
 * "current_page": 3,
 * "total_pages": 901,
 * "links": {
 * "previous": "https://www.cannabisreports.com/api/v1.0/strains?sort=name&page=2",
 * "next": "https://www.cannabisreports.com/api/v1.0/strains?sort=name&page=4"
 * }
 * }
 * }
 * }
 */
@JsonIgnoreProperties(ignoreUnknown = true)
class Metadata {
    var pagination: Pagination? = null
}


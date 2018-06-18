package pl.applover.android.mvvmtest.models.example

import pl.applover.android.mvvmtest.data.example.database.models.ExampleCityDbModel
import pl.applover.android.mvvmtest.data.example.internet.response.ExampleCityResponse


class ExampleCityModel(
        val id: Int,
        val name: String,
        val lat: Double,
        val lng: Double,
        val country: String
) {

    constructor(exampleCityResponse: ExampleCityResponse) : this(
            exampleCityResponse.id,
            exampleCityResponse.name,
            exampleCityResponse.lat,
            exampleCityResponse.lng,
            exampleCityResponse.country)

    constructor(exampleCityDbModel: ExampleCityDbModel) : this(
            exampleCityDbModel.id,
            exampleCityDbModel.name,
            exampleCityDbModel.lat,
            exampleCityDbModel.lng,
            exampleCityDbModel.country
    )

    fun getInfoAboutCity() = "City $name in country $country with coordinates: $lat lat and $lng lng"

}
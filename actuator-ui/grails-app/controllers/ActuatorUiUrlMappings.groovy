class ActuatorUiUrlMappings {
    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/actuator/dashboard"(controller: "actuatorDashboard")
        "/actuator/traceability"(controller: "actuatorDashboard", action: "traceability")
    }
}
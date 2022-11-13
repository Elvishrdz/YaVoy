package com.eahm.testing.data

/**
 * If using localhost you will need to change the port of the service that you need using the
 * following command: adb reverse tcp:8080 tcp:8080
 *
 * substitute the port number with the service that you need. You can ONLY use one port at the time:
 * e.g.: Firestore adb reverse tcp:5001 tcp:5001
 *       Functions adb reverse tcp:4000 tcp:4000
 */
object FirebaseServicesTestConfiguration {

    /**
     * define if using localhost server for the api service, the service must be running.
     */
    const val CLOUD_FUNCTIONS_USE_LOCALHOST = true

    /**
     * When you run your local emulators (firebase emulators:start) check the
     * Host:Port number assigned to Functions and provide it here
     */
    const val CLOUD_FUNCTIONS_LOCALHOST_PORT = 5001
    const val CLOUD_FUNCTIONS_LOCALHOST = "localhost"

    /**
     * When you run your local emulators (firebase emulators:start) check the
     * Host:Port number assigned to Firestore and provide it here
     */
    const val FIRESTORE_LOCALHOST_PORT = 8080
    const val FIRESTORE_LOCALHOST = "localhost"
}
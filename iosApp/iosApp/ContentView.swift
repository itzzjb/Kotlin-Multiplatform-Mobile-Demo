import SwiftUI
import shared

struct ContentView: View {
    // Calling the greet() function from the shared module
	let greet = Greeting().greet()
	// Calling the name() function from the shared module
	let name = Greeting().name()
	// Calling the todaysDate() function from the shared module
	let date = Greeting().todaysDate()

	var body: some View {
	    // Displaying the greet and name in the ContentView
		Text(greet)
		// Displaying the name in the ContentView
		Text(name)
        // Displaying the name in the ContentView
		Test(date)
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
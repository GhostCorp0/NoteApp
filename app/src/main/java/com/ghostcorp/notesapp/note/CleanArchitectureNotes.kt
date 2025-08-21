package com.ghostcorp.notesapp.note

class CleanArchitectureNotes {
    /**
     *  Clean architecture is used to make our app
     *
     *  Maintainable
     *
     *  Testable
     *
     *  Scalable
     *
     *  It contains three layers :
     *
     *  Data Layer - handles api calls localstorage and database calls
     *
     *  Domain Layer - Contains Logics and pure kotlin code no interaction with ui
     *
     *  Presentation Layer - interaction with UI
     *
     *  Why Clean architecture
     *
     *  1- Separation of concerns
     *
     *  2- Easy to test
     *
     *  3 - Scalable
     *
     *  4 - Maintainable
     *
     *
     *  1- Domain layer
     *
     *  It contains Usecases or business logic and pure kotlin code
     *
     *  2 - Data layer
     *
     *  It manages data like room database, retrofit for apis or shared preferences.
     *
     *  It also contains the implementation of the interfaces of domain layer.b
     *
     * 3- Presentation Layer
     *
     * It contains the UI part also view models are available in this
     *
     * viemodels are used to communicate with the domain layer and ui.
     *
     *
     * The Three Layers
     * 1. UI Layer (Presentation Layer)
     *
     * Components: Activities, Fragments, ViewModels, Composables
     *
     * Purpose: Handles user interactions and displays data
     *
     * 2. Domain Layer (Business Logic) - Optional
     *
     * Components: Use Cases, Business Logic
     *
     * Purpose: Contains app's business rules and logic
     *
     * 3. Data Layer (Repository Layer)
     *
     * Components: Repositories, Data Sources, APIs, Databases
     *
     * Purpose: Manages data from various sources
     *
     * Access Rules: Who Can Access What
     * ✅ UI Layer CAN Access:
     *
     * Domain Layer ✅ (Use Cases)
     *
     * Data Layer ✅ (But Google recommends going through Domain when possible)
     *
     * ✅ Domain Layer CAN Access:
     *
     * Data Layer ✅ (Repositories)
     *
     * ❌ What Layers CANNOT Access:
     *
     * UI Layer CANNOT Access:
     *
     * Nothing is strictly forbidden, but should avoid direct Data Layer access when Domain Layer exists
     *
     * Domain Layer CANNOT Access:
     *
     * UI Layer ❌ (Cannot import ViewModels, Activities, or any Android UI components)
     *
     * Data Layer CANNOT Access:
     *
     * UI Layer ❌ (Cannot know about ViewModels or UI components)
     *
     * Domain Layer ❌ (Cannot depend on business logic)
     *
     * Key Principles
     * Unidirectional Flow: State flows up, events flow down
     *
     * Data flows: Data Layer → Domain Layer → UI Layer
     *
     * User actions flow: UI Layer → Domain Layer → Data Layer
     *
     * Dependency Rule: Dependencies always point inward
     *
     * Outer layers can depend on inner layers
     *
     * Inner layers never depend on outer layers
     *
     * This keeps business logic independent of frameworks
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     */
}
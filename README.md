پروژه آموزشی Jetpack Compose
این پروژه آموزشی به یادگیرندگان کمک می‌کند تا به طور سیستماتیک با Jetpack Compose آشنا شوند و مهارت‌های لازم را برای توسعه اپلیکیشن‌های اندروید به دست آورند. این README شامل نقشه راه جامع پروژه، ساختار فایل‌ها و توضیحات مربوط به هر سرفصل است.
ساختار پروژه
    stylus
    
    
  
  app/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── msa/
│   │   │           └── composeacademy/
│   │   │               ├── MainActivity.kt
│   │   │               ├── Introduction/
│   │   │               │   ├── IntroductionScreen.kt
│   │   │               │   ├── InstallationScreen.kt
│   │   │               │   └── OverviewScreen.kt
│   │   │               ├── Basics/
│   │   │               │   ├── TextScreen.kt
│   │   │               │   ├── ButtonScreen.kt
│   │   │               │   ├── ImageScreen.kt
│   │   │               │   ├── InputFieldScreen.kt
│   │   │               │   ├── IconScreen.kt
│   │   │               │   └── ColorAndTypographyScreen.kt
│   │   │               ├── StateManagement/
│   │   │               │   ├── StateBasicsScreen.kt
│   │   │               │   ├── RememberScreen.kt
│   │   │               │   ├── MutableStateOfScreen.kt
│   │   │               │   ├── StateHoistingScreen.kt
│   │   │               │   ├── ViewModelIntegrationScreen.kt
│   │   │               │   ├── LiveDataIntegrationScreen.kt
│   │   │               │   └── StateFlowIntegrationScreen.kt
│   │   │               ├── Layouts/
│   │   │               │   ├── ColumnRowScreen.kt
│   │   │               │   ├── BoxScreen.kt
│   │   │               │   ├── ConstraintLayoutScreen.kt
│   │   │               │   ├── CustomLayoutsScreen.kt
│   │   │               │   ├── ResponsiveLayoutsScreen.kt
│   │   │               │   └── GridLayoutsScreen.kt
│   │   │               ├── Navigation/
│   │   │               │   ├── NavigationScreen.kt
│   │   │               │   ├── NestedNavigationScreen.kt
│   │   │               │   ├── BottomNavigationScreen.kt
│   │   │               │   ├── NavigationWithViewModelScreen.kt
│   │   │               │   ├── DeepLinkingScreen.kt
│   │   │               │   └── NavigationAnimationsScreen.kt
│   │   │               ├── DataHandling/
│   │   │               │   ├── LazyColumnScreen.kt
│   │   │               │   ├── ViewModelIntegrationScreen.kt
│   │   │               │   ├── DataClassExampleScreen.kt
│   │   │               │   ├── RoomDatabaseScreen.kt
│   │   │               │   ├── RetrofitIntegrationScreen.kt
│   │   │               │   ├── DataStateManagementScreen.kt
│   │   │               │   └── PagingScreen.kt
│   │   │               ├── Animations/
│   │   │               │   ├── SimpleAnimationScreen.kt
│   │   │               │   ├── AdvancedAnimationScreen.kt
│   │   │               │   ├── AnimatedVisibilityScreen.kt
│   │   │               │   ├── TransitionAnimationsScreen.kt
│   │   │               │   ├── GestureAnimationsScreen.kt
│   │   │               │   └── CustomAnimationsScreen.kt
│   │   │               ├── Testing/
│   │   │               │   ├── ComponentTestingScreen.kt
│   │   │               │   ├── UIAutomationTestingScreen.kt
│   │   │               │   ├── MockingScreen.kt
│   │   │               │   ├── TestingBestPracticesScreen.kt
│   │   │               │   ├── IntegrationTestingScreen.kt
│   │   │               │   └── Test-Driven Development (TDD) Screen.kt
│   │   │               ├── BestPractices/
│   │   │               │   ├── DesignPrinciplesScreen.kt
│   │   │               │   ├── PerformanceOptimizationScreen.kt
│   │   │               │   ├── CodeOrganizationScreen.kt
│   │   │               │   ├── SecurityBestPracticesScreen.kt
│   │   │               │   ├── AccessibilityBestPracticesScreen.kt
│   │   │               │   └── UI/UX Best Practices Screen.kt
│   │   │               ├── AdvancedTopics/
│   │   │               │   ├── SideEffectsScreen.kt
│   │   │               │   ├── ThemingScreen.kt
│   │   │               │   ├── ComplexAnimationsScreen.kt
│   │   │               │   ├── InputHandlingScreen.kt
│   │   │               │   ├── IntegrationWithLibrariesScreen.kt
│   │   │               │   ├── CustomModifiersScreen.kt
│   │   │               │   └── Advanced State Management Screen.kt
│   │   │               ├── NewTopics/
│   │   │               │   ├── Accessibility/
│   │   │               │   │   ├── AccessibilityScreen.kt
│   │   │               │   │   └── AccessibilityBestPracticesScreen.kt
│   │   │               │   ├── Performance/
│   │   │               │   │   ├── PerformanceOptimizationScreen.kt
│   │   │               │   │   └── ProfilingToolsScreen.kt
│   │   │               │   ├── DependencyInjection/
│   │   │               │   │   ├── DependencyInjectionScreen.kt
│   │   │               │   │   └── HiltIntegrationScreen.kt
│   │   │               │   ├── Localization/
│   │   │               │   │   ├── LocalizationScreen.kt
│   │   │               │   │   └── MultiLanguageSupportScreen.kt
│   │   │               │   ├── Networking/
│   │   │               │   │   ├── NetworkingScreen.kt
│   │   │               │   │   └── ApiIntegrationScreen.kt
│   │   │               │   ├── CustomComponents/
│   │   │               │   │   ├── CustomComponentsScreen.kt
│   │   │               │   │   └── ReusableComponentsScreen.kt
│   │   │               │   ├── Coroutines/
│   │   │               │   │   ├── CoroutinesScreen.kt
│   │   │               │   │   └── FlowAndStateFlowScreen.kt
│   │   │               │   └── LibraryIntegration/
│   │   │               │       ├── LibraryIntegrationScreen.kt
│   │   │               │       └── PopularLibrariesScreen.kt
│   │   │               └── FinalProject/
│   │   │                   ├── FinalProjectScreen.kt
│   │   │                   ├── FinalProjectDetails.kt
│   │   │                   └── FinalProjectResources.kt
│   │   └── res/
│   │       ├── drawable/
│   │       ├── layout/
│   │       └── values/
│   │           ├── colors.xml
│   │           ├── strings.xml
│   │           └── styles.xml

توضیحات سرفصل‌ها و زیرمجموعه‌ها
1. Introduction

IntroductionScreen.kt: معرفی Jetpack Compose و کاربردهای آن.
InstallationScreen.kt: مراحل نصب و راه‌اندازی محیط توسعه.
OverviewScreen.kt: مرور کلی بر مفاهیم کلیدی Jetpack Compose.

2. Basics

TextScreen.kt: نحوه استفاده از متن و ویژگی‌های آن.
ButtonScreen.kt: ایجاد و مدیریت دکمه‌ها.
ImageScreen.kt: کار با تصاویر و نحوه بارگذاری آن‌ها.
InputFieldScreen.kt: ایجاد فیلدهای ورودی و مدیریت داده‌های ورودی.
IconScreen.kt: نحوه استفاده از آیکون‌ها و طراحی آیکون‌های سفارشی.
ColorAndTypographyScreen.kt: مدیریت رنگ‌ها و نوع‌خط‌ها.

3. State Management

StateBasicsScreen.kt: مفاهیم پایه مدیریت وضعیت.
RememberScreen.kt: استفاده از Remember برای حفظ وضعیت.
MutableStateOfScreen.kt: استفاده از MutableState برای مدیریت وضعیت.
StateHoistingScreen.kt: مفهوم State Hoisting و کاربرد آن.
ViewModelIntegrationScreen.kt: ادغام ViewModel برای مدیریت وضعیت.
LiveDataIntegrationScreen.kt: ادغام LiveData با Jetpack Compose.
StateFlowIntegrationScreen.kt: استفاده از StateFlow برای مدیریت وضعیت.

4. Layouts

ColumnRowScreen.kt: استفاده از Column و Row برای چیدمان.
BoxScreen.kt: استفاده از Box برای لایه‌بندی.
ConstraintLayoutScreen.kt: طراحی چیدمان‌های پیچیده با ConstraintLayout.
CustomLayoutsScreen.kt: ایجاد چیدمان‌های سفارشی.
ResponsiveLayoutsScreen.kt: طراحی چیدمان‌های پاسخگو.
GridLayoutsScreen.kt: طراحی چیدمان‌های شبکه‌ای.

5. Navigation

NavigationScreen.kt: پیاده‌سازی ناوبری در Jetpack Compose.
NestedNavigationScreen.kt: پیاده‌سازی ناوبری تو در تو.
BottomNavigationScreen.kt: پیاده‌سازی ناوبری از پایین.
NavigationWithViewModelScreen.kt: استفاده از ViewModel در ناوبری.
DeepLinkingScreen.kt: پیاده‌سازی Deep Linking.
NavigationAnimationsScreen.kt: انیمیشن‌ها در ناوبری.

6. Data Handling

LazyColumnScreen.kt: استفاده از LazyColumn برای لیست‌های بزرگ.
ViewModelIntegrationScreen.kt: ادغام ViewModel برای مدیریت داده‌ها.
DataClassExampleScreen.kt: استفاده از Data Classها.
RoomDatabaseScreen.kt: کار با پایگاه داده Room.
RetrofitIntegrationScreen.kt: استفاده از Retrofit برای APIها.
DataStateManagementScreen.kt: مدیریت وضعیت داده‌ها.
PagingScreen.kt: پیاده‌سازی Paging برای داده‌های بزرگ.

7. Animations

SimpleAnimationScreen.kt: ایجاد انیمیشن‌های ساده.
AdvancedAnimationScreen.kt: انیمیشن‌های پیشرفته.
AnimatedVisibilityScreen.kt: استفاده از انیمیشن‌های نمایشی.
TransitionAnimationsScreen.kt: انیمیشن‌های انتقالی.
GestureAnimationsScreen.kt: انیمیشن‌های مبتنی بر حرکات کاربر.
CustomAnimationsScreen.kt: ایجاد انیمیشن‌های سفارشی.

8. Testing

ComponentTestingScreen.kt: تست کامپوننت‌ها.
UIAutomationTestingScreen.kt: تست خودکار UI.
MockingScreen.kt: استفاده از Mocking در تست‌ها.
TestingBestPracticesScreen.kt: بهترین شیوه‌ها برای تست.
IntegrationTestingScreen.kt: تست‌های یکپارچه.
Test-Driven Development (TDD) Screen.kt: پیاده‌سازی TDD.

9. Best Practices

DesignPrinciplesScreen.kt: اصول طراحی در Jetpack Compose.
PerformanceOptimizationScreen.kt: بهینه‌سازی عملکرد.
CodeOrganizationScreen.kt: سازمان‌دهی کد.
SecurityBestPracticesScreen.kt: بهترین شیوه‌ها برای امنیت.
AccessibilityBestPracticesScreen.kt: بهترین شیوه‌ها برای طراحی دسترس‌پذیر.
UI/UX Best Practices Screen.kt: بهترین شیوه‌ها برای طراحی UI و UX.

10. Advanced Topics

SideEffectsScreen.kt: مدیریت اثرات جانبی.
ThemingScreen.kt: نحوه ایجاد تم‌ها.
ComplexAnimationsScreen.kt: انیمیشن‌های پیچیده.
InputHandlingScreen.kt: مدیریت ورودی‌ها.
IntegrationWithLibrariesScreen.kt: ادغام با کتابخانه‌های دیگر.
CustomModifiersScreen.kt: ایجاد Modifiers سفارشی.
Advanced State Management Screen.kt: تکنیک‌های پیشرفته مدیریت وضعیت.

11. New Topics

Accessibility

AccessibilityScreen.kt: معرفی مفاهیم دسترس‌پذیری.
AccessibilityBestPracticesScreen.kt: بهترین شیوه‌ها برای طراحی دسترس‌پذیر.


Performance

PerformanceOptimizationScreen.kt: بهینه‌سازی عملکرد.
ProfilingToolsScreen.kt: ابزارهای پروفایلینگ.


Dependency Injection

DependencyInjectionScreen.kt: معرفی تزریق وابستگی.
HiltIntegrationScreen.kt: ادغام Hilt با Jetpack Compose.


Localization

LocalizationScreen.kt: نحوه پشتیبانی از زبان‌های مختلف.
MultiLanguageSupportScreen.kt: مدیریت چندزبانگی.


Networking

NetworkingScreen.kt: کار با APIها.
ApiIntegrationScreen.kt: جزئیات درخواست‌های شبکه‌ای.


Custom Components

CustomComponentsScreen.kt: ایجاد کامپوننت‌های سفارشی.
ReusableComponentsScreen.kt: مدیریت کامپوننت‌های قابل استفاده مجدد.


Coroutines

CoroutinesScreen.kt: استفاده از کروتین‌ها.
FlowAndStateFlowScreen.kt: مدیریت داده‌های ناهمزمان.


Library Integration

LibraryIntegrationScreen.kt: ادغام با کتابخانه‌های محبوب.
PopularLibrariesScreen.kt: معرفی کتابخانه‌های کاربردی.



12. Final Project

FinalProjectScreen.kt: معرفی پروژه نهایی.
FinalProjectDetails.kt: جزئیات پروژه نهایی و اهداف آن.
FinalProjectResources.kt: منابع و مستندات مورد نیاز برای پروژه نهایی.

نتیجه‌گیری
این نقشه راه جامع و کامل به یادگیرندگان کمک می‌کند تا به طور سیستماتیک و مرحله به مرحله با Jetpack Compose آشنا شوند و مهارت‌های لازم را برای توسعه اپلیکیشن‌های اندروید به دست آورند. با این ساختار، یادگیرندگان می‌توانند به راحتی به موضوعات مختلف دسترسی پیدا کنند و درک عمیق‌تری از مفاهیم و تکنیک‌ها داشته باشند. این رویکرد یادگیری به یک تجربه جذاب و مفید تبدیل می‌شود که به یادگیرندگان ابزارهای لازم برای موفقیت در پروژه‌های واقعی را می‌دهد.

این فایل README می‌تواند به عنوان یک راهنما برای شروع کار با پروژه آموزشی Jetpack Compose استفاده شود و به یادگیرندگان کمک کند تا به راحتی به منابع و سرفصل‌های مورد نیاز خود دسترسی پیدا کنند.

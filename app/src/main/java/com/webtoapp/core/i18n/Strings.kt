package com.webtoapp.core.i18n

import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalContext

/**
 * 多语言字符串管理器
 * 提供运行时可切换的多语言字符串
 * 
 * 支持语言：中文、英文、阿拉伯语
 */
object Strings {
    
    // 当前语言状态
    private val _currentLanguage = mutableStateOf(AppLanguage.CHINESE)
    val currentLanguage: State<AppLanguage> = _currentLanguage
    
    fun setLanguage(language: AppLanguage) {
        _currentLanguage.value = language
    }
    
    // 获取当前语言
    private val lang: AppLanguage get() = _currentLanguage.value
    
    // ==================== 应用标题 ====================
    val appTitle: String get() = "WebToApp"
    
    // ==================== 主界面 ====================
    val myApps: String get() = when (lang) {
        AppLanguage.CHINESE -> "我的应用"
        AppLanguage.ENGLISH -> "My Apps"
        AppLanguage.ARABIC -> "تطبيقاتي"
    }
    
    val createApp: String get() = when (lang) {
        AppLanguage.CHINESE -> "创建应用"
        AppLanguage.ENGLISH -> "Create App"
        AppLanguage.ARABIC -> "إنشاء تطبيق"
    }
    
    val settings: String get() = when (lang) {
        AppLanguage.CHINESE -> "设置"
        AppLanguage.ENGLISH -> "Settings"
        AppLanguage.ARABIC -> "الإعدادات"
    }
    
    val search: String get() = when (lang) {
        AppLanguage.CHINESE -> "搜索..."
        AppLanguage.ENGLISH -> "Search..."
        AppLanguage.ARABIC -> "بحث..."
    }

    val more: String get() = when (lang) {
        AppLanguage.CHINESE -> "更多"
        AppLanguage.ENGLISH -> "More"
        AppLanguage.ARABIC -> "المزيد"
    }
    
    val back: String get() = when (lang) {
        AppLanguage.CHINESE -> "返回"
        AppLanguage.ENGLISH -> "Back"
        AppLanguage.ARABIC -> "رجوع"
    }
    
    // ==================== 菜单项 ====================
    val menuAiHtmlCoding: String get() = when (lang) {
        AppLanguage.CHINESE -> "AI HTML编程"
        AppLanguage.ENGLISH -> "AI HTML Coding"
        AppLanguage.ARABIC -> "برمجة AI HTML"
    }
    
    val menuThemeSettings: String get() = when (lang) {
        AppLanguage.CHINESE -> "主题设置"
        AppLanguage.ENGLISH -> "Theme Settings"
        AppLanguage.ARABIC -> "إعدادات السمة"
    }
    
    val menuAiSettings: String get() = when (lang) {
        AppLanguage.CHINESE -> "AI 设置"
        AppLanguage.ENGLISH -> "AI Settings"
        AppLanguage.ARABIC -> "إعدادات AI"
    }
    
    val menuAppModifier: String get() = when (lang) {
        AppLanguage.CHINESE -> "应用修改器"
        AppLanguage.ENGLISH -> "App Modifier"
        AppLanguage.ARABIC -> "معدل التطبيق"
    }
    
    val menuExtensionModules: String get() = when (lang) {
        AppLanguage.CHINESE -> "扩展模块"
        AppLanguage.ENGLISH -> "Extension Modules"
        AppLanguage.ARABIC -> "الوحدات الإضافية"
    }
    
    val menuAbout: String get() = when (lang) {
        AppLanguage.CHINESE -> "关于"
        AppLanguage.ENGLISH -> "About"
        AppLanguage.ARABIC -> "حول"
    }
    
    val menuLinuxEnvironment: String get() = when (lang) {
        AppLanguage.CHINESE -> "Linux 环境"
        AppLanguage.ENGLISH -> "Linux Environment"
        AppLanguage.ARABIC -> "بيئة Linux"
    }
    
    val menuLanguage: String get() = when (lang) {
        AppLanguage.CHINESE -> "语言"
        AppLanguage.ENGLISH -> "Language"
        AppLanguage.ARABIC -> "اللغة"
    }

    // ==================== 创建应用类型 ====================
    val createWebApp: String get() = when (lang) {
        AppLanguage.CHINESE -> "网页应用"
        AppLanguage.ENGLISH -> "Web App"
        AppLanguage.ARABIC -> "تطبيق ويب"
    }
    
    val createMediaApp: String get() = when (lang) {
        AppLanguage.CHINESE -> "媒体应用"
        AppLanguage.ENGLISH -> "Media App"
        AppLanguage.ARABIC -> "تطبيق وسائط"
    }
    
    val createHtmlApp: String get() = when (lang) {
        AppLanguage.CHINESE -> "HTML应用"
        AppLanguage.ENGLISH -> "HTML App"
        AppLanguage.ARABIC -> "تطبيق HTML"
    }
    
    val createFrontendApp: String get() = when (lang) {
        AppLanguage.CHINESE -> "前端项目"
        AppLanguage.ENGLISH -> "Frontend Project"
        AppLanguage.ARABIC -> "مشروع الواجهة الأمامية"
    }
    
    // ==================== 操作按钮 ====================
    val btnCreate: String get() = when (lang) {
        AppLanguage.CHINESE -> "创建应用"
        AppLanguage.ENGLISH -> "Create App"
        AppLanguage.ARABIC -> "إنشاء تطبيق"
    }
    
    val btnPreview: String get() = when (lang) {
        AppLanguage.CHINESE -> "预览"
        AppLanguage.ENGLISH -> "Preview"
        AppLanguage.ARABIC -> "معاينة"
    }
    
    val btnExport: String get() = when (lang) {
        AppLanguage.CHINESE -> "导出APK"
        AppLanguage.ENGLISH -> "Export APK"
        AppLanguage.ARABIC -> "تصدير APK"
    }
    
    val btnSave: String get() = when (lang) {
        AppLanguage.CHINESE -> "保存"
        AppLanguage.ENGLISH -> "Save"
        AppLanguage.ARABIC -> "حفظ"
    }
    
    val btnCancel: String get() = when (lang) {
        AppLanguage.CHINESE -> "取消"
        AppLanguage.ENGLISH -> "Cancel"
        AppLanguage.ARABIC -> "إلغاء"
    }
    
    val btnDelete: String get() = when (lang) {
        AppLanguage.CHINESE -> "删除"
        AppLanguage.ENGLISH -> "Delete"
        AppLanguage.ARABIC -> "حذف"
    }
    
    val btnEdit: String get() = when (lang) {
        AppLanguage.CHINESE -> "编辑"
        AppLanguage.ENGLISH -> "Edit"
        AppLanguage.ARABIC -> "تعديل"
    }
    
    val btnLaunch: String get() = when (lang) {
        AppLanguage.CHINESE -> "启动"
        AppLanguage.ENGLISH -> "Launch"
        AppLanguage.ARABIC -> "تشغيل"
    }
    
    val btnShortcut: String get() = when (lang) {
        AppLanguage.CHINESE -> "创建快捷方式"
        AppLanguage.ENGLISH -> "Create Shortcut"
        AppLanguage.ARABIC -> "إنشاء اختصار"
    }
    
    val btnConfirm: String get() = when (lang) {
        AppLanguage.CHINESE -> "确认"
        AppLanguage.ENGLISH -> "Confirm"
        AppLanguage.ARABIC -> "تأكيد"
    }
    
    val btnOk: String get() = when (lang) {
        AppLanguage.CHINESE -> "确定"
        AppLanguage.ENGLISH -> "OK"
        AppLanguage.ARABIC -> "موافق"
    }
    
    val btnRetry: String get() = when (lang) {
        AppLanguage.CHINESE -> "重试"
        AppLanguage.ENGLISH -> "Retry"
        AppLanguage.ARABIC -> "إعادة المحاولة"
    }
    
    val btnImport: String get() = when (lang) {
        AppLanguage.CHINESE -> "导入"
        AppLanguage.ENGLISH -> "Import"
        AppLanguage.ARABIC -> "استيراد"
    }
    
    val btnBuild: String get() = when (lang) {
        AppLanguage.CHINESE -> "构建"
        AppLanguage.ENGLISH -> "Build"
        AppLanguage.ARABIC -> "بناء"
    }
    
    val btnStartBuild: String get() = when (lang) {
        AppLanguage.CHINESE -> "开始构建"
        AppLanguage.ENGLISH -> "Start Build"
        AppLanguage.ARABIC -> "بدء البناء"
    }
    
    val btnReset: String get() = when (lang) {
        AppLanguage.CHINESE -> "重置"
        AppLanguage.ENGLISH -> "Reset"
        AppLanguage.ARABIC -> "إعادة تعيين"
    }
    
    val btnClearCache: String get() = when (lang) {
        AppLanguage.CHINESE -> "清理缓存"
        AppLanguage.ENGLISH -> "Clear Cache"
        AppLanguage.ARABIC -> "مسح ذاكرة التخزين المؤقت"
    }
    
    val help: String get() = when (lang) {
        AppLanguage.CHINESE -> "帮助"
        AppLanguage.ENGLISH -> "Help"
        AppLanguage.ARABIC -> "مساعدة"
    }
    
    val usageHelp: String get() = when (lang) {
        AppLanguage.CHINESE -> "使用帮助"
        AppLanguage.ENGLISH -> "Usage Help"
        AppLanguage.ARABIC -> "مساعدة الاستخدام"
    }
    
    val iUnderstand: String get() = when (lang) {
        AppLanguage.CHINESE -> "我知道了"
        AppLanguage.ENGLISH -> "I Understand"
        AppLanguage.ARABIC -> "فهمت"
    }
    
    val selectModuleCategory: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择模块分类"
        AppLanguage.ENGLISH -> "Select Module Category"
        AppLanguage.ARABIC -> "اختر فئة الوحدة"
    }
    
    val autoDetect: String get() = when (lang) {
        AppLanguage.CHINESE -> "自动识别"
        AppLanguage.ENGLISH -> "Auto Detect"
        AppLanguage.ARABIC -> "الكشف التلقائي"
    }
    
    val autoDetectCategoryHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "让 AI 根据需求自动选择分类"
        AppLanguage.ENGLISH -> "Let AI automatically select category based on requirements"
        AppLanguage.ARABIC -> "دع الذكاء الاصطناعي يختار الفئة تلقائيًا بناءً على المتطلبات"
    }
    
    // ==================== AI 模块开发帮助 ====================
    val helpHowToUse: String get() = when (lang) {
        AppLanguage.CHINESE -> "如何使用"
        AppLanguage.ENGLISH -> "How to Use"
        AppLanguage.ARABIC -> "كيفية الاستخدام"
    }
    
    val helpHowToUseContent: String get() = when (lang) {
        AppLanguage.CHINESE -> "在输入框中用自然语言描述你想要的功能，AI 会自动分析需求并生成对应的扩展模块代码。"
        AppLanguage.ENGLISH -> "Describe the functionality you want in natural language in the input box, and AI will automatically analyze the requirements and generate the corresponding extension module code."
        AppLanguage.ARABIC -> "صف الوظيفة التي تريدها بلغة طبيعية في مربع الإدخال، وسيقوم الذكاء الاصطناعي بتحليل المتطلبات تلقائيًا وإنشاء كود وحدة الإضافة المقابل."
    }
    
    val helpRequirementTips: String get() = when (lang) {
        AppLanguage.CHINESE -> "需求描述技巧"
        AppLanguage.ENGLISH -> "Requirement Description Tips"
        AppLanguage.ARABIC -> "نصائح وصف المتطلبات"
    }
    
    val helpRequirementTipsContent: String get() = when (lang) {
        AppLanguage.CHINESE -> "• 描述具体的功能效果\n• 说明目标网站或页面类型\n• 可以参考示例需求的写法"
        AppLanguage.ENGLISH -> "• Describe specific functionality effects\n• Specify target website or page type\n• Refer to example requirements for guidance"
        AppLanguage.ARABIC -> "• وصف تأثيرات الوظائف المحددة\n• تحديد نوع الموقع أو الصفحة المستهدفة\n• الرجوع إلى أمثلة المتطلبات للإرشاد"
    }
    
    val helpModelSelection: String get() = when (lang) {
        AppLanguage.CHINESE -> "模型选择"
        AppLanguage.ENGLISH -> "Model Selection"
        AppLanguage.ARABIC -> "اختيار النموذج"
    }
    
    val helpModelSelectionContent: String get() = when (lang) {
        AppLanguage.CHINESE -> "可以选择不同的 AI 模型来生成代码。不同模型可能有不同的效果和速度。"
        AppLanguage.ENGLISH -> "You can choose different AI models to generate code. Different models may have different effects and speeds."
        AppLanguage.ARABIC -> "يمكنك اختيار نماذج ذكاء اصطناعي مختلفة لإنشاء الكود. قد يكون للنماذج المختلفة تأثيرات وسرعات مختلفة."
    }
    
    val helpCategorySelection: String get() = when (lang) {
        AppLanguage.CHINESE -> "分类选择"
        AppLanguage.ENGLISH -> "Category Selection"
        AppLanguage.ARABIC -> "اختيار الفئة"
    }
    
    val helpCategorySelectionContent: String get() = when (lang) {
        AppLanguage.CHINESE -> "可以手动选择模块分类，也可以让 AI 自动识别。手动选择可以让生成的代码更精准。"
        AppLanguage.ENGLISH -> "You can manually select module category or let AI auto-detect. Manual selection can make generated code more precise."
        AppLanguage.ARABIC -> "يمكنك اختيار فئة الوحدة يدويًا أو السماح للذكاء الاصطناعي بالكشف التلقائي. الاختيار اليدوي يجعل الكود المُنشأ أكثر دقة."
    }
    
    val helpAutoCheck: String get() = when (lang) {
        AppLanguage.CHINESE -> "自动检查"
        AppLanguage.ENGLISH -> "Auto Check"
        AppLanguage.ARABIC -> "الفحص التلقائي"
    }
    
    val helpAutoCheckContent: String get() = when (lang) {
        AppLanguage.CHINESE -> "AI 会自动进行语法检查和安全扫描，确保生成的代码可以正常运行且没有安全隐患。"
        AppLanguage.ENGLISH -> "AI will automatically perform syntax checking and security scanning to ensure generated code runs properly without security risks."
        AppLanguage.ARABIC -> "سيقوم الذكاء الاصطناعي تلقائيًا بإجراء فحص بناء الجملة والمسح الأمني لضمان تشغيل الكود المُنشأ بشكل صحيح دون مخاطر أمنية."
    }
    
    val helpCodeEdit: String get() = when (lang) {
        AppLanguage.CHINESE -> "代码编辑"
        AppLanguage.ENGLISH -> "Code Editing"
        AppLanguage.ARABIC -> "تحرير الكود"
    }
    
    val helpCodeEditContent: String get() = when (lang) {
        AppLanguage.CHINESE -> "生成的代码可以直接编辑修改，保存时会使用修改后的版本。"
        AppLanguage.ENGLISH -> "Generated code can be directly edited and modified. The modified version will be used when saving."
        AppLanguage.ARABIC -> "يمكن تحرير وتعديل الكود المُنشأ مباشرة. سيتم استخدام النسخة المعدلة عند الحفظ."
    }
    
    val helpSaveModule: String get() = when (lang) {
        AppLanguage.CHINESE -> "保存模块"
        AppLanguage.ENGLISH -> "Save Module"
        AppLanguage.ARABIC -> "حفظ الوحدة"
    }
    
    val helpSaveModuleContent: String get() = when (lang) {
        AppLanguage.CHINESE -> "生成完成后，点击「保存」将其添加到你的模块库中，之后可以在创建应用时使用。"
        AppLanguage.ENGLISH -> "After generation is complete, click 'Save' to add it to your module library for use when creating apps."
        AppLanguage.ARABIC -> "بعد اكتمال الإنشاء، انقر على 'حفظ' لإضافته إلى مكتبة الوحدات الخاصة بك لاستخدامه عند إنشاء التطبيقات."
    }

    // ==================== 表单标签 ====================
    val labelAppName: String get() = when (lang) {
        AppLanguage.CHINESE -> "应用名称"
        AppLanguage.ENGLISH -> "App Name"
        AppLanguage.ARABIC -> "اسم التطبيق"
    }
    
    val labelUrl: String get() = when (lang) {
        AppLanguage.CHINESE -> "网站地址"
        AppLanguage.ENGLISH -> "Website URL"
        AppLanguage.ARABIC -> "عنوان الموقع"
    }
    
    val labelIcon: String get() = when (lang) {
        AppLanguage.CHINESE -> "应用图标"
        AppLanguage.ENGLISH -> "App Icon"
        AppLanguage.ARABIC -> "أيقونة التطبيق"
    }
    
    val labelBasicInfo: String get() = when (lang) {
        AppLanguage.CHINESE -> "基本信息"
        AppLanguage.ENGLISH -> "Basic Info"
        AppLanguage.ARABIC -> "المعلومات الأساسية"
    }
    
    val labelAdvancedConfig: String get() = when (lang) {
        AppLanguage.CHINESE -> "高级配置"
        AppLanguage.ENGLISH -> "Advanced Config"
        AppLanguage.ARABIC -> "الإعدادات المتقدمة"
    }
    
    val labelDisplaySettings: String get() = when (lang) {
        AppLanguage.CHINESE -> "显示设置"
        AppLanguage.ENGLISH -> "Display Settings"
        AppLanguage.ARABIC -> "إعدادات العرض"
    }
    
    val labelAppInfo: String get() = when (lang) {
        AppLanguage.CHINESE -> "应用信息"
        AppLanguage.ENGLISH -> "App Info"
        AppLanguage.ARABIC -> "معلومات التطبيق"
    }
    
    // ==================== 提示消息 ====================
    val msgAppCreated: String get() = when (lang) {
        AppLanguage.CHINESE -> "应用创建成功"
        AppLanguage.ENGLISH -> "App created successfully"
        AppLanguage.ARABIC -> "تم إنشاء التطبيق بنجاح"
    }
    
    val msgAppDeleted: String get() = when (lang) {
        AppLanguage.CHINESE -> "应用已删除"
        AppLanguage.ENGLISH -> "App deleted"
        AppLanguage.ARABIC -> "تم حذف التطبيق"
    }
    
    val msgLoading: String get() = when (lang) {
        AppLanguage.CHINESE -> "加载中..."
        AppLanguage.ENGLISH -> "Loading..."
        AppLanguage.ARABIC -> "جاري التحميل..."
    }
    
    val msgNoApps: String get() = when (lang) {
        AppLanguage.CHINESE -> "暂无应用"
        AppLanguage.ENGLISH -> "No apps yet"
        AppLanguage.ARABIC -> "لا توجد تطبيقات بعد"
    }
    
    val msgLanguageChanged: String get() = when (lang) {
        AppLanguage.CHINESE -> "语言已更改"
        AppLanguage.ENGLISH -> "Language changed"
        AppLanguage.ARABIC -> "تم تغيير اللغة"
    }
    
    val msgExportSuccess: String get() = when (lang) {
        AppLanguage.CHINESE -> "APK导出成功"
        AppLanguage.ENGLISH -> "APK exported successfully"
        AppLanguage.ARABIC -> "تم تصدير APK بنجاح"
    }
    
    val msgExportFailed: String get() = when (lang) {
        AppLanguage.CHINESE -> "APK导出失败"
        AppLanguage.ENGLISH -> "APK export failed"
        AppLanguage.ARABIC -> "فشل تصدير APK"
    }
    
    val msgImportSuccess: String get() = when (lang) {
        AppLanguage.CHINESE -> "导入成功"
        AppLanguage.ENGLISH -> "Import successful"
        AppLanguage.ARABIC -> "تم الاستيراد بنجاح"
    }
    
    val msgImportFailed: String get() = when (lang) {
        AppLanguage.CHINESE -> "导入失败"
        AppLanguage.ENGLISH -> "Import failed"
        AppLanguage.ARABIC -> "فشل الاستيراد"
    }
    
    val msgCopied: String get() = when (lang) {
        AppLanguage.CHINESE -> "已复制"
        AppLanguage.ENGLISH -> "Copied"
        AppLanguage.ARABIC -> "تم النسخ"
    }
    
    val msgDeleted: String get() = when (lang) {
        AppLanguage.CHINESE -> "已删除"
        AppLanguage.ENGLISH -> "Deleted"
        AppLanguage.ARABIC -> "تم الحذف"
    }

    // ==================== 删除确认对话框 ====================
    val deleteConfirmTitle: String get() = when (lang) {
        AppLanguage.CHINESE -> "确认删除"
        AppLanguage.ENGLISH -> "Confirm Delete"
        AppLanguage.ARABIC -> "تأكيد الحذف"
    }
    
    val deleteConfirmMessage: String get() = when (lang) {
        AppLanguage.CHINESE -> "确定要删除这个应用吗？"
        AppLanguage.ENGLISH -> "Are you sure you want to delete this app?"
        AppLanguage.ARABIC -> "هل أنت متأكد أنك تريد حذف هذا التطبيق؟"
    }
    
    // ==================== 构建对话框 ====================
    val buildDialogTitle: String get() = when (lang) {
        AppLanguage.CHINESE -> "构建 APK"
        AppLanguage.ENGLISH -> "Build APK"
        AppLanguage.ARABIC -> "بناء APK"
    }
    
    val buildDialogBuilding: String get() = when (lang) {
        AppLanguage.CHINESE -> "正在构建..."
        AppLanguage.ENGLISH -> "Building..."
        AppLanguage.ARABIC -> "جاري البناء..."
    }
    
    // ==================== 构建环境页面 ====================
    val buildEnvironment: String get() = when (lang) {
        AppLanguage.CHINESE -> "构建环境"
        AppLanguage.ENGLISH -> "Build Environment"
        AppLanguage.ARABIC -> "بيئة البناء"
    }
    
    val envReady: String get() = when (lang) {
        AppLanguage.CHINESE -> "环境就绪"
        AppLanguage.ENGLISH -> "Environment Ready"
        AppLanguage.ARABIC -> "البيئة جاهزة"
    }
    
    val envNotInstalled: String get() = when (lang) {
        AppLanguage.CHINESE -> "可以使用"
        AppLanguage.ENGLISH -> "Available"
        AppLanguage.ARABIC -> "متاح"
    }
    
    val envDownloading: String get() = when (lang) {
        AppLanguage.CHINESE -> "下载中"
        AppLanguage.ENGLISH -> "Downloading"
        AppLanguage.ARABIC -> "جاري التحميل"
    }
    
    val envInstalling: String get() = when (lang) {
        AppLanguage.CHINESE -> "安装中"
        AppLanguage.ENGLISH -> "Installing"
        AppLanguage.ARABIC -> "جاري التثبيت"
    }
    
    val canBuildFrontend: String get() = when (lang) {
        AppLanguage.CHINESE -> "可以构建前端项目"
        AppLanguage.ENGLISH -> "Can build frontend projects"
        AppLanguage.ARABIC -> "يمكن بناء مشاريع الواجهة الأمامية"
    }
    
    val builtInPackagerReady: String get() = when (lang) {
        AppLanguage.CHINESE -> "内置打包器已就绪"
        AppLanguage.ENGLISH -> "Built-in packager ready"
        AppLanguage.ARABIC -> "أداة التعبئة المدمجة جاهزة"
    }
    
    val installAdvancedBuildTool: String get() = when (lang) {
        AppLanguage.CHINESE -> "安装高级构建工具 (esbuild)"
        AppLanguage.ENGLISH -> "Install Advanced Build Tool (esbuild)"
        AppLanguage.ARABIC -> "تثبيت أداة البناء المتقدمة (esbuild)"
    }
    
    val optionalEsbuildHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "可选：安装 esbuild 可获得更好的构建性能"
        AppLanguage.ENGLISH -> "Optional: Install esbuild for better build performance"
        AppLanguage.ARABIC -> "اختياري: تثبيت esbuild للحصول على أداء بناء أفضل"
    }
    
    val buildTools: String get() = when (lang) {
        AppLanguage.CHINESE -> "构建工具"
        AppLanguage.ENGLISH -> "Build Tools"
        AppLanguage.ARABIC -> "أدوات البناء"
    }
    
    val builtInPackager: String get() = when (lang) {
        AppLanguage.CHINESE -> "内置打包器"
        AppLanguage.ENGLISH -> "Built-in Packager"
        AppLanguage.ARABIC -> "أداة التعبئة المدمجة"
    }
    
    val pureKotlinImpl: String get() = when (lang) {
        AppLanguage.CHINESE -> "纯 Kotlin 实现，无需外部依赖"
        AppLanguage.ENGLISH -> "Pure Kotlin implementation, no external dependencies"
        AppLanguage.ARABIC -> "تنفيذ Kotlin خالص، بدون تبعيات خارجية"
    }
    
    val highPerfBuildTool: String get() = when (lang) {
        AppLanguage.CHINESE -> "高性能构建工具"
        AppLanguage.ENGLISH -> "High-performance build tool"
        AppLanguage.ARABIC -> "أداة بناء عالية الأداء"
    }
    
    val installed: String get() = when (lang) {
        AppLanguage.CHINESE -> "已安装"
        AppLanguage.ENGLISH -> "Installed"
        AppLanguage.ARABIC -> "مثبت"
    }
    
    val notInstalled: String get() = when (lang) {
        AppLanguage.CHINESE -> "未安装"
        AppLanguage.ENGLISH -> "Not Installed"
        AppLanguage.ARABIC -> "غير مثبت"
    }
    
    val ready: String get() = when (lang) {
        AppLanguage.CHINESE -> "已就绪"
        AppLanguage.ENGLISH -> "Ready"
        AppLanguage.ARABIC -> "جاهز"
    }
    
    val storageUsage: String get() = when (lang) {
        AppLanguage.CHINESE -> "存储使用"
        AppLanguage.ENGLISH -> "Storage Usage"
        AppLanguage.ARABIC -> "استخدام التخزين"
    }
    
    val cache: String get() = when (lang) {
        AppLanguage.CHINESE -> "缓存"
        AppLanguage.ENGLISH -> "Cache"
        AppLanguage.ARABIC -> "ذاكرة التخزين المؤقت"
    }
    
    val supportedFeatures: String get() = when (lang) {
        AppLanguage.CHINESE -> "支持的功能"
        AppLanguage.ENGLISH -> "Supported Features"
        AppLanguage.ARABIC -> "الميزات المدعومة"
    }
    
    val techDescription: String get() = when (lang) {
        AppLanguage.CHINESE -> "技术说明"
        AppLanguage.ENGLISH -> "Technical Description"
        AppLanguage.ARABIC -> "الوصف التقني"
    }
    
    val resetEnvironment: String get() = when (lang) {
        AppLanguage.CHINESE -> "重置环境"
        AppLanguage.ENGLISH -> "Reset Environment"
        AppLanguage.ARABIC -> "إعادة تعيين البيئة"
    }
    
    val resetEnvConfirm: String get() = when (lang) {
        AppLanguage.CHINESE -> "这将删除已下载的构建工具。确定要继续吗？"
        AppLanguage.ENGLISH -> "This will delete downloaded build tools. Are you sure?"
        AppLanguage.ARABIC -> "سيؤدي هذا إلى حذف أدوات البناء المحملة. هل أنت متأكد؟"
    }
    
    val clearCacheTitle: String get() = when (lang) {
        AppLanguage.CHINESE -> "清理缓存"
        AppLanguage.ENGLISH -> "Clear Cache"
        AppLanguage.ARABIC -> "مسح ذاكرة التخزين المؤقت"
    }
    
    val clearCacheConfirm: String get() = when (lang) {
        AppLanguage.CHINESE -> "这将清理构建缓存和临时文件。"
        AppLanguage.ENGLISH -> "This will clear build cache and temporary files."
        AppLanguage.ARABIC -> "سيؤدي هذا إلى مسح ذاكرة التخزين المؤقت للبناء والملفات المؤقتة."
    }
    
    val clean: String get() = when (lang) {
        AppLanguage.CHINESE -> "清理"
        AppLanguage.ENGLISH -> "Clean"
        AppLanguage.ARABIC -> "تنظيف"
    }

    // ==================== 前端项目页面 ====================
    val selectProject: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择项目"
        AppLanguage.ENGLISH -> "Select Project"
        AppLanguage.ARABIC -> "اختيار المشروع"
    }
    
    val selectProjectFolder: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择项目文件夹"
        AppLanguage.ENGLISH -> "Select Project Folder"
        AppLanguage.ARABIC -> "اختيار مجلد المشروع"
    }
    
    val selectProjectHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择项目根目录或构建输出目录（dist/build）"
        AppLanguage.ENGLISH -> "Select project root or build output directory (dist/build)"
        AppLanguage.ARABIC -> "اختر جذر المشروع أو دليل إخراج البناء (dist/build)"
    }
    
    val projectAnalysis: String get() = when (lang) {
        AppLanguage.CHINESE -> "项目分析"
        AppLanguage.ENGLISH -> "Project Analysis"
        AppLanguage.ARABIC -> "تحليل المشروع"
    }
    
    val framework: String get() = when (lang) {
        AppLanguage.CHINESE -> "框架"
        AppLanguage.ENGLISH -> "Framework"
        AppLanguage.ARABIC -> "إطار العمل"
    }
    
    val version: String get() = when (lang) {
        AppLanguage.CHINESE -> "版本"
        AppLanguage.ENGLISH -> "Version"
        AppLanguage.ARABIC -> "الإصدار"
    }
    
    val packageManager: String get() = when (lang) {
        AppLanguage.CHINESE -> "包管理器"
        AppLanguage.ENGLISH -> "Package Manager"
        AppLanguage.ARABIC -> "مدير الحزم"
    }
    
    val dependencyCount: String get() = when (lang) {
        AppLanguage.CHINESE -> "依赖数量"
        AppLanguage.ENGLISH -> "Dependency Count"
        AppLanguage.ARABIC -> "عدد التبعيات"
    }
    
    val outputDir: String get() = when (lang) {
        AppLanguage.CHINESE -> "输出目录"
        AppLanguage.ENGLISH -> "Output Directory"
        AppLanguage.ARABIC -> "دليل الإخراج"
    }
    
    val appConfig: String get() = when (lang) {
        AppLanguage.CHINESE -> "应用配置"
        AppLanguage.ENGLISH -> "App Config"
        AppLanguage.ARABIC -> "إعدادات التطبيق"
    }
    
    val importProject: String get() = when (lang) {
        AppLanguage.CHINESE -> "导入项目"
        AppLanguage.ENGLISH -> "Import Project"
        AppLanguage.ARABIC -> "استيراد المشروع"
    }
    
    val buildProject: String get() = when (lang) {
        AppLanguage.CHINESE -> "构建项目"
        AppLanguage.ENGLISH -> "Build Project"
        AppLanguage.ARABIC -> "بناء المشروع"
    }
    
    val scanningProject: String get() = when (lang) {
        AppLanguage.CHINESE -> "扫描项目中..."
        AppLanguage.ENGLISH -> "Scanning project..."
        AppLanguage.ARABIC -> "جاري فحص المشروع..."
    }
    
    val importing: String get() = when (lang) {
        AppLanguage.CHINESE -> "导入中"
        AppLanguage.ENGLISH -> "Importing"
        AppLanguage.ARABIC -> "جاري الاستيراد"
    }
    
    val checkingEnv: String get() = when (lang) {
        AppLanguage.CHINESE -> "检查环境..."
        AppLanguage.ENGLISH -> "Checking environment..."
        AppLanguage.ARABIC -> "جاري فحص البيئة..."
    }
    
    val copyingProjectFiles: String get() = when (lang) {
        AppLanguage.CHINESE -> "复制项目文件"
        AppLanguage.ENGLISH -> "Copying project files"
        AppLanguage.ARABIC -> "نسخ ملفات المشروع"
    }
    
    val installingDeps: String get() = when (lang) {
        AppLanguage.CHINESE -> "安装依赖"
        AppLanguage.ENGLISH -> "Installing dependencies"
        AppLanguage.ARABIC -> "تثبيت التبعيات"
    }
    
    val building: String get() = when (lang) {
        AppLanguage.CHINESE -> "构建中"
        AppLanguage.ENGLISH -> "Building"
        AppLanguage.ARABIC -> "جاري البناء"
    }
    
    val processingOutput: String get() = when (lang) {
        AppLanguage.CHINESE -> "处理构建产物..."
        AppLanguage.ENGLISH -> "Processing build output..."
        AppLanguage.ARABIC -> "معالجة مخرجات البناء..."
    }
    
    val completed: String get() = when (lang) {
        AppLanguage.CHINESE -> "完成"
        AppLanguage.ENGLISH -> "Completed"
        AppLanguage.ARABIC -> "مكتمل"
    }
    
    val failed: String get() = when (lang) {
        AppLanguage.CHINESE -> "失败"
        AppLanguage.ENGLISH -> "Failed"
        AppLanguage.ARABIC -> "فشل"
    }
    
    val totalFiles: String get() = when (lang) {
        AppLanguage.CHINESE -> "共 %d 个文件"
        AppLanguage.ENGLISH -> "%d files total"
        AppLanguage.ARABIC -> "إجمالي %d ملفات"
    }
    
    val logs: String get() = when (lang) {
        AppLanguage.CHINESE -> "日志"
        AppLanguage.ENGLISH -> "Logs"
        AppLanguage.ARABIC -> "السجلات"
    }
    
    val importLogs: String get() = when (lang) {
        AppLanguage.CHINESE -> "导入日志"
        AppLanguage.ENGLISH -> "Import Logs"
        AppLanguage.ARABIC -> "سجلات الاستيراد"
    }
    
    val importFrontendProject: String get() = when (lang) {
        AppLanguage.CHINESE -> "导入前端项目"
        AppLanguage.ENGLISH -> "Import Frontend Project"
        AppLanguage.ARABIC -> "استيراد مشروع الواجهة الأمامية"
    }
    
    val supportVueReactVite: String get() = when (lang) {
        AppLanguage.CHINESE -> "支持 Vue、React、Vite 等已构建的项目"
        AppLanguage.ENGLISH -> "Supports built Vue, React, Vite projects"
        AppLanguage.ARABIC -> "يدعم مشاريع Vue و React و Vite المبنية"
    }
    
    val usageSteps: String get() = when (lang) {
        AppLanguage.CHINESE -> "📋 使用步骤"
        AppLanguage.ENGLISH -> "📋 Usage Steps"
        AppLanguage.ARABIC -> "📋 خطوات الاستخدام"
    }
    
    val usageStepsContent: String get() = when (lang) {
        AppLanguage.CHINESE -> "1. 在电脑上构建项目：npm run build\n2. 将构建输出（dist/build）复制到手机\n3. 选择项目文件夹导入"
        AppLanguage.ENGLISH -> "1. Build project on computer: npm run build\n2. Copy build output (dist/build) to phone\n3. Select project folder to import"
        AppLanguage.ARABIC -> "1. بناء المشروع على الكمبيوتر: npm run build\n2. نسخ مخرجات البناء (dist/build) إلى الهاتف\n3. اختيار مجلد المشروع للاستيراد"
    }
    
    val builtInEngineReady: String get() = when (lang) {
        AppLanguage.CHINESE -> "内置构建引擎已就绪。支持导入已构建的项目，或使用 esbuild 进行简单构建。推荐在电脑上完成复杂项目的构建。"
        AppLanguage.ENGLISH -> "Built-in build engine ready. Supports importing built projects or simple builds with esbuild. Complex projects are recommended to be built on computer."
        AppLanguage.ARABIC -> "محرك البناء المدمج جاهز. يدعم استيراد المشاريع المبنية أو البناء البسيط باستخدام esbuild. يُنصح ببناء المشاريع المعقدة على الكمبيوتر."
    }

    // ==================== 媒体应用页面 ====================
    val createMediaAppTitle: String get() = when (lang) {
        AppLanguage.CHINESE -> "创建媒体应用"
        AppLanguage.ENGLISH -> "Create Media App"
        AppLanguage.ARABIC -> "إنشاء تطبيق وسائط"
    }
    
    val selectMediaType: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择媒体类型"
        AppLanguage.ENGLISH -> "Select Media Type"
        AppLanguage.ARABIC -> "اختيار نوع الوسائط"
    }
    
    val image: String get() = when (lang) {
        AppLanguage.CHINESE -> "图片"
        AppLanguage.ENGLISH -> "Image"
        AppLanguage.ARABIC -> "صورة"
    }
    
    val video: String get() = when (lang) {
        AppLanguage.CHINESE -> "视频"
        AppLanguage.ENGLISH -> "Video"
        AppLanguage.ARABIC -> "فيديو"
    }
    
    val selectImage: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择图片"
        AppLanguage.ENGLISH -> "Select Image"
        AppLanguage.ARABIC -> "اختيار صورة"
    }
    
    val selectVideo: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择视频"
        AppLanguage.ENGLISH -> "Select Video"
        AppLanguage.ARABIC -> "اختيار فيديو"
    }
    
    val clickToSelectImage: String get() = when (lang) {
        AppLanguage.CHINESE -> "点击选择图片"
        AppLanguage.ENGLISH -> "Click to select image"
        AppLanguage.ARABIC -> "انقر لاختيار صورة"
    }
    
    val clickToSelectVideo: String get() = when (lang) {
        AppLanguage.CHINESE -> "点击选择视频"
        AppLanguage.ENGLISH -> "Click to select video"
        AppLanguage.ARABIC -> "انقر لاختيار فيديو"
    }
    
    val videoSelected: String get() = when (lang) {
        AppLanguage.CHINESE -> "视频已选择"
        AppLanguage.ENGLISH -> "Video selected"
        AppLanguage.ARABIC -> "تم اختيار الفيديو"
    }
    
    val fillScreen: String get() = when (lang) {
        AppLanguage.CHINESE -> "铺满屏幕"
        AppLanguage.ENGLISH -> "Fill Screen"
        AppLanguage.ARABIC -> "ملء الشاشة"
    }
    
    val fillScreenHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "自动裁剪以填满整个屏幕"
        AppLanguage.ENGLISH -> "Auto crop to fill entire screen"
        AppLanguage.ARABIC -> "قص تلقائي لملء الشاشة بالكامل"
    }
    
    val landscapeMode: String get() = when (lang) {
        AppLanguage.CHINESE -> "横屏显示"
        AppLanguage.ENGLISH -> "Landscape Mode"
        AppLanguage.ARABIC -> "الوضع الأفقي"
    }
    
    val landscapeModeHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "以横屏模式显示内容"
        AppLanguage.ENGLISH -> "Display content in landscape mode"
        AppLanguage.ARABIC -> "عرض المحتوى في الوضع الأفقي"
    }
    
    val enableAudio: String get() = when (lang) {
        AppLanguage.CHINESE -> "启用音频"
        AppLanguage.ENGLISH -> "Enable Audio"
        AppLanguage.ARABIC -> "تفعيل الصوت"
    }
    
    val enableAudioHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "播放视频时包含声音"
        AppLanguage.ENGLISH -> "Include sound when playing video"
        AppLanguage.ARABIC -> "تضمين الصوت عند تشغيل الفيديو"
    }
    
    val loopPlay: String get() = when (lang) {
        AppLanguage.CHINESE -> "循环播放"
        AppLanguage.ENGLISH -> "Loop Play"
        AppLanguage.ARABIC -> "تشغيل متكرر"
    }
    
    val loopPlayHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "视频结束后自动重新播放"
        AppLanguage.ENGLISH -> "Auto replay when video ends"
        AppLanguage.ARABIC -> "إعادة التشغيل تلقائيًا عند انتهاء الفيديو"
    }
    
    val autoPlay: String get() = when (lang) {
        AppLanguage.CHINESE -> "自动播放"
        AppLanguage.ENGLISH -> "Auto Play"
        AppLanguage.ARABIC -> "تشغيل تلقائي"
    }
    
    val autoPlayHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "打开应用时自动开始播放"
        AppLanguage.ENGLISH -> "Auto start playing when app opens"
        AppLanguage.ARABIC -> "بدء التشغيل تلقائيًا عند فتح التطبيق"
    }
    
    val mediaAppHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "创建的应用将%s，适合用作数字相框、广告展示或视频壁纸。"
        AppLanguage.ENGLISH -> "The created app will %s, suitable for digital photo frames, advertising displays, or video wallpapers."
        AppLanguage.ARABIC -> "سيقوم التطبيق المُنشأ بـ %s، مناسب للإطارات الرقمية أو عروض الإعلانات أو خلفيات الفيديو."
    }
    
    val fullscreenDisplayImage: String get() = when (lang) {
        AppLanguage.CHINESE -> "全屏显示您选择的图片"
        AppLanguage.ENGLISH -> "display your selected image in fullscreen"
        AppLanguage.ARABIC -> "عرض الصورة المختارة بملء الشاشة"
    }
    
    val fullscreenPlayVideo: String get() = when (lang) {
        AppLanguage.CHINESE -> "全屏播放您选择的视频"
        AppLanguage.ENGLISH -> "play your selected video in fullscreen"
        AppLanguage.ARABIC -> "تشغيل الفيديو المختار بملء الشاشة"
    }

    // ==================== HTML应用页面 ====================
    val createHtmlAppTitle: String get() = when (lang) {
        AppLanguage.CHINESE -> "创建HTML应用"
        AppLanguage.ENGLISH -> "Create HTML App"
        AppLanguage.ARABIC -> "إنشاء تطبيق HTML"
    }
    
    val selectFiles: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择文件"
        AppLanguage.ENGLISH -> "Select Files"
        AppLanguage.ARABIC -> "اختيار الملفات"
    }
    
    val selectFilesHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "分别选择HTML、CSS、JS文件（CSS和JS为可选）"
        AppLanguage.ENGLISH -> "Select HTML, CSS, JS files separately (CSS and JS are optional)"
        AppLanguage.ARABIC -> "اختر ملفات HTML و CSS و JS بشكل منفصل (CSS و JS اختياريان)"
    }
    
    val htmlFile: String get() = when (lang) {
        AppLanguage.CHINESE -> "HTML 文件"
        AppLanguage.ENGLISH -> "HTML File"
        AppLanguage.ARABIC -> "ملف HTML"
    }
    
    val cssFile: String get() = when (lang) {
        AppLanguage.CHINESE -> "CSS 样式文件"
        AppLanguage.ENGLISH -> "CSS Style File"
        AppLanguage.ARABIC -> "ملف أنماط CSS"
    }
    
    val jsFile: String get() = when (lang) {
        AppLanguage.CHINESE -> "JavaScript 脚本"
        AppLanguage.ENGLISH -> "JavaScript Script"
        AppLanguage.ARABIC -> "سكريبت JavaScript"
    }
    
    val enableJavaScript: String get() = when (lang) {
        AppLanguage.CHINESE -> "启用 JavaScript"
        AppLanguage.ENGLISH -> "Enable JavaScript"
        AppLanguage.ARABIC -> "تفعيل JavaScript"
    }
    
    val enableJsHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "允许HTML中的JavaScript代码执行"
        AppLanguage.ENGLISH -> "Allow JavaScript code execution in HTML"
        AppLanguage.ARABIC -> "السماح بتنفيذ كود JavaScript في HTML"
    }
    
    val enableLocalStorage: String get() = when (lang) {
        AppLanguage.CHINESE -> "启用本地存储"
        AppLanguage.ENGLISH -> "Enable Local Storage"
        AppLanguage.ARABIC -> "تفعيل التخزين المحلي"
    }
    
    val enableLocalStorageHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "允许使用 localStorage 保存数据"
        AppLanguage.ENGLISH -> "Allow using localStorage to save data"
        AppLanguage.ARABIC -> "السماح باستخدام localStorage لحفظ البيانات"
    }
    
    val landscapeModeLabel: String get() = when (lang) {
        AppLanguage.CHINESE -> "横屏模式"
        AppLanguage.ENGLISH -> "Landscape Mode"
        AppLanguage.ARABIC -> "الوضع الأفقي"
    }
    
    val landscapeModeHintHtml: String get() = when (lang) {
        AppLanguage.CHINESE -> "以横屏方向显示应用内容"
        AppLanguage.ENGLISH -> "Display app content in landscape orientation"
        AppLanguage.ARABIC -> "عرض محتوى التطبيق بالاتجاه الأفقي"
    }
    
    val projectIssuesDetected: String get() = when (lang) {
        AppLanguage.CHINESE -> "检测到项目问题"
        AppLanguage.ENGLISH -> "Project issues detected"
        AppLanguage.ARABIC -> "تم اكتشاف مشاكل في المشروع"
    }
    
    val errorsCount: String get() = when (lang) {
        AppLanguage.CHINESE -> "%d 个错误"
        AppLanguage.ENGLISH -> "%d errors"
        AppLanguage.ARABIC -> "%d أخطاء"
    }
    
    val warningsCount: String get() = when (lang) {
        AppLanguage.CHINESE -> "%d 个警告"
        AppLanguage.ENGLISH -> "%d warnings"
        AppLanguage.ARABIC -> "%d تحذيرات"
    }
    
    val autoFixHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "应用会自动修复路径问题并内联CSS/JS，但建议查看详情确认"
        AppLanguage.ENGLISH -> "App will auto-fix path issues and inline CSS/JS, but please review details"
        AppLanguage.ARABIC -> "سيقوم التطبيق بإصلاح مشاكل المسار تلقائيًا ودمج CSS/JS، لكن يُرجى مراجعة التفاصيل"
    }
    
    val viewAnalysisResult: String get() = when (lang) {
        AppLanguage.CHINESE -> "查看分析结果"
        AppLanguage.ENGLISH -> "View Analysis Result"
        AppLanguage.ARABIC -> "عرض نتيجة التحليل"
    }
    
    val htmlAppTip: String get() = when (lang) {
        AppLanguage.CHINESE -> "提示：HTML文件为必选，CSS和JS文件为可选。如果你的HTML文件中引用了CSS或JS，请分别选择对应的文件。"
        AppLanguage.ENGLISH -> "Tip: HTML file is required, CSS and JS files are optional. If your HTML references CSS or JS, please select the corresponding files."
        AppLanguage.ARABIC -> "تلميح: ملف HTML مطلوب، ملفات CSS و JS اختيارية. إذا كان HTML يشير إلى CSS أو JS، يرجى اختيار الملفات المقابلة."
    }
    
    val featureTip: String get() = when (lang) {
        AppLanguage.CHINESE -> "💡 激活码验证、背景音乐等功能可在创建项目后，通过项目管理界面点击「编辑」进行添加和配置。"
        AppLanguage.ENGLISH -> "💡 Features like activation code and background music can be added via 'Edit' in project management after creation."
        AppLanguage.ARABIC -> "💡 يمكن إضافة ميزات مثل رمز التفعيل والموسيقى الخلفية عبر 'تعديل' في إدارة المشروع بعد الإنشاء."
    }
    
    val aboutFileReference: String get() = when (lang) {
        AppLanguage.CHINESE -> "关于文件引用"
        AppLanguage.ENGLISH -> "About File References"
        AppLanguage.ARABIC -> "حول مراجع الملفات"
    }
    
    val fileReferenceHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "• 应用会自动将CSS和JS内联到HTML中\n• 绝对路径（如 /css/style.css）会自动转换\n• 建议使用相对路径（如 ./style.css）"
        AppLanguage.ENGLISH -> "• App will auto-inline CSS and JS into HTML\n• Absolute paths (like /css/style.css) will be auto-converted\n• Relative paths (like ./style.css) are recommended"
        AppLanguage.ARABIC -> "• سيقوم التطبيق بدمج CSS و JS تلقائيًا في HTML\n• سيتم تحويل المسارات المطلقة (مثل /css/style.css) تلقائيًا\n• يُنصح باستخدام المسارات النسبية (مثل ./style.css)"
    }
    
    val projectAnalysisResult: String get() = when (lang) {
        AppLanguage.CHINESE -> "项目分析结果"
        AppLanguage.ENGLISH -> "Project Analysis Result"
        AppLanguage.ARABIC -> "نتيجة تحليل المشروع"
    }
    
    val fileInfo: String get() = when (lang) {
        AppLanguage.CHINESE -> "文件信息"
        AppLanguage.ENGLISH -> "File Info"
        AppLanguage.ARABIC -> "معلومات الملف"
    }
    
    val detectedIssues: String get() = when (lang) {
        AppLanguage.CHINESE -> "检测到的问题"
        AppLanguage.ENGLISH -> "Detected Issues"
        AppLanguage.ARABIC -> "المشاكل المكتشفة"
    }
    
    val suggestions: String get() = when (lang) {
        AppLanguage.CHINESE -> "建议"
        AppLanguage.ENGLISH -> "Suggestions"
        AppLanguage.ARABIC -> "اقتراحات"
    }
    
    val autoProcessHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "应用会自动处理：路径修复、CSS/JS内联、编码转换、viewport适配"
        AppLanguage.ENGLISH -> "App will auto-process: path fixing, CSS/JS inlining, encoding conversion, viewport adaptation"
        AppLanguage.ARABIC -> "سيقوم التطبيق بالمعالجة التلقائية: إصلاح المسارات، دمج CSS/JS، تحويل الترميز، تكييف viewport"
    }
    
    val gotIt: String get() = when (lang) {
        AppLanguage.CHINESE -> "知道了"
        AppLanguage.ENGLISH -> "Got it"
        AppLanguage.ARABIC -> "فهمت"
    }

    // ==================== 创建应用页面 ====================
    val editApp: String get() = when (lang) {
        AppLanguage.CHINESE -> "编辑应用"
        AppLanguage.ENGLISH -> "Edit App"
        AppLanguage.ARABIC -> "تعديل التطبيق"
    }
    
    val inputAppName: String get() = when (lang) {
        AppLanguage.CHINESE -> "输入应用显示名称"
        AppLanguage.ENGLISH -> "Enter app display name"
        AppLanguage.ARABIC -> "أدخل اسم عرض التطبيق"
    }
    
    val activationCodeVerify: String get() = when (lang) {
        AppLanguage.CHINESE -> "激活码验证"
        AppLanguage.ENGLISH -> "Activation Code Verification"
        AppLanguage.ARABIC -> "التحقق من رمز التفعيل"
    }
    
    val activationCodeHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "启用后，用户需要输入正确的激活码才能使用应用"
        AppLanguage.ENGLISH -> "When enabled, users need to enter correct activation code to use the app"
        AppLanguage.ARABIC -> "عند التفعيل، يحتاج المستخدمون إلى إدخال رمز التفعيل الصحيح لاستخدام التطبيق"
    }
    
    val inputActivationCode: String get() = when (lang) {
        AppLanguage.CHINESE -> "输入激活码"
        AppLanguage.ENGLISH -> "Enter activation code"
        AppLanguage.ARABIC -> "أدخل رمز التفعيل"
    }
    
    val popupAnnouncement: String get() = when (lang) {
        AppLanguage.CHINESE -> "弹窗公告"
        AppLanguage.ENGLISH -> "Popup Announcement"
        AppLanguage.ARABIC -> "إعلان منبثق"
    }
    
    val announcementTitle: String get() = when (lang) {
        AppLanguage.CHINESE -> "公告标题"
        AppLanguage.ENGLISH -> "Announcement Title"
        AppLanguage.ARABIC -> "عنوان الإعلان"
    }
    
    val announcementContent: String get() = when (lang) {
        AppLanguage.CHINESE -> "公告内容"
        AppLanguage.ENGLISH -> "Announcement Content"
        AppLanguage.ARABIC -> "محتوى الإعلان"
    }
    
    val linkUrl: String get() = when (lang) {
        AppLanguage.CHINESE -> "链接地址（可选）"
        AppLanguage.ENGLISH -> "Link URL (optional)"
        AppLanguage.ARABIC -> "رابط URL (اختياري)"
    }
    
    val linkButtonText: String get() = when (lang) {
        AppLanguage.CHINESE -> "链接按钮文字"
        AppLanguage.ENGLISH -> "Link Button Text"
        AppLanguage.ARABIC -> "نص زر الرابط"
    }
    
    val viewDetails: String get() = when (lang) {
        AppLanguage.CHINESE -> "查看详情"
        AppLanguage.ENGLISH -> "View Details"
        AppLanguage.ARABIC -> "عرض التفاصيل"
    }
    
    val displayFrequency: String get() = when (lang) {
        AppLanguage.CHINESE -> "显示频率"
        AppLanguage.ENGLISH -> "Display Frequency"
        AppLanguage.ARABIC -> "تكرار العرض"
    }
    
    val showOnce: String get() = when (lang) {
        AppLanguage.CHINESE -> "仅显示一次"
        AppLanguage.ENGLISH -> "Show Once Only"
        AppLanguage.ARABIC -> "عرض مرة واحدة فقط"
    }
    
    val everyLaunch: String get() = when (lang) {
        AppLanguage.CHINESE -> "每次启动"
        AppLanguage.ENGLISH -> "Every Launch"
        AppLanguage.ARABIC -> "كل تشغيل"
    }
    
    val showEmoji: String get() = when (lang) {
        AppLanguage.CHINESE -> "显示表情"
        AppLanguage.ENGLISH -> "Show Emoji"
        AppLanguage.ARABIC -> "عرض الرموز التعبيرية"
    }
    
    val enableAnimation: String get() = when (lang) {
        AppLanguage.CHINESE -> "启用动画"
        AppLanguage.ENGLISH -> "Enable Animation"
        AppLanguage.ARABIC -> "تفعيل الرسوم المتحركة"
    }
    
    val adBlocking: String get() = when (lang) {
        AppLanguage.CHINESE -> "广告拦截"
        AppLanguage.ENGLISH -> "Ad Blocking"
        AppLanguage.ARABIC -> "حظر الإعلانات"
    }
    
    val enableAdBlock: String get() = when (lang) {
        AppLanguage.CHINESE -> "启用广告拦截"
        AppLanguage.ENGLISH -> "Enable Ad Blocking"
        AppLanguage.ARABIC -> "تفعيل حظر الإعلانات"
    }
    
    val desktopMode: String get() = when (lang) {
        AppLanguage.CHINESE -> "访问电脑版"
        AppLanguage.ENGLISH -> "Desktop Mode"
        AppLanguage.ARABIC -> "وضع سطح المكتب"
    }
    
    val fullscreenMode: String get() = when (lang) {
        AppLanguage.CHINESE -> "全屏模式"
        AppLanguage.ENGLISH -> "Fullscreen Mode"
        AppLanguage.ARABIC -> "وضع ملء الشاشة"
    }
    
    val splashScreen: String get() = when (lang) {
        AppLanguage.CHINESE -> "启动画面"
        AppLanguage.ENGLISH -> "Splash Screen"
        AppLanguage.ARABIC -> "شاشة البداية"
    }
    
    val backgroundMusic: String get() = when (lang) {
        AppLanguage.CHINESE -> "背景音乐"
        AppLanguage.ENGLISH -> "Background Music"
        AppLanguage.ARABIC -> "موسيقى الخلفية"
    }
    
    val autoTranslate: String get() = when (lang) {
        AppLanguage.CHINESE -> "网页自动翻译"
        AppLanguage.ENGLISH -> "Auto Translate"
        AppLanguage.ARABIC -> "الترجمة التلقائية"
    }
    
    val webViewAdvancedSettings: String get() = when (lang) {
        AppLanguage.CHINESE -> "WebView高级设置"
        AppLanguage.ENGLISH -> "WebView Advanced Settings"
        AppLanguage.ARABIC -> "إعدادات WebView المتقدمة"
    }
    
    val htmlApp: String get() = when (lang) {
        AppLanguage.CHINESE -> "HTML 应用"
        AppLanguage.ENGLISH -> "HTML App"
        AppLanguage.ARABIC -> "تطبيق HTML"
    }
    
    val entryFile: String get() = when (lang) {
        AppLanguage.CHINESE -> "入口文件"
        AppLanguage.ENGLISH -> "Entry File"
        AppLanguage.ARABIC -> "ملف الدخول"
    }
    
    val totalFilesCount: String get() = when (lang) {
        AppLanguage.CHINESE -> "共 %d 个文件"
        AppLanguage.ENGLISH -> "%d files total"
        AppLanguage.ARABIC -> "إجمالي %d ملفات"
    }
    
    val imageApp: String get() = when (lang) {
        AppLanguage.CHINESE -> "图片应用"
        AppLanguage.ENGLISH -> "Image App"
        AppLanguage.ARABIC -> "تطبيق صور"
    }
    
    val videoApp: String get() = when (lang) {
        AppLanguage.CHINESE -> "视频应用"
        AppLanguage.ENGLISH -> "Video App"
        AppLanguage.ARABIC -> "تطبيق فيديو"
    }
    
    val unknownFile: String get() = when (lang) {
        AppLanguage.CHINESE -> "未知文件"
        AppLanguage.ENGLISH -> "Unknown File"
        AppLanguage.ARABIC -> "ملف غير معروف"
    }

    // ==================== 扩展模块页面 ====================
    val extensionModule: String get() = when (lang) {
        AppLanguage.CHINESE -> "扩展模块"
        AppLanguage.ENGLISH -> "Extension Module"
        AppLanguage.ARABIC -> "وحدة إضافية"
    }
    
    val searchModules: String get() = when (lang) {
        AppLanguage.CHINESE -> "搜索模块..."
        AppLanguage.ENGLISH -> "Search modules..."
        AppLanguage.ARABIC -> "البحث عن الوحدات..."
    }
    
    val all: String get() = when (lang) {
        AppLanguage.CHINESE -> "全部"
        AppLanguage.ENGLISH -> "All"
        AppLanguage.ARABIC -> "الكل"
    }
    
    val totalModules: String get() = when (lang) {
        AppLanguage.CHINESE -> "共 %d 个模块"
        AppLanguage.ENGLISH -> "%d modules total"
        AppLanguage.ARABIC -> "إجمالي %d وحدات"
    }
    
    val enabledModules: String get() = when (lang) {
        AppLanguage.CHINESE -> "已启用 %d 个"
        AppLanguage.ENGLISH -> "%d enabled"
        AppLanguage.ARABIC -> "%d مفعلة"
    }
    
    val builtIn: String get() = when (lang) {
        AppLanguage.CHINESE -> "内置"
        AppLanguage.ENGLISH -> "Built-in"
        AppLanguage.ARABIC -> "مدمج"
    }
    
    val duplicate: String get() = when (lang) {
        AppLanguage.CHINESE -> "复制"
        AppLanguage.ENGLISH -> "Duplicate"
        AppLanguage.ARABIC -> "نسخ"
    }
    
    val copyShareCode: String get() = when (lang) {
        AppLanguage.CHINESE -> "复制分享码"
        AppLanguage.ENGLISH -> "Copy Share Code"
        AppLanguage.ARABIC -> "نسخ رمز المشاركة"
    }
    
    val shareCodeCopied: String get() = when (lang) {
        AppLanguage.CHINESE -> "分享码已复制"
        AppLanguage.ENGLISH -> "Share code copied"
        AppLanguage.ARABIC -> "تم نسخ رمز المشاركة"
    }
    
    val noModulesFound: String get() = when (lang) {
        AppLanguage.CHINESE -> "没有找到匹配的模块"
        AppLanguage.ENGLISH -> "No matching modules found"
        AppLanguage.ARABIC -> "لم يتم العثور على وحدات مطابقة"
    }
    
    val noModulesYet: String get() = when (lang) {
        AppLanguage.CHINESE -> "暂无模块"
        AppLanguage.ENGLISH -> "No modules yet"
        AppLanguage.ARABIC -> "لا توجد وحدات بعد"
    }
    
    val createFirstModule: String get() = when (lang) {
        AppLanguage.CHINESE -> "创建第一个模块"
        AppLanguage.ENGLISH -> "Create first module"
        AppLanguage.ARABIC -> "إنشاء أول وحدة"
    }
    
    val importModule: String get() = when (lang) {
        AppLanguage.CHINESE -> "导入模块"
        AppLanguage.ENGLISH -> "Import Module"
        AppLanguage.ARABIC -> "استيراد وحدة"
    }
    
    val importFromFile: String get() = when (lang) {
        AppLanguage.CHINESE -> "从文件导入"
        AppLanguage.ENGLISH -> "Import from File"
        AppLanguage.ARABIC -> "استيراد من ملف"
    }
    
    val selectWtamodFile: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择 .wtamod 或 .wtapkg 文件"
        AppLanguage.ENGLISH -> "Select .wtamod or .wtapkg file"
        AppLanguage.ARABIC -> "اختر ملف .wtamod أو .wtapkg"
    }
    
    val importFromShareCode: String get() = when (lang) {
        AppLanguage.CHINESE -> "从分享码导入"
        AppLanguage.ENGLISH -> "Import from Share Code"
        AppLanguage.ARABIC -> "استيراد من رمز المشاركة"
    }
    
    val pasteShareCode: String get() = when (lang) {
        AppLanguage.CHINESE -> "粘贴他人分享的模块代码"
        AppLanguage.ENGLISH -> "Paste shared module code"
        AppLanguage.ARABIC -> "لصق رمز الوحدة المشتركة"
    }
    
    val shareCode: String get() = when (lang) {
        AppLanguage.CHINESE -> "分享码"
        AppLanguage.ENGLISH -> "Share Code"
        AppLanguage.ARABIC -> "رمز المشاركة"
    }
    
    val pasteShareCodeHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "粘贴分享码..."
        AppLanguage.ENGLISH -> "Paste share code..."
        AppLanguage.ARABIC -> "لصق رمز المشاركة..."
    }
    
    val pasteFromClipboard: String get() = when (lang) {
        AppLanguage.CHINESE -> "从剪贴板粘贴"
        AppLanguage.ENGLISH -> "Paste from Clipboard"
        AppLanguage.ARABIC -> "لصق من الحافظة"
    }
    
    val onlyOnMatchingUrls: String get() = when (lang) {
        AppLanguage.CHINESE -> "仅在 %d 个匹配规则的网站生效"
        AppLanguage.ENGLISH -> "Only works on %d matching URL rules"
        AppLanguage.ARABIC -> "يعمل فقط على %d قواعد URL مطابقة"
    }
    
    val requiresSensitivePermissions: String get() = when (lang) {
        AppLanguage.CHINESE -> "需要敏感权限"
        AppLanguage.ENGLISH -> "Requires sensitive permissions"
        AppLanguage.ARABIC -> "يتطلب أذونات حساسة"
    }
    
    val aiDevelop: String get() = when (lang) {
        AppLanguage.CHINESE -> "AI 开发"
        AppLanguage.ENGLISH -> "AI Develop"
        AppLanguage.ARABIC -> "تطوير AI"
    }
    
    val manualCreate: String get() = when (lang) {
        AppLanguage.CHINESE -> "手动创建"
        AppLanguage.ENGLISH -> "Manual Create"
        AppLanguage.ARABIC -> "إنشاء يدوي"
    }
    
    val createModule: String get() = when (lang) {
        AppLanguage.CHINESE -> "创建模块"
        AppLanguage.ENGLISH -> "Create Module"
        AppLanguage.ARABIC -> "إنشاء وحدة"
    }
    
    val aiModuleDeveloper: String get() = when (lang) {
        AppLanguage.CHINESE -> "AI 模块开发"
        AppLanguage.ENGLISH -> "AI Module Developer"
        AppLanguage.ARABIC -> "مطور وحدات AI"
    }

    // ==================== 主题设置页面 ====================
    val themeSettings: String get() = when (lang) {
        AppLanguage.CHINESE -> "主题设置"
        AppLanguage.ENGLISH -> "Theme Settings"
        AppLanguage.ARABIC -> "إعدادات السمة"
    }
    
    val enhancedMode: String get() = when (lang) {
        AppLanguage.CHINESE -> "强化版"
        AppLanguage.ENGLISH -> "Enhanced"
        AppLanguage.ARABIC -> "محسّن"
    }
    
    val theme: String get() = when (lang) {
        AppLanguage.CHINESE -> "主题"
        AppLanguage.ENGLISH -> "Theme"
        AppLanguage.ARABIC -> "السمة"
    }
    
    val appearance: String get() = when (lang) {
        AppLanguage.CHINESE -> "外观"
        AppLanguage.ENGLISH -> "Appearance"
        AppLanguage.ARABIC -> "المظهر"
    }
    
    val effects: String get() = when (lang) {
        AppLanguage.CHINESE -> "效果"
        AppLanguage.ENGLISH -> "Effects"
        AppLanguage.ARABIC -> "التأثيرات"
    }
    
    val uiMode: String get() = when (lang) {
        AppLanguage.CHINESE -> "UI 模式"
        AppLanguage.ENGLISH -> "UI Mode"
        AppLanguage.ARABIC -> "وضع واجهة المستخدم"
    }
    
    val selectUiStyle: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择界面视觉风格"
        AppLanguage.ENGLISH -> "Select UI visual style"
        AppLanguage.ARABIC -> "اختر نمط واجهة المستخدم المرئي"
    }
    
    val darkMode: String get() = when (lang) {
        AppLanguage.CHINESE -> "深色模式"
        AppLanguage.ENGLISH -> "Dark Mode"
        AppLanguage.ARABIC -> "الوضع الداكن"
    }
    
    val followSystem: String get() = when (lang) {
        AppLanguage.CHINESE -> "跟随系统"
        AppLanguage.ENGLISH -> "Follow System"
        AppLanguage.ARABIC -> "اتباع النظام"
    }
    
    val followSystemHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "根据系统设置自动切换"
        AppLanguage.ENGLISH -> "Auto switch based on system settings"
        AppLanguage.ARABIC -> "التبديل التلقائي بناءً على إعدادات النظام"
    }
    
    val lightMode: String get() = when (lang) {
        AppLanguage.CHINESE -> "浅色模式"
        AppLanguage.ENGLISH -> "Light Mode"
        AppLanguage.ARABIC -> "الوضع الفاتح"
    }
    
    val lightModeHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "始终使用浅色主题"
        AppLanguage.ENGLISH -> "Always use light theme"
        AppLanguage.ARABIC -> "استخدام السمة الفاتحة دائمًا"
    }
    
    val darkModeHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "始终使用深色主题"
        AppLanguage.ENGLISH -> "Always use dark theme"
        AppLanguage.ARABIC -> "استخدام السمة الداكنة دائمًا"
    }
    
    // ==================== 暗色模式选项 ====================
    val alwaysLight: String get() = when (lang) {
        AppLanguage.CHINESE -> "始终浅色"
        AppLanguage.ENGLISH -> "Always Light"
        AppLanguage.ARABIC -> "فاتح دائمًا"
    }
    
    val alwaysDark: String get() = when (lang) {
        AppLanguage.CHINESE -> "始终深色"
        AppLanguage.ENGLISH -> "Always Dark"
        AppLanguage.ARABIC -> "داكن دائمًا"
    }
    
    // ==================== UI 模式 ====================
    val defaultMode: String get() = when (lang) {
        AppLanguage.CHINESE -> "默认模式"
        AppLanguage.ENGLISH -> "Default Mode"
        AppLanguage.ARABIC -> "الوضع الافتراضي"
    }
    
    val defaultModeDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "简洁配色，流畅体验"
        AppLanguage.ENGLISH -> "Clean colors, smooth experience"
        AppLanguage.ARABIC -> "ألوان نظيفة، تجربة سلسة"
    }
    
    val uiEnhancedMode: String get() = when (lang) {
        AppLanguage.CHINESE -> "强化模式"
        AppLanguage.ENGLISH -> "Enhanced Mode"
        AppLanguage.ARABIC -> "الوضع المحسّن"
    }
    
    val enhancedModeDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "沉浸式视觉盛宴，展示极致前端能力"
        AppLanguage.ENGLISH -> "Immersive visual feast, showcase cutting-edge capabilities"
        AppLanguage.ARABIC -> "وليمة بصرية غامرة، عرض قدرات متطورة"
    }
    
    // ==================== 动画速度 ====================
    val speedSlow: String get() = when (lang) {
        AppLanguage.CHINESE -> "慢速"
        AppLanguage.ENGLISH -> "Slow"
        AppLanguage.ARABIC -> "بطيء"
    }
    
    val speedNormal: String get() = when (lang) {
        AppLanguage.CHINESE -> "正常"
        AppLanguage.ENGLISH -> "Normal"
        AppLanguage.ARABIC -> "عادي"
    }
    
    val speedFast: String get() = when (lang) {
        AppLanguage.CHINESE -> "快速"
        AppLanguage.ENGLISH -> "Fast"
        AppLanguage.ARABIC -> "سريع"
    }
    
    val speedInstant: String get() = when (lang) {
        AppLanguage.CHINESE -> "即时"
        AppLanguage.ENGLISH -> "Instant"
        AppLanguage.ARABIC -> "فوري"
    }
    
    val previewEffect: String get() = when (lang) {
        AppLanguage.CHINESE -> "预览效果"
        AppLanguage.ENGLISH -> "Preview Effect"
        AppLanguage.ARABIC -> "معاينة التأثير"
    }
    
    val button: String get() = when (lang) {
        AppLanguage.CHINESE -> "按钮"
        AppLanguage.ENGLISH -> "Button"
        AppLanguage.ARABIC -> "زر"
    }
    
    val enhancedModeEnabled: String get() = when (lang) {
        AppLanguage.CHINESE -> "强化模式已启用"
        AppLanguage.ENGLISH -> "Enhanced mode enabled"
        AppLanguage.ARABIC -> "تم تفعيل الوضع المحسّن"
    }
    
    val enjoyImmersiveExperience: String get() = when (lang) {
        AppLanguage.CHINESE -> "享受 %s 的沉浸式视觉体验"
        AppLanguage.ENGLISH -> "Enjoy immersive visual experience of %s"
        AppLanguage.ARABIC -> "استمتع بتجربة بصرية غامرة لـ %s"
    }
    
    val enableAnimations: String get() = when (lang) {
        AppLanguage.CHINESE -> "启用动画"
        AppLanguage.ENGLISH -> "Enable Animations"
        AppLanguage.ARABIC -> "تفعيل الرسوم المتحركة"
    }
    
    val enableAnimationsHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "开启界面过渡动画和交互反馈"
        AppLanguage.ENGLISH -> "Enable UI transition animations and interaction feedback"
        AppLanguage.ARABIC -> "تفعيل رسوم الانتقال والتفاعل"
    }
    
    val particleEffects: String get() = when (lang) {
        AppLanguage.CHINESE -> "粒子效果"
        AppLanguage.ENGLISH -> "Particle Effects"
        AppLanguage.ARABIC -> "تأثيرات الجسيمات"
    }
    
    val particleEffectsHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "显示主题特有的背景粒子动画"
        AppLanguage.ENGLISH -> "Show theme-specific background particle animations"
        AppLanguage.ARABIC -> "عرض رسوم الجسيمات الخلفية الخاصة بالسمة"
    }
    
    val particleEffectsEnhancedHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "强化模式下的沉浸式背景效果"
        AppLanguage.ENGLISH -> "Immersive background effects in enhanced mode"
        AppLanguage.ARABIC -> "تأثيرات خلفية غامرة في الوضع المحسّن"
    }
    
    val hapticFeedback: String get() = when (lang) {
        AppLanguage.CHINESE -> "触觉反馈"
        AppLanguage.ENGLISH -> "Haptic Feedback"
        AppLanguage.ARABIC -> "ردود الفعل اللمسية"
    }
    
    val hapticFeedbackHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "交互时提供震动反馈"
        AppLanguage.ENGLISH -> "Provide vibration feedback on interaction"
        AppLanguage.ARABIC -> "توفير ردود فعل اهتزازية عند التفاعل"
    }
    
    val soundFeedback: String get() = when (lang) {
        AppLanguage.CHINESE -> "音效反馈"
        AppLanguage.ENGLISH -> "Sound Feedback"
        AppLanguage.ARABIC -> "ردود الفعل الصوتية"
    }
    
    val soundFeedbackHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "交互时播放音效（强化模式）"
        AppLanguage.ENGLISH -> "Play sound effects on interaction (enhanced mode)"
        AppLanguage.ARABIC -> "تشغيل المؤثرات الصوتية عند التفاعل (الوضع المحسّن)"
    }
    
    val animationSpeed: String get() = when (lang) {
        AppLanguage.CHINESE -> "动画速度"
        AppLanguage.ENGLISH -> "Animation Speed"
        AppLanguage.ARABIC -> "سرعة الرسوم المتحركة"
    }
    
    val currentThemeAnimStyle: String get() = when (lang) {
        AppLanguage.CHINESE -> "当前主题动画风格"
        AppLanguage.ENGLISH -> "Current Theme Animation Style"
        AppLanguage.ARABIC -> "نمط الرسوم المتحركة للسمة الحالية"
    }
    
    val interactionStyle: String get() = when (lang) {
        AppLanguage.CHINESE -> "交互风格"
        AppLanguage.ENGLISH -> "Interaction Style"
        AppLanguage.ARABIC -> "نمط التفاعل"
    }
    
    val glow: String get() = when (lang) {
        AppLanguage.CHINESE -> "发光"
        AppLanguage.ENGLISH -> "Glow"
        AppLanguage.ARABIC -> "توهج"
    }
    
    val particles: String get() = when (lang) {
        AppLanguage.CHINESE -> "粒子"
        AppLanguage.ENGLISH -> "Particles"
        AppLanguage.ARABIC -> "جسيمات"
    }

    // ==================== 关于页面 ====================
    val about: String get() = when (lang) {
        AppLanguage.CHINESE -> "关于"
        AppLanguage.ENGLISH -> "About"
        AppLanguage.ARABIC -> "حول"
    }
    
    val independentDeveloper: String get() = when (lang) {
        AppLanguage.CHINESE -> "独立开发者 · AI 爱好者"
        AppLanguage.ENGLISH -> "Independent Developer · AI Enthusiast"
        AppLanguage.ARABIC -> "مطور مستقل · متحمس للذكاء الاصطناعي"
    }
    
    val checkUpdate: String get() = when (lang) {
        AppLanguage.CHINESE -> "检查更新"
        AppLanguage.ENGLISH -> "Check Update"
        AppLanguage.ARABIC -> "التحقق من التحديثات"
    }
    
    val checking: String get() = when (lang) {
        AppLanguage.CHINESE -> "正在检查..."
        AppLanguage.ENGLISH -> "Checking..."
        AppLanguage.ARABIC -> "جاري التحقق..."
    }
    
    val downloading: String get() = when (lang) {
        AppLanguage.CHINESE -> "正在下载..."
        AppLanguage.ENGLISH -> "Downloading..."
        AppLanguage.ARABIC -> "جاري التحميل..."
    }
    
    val currentVersion: String get() = when (lang) {
        AppLanguage.CHINESE -> "当前版本"
        AppLanguage.ENGLISH -> "Current Version"
        AppLanguage.ARABIC -> "الإصدار الحالي"
    }
    
    val aboutThisApp: String get() = when (lang) {
        AppLanguage.CHINESE -> "关于这个应用"
        AppLanguage.ENGLISH -> "About This App"
        AppLanguage.ARABIC -> "حول هذا التطبيق"
    }
    
    val aboutAppDescription: String get() = when (lang) {
        AppLanguage.CHINESE -> "WebToApp 是我独立开发的一款工具，可以将网站、图片、视频快速转换成独立的 Android 应用。\n\n如果你有任何问题、建议或想法，欢迎随时联系我！"
        AppLanguage.ENGLISH -> "WebToApp is a tool I independently developed that can quickly convert websites, images, and videos into standalone Android apps.\n\nIf you have any questions, suggestions, or ideas, feel free to contact me!"
        AppLanguage.ARABIC -> "WebToApp هي أداة طورتها بشكل مستقل يمكنها تحويل المواقع والصور ومقاطع الفيديو بسرعة إلى تطبيقات Android مستقلة.\n\nإذا كان لديك أي أسئلة أو اقتراحات أو أفكار، لا تتردد في الاتصال بي!"
    }
    
    val socialMedia: String get() = when (lang) {
        AppLanguage.CHINESE -> "社交媒体"
        AppLanguage.ENGLISH -> "Social Media"
        AppLanguage.ARABIC -> "وسائل التواصل الاجتماعي"
    }
    
    val exchangeGroup: String get() = when (lang) {
        AppLanguage.CHINESE -> "交流群"
        AppLanguage.ENGLISH -> "Community Group"
        AppLanguage.ARABIC -> "مجموعة المجتمع"
    }
    
    val videoTutorial: String get() = when (lang) {
        AppLanguage.CHINESE -> "视频教程"
        AppLanguage.ENGLISH -> "Video Tutorial"
        AppLanguage.ARABIC -> "فيديو تعليمي"
    }
    
    val openSourceRepo: String get() = when (lang) {
        AppLanguage.CHINESE -> "开源仓库"
        AppLanguage.ENGLISH -> "Open Source Repo"
        AppLanguage.ARABIC -> "مستودع مفتوح المصدر"
    }
    
    val joinExchangeGroup: String get() = when (lang) {
        AppLanguage.CHINESE -> "加入交流群"
        AppLanguage.ENGLISH -> "Join Community"
        AppLanguage.ARABIC -> "انضم إلى المجتمع"
    }
    
    val learnProgressTogether: String get() = when (lang) {
        AppLanguage.CHINESE -> "一起学习进步，获取最新消息 🚀"
        AppLanguage.ENGLISH -> "Learn together, get latest news 🚀"
        AppLanguage.ARABIC -> "تعلم معًا، احصل على آخر الأخبار 🚀"
    }
    
    val exchangeLearning: String get() = when (lang) {
        AppLanguage.CHINESE -> "交流学习、更新消息"
        AppLanguage.ENGLISH -> "Exchange learning, update news"
        AppLanguage.ARABIC -> "تبادل التعلم، تحديث الأخبار"
    }
    
    val internationalGroup: String get() = when (lang) {
        AppLanguage.CHINESE -> "国际用户交流群"
        AppLanguage.ENGLISH -> "International user group"
        AppLanguage.ARABIC -> "مجموعة المستخدمين الدوليين"
    }
    
    val contactAuthor: String get() = when (lang) {
        AppLanguage.CHINESE -> "联系作者"
        AppLanguage.ENGLISH -> "Contact Author"
        AppLanguage.ARABIC -> "الاتصال بالمؤلف"
    }
    
    val feedbackCooperation: String get() = when (lang) {
        AppLanguage.CHINESE -> "问题反馈、合作咨询、功能建议 💬"
        AppLanguage.ENGLISH -> "Feedback, cooperation, feature suggestions 💬"
        AppLanguage.ARABIC -> "ملاحظات، تعاون، اقتراحات الميزات 💬"
    }
    
    val feedbackCooperationShort: String get() = when (lang) {
        AppLanguage.CHINESE -> "问题反馈、合作咨询"
        AppLanguage.ENGLISH -> "Feedback, cooperation"
        AppLanguage.ARABIC -> "ملاحظات، تعاون"
    }
    
    val emailContact: String get() = when (lang) {
        AppLanguage.CHINESE -> "邮件联系"
        AppLanguage.ENGLISH -> "Email Contact"
        AppLanguage.ARABIC -> "الاتصال بالبريد الإلكتروني"
    }
    
    val internationalEmail: String get() = when (lang) {
        AppLanguage.CHINESE -> "国际邮件"
        AppLanguage.ENGLISH -> "International Email"
        AppLanguage.ARABIC -> "البريد الإلكتروني الدولي"
    }
    
    val updateLater: String get() = when (lang) {
        AppLanguage.CHINESE -> "稍后更新"
        AppLanguage.ENGLISH -> "Update Later"
        AppLanguage.ARABIC -> "التحديث لاحقًا"
    }
    
    val downloadComplete: String get() = when (lang) {
        AppLanguage.CHINESE -> "下载完成，正在安装..."
        AppLanguage.ENGLISH -> "Download complete, installing..."
        AppLanguage.ARABIC -> "اكتمل التحميل، جاري التثبيت..."
    }
    
    val checkUpdateFailed: String get() = when (lang) {
        AppLanguage.CHINESE -> "检查更新失败"
        AppLanguage.ENGLISH -> "Check update failed"
        AppLanguage.ARABIC -> "فشل التحقق من التحديثات"
    }

    // ==================== AI 状态 ====================
    val aiGenerating: String get() = when (lang) {
        AppLanguage.CHINESE -> "AI 生成中..."
        AppLanguage.ENGLISH -> "AI Generating..."
        AppLanguage.ARABIC -> "AI يولد..."
    }
    
    val aiAnalyzing: String get() = when (lang) {
        AppLanguage.CHINESE -> "正在分析需求..."
        AppLanguage.ENGLISH -> "Analyzing requirements..."
        AppLanguage.ARABIC -> "تحليل المتطلبات..."
    }
    
    val aiCompleted: String get() = when (lang) {
        AppLanguage.CHINESE -> "生成完成"
        AppLanguage.ENGLISH -> "Generation completed"
        AppLanguage.ARABIC -> "اكتمل التوليد"
    }
    
    val aiPlanning: String get() = when (lang) {
        AppLanguage.CHINESE -> "制定开发计划..."
        AppLanguage.ENGLISH -> "Planning development..."
        AppLanguage.ARABIC -> "تخطيط التطوير..."
    }
    
    val aiCoding: String get() = when (lang) {
        AppLanguage.CHINESE -> "生成代码中..."
        AppLanguage.ENGLISH -> "Generating code..."
        AppLanguage.ARABIC -> "توليد الكود..."
    }
    
    val aiChecking: String get() = when (lang) {
        AppLanguage.CHINESE -> "检查语法中..."
        AppLanguage.ENGLISH -> "Checking syntax..."
        AppLanguage.ARABIC -> "فحص بناء الجملة..."
    }
    
    val aiFixing: String get() = when (lang) {
        AppLanguage.CHINESE -> "自动修复错误..."
        AppLanguage.ENGLISH -> "Auto fixing errors..."
        AppLanguage.ARABIC -> "إصلاح الأخطاء تلقائيًا..."
    }
    
    val aiScanning: String get() = when (lang) {
        AppLanguage.CHINESE -> "安全扫描中..."
        AppLanguage.ENGLISH -> "Security scanning..."
        AppLanguage.ARABIC -> "فحص الأمان..."
    }
    
    val aiError: String get() = when (lang) {
        AppLanguage.CHINESE -> "AI 错误"
        AppLanguage.ENGLISH -> "AI Error"
        AppLanguage.ARABIC -> "خطأ AI"
    }
    
    // ==================== 通用 ====================
    val yes: String get() = when (lang) {
        AppLanguage.CHINESE -> "是"
        AppLanguage.ENGLISH -> "Yes"
        AppLanguage.ARABIC -> "نعم"
    }
    
    val no: String get() = when (lang) {
        AppLanguage.CHINESE -> "否"
        AppLanguage.ENGLISH -> "No"
        AppLanguage.ARABIC -> "لا"
    }
    
    val error: String get() = when (lang) {
        AppLanguage.CHINESE -> "错误"
        AppLanguage.ENGLISH -> "Error"
        AppLanguage.ARABIC -> "خطأ"
    }
    
    val success: String get() = when (lang) {
        AppLanguage.CHINESE -> "成功"
        AppLanguage.ENGLISH -> "Success"
        AppLanguage.ARABIC -> "نجاح"
    }
    
    val close: String get() = when (lang) {
        AppLanguage.CHINESE -> "关闭"
        AppLanguage.ENGLISH -> "Close"
        AppLanguage.ARABIC -> "إغلاق"
    }
    
    val cancel: String get() = when (lang) {
        AppLanguage.CHINESE -> "取消"
        AppLanguage.ENGLISH -> "Cancel"
        AppLanguage.ARABIC -> "إلغاء"
    }
    
    val copy: String get() = when (lang) {
        AppLanguage.CHINESE -> "复制"
        AppLanguage.ENGLISH -> "Copy"
        AppLanguage.ARABIC -> "نسخ"
    }
    
    val share: String get() = when (lang) {
        AppLanguage.CHINESE -> "分享"
        AppLanguage.ENGLISH -> "Share"
        AppLanguage.ARABIC -> "مشاركة"
    }
    
    val download: String get() = when (lang) {
        AppLanguage.CHINESE -> "下载"
        AppLanguage.ENGLISH -> "Download"
        AppLanguage.ARABIC -> "تحميل"
    }
    
    val remove: String get() = when (lang) {
        AppLanguage.CHINESE -> "移除"
        AppLanguage.ENGLISH -> "Remove"
        AppLanguage.ARABIC -> "إزالة"
    }
    
    val clear: String get() = when (lang) {
        AppLanguage.CHINESE -> "清除"
        AppLanguage.ENGLISH -> "Clear"
        AppLanguage.ARABIC -> "مسح"
    }
    
    val add: String get() = when (lang) {
        AppLanguage.CHINESE -> "添加"
        AppLanguage.ENGLISH -> "Add"
        AppLanguage.ARABIC -> "إضافة"
    }
    
    val enabled: String get() = when (lang) {
        AppLanguage.CHINESE -> "已启用"
        AppLanguage.ENGLISH -> "Enabled"
        AppLanguage.ARABIC -> "مفعل"
    }
    
    val disabled: String get() = when (lang) {
        AppLanguage.CHINESE -> "已禁用"
        AppLanguage.ENGLISH -> "Disabled"
        AppLanguage.ARABIC -> "معطل"
    }
    
    val tip: String get() = when (lang) {
        AppLanguage.CHINESE -> "提示"
        AppLanguage.ENGLISH -> "Tip"
        AppLanguage.ARABIC -> "تلميح"
    }
    
    val warning: String get() = when (lang) {
        AppLanguage.CHINESE -> "警告"
        AppLanguage.ENGLISH -> "Warning"
        AppLanguage.ARABIC -> "تحذير"
    }
    
    val info: String get() = when (lang) {
        AppLanguage.CHINESE -> "信息"
        AppLanguage.ENGLISH -> "Info"
        AppLanguage.ARABIC -> "معلومات"
    }
    
    // ==================== 空状态提示 ====================
    val emptyStateHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "点击下方按钮创建您的第一个应用"
        AppLanguage.ENGLISH -> "Tap the button below to create your first app"
        AppLanguage.ARABIC -> "اضغط على الزر أدناه لإنشاء تطبيقك الأول"
    }
    
    // ==================== 构建环境功能列表 ====================
    val featureImportBuiltProjects: String get() = when (lang) {
        AppLanguage.CHINESE -> "导入已构建的 Vue/React/Angular 项目"
        AppLanguage.ENGLISH -> "Import built Vue/React/Angular projects"
        AppLanguage.ARABIC -> "استيراد مشاريع Vue/React/Angular المبنية"
    }
    
    val featureAutoDetectFramework: String get() = when (lang) {
        AppLanguage.CHINESE -> "自动检测项目类型和框架"
        AppLanguage.ENGLISH -> "Auto detect project type and framework"
        AppLanguage.ARABIC -> "الكشف التلقائي عن نوع المشروع وإطار العمل"
    }
    
    val featureSupportViteWebpack: String get() = when (lang) {
        AppLanguage.CHINESE -> "支持 Vite/Webpack 构建输出"
        AppLanguage.ENGLISH -> "Support Vite/Webpack build output"
        AppLanguage.ARABIC -> "دعم مخرجات بناء Vite/Webpack"
    }
    
    val featureTypeScriptSupport: String get() = when (lang) {
        AppLanguage.CHINESE -> "TypeScript 项目支持"
        AppLanguage.ENGLISH -> "TypeScript project support"
        AppLanguage.ARABIC -> "دعم مشاريع TypeScript"
    }
    
    val featureStaticAssets: String get() = when (lang) {
        AppLanguage.CHINESE -> "静态资源自动处理"
        AppLanguage.ENGLISH -> "Auto process static assets"
        AppLanguage.ARABIC -> "معالجة الأصول الثابتة تلقائيًا"
    }
    
    val featureEsbuildOptional: String get() = when (lang) {
        AppLanguage.CHINESE -> "esbuild 高性能构建（可选）"
        AppLanguage.ENGLISH -> "esbuild high-performance build (optional)"
        AppLanguage.ARABIC -> "بناء esbuild عالي الأداء (اختياري)"
    }
    
    val techDescriptionContent: String get() = when (lang) {
        AppLanguage.CHINESE -> "本应用采用第一性原理设计，不依赖传统的 Node.js 运行时：\n\n• 内置打包器：纯 Kotlin 实现，可处理简单项目\n• esbuild：为 Android 编译的原生二进制，高性能\n• 渐进式降级：总能找到可用的构建方案\n\n推荐工作流：在电脑上完成 npm run build，然后导入构建输出。"
        AppLanguage.ENGLISH -> "This app uses first principles design, not relying on traditional Node.js runtime:\n\n• Built-in packager: Pure Kotlin implementation for simple projects\n• esbuild: Native binary compiled for Android, high performance\n• Progressive degradation: Always finds a working build solution\n\nRecommended workflow: Complete npm run build on computer, then import build output."
        AppLanguage.ARABIC -> "يستخدم هذا التطبيق تصميم المبادئ الأولى، دون الاعتماد على وقت تشغيل Node.js التقليدي:\n\n• أداة التعبئة المدمجة: تنفيذ Kotlin خالص للمشاريع البسيطة\n• esbuild: ثنائي أصلي مترجم لـ Android، أداء عالي\n• التدهور التدريجي: يجد دائمًا حل بناء يعمل\n\nسير العمل الموصى به: أكمل npm run build على الكمبيوتر، ثم استورد مخرجات البناء."
    }

    // ==================== 应用修改器 ====================
    val appIconModifier: String get() = when (lang) {
        AppLanguage.CHINESE -> "应用修改器"
        AppLanguage.ENGLISH -> "App Modifier"
        AppLanguage.ARABIC -> "معدل التطبيق"
    }
    
    val searchApps: String get() = when (lang) {
        AppLanguage.CHINESE -> "搜索应用..."
        AppLanguage.ENGLISH -> "Search apps..."
        AppLanguage.ARABIC -> "البحث عن التطبيقات..."
    }
    
    val userApps: String get() = when (lang) {
        AppLanguage.CHINESE -> "用户应用"
        AppLanguage.ENGLISH -> "User Apps"
        AppLanguage.ARABIC -> "تطبيقات المستخدم"
    }
    
    val systemApps: String get() = when (lang) {
        AppLanguage.CHINESE -> "系统应用"
        AppLanguage.ENGLISH -> "System Apps"
        AppLanguage.ARABIC -> "تطبيقات النظام"
    }
    
    val modifyApp: String get() = when (lang) {
        AppLanguage.CHINESE -> "修改应用"
        AppLanguage.ENGLISH -> "Modify App"
        AppLanguage.ARABIC -> "تعديل التطبيق"
    }
    
    val cloneInstall: String get() = when (lang) {
        AppLanguage.CHINESE -> "克隆安装"
        AppLanguage.ENGLISH -> "Clone Install"
        AppLanguage.ARABIC -> "تثبيت نسخة"
    }
    
    val originalApp: String get() = when (lang) {
        AppLanguage.CHINESE -> "原应用"
        AppLanguage.ENGLISH -> "Original App"
        AppLanguage.ARABIC -> "التطبيق الأصلي"
    }
    
    val useOriginalIcon: String get() = when (lang) {
        AppLanguage.CHINESE -> "使用原图标"
        AppLanguage.ENGLISH -> "Use Original Icon"
        AppLanguage.ARABIC -> "استخدام الأيقونة الأصلية"
    }
    
    val shortcutCreated: String get() = when (lang) {
        AppLanguage.CHINESE -> "快捷方式创建成功"
        AppLanguage.ENGLISH -> "Shortcut created successfully"
        AppLanguage.ARABIC -> "تم إنشاء الاختصار بنجاح"
    }
    
    val cloneSuccess: String get() = when (lang) {
        AppLanguage.CHINESE -> "克隆成功，请确认安装"
        AppLanguage.ENGLISH -> "Clone successful, please confirm installation"
        AppLanguage.ARABIC -> "تم النسخ بنجاح، يرجى تأكيد التثبيت"
    }

    // ==================== 资源加密 ====================
    val resourceEncryption: String get() = when (lang) {
        AppLanguage.CHINESE -> "资源加密"
        AppLanguage.ENGLISH -> "Resource Encryption"
        AppLanguage.ARABIC -> "تشفير الموارد"
    }
    
    val encryptionEnabled: String get() = when (lang) {
        AppLanguage.CHINESE -> "已启用加密保护"
        AppLanguage.ENGLISH -> "Encryption protection enabled"
        AppLanguage.ARABIC -> "تم تفعيل حماية التشفير"
    }
    
    val encryptionLevel: String get() = when (lang) {
        AppLanguage.CHINESE -> "加密级别"
        AppLanguage.ENGLISH -> "Encryption Level"
        AppLanguage.ARABIC -> "مستوى التشفير"
    }
    
    val basic: String get() = when (lang) {
        AppLanguage.CHINESE -> "基础"
        AppLanguage.ENGLISH -> "Basic"
        AppLanguage.ARABIC -> "أساسي"
    }
    
    val standard: String get() = when (lang) {
        AppLanguage.CHINESE -> "标准"
        AppLanguage.ENGLISH -> "Standard"
        AppLanguage.ARABIC -> "قياسي"
    }
    
    val advanced: String get() = when (lang) {
        AppLanguage.CHINESE -> "高级"
        AppLanguage.ENGLISH -> "Advanced"
        AppLanguage.ARABIC -> "متقدم"
    }

    // ==================== 独立环境 ====================
    val isolatedEnvironment: String get() = when (lang) {
        AppLanguage.CHINESE -> "独立环境"
        AppLanguage.ENGLISH -> "Isolated Environment"
        AppLanguage.ARABIC -> "بيئة معزولة"
    }
    
    val antiDetectionEnabled: String get() = when (lang) {
        AppLanguage.CHINESE -> "已启用防检测保护"
        AppLanguage.ENGLISH -> "Anti-detection protection enabled"
        AppLanguage.ARABIC -> "تم تفعيل حماية مكافحة الكشف"
    }
    
    val isolationLevel: String get() = when (lang) {
        AppLanguage.CHINESE -> "隔离级别"
        AppLanguage.ENGLISH -> "Isolation Level"
        AppLanguage.ARABIC -> "مستوى العزل"
    }

    // ==================== 激活对话框 ====================
    val activateApp: String get() = when (lang) {
        AppLanguage.CHINESE -> "激活应用"
        AppLanguage.ENGLISH -> "Activate App"
        AppLanguage.ARABIC -> "تفعيل التطبيق"
    }
    
    val enterActivationCodeToContinue: String get() = when (lang) {
        AppLanguage.CHINESE -> "请输入激活码以继续使用"
        AppLanguage.ENGLISH -> "Please enter activation code to continue"
        AppLanguage.ARABIC -> "يرجى إدخال رمز التفعيل للمتابعة"
    }
    
    val activationCodeExample: String get() = when (lang) {
        AppLanguage.CHINESE -> "例如：XXXX-XXXX-XXXX-XXXX"
        AppLanguage.ENGLISH -> "e.g.: XXXX-XXXX-XXXX-XXXX"
        AppLanguage.ARABIC -> "مثال: XXXX-XXXX-XXXX-XXXX"
    }
    
    val activate: String get() = when (lang) {
        AppLanguage.CHINESE -> "激活"
        AppLanguage.ENGLISH -> "Activate"
        AppLanguage.ARABIC -> "تفعيل"
    }
    
    val addActivationCode: String get() = when (lang) {
        AppLanguage.CHINESE -> "添加激活码"
        AppLanguage.ENGLISH -> "Add Activation Code"
        AppLanguage.ARABIC -> "إضافة رمز التفعيل"
    }
    
    val useCustomCode: String get() = when (lang) {
        AppLanguage.CHINESE -> "使用自定义激活码"
        AppLanguage.ENGLISH -> "Use Custom Code"
        AppLanguage.ARABIC -> "استخدام رمز مخصص"
    }
    
    val validityDays: String get() = when (lang) {
        AppLanguage.CHINESE -> "有效期（天）"
        AppLanguage.ENGLISH -> "Validity (days)"
        AppLanguage.ARABIC -> "الصلاحية (أيام)"
    }
    
    val usageCount: String get() = when (lang) {
        AppLanguage.CHINESE -> "使用次数"
        AppLanguage.ENGLISH -> "Usage Count"
        AppLanguage.ARABIC -> "عدد الاستخدامات"
    }
    
    val noteOptional: String get() = when (lang) {
        AppLanguage.CHINESE -> "备注（可选）"
        AppLanguage.ENGLISH -> "Note (optional)"
        AppLanguage.ARABIC -> "ملاحظة (اختياري)"
    }
    
    val vipUserOnly: String get() = when (lang) {
        AppLanguage.CHINESE -> "例如：VIP用户专用"
        AppLanguage.ENGLISH -> "e.g.: VIP users only"
        AppLanguage.ARABIC -> "مثال: لمستخدمي VIP فقط"
    }
    
    val requireEveryLaunch: String get() = when (lang) {
        AppLanguage.CHINESE -> "每次启动都需要验证"
        AppLanguage.ENGLISH -> "Require verification every launch"
        AppLanguage.ARABIC -> "يتطلب التحقق في كل تشغيل"
    }
    
    val requireEveryLaunchHintOn: String get() = when (lang) {
        AppLanguage.CHINESE -> "每次打开应用都需要输入激活码"
        AppLanguage.ENGLISH -> "Enter activation code every time app opens"
        AppLanguage.ARABIC -> "أدخل رمز التفعيل في كل مرة يفتح فيها التطبيق"
    }
    
    val requireEveryLaunchHintOff: String get() = when (lang) {
        AppLanguage.CHINESE -> "激活一次后永久有效"
        AppLanguage.ENGLISH -> "Valid permanently after one activation"
        AppLanguage.ARABIC -> "صالح بشكل دائم بعد تفعيل واحد"
    }

    // ==================== 颜色选择器 ====================
    val selectColor: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择颜色"
        AppLanguage.ENGLISH -> "Select Color"
        AppLanguage.ARABIC -> "اختيار اللون"
    }
    
    val hexColor: String get() = when (lang) {
        AppLanguage.CHINESE -> "十六进制颜色"
        AppLanguage.ENGLISH -> "Hex Color"
        AppLanguage.ARABIC -> "لون سداسي عشري"
    }
    
    val hexColorHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "如: FF5722 或 80FF5722"
        AppLanguage.ENGLISH -> "e.g.: FF5722 or 80FF5722"
        AppLanguage.ARABIC -> "مثال: FF5722 أو 80FF5722"
    }

    // ==================== 在线音乐 ====================
    val onlineMusic: String get() = when (lang) {
        AppLanguage.CHINESE -> "在线音乐"
        AppLanguage.ENGLISH -> "Online Music"
        AppLanguage.ARABIC -> "موسيقى عبر الإنترنت"
    }
    
    val searchSongName: String get() = when (lang) {
        AppLanguage.CHINESE -> "搜索歌曲名称"
        AppLanguage.ENGLISH -> "Search song name"
        AppLanguage.ARABIC -> "البحث عن اسم الأغنية"
    }
    
    val paid: String get() = when (lang) {
        AppLanguage.CHINESE -> "付费"
        AppLanguage.ENGLISH -> "Paid"
        AppLanguage.ARABIC -> "مدفوع"
    }

    // ==================== 图标生成器 ====================
    val selectModel: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择模型"
        AppLanguage.ENGLISH -> "Select Model"
        AppLanguage.ARABIC -> "اختيار النموذج"
    }
    
    val describeIcon: String get() = when (lang) {
        AppLanguage.CHINESE -> "描述你想要的图标"
        AppLanguage.ENGLISH -> "Describe the icon you want"
        AppLanguage.ARABIC -> "صف الأيقونة التي تريدها"
    }
    
    val iconDescriptionExample: String get() = when (lang) {
        AppLanguage.CHINESE -> "例如：一个蓝色渐变的音乐播放器图标"
        AppLanguage.ENGLISH -> "e.g.: A blue gradient music player icon"
        AppLanguage.ARABIC -> "مثال: أيقونة مشغل موسيقى بتدرج أزرق"
    }
    
    val generationResult: String get() = when (lang) {
        AppLanguage.CHINESE -> "生成结果"
        AppLanguage.ENGLISH -> "Generation Result"
        AppLanguage.ARABIC -> "نتيجة التوليد"
    }
    
    val useThisIcon: String get() = when (lang) {
        AppLanguage.CHINESE -> "使用此图标"
        AppLanguage.ENGLISH -> "Use This Icon"
        AppLanguage.ARABIC -> "استخدام هذه الأيقونة"
    }
    
    val saving: String get() = when (lang) {
        AppLanguage.CHINESE -> "保存中..."
        AppLanguage.ENGLISH -> "Saving..."
        AppLanguage.ARABIC -> "جاري الحفظ..."
    }
    
    val generateIcon: String get() = when (lang) {
        AppLanguage.CHINESE -> "生成图标"
        AppLanguage.ENGLISH -> "Generate Icon"
        AppLanguage.ARABIC -> "توليد الأيقونة"
    }
    
    val regenerate: String get() = when (lang) {
        AppLanguage.CHINESE -> "重新生成"
        AppLanguage.ENGLISH -> "Regenerate"
        AppLanguage.ARABIC -> "إعادة التوليد"
    }

    // ==================== 状态栏配置 ====================
    val backgroundType: String get() = when (lang) {
        AppLanguage.CHINESE -> "背景类型"
        AppLanguage.ENGLISH -> "Background Type"
        AppLanguage.ARABIC -> "نوع الخلفية"
    }
    
    val solidColor: String get() = when (lang) {
        AppLanguage.CHINESE -> "纯色"
        AppLanguage.ENGLISH -> "Solid Color"
        AppLanguage.ARABIC -> "لون صلب"
    }
    
    val cropStatusBarBg: String get() = when (lang) {
        AppLanguage.CHINESE -> "裁剪状态栏背景"
        AppLanguage.ENGLISH -> "Crop Status Bar Background"
        AppLanguage.ARABIC -> "قص خلفية شريط الحالة"
    }
    
    val confirmCrop: String get() = when (lang) {
        AppLanguage.CHINESE -> "确认裁剪"
        AppLanguage.ENGLISH -> "Confirm Crop"
        AppLanguage.ARABIC -> "تأكيد القص"
    }

    // ==================== 歌词对齐 ====================
    val nextStepTimeAlign: String get() = when (lang) {
        AppLanguage.CHINESE -> "下一步：时间对齐"
        AppLanguage.ENGLISH -> "Next: Time Alignment"
        AppLanguage.ARABIC -> "التالي: محاذاة الوقت"
    }
    
    val tap: String get() = when (lang) {
        AppLanguage.CHINESE -> "打点"
        AppLanguage.ENGLISH -> "Tap"
        AppLanguage.ARABIC -> "نقر"
    }
    
    val previousStep: String get() = when (lang) {
        AppLanguage.CHINESE -> "上一步"
        AppLanguage.ENGLISH -> "Previous"
        AppLanguage.ARABIC -> "السابق"
    }
    
    val nextStep: String get() = when (lang) {
        AppLanguage.CHINESE -> "下一步"
        AppLanguage.ENGLISH -> "Next"
        AppLanguage.ARABIC -> "التالي"
    }
    
    val backToModify: String get() = when (lang) {
        AppLanguage.CHINESE -> "返回修改"
        AppLanguage.ENGLISH -> "Back to Modify"
        AppLanguage.ARABIC -> "العودة للتعديل"
    }
    
    val saveLrc: String get() = when (lang) {
        AppLanguage.CHINESE -> "保存 LRC"
        AppLanguage.ENGLISH -> "Save LRC"
        AppLanguage.ARABIC -> "حفظ LRC"
    }
    
    // ==================== 额外字符串 ====================
    val seconds: String get() = when (lang) {
        AppLanguage.CHINESE -> "秒"
        AppLanguage.ENGLISH -> "seconds"
        AppLanguage.ARABIC -> "ثواني"
    }
    
    val allowClickToSkip: String get() = when (lang) {
        AppLanguage.CHINESE -> "允许点击跳过"
        AppLanguage.ENGLISH -> "Allow click to skip"
        AppLanguage.ARABIC -> "السماح بالنقر للتخطي"
    }
    
    val hotSearch: String get() = when (lang) {
        AppLanguage.CHINESE -> "热门搜索"
        AppLanguage.ENGLISH -> "Hot Search"
        AppLanguage.ARABIC -> "البحث الشائع"
    }
    
    val searchHistory: String get() = when (lang) {
        AppLanguage.CHINESE -> "搜索历史"
        AppLanguage.ENGLISH -> "Search History"
        AppLanguage.ARABIC -> "سجل البحث"
    }
    
    val musicSource: String get() = when (lang) {
        AppLanguage.CHINESE -> "音乐来源：网易云音乐"
        AppLanguage.ENGLISH -> "Music source: NetEase Cloud Music"
        AppLanguage.ARABIC -> "مصدر الموسيقى: NetEase Cloud Music"
    }
    
    val unknownArtist: String get() = when (lang) {
        AppLanguage.CHINESE -> "未知歌手"
        AppLanguage.ENGLISH -> "Unknown Artist"
        AppLanguage.ARABIC -> "فنان غير معروف"
    }
    
    val downloaded: String get() = when (lang) {
        AppLanguage.CHINESE -> "已下载"
        AppLanguage.ENGLISH -> "Downloaded"
        AppLanguage.ARABIC -> "تم التحميل"
    }
    
    val downloadFailed: String get() = when (lang) {
        AppLanguage.CHINESE -> "下载失败，请重试"
        AppLanguage.ENGLISH -> "Download failed, please retry"
        AppLanguage.ARABIC -> "فشل التحميل، يرجى المحاولة مرة أخرى"
    }
    
    val searching: String get() = when (lang) {
        AppLanguage.CHINESE -> "搜索中..."
        AppLanguage.ENGLISH -> "Searching..."
        AppLanguage.ARABIC -> "جاري البحث..."
    }
    
    val randomRecommend: String get() = when (lang) {
        AppLanguage.CHINESE -> "随机推荐"
        AppLanguage.ENGLISH -> "Random Recommend"
        AppLanguage.ARABIC -> "توصية عشوائية"
    }
    
    val aiGenerateIcon: String get() = when (lang) {
        AppLanguage.CHINESE -> "AI 生成图标"
        AppLanguage.ENGLISH -> "AI Generate Icon"
        AppLanguage.ARABIC -> "توليد أيقونة AI"
    }
    
    val noImageGenModel: String get() = when (lang) {
        AppLanguage.CHINESE -> "未找到支持图像生成的模型"
        AppLanguage.ENGLISH -> "No image generation model found"
        AppLanguage.ARABIC -> "لم يتم العثور على نموذج توليد الصور"
    }
    
    val addImageGenModelHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "请在「AI设置」中添加模型并标记「图像生成」能力"
        AppLanguage.ENGLISH -> "Please add a model in 'AI Settings' and mark 'Image Generation' capability"
        AppLanguage.ARABIC -> "يرجى إضافة نموذج في 'إعدادات AI' وتحديد قدرة 'توليد الصور'"
    }
    
    val referenceImages: String get() = when (lang) {
        AppLanguage.CHINESE -> "参考图片（可选，最多3张）"
        AppLanguage.ENGLISH -> "Reference images (optional, max 3)"
        AppLanguage.ARABIC -> "صور مرجعية (اختياري، بحد أقصى 3)"
    }
    
    val addImage: String get() = when (lang) {
        AppLanguage.CHINESE -> "添加图片"
        AppLanguage.ENGLISH -> "Add Image"
        AppLanguage.ARABIC -> "إضافة صورة"
    }
    
    val generatedIcon: String get() = when (lang) {
        AppLanguage.CHINESE -> "生成的图标"
        AppLanguage.ENGLISH -> "Generated Icon"
        AppLanguage.ARABIC -> "الأيقونة المولدة"
    }
    
    val presetColors: String get() = when (lang) {
        AppLanguage.CHINESE -> "预设颜色"
        AppLanguage.ENGLISH -> "Preset Colors"
        AppLanguage.ARABIC -> "الألوان المسبقة"
    }
    
    val customColor: String get() = when (lang) {
        AppLanguage.CHINESE -> "自定义颜色"
        AppLanguage.ENGLISH -> "Custom Color"
        AppLanguage.ARABIC -> "لون مخصص"
    }
    
    val currentSelection: String get() = when (lang) {
        AppLanguage.CHINESE -> "当前选择"
        AppLanguage.ENGLISH -> "Current Selection"
        AppLanguage.ARABIC -> "الاختيار الحالي"
    }
    
    val hexColorFormat: String get() = when (lang) {
        AppLanguage.CHINESE -> "6位(RGB)或8位(ARGB)十六进制"
        AppLanguage.ENGLISH -> "6-digit (RGB) or 8-digit (ARGB) hex"
        AppLanguage.ARABIC -> "سداسي عشري 6 أرقام (RGB) أو 8 أرقام (ARGB)"
    }
    
    val dragToSelectArea: String get() = when (lang) {
        AppLanguage.CHINESE -> "上下拖动选择要截取的区域"
        AppLanguage.ENGLISH -> "Drag up/down to select crop area"
        AppLanguage.ARABIC -> "اسحب لأعلى/لأسفل لتحديد منطقة القص"
    }
    
    val loadingImage: String get() = when (lang) {
        AppLanguage.CHINESE -> "加载图片中..."
        AppLanguage.ENGLISH -> "Loading image..."
        AppLanguage.ARABIC -> "جاري تحميل الصورة..."
    }
    
    val cropSize: String get() = when (lang) {
        AppLanguage.CHINESE -> "裁剪尺寸"
        AppLanguage.ENGLISH -> "Crop Size"
        AppLanguage.ARABIC -> "حجم القص"
    }
    
    val originalSize: String get() = when (lang) {
        AppLanguage.CHINESE -> "原图尺寸"
        AppLanguage.ENGLISH -> "Original Size"
        AppLanguage.ARABIC -> "الحجم الأصلي"
    }
    
    val statusBarHeight: String get() = when (lang) {
        AppLanguage.CHINESE -> "状态栏高度"
        AppLanguage.ENGLISH -> "Status Bar Height"
        AppLanguage.ARABIC -> "ارتفاع شريط الحالة"
    }
    
    val restoreDefault: String get() = when (lang) {
        AppLanguage.CHINESE -> "恢复默认"
        AppLanguage.ENGLISH -> "Restore Default"
        AppLanguage.ARABIC -> "استعادة الافتراضي"
    }
    
    val statusBarPreview: String get() = when (lang) {
        AppLanguage.CHINESE -> "状态栏预览"
        AppLanguage.ENGLISH -> "Status Bar Preview"
        AppLanguage.ARABIC -> "معاينة شريط الحالة"
    }
    
    val noImageSelected: String get() = when (lang) {
        AppLanguage.CHINESE -> "未选择图片"
        AppLanguage.ENGLISH -> "No image selected"
        AppLanguage.ARABIC -> "لم يتم اختيار صورة"
    }
    
    val backgroundColor: String get() = when (lang) {
        AppLanguage.CHINESE -> "背景颜色"
        AppLanguage.ENGLISH -> "Background Color"
        AppLanguage.ARABIC -> "لون الخلفية"
    }
    
    val selectBackgroundImage: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择背景图片"
        AppLanguage.ENGLISH -> "Select Background Image"
        AppLanguage.ARABIC -> "اختيار صورة الخلفية"
    }
    
    val imageSelected: String get() = when (lang) {
        AppLanguage.CHINESE -> "已选择图片"
        AppLanguage.ENGLISH -> "Image Selected"
        AppLanguage.ARABIC -> "تم اختيار الصورة"
    }
    
    val clickToChangeOrClear: String get() = when (lang) {
        AppLanguage.CHINESE -> "点击更换或清除"
        AppLanguage.ENGLISH -> "Click to change or clear"
        AppLanguage.ARABIC -> "انقر للتغيير أو المسح"
    }
    
    val changeImage: String get() = when (lang) {
        AppLanguage.CHINESE -> "更换图片"
        AppLanguage.ENGLISH -> "Change Image"
        AppLanguage.ARABIC -> "تغيير الصورة"
    }
    
    val clearImage: String get() = when (lang) {
        AppLanguage.CHINESE -> "清除图片"
        AppLanguage.ENGLISH -> "Clear Image"
        AppLanguage.ARABIC -> "مسح الصورة"
    }
    
    val backgroundAlpha: String get() = when (lang) {
        AppLanguage.CHINESE -> "背景透明度"
        AppLanguage.ENGLISH -> "Background Alpha"
        AppLanguage.ARABIC -> "شفافية الخلفية"
    }
    
    val transparent: String get() = when (lang) {
        AppLanguage.CHINESE -> "透明"
        AppLanguage.ENGLISH -> "Transparent"
        AppLanguage.ARABIC -> "شفاف"
    }
    
    val opaque: String get() = when (lang) {
        AppLanguage.CHINESE -> "不透明"
        AppLanguage.ENGLISH -> "Opaque"
        AppLanguage.ARABIC -> "معتم"
    }
    
    val inputLyrics: String get() = when (lang) {
        AppLanguage.CHINESE -> "输入歌词"
        AppLanguage.ENGLISH -> "Input Lyrics"
        AppLanguage.ARABIC -> "إدخال كلمات الأغنية"
    }
    
    val timeAlignment: String get() = when (lang) {
        AppLanguage.CHINESE -> "时间对齐"
        AppLanguage.ENGLISH -> "Time Alignment"
        AppLanguage.ARABIC -> "محاذاة الوقت"
    }
    
    val previewConfirm: String get() = when (lang) {
        AppLanguage.CHINESE -> "预览确认"
        AppLanguage.ENGLISH -> "Preview Confirm"
        AppLanguage.ARABIC -> "تأكيد المعاينة"
    }
    
    val duration: String get() = when (lang) {
        AppLanguage.CHINESE -> "时长"
        AppLanguage.ENGLISH -> "Duration"
        AppLanguage.ARABIC -> "المدة"
    }
    
    val inputLyricsHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "请输入歌词文本，每行一句："
        AppLanguage.ENGLISH -> "Please enter lyrics text, one line per sentence:"
        AppLanguage.ARABIC -> "يرجى إدخال نص كلمات الأغنية، سطر واحد لكل جملة:"
    }
    
    val lyricsPlaceholder: String get() = when (lang) {
        AppLanguage.CHINESE -> "在这里粘贴或输入歌词...\n\n示例：\n♪ 前奏\n第一句歌词\n第二句歌词\n♪ 间奏\n继续歌词..."
        AppLanguage.ENGLISH -> "Paste or enter lyrics here...\n\nExample:\n♪ Intro\nFirst line\nSecond line\n♪ Interlude\nContinue lyrics..."
        AppLanguage.ARABIC -> "الصق أو أدخل كلمات الأغنية هنا...\n\nمثال:\n♪ مقدمة\nالسطر الأول\nالسطر الثاني\n♪ فاصل\nمتابعة الكلمات..."
    }
    
    val totalLyricsLines: String get() = when (lang) {
        AppLanguage.CHINESE -> "共 %d 行歌词"
        AppLanguage.ENGLISH -> "%d lines of lyrics"
        AppLanguage.ARABIC -> "%d سطر من الكلمات"
    }
    
    val alignmentHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "播放音频，在听到每句歌词开始时点击「打点」按钮"
        AppLanguage.ENGLISH -> "Play audio, click 'Tap' button when you hear each line start"
        AppLanguage.ARABIC -> "شغل الصوت، انقر على زر 'نقر' عند سماع بداية كل سطر"
    }
    
    val rewind3s: String get() = when (lang) {
        AppLanguage.CHINESE -> "后退3秒"
        AppLanguage.ENGLISH -> "Rewind 3s"
        AppLanguage.ARABIC -> "إرجاع 3 ثواني"
    }
    
    val play: String get() = when (lang) {
        AppLanguage.CHINESE -> "播放"
        AppLanguage.ENGLISH -> "Play"
        AppLanguage.ARABIC -> "تشغيل"
    }
    
    val pause: String get() = when (lang) {
        AppLanguage.CHINESE -> "暂停"
        AppLanguage.ENGLISH -> "Pause"
        AppLanguage.ARABIC -> "إيقاف مؤقت"
    }
    
    val reTap: String get() = when (lang) {
        AppLanguage.CHINESE -> "重新打点"
        AppLanguage.ENGLISH -> "Re-tap"
        AppLanguage.ARABIC -> "إعادة النقر"
    }
    
    val undo: String get() = when (lang) {
        AppLanguage.CHINESE -> "撤销"
        AppLanguage.ENGLISH -> "Undo"
        AppLanguage.ARABIC -> "تراجع"
    }
    
    val redo: String get() = when (lang) {
        AppLanguage.CHINESE -> "重做"
        AppLanguage.ENGLISH -> "Redo"
        AppLanguage.ARABIC -> "إعادة"
    }
    
    val progress: String get() = when (lang) {
        AppLanguage.CHINESE -> "进度"
        AppLanguage.ENGLISH -> "Progress"
        AppLanguage.ARABIC -> "التقدم"
    }
    
    val activationSuccess: String get() = when (lang) {
        AppLanguage.CHINESE -> "激活成功！"
        AppLanguage.ENGLISH -> "Activation successful!"
        AppLanguage.ARABIC -> "تم التفعيل بنجاح!"
    }
    
    val activationCodeCopied: String get() = when (lang) {
        AppLanguage.CHINESE -> "激活码已复制"
        AppLanguage.ENGLISH -> "Activation code copied"
        AppLanguage.ARABIC -> "تم نسخ رمز التفعيل"
    }
    
    val copyActivationCode: String get() = when (lang) {
        AppLanguage.CHINESE -> "复制激活码"
        AppLanguage.ENGLISH -> "Copy Activation Code"
        AppLanguage.ARABIC -> "نسخ رمز التفعيل"
    }
    
    val noActivationCodes: String get() = when (lang) {
        AppLanguage.CHINESE -> "暂无激活码，点击上方按钮添加"
        AppLanguage.ENGLISH -> "No activation codes, click button above to add"
        AppLanguage.ARABIC -> "لا توجد رموز تفعيل، انقر على الزر أعلاه للإضافة"
    }
    
    val activationCodeType: String get() = when (lang) {
        AppLanguage.CHINESE -> "激活码类型"
        AppLanguage.ENGLISH -> "Activation Code Type"
        AppLanguage.ARABIC -> "نوع رمز التفعيل"
    }
    
    val activated: String get() = when (lang) {
        AppLanguage.CHINESE -> "已激活"
        AppLanguage.ENGLISH -> "Activated"
        AppLanguage.ARABIC -> "مفعل"
    }
    
    val activationExpired: String get() = when (lang) {
        AppLanguage.CHINESE -> "激活已失效"
        AppLanguage.ENGLISH -> "Activation expired"
        AppLanguage.ARABIC -> "انتهت صلاحية التفعيل"
    }
    
    val activationTime: String get() = when (lang) {
        AppLanguage.CHINESE -> "激活时间"
        AppLanguage.ENGLISH -> "Activation Time"
        AppLanguage.ARABIC -> "وقت التفعيل"
    }
    
    val remainingTime: String get() = when (lang) {
        AppLanguage.CHINESE -> "剩余时间"
        AppLanguage.ENGLISH -> "Remaining Time"
        AppLanguage.ARABIC -> "الوقت المتبقي"
    }
    
    val expireTime: String get() = when (lang) {
        AppLanguage.CHINESE -> "过期时间"
        AppLanguage.ENGLISH -> "Expire Time"
        AppLanguage.ARABIC -> "وقت الانتهاء"
    }
    
    val remainingUsage: String get() = when (lang) {
        AppLanguage.CHINESE -> "剩余次数"
        AppLanguage.ENGLISH -> "Remaining Usage"
        AppLanguage.ARABIC -> "الاستخدامات المتبقية"
    }
    
    val deviceBound: String get() = when (lang) {
        AppLanguage.CHINESE -> "设备绑定：已启用"
        AppLanguage.ENGLISH -> "Device Bound: Enabled"
        AppLanguage.ARABIC -> "ربط الجهاز: مفعل"
    }
    
    val invalidActivationCode: String get() = when (lang) {
        AppLanguage.CHINESE -> "无效的激活码"
        AppLanguage.ENGLISH -> "Invalid activation code"
        AppLanguage.ARABIC -> "رمز تفعيل غير صالح"
    }
    
    val activationCodeBoundToOtherDevice: String get() = when (lang) {
        AppLanguage.CHINESE -> "此激活码已绑定到其他设备"
        AppLanguage.ENGLISH -> "This activation code is bound to another device"
        AppLanguage.ARABIC -> "رمز التفعيل هذا مرتبط بجهاز آخر"
    }
    
    val activationCodeExpired: String get() = when (lang) {
        AppLanguage.CHINESE -> "激活码已过期"
        AppLanguage.ENGLISH -> "Activation code expired"
        AppLanguage.ARABIC -> "انتهت صلاحية رمز التفعيل"
    }
    
    val activationCodeUsageExceeded: String get() = when (lang) {
        AppLanguage.CHINESE -> "激活码使用次数已用完"
        AppLanguage.ENGLISH -> "Activation code usage exceeded"
        AppLanguage.ARABIC -> "تم تجاوز استخدام رمز التفعيل"
    }
    
    val appAlreadyActivated: String get() = when (lang) {
        AppLanguage.CHINESE -> "应用已激活"
        AppLanguage.ENGLISH -> "App already activated"
        AppLanguage.ARABIC -> "التطبيق مفعل بالفعل"
    }
    
    val pleaseEnterActivationCode: String get() = when (lang) {
        AppLanguage.CHINESE -> "请输入激活码"
        AppLanguage.ENGLISH -> "Please enter activation code"
        AppLanguage.ARABIC -> "يرجى إدخال رمز التفعيل"
    }
    
    val permanentValid: String get() = when (lang) {
        AppLanguage.CHINESE -> "永久有效"
        AppLanguage.ENGLISH -> "Permanently valid"
        AppLanguage.ARABIC -> "صالح بشكل دائم"
    }
    
    val validityPeriod: String get() = when (lang) {
        AppLanguage.CHINESE -> "有效期"
        AppLanguage.ENGLISH -> "Validity Period"
        AppLanguage.ARABIC -> "فترة الصلاحية"
    }
    
    val days: String get() = when (lang) {
        AppLanguage.CHINESE -> "天"
        AppLanguage.ENGLISH -> "days"
        AppLanguage.ARABIC -> "أيام"
    }
    
    val hours: String get() = when (lang) {
        AppLanguage.CHINESE -> "小时"
        AppLanguage.ENGLISH -> "hours"
        AppLanguage.ARABIC -> "ساعات"
    }
    
    val times: String get() = when (lang) {
        AppLanguage.CHINESE -> "次"
        AppLanguage.ENGLISH -> "times"
        AppLanguage.ARABIC -> "مرات"
    }
    
    val note: String get() = when (lang) {
        AppLanguage.CHINESE -> "备注"
        AppLanguage.ENGLISH -> "Note"
        AppLanguage.ARABIC -> "ملاحظة"
    }
    
    val cloneInstallWarning: String get() = when (lang) {
        AppLanguage.CHINESE -> "克隆安装仅适用于无签名校验的应用，兼容性较差。建议优先使用「快捷方式」功能。"
        AppLanguage.ENGLISH -> "Clone install only works for apps without signature verification, with limited compatibility. It's recommended to use 'Shortcut' feature instead."
        AppLanguage.ARABIC -> "التثبيت المستنسخ يعمل فقط للتطبيقات بدون التحقق من التوقيع، مع توافق محدود. يُنصح باستخدام ميزة 'الاختصار' بدلاً من ذلك."
    }
    
    val enableAudioLabel: String get() = when (lang) {
        AppLanguage.CHINESE -> "启用音频"
        AppLanguage.ENGLISH -> "Enable Audio"
        AppLanguage.ARABIC -> "تفعيل الصوت"
    }

    // ==================== 图标库 ====================
    val iconLibrary: String get() = when (lang) {
        AppLanguage.CHINESE -> "图标库"
        AppLanguage.ENGLISH -> "Icon Library"
        AppLanguage.ARABIC -> "مكتبة الأيقونات"
    }
    
    val selectIconOrGenerate: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择图标或使用AI生成新图标"
        AppLanguage.ENGLISH -> "Select icon or generate new one with AI"
        AppLanguage.ARABIC -> "اختر أيقونة أو أنشئ واحدة جديدة بالذكاء الاصطناعي"
    }
    
    val useAiToGenerateIcon: String get() = when (lang) {
        AppLanguage.CHINESE -> "使用AI模型生成自定义图标"
        AppLanguage.ENGLISH -> "Use AI model to generate custom icon"
        AppLanguage.ARABIC -> "استخدم نموذج الذكاء الاصطناعي لإنشاء أيقونة مخصصة"
    }
    
    val iconLibraryEmpty: String get() = when (lang) {
        AppLanguage.CHINESE -> "图标库为空"
        AppLanguage.ENGLISH -> "Icon library is empty"
        AppLanguage.ARABIC -> "مكتبة الأيقونات فارغة"
    }
    
    val iconLibraryEmptyHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "使用AI生成图标后会自动保存到这里"
        AppLanguage.ENGLISH -> "Icons generated by AI will be saved here automatically"
        AppLanguage.ARABIC -> "سيتم حفظ الأيقونات المُنشأة بالذكاء الاصطناعي هنا تلقائيًا"
    }
    
    val savedIcons: String get() = when (lang) {
        AppLanguage.CHINESE -> "已保存的图标"
        AppLanguage.ENGLISH -> "Saved Icons"
        AppLanguage.ARABIC -> "الأيقونات المحفوظة"
    }
    
    val deleteIcon: String get() = when (lang) {
        AppLanguage.CHINESE -> "删除图标"
        AppLanguage.ENGLISH -> "Delete Icon"
        AppLanguage.ARABIC -> "حذف الأيقونة"
    }
    
    val deleteIconConfirm: String get() = when (lang) {
        AppLanguage.CHINESE -> "确定要从图标库中删除此图标吗？"
        AppLanguage.ENGLISH -> "Are you sure you want to delete this icon from the library?"
        AppLanguage.ARABIC -> "هل أنت متأكد أنك تريد حذف هذه الأيقونة من المكتبة؟"
    }

    // ==================== 下载和保存 ====================
    val saveFailed: String get() = when (lang) {
        AppLanguage.CHINESE -> "保存失败"
        AppLanguage.ENGLISH -> "Save failed"
        AppLanguage.ARABIC -> "فشل الحفظ"
    }
    
    val saveFailedWithReason: String get() = when (lang) {
        AppLanguage.CHINESE -> "保存失败: %s"
        AppLanguage.ENGLISH -> "Save failed: %s"
        AppLanguage.ARABIC -> "فشل الحفظ: %s"
    }
    
    val savedTo: String get() = when (lang) {
        AppLanguage.CHINESE -> "已保存到: %s"
        AppLanguage.ENGLISH -> "Saved to: %s"
        AppLanguage.ARABIC -> "تم الحفظ إلى: %s"
    }
    
    val copiedToClipboard: String get() = when (lang) {
        AppLanguage.CHINESE -> "已复制到剪贴板"
        AppLanguage.ENGLISH -> "Copied to clipboard"
        AppLanguage.ARABIC -> "تم النسخ إلى الحافظة"
    }
    
    val downloadingVideo: String get() = when (lang) {
        AppLanguage.CHINESE -> "正在下载视频..."
        AppLanguage.ENGLISH -> "Downloading video..."
        AppLanguage.ARABIC -> "جاري تحميل الفيديو..."
    }
    
    val shareFailed: String get() = when (lang) {
        AppLanguage.CHINESE -> "分享失败"
        AppLanguage.ENGLISH -> "Share failed"
        AppLanguage.ARABIC -> "فشلت المشاركة"
    }
    
    val preparingShare: String get() = when (lang) {
        AppLanguage.CHINESE -> "正在准备分享..."
        AppLanguage.ENGLISH -> "Preparing to share..."
        AppLanguage.ARABIC -> "جاري التحضير للمشاركة..."
    }
    
    val cannotOpenLink: String get() = when (lang) {
        AppLanguage.CHINESE -> "无法打开链接"
        AppLanguage.ENGLISH -> "Cannot open link"
        AppLanguage.ARABIC -> "لا يمكن فتح الرابط"
    }
    
    val savingImage: String get() = when (lang) {
        AppLanguage.CHINESE -> "正在保存图片..."
        AppLanguage.ENGLISH -> "Saving image..."
        AppLanguage.ARABIC -> "جاري حفظ الصورة..."
    }
    
    val imageSavedToGallery: String get() = when (lang) {
        AppLanguage.CHINESE -> "图片已保存到相册"
        AppLanguage.ENGLISH -> "Image saved to gallery"
        AppLanguage.ARABIC -> "تم حفظ الصورة في المعرض"
    }
    
    val savingVideo: String get() = when (lang) {
        AppLanguage.CHINESE -> "正在保存视频..."
        AppLanguage.ENGLISH -> "Saving video..."
        AppLanguage.ARABIC -> "جاري حفظ الفيديو..."
    }
    
    val videoSavedToGallery: String get() = when (lang) {
        AppLanguage.CHINESE -> "视频已保存到相册"
        AppLanguage.ENGLISH -> "Video saved to gallery"
        AppLanguage.ARABIC -> "تم حفظ الفيديو في المعرض"
    }
    
    val startDownload: String get() = when (lang) {
        AppLanguage.CHINESE -> "开始下载: %s"
        AppLanguage.ENGLISH -> "Start download: %s"
        AppLanguage.ARABIC -> "بدء التحميل: %s"
    }
    
    val downloadFailedWithReason: String get() = when (lang) {
        AppLanguage.CHINESE -> "下载失败: %s"
        AppLanguage.ENGLISH -> "Download failed: %s"
        AppLanguage.ARABIC -> "فشل التحميل: %s"
    }

    // ==================== 公告模板 ====================
    val previewAnnouncementEffect: String get() = when (lang) {
        AppLanguage.CHINESE -> "预览公告效果"
        AppLanguage.ENGLISH -> "Preview Announcement Effect"
        AppLanguage.ARABIC -> "معاينة تأثير الإعلان"
    }
    
    val inputAnnouncementTitle: String get() = when (lang) {
        AppLanguage.CHINESE -> "输入公告标题"
        AppLanguage.ENGLISH -> "Enter announcement title"
        AppLanguage.ARABIC -> "أدخل عنوان الإعلان"
    }
    
    val inputAnnouncementContent: String get() = when (lang) {
        AppLanguage.CHINESE -> "输入公告内容..."
        AppLanguage.ENGLISH -> "Enter announcement content..."
        AppLanguage.ARABIC -> "أدخل محتوى الإعلان..."
    }
    
    val linkAddress: String get() = when (lang) {
        AppLanguage.CHINESE -> "链接地址（可选）"
        AppLanguage.ENGLISH -> "Link URL (optional)"
        AppLanguage.ARABIC -> "عنوان الرابط (اختياري)"
    }
    
    val linkText: String get() = when (lang) {
        AppLanguage.CHINESE -> "链接文字"
        AppLanguage.ENGLISH -> "Link Text"
        AppLanguage.ARABIC -> "نص الرابط"
    }
    
    val showOnceOnly: String get() = when (lang) {
        AppLanguage.CHINESE -> "仅显示一次"
        AppLanguage.ENGLISH -> "Show once only"
        AppLanguage.ARABIC -> "عرض مرة واحدة فقط"
    }

    // ==================== AI 配置 ====================
    val textGeneration: String get() = when (lang) {
        AppLanguage.CHINESE -> "文本生成"
        AppLanguage.ENGLISH -> "Text Generation"
        AppLanguage.ARABIC -> "توليد النص"
    }
    
    val basicTextDialogue: String get() = when (lang) {
        AppLanguage.CHINESE -> "基础文本对话和生成"
        AppLanguage.ENGLISH -> "Basic text dialogue and generation"
        AppLanguage.ARABIC -> "حوار النص الأساسي والتوليد"
    }
    
    val audioUnderstanding: String get() = when (lang) {
        AppLanguage.CHINESE -> "音频理解"
        AppLanguage.ENGLISH -> "Audio Understanding"
        AppLanguage.ARABIC -> "فهم الصوت"
    }
    
    val understandAndTranscribeAudio: String get() = when (lang) {
        AppLanguage.CHINESE -> "理解和转录音频内容"
        AppLanguage.ENGLISH -> "Understand and transcribe audio content"
        AppLanguage.ARABIC -> "فهم ونسخ محتوى الصوت"
    }
    
    val imageUnderstanding: String get() = when (lang) {
        AppLanguage.CHINESE -> "图像理解"
        AppLanguage.ENGLISH -> "Image Understanding"
        AppLanguage.ARABIC -> "فهم الصور"
    }
    
    val understandAndAnalyzeImages: String get() = when (lang) {
        AppLanguage.CHINESE -> "理解和分析图片内容"
        AppLanguage.ENGLISH -> "Understand and analyze image content"
        AppLanguage.ARABIC -> "فهم وتحليل محتوى الصور"
    }
    
    val imageGeneration: String get() = when (lang) {
        AppLanguage.CHINESE -> "图像生成"
        AppLanguage.ENGLISH -> "Image Generation"
        AppLanguage.ARABIC -> "توليد الصور"
    }
    
    val generateImages: String get() = when (lang) {
        AppLanguage.CHINESE -> "生成图片"
        AppLanguage.ENGLISH -> "Generate images"
        AppLanguage.ARABIC -> "إنشاء الصور"
    }
    
    val codeGeneration: String get() = when (lang) {
        AppLanguage.CHINESE -> "代码生成"
        AppLanguage.ENGLISH -> "Code Generation"
        AppLanguage.ARABIC -> "توليد الكود"
    }
    
    val generateAndUnderstandCode: String get() = when (lang) {
        AppLanguage.CHINESE -> "生成和理解代码"
        AppLanguage.ENGLISH -> "Generate and understand code"
        AppLanguage.ARABIC -> "توليد وفهم الكود"
    }
    
    val functionCall: String get() = when (lang) {
        AppLanguage.CHINESE -> "函数调用"
        AppLanguage.ENGLISH -> "Function Call"
        AppLanguage.ARABIC -> "استدعاء الدالة"
    }
    
    val supportToolCall: String get() = when (lang) {
        AppLanguage.CHINESE -> "支持工具调用"
        AppLanguage.ENGLISH -> "Support tool call"
        AppLanguage.ARABIC -> "دعم استدعاء الأدوات"
    }
    
    val longContext: String get() = when (lang) {
        AppLanguage.CHINESE -> "长上下文"
        AppLanguage.ENGLISH -> "Long Context"
        AppLanguage.ARABIC -> "سياق طويل"
    }
    
    val supportLongTextInput: String get() = when (lang) {
        AppLanguage.CHINESE -> "支持超长文本输入"
        AppLanguage.ENGLISH -> "Support extra long text input"
        AppLanguage.ARABIC -> "دعم إدخال نص طويل جدًا"
    }
    
    val goToConfig: String get() = when (lang) {
        AppLanguage.CHINESE -> "前往配置"
        AppLanguage.ENGLISH -> "Go to Config"
        AppLanguage.ARABIC -> "الذهاب إلى الإعدادات"
    }
    
    val retry: String get() = when (lang) {
        AppLanguage.CHINESE -> "重试"
        AppLanguage.ENGLISH -> "Retry"
        AppLanguage.ARABIC -> "إعادة المحاولة"
    }

    // ==================== 通用操作 ====================
    val closeDialog: String get() = when (lang) {
        AppLanguage.CHINESE -> "关闭"
        AppLanguage.ENGLISH -> "Close"
        AppLanguage.ARABIC -> "إغلاق"
    }
    
    val deleteAction: String get() = when (lang) {
        AppLanguage.CHINESE -> "删除"
        AppLanguage.ENGLISH -> "Delete"
        AppLanguage.ARABIC -> "حذف"
    }

    // ==================== 更多通用消息 ====================
    val savingToGallery: String get() = when (lang) {
        AppLanguage.CHINESE -> "正在保存到相册..."
        AppLanguage.ENGLISH -> "Saving to gallery..."
        AppLanguage.ARABIC -> "جاري الحفظ في المعرض..."
    }
    
    val savingImageToGallery: String get() = when (lang) {
        AppLanguage.CHINESE -> "正在保存图片到相册..."
        AppLanguage.ENGLISH -> "Saving image to gallery..."
        AppLanguage.ARABIC -> "جاري حفظ الصورة في المعرض..."
    }
    
    val savingVideoToGallery: String get() = when (lang) {
        AppLanguage.CHINESE -> "正在保存视频到相册..."
        AppLanguage.ENGLISH -> "Saving video to gallery..."
        AppLanguage.ARABIC -> "جاري حفظ الفيديو في المعرض..."
    }
    
    val downloadStartFailed: String get() = when (lang) {
        AppLanguage.CHINESE -> "下载启动失败"
        AppLanguage.ENGLISH -> "Download start failed"
        AppLanguage.ARABIC -> "فشل بدء التحميل"
    }
    
    val startDownloadCheckNotification: String get() = when (lang) {
        AppLanguage.CHINESE -> "开始下载，请查看通知栏"
        AppLanguage.ENGLISH -> "Download started, check notification"
        AppLanguage.ARABIC -> "بدأ التحميل، تحقق من الإشعارات"
    }
    
    val downloadLinkNotFound: String get() = when (lang) {
        AppLanguage.CHINESE -> "未找到下载链接"
        AppLanguage.ENGLISH -> "Download link not found"
        AppLanguage.ARABIC -> "لم يتم العثور على رابط التحميل"
    }
    
    val downloadFailedTryBrowser: String get() = when (lang) {
        AppLanguage.CHINESE -> "下载失败，尝试使用浏览器下载"
        AppLanguage.ENGLISH -> "Download failed, trying browser download"
        AppLanguage.ARABIC -> "فشل التحميل، جاري المحاولة عبر المتصفح"
    }
    
    val cannotOpenBrowser: String get() = when (lang) {
        AppLanguage.CHINESE -> "无法打开浏览器"
        AppLanguage.ENGLISH -> "Cannot open browser"
        AppLanguage.ARABIC -> "لا يمكن فتح المتصفح"
    }
    
    val appliedPreset: String get() = when (lang) {
        AppLanguage.CHINESE -> "已应用方案"
        AppLanguage.ENGLISH -> "Preset applied"
        AppLanguage.ARABIC -> "تم تطبيق الإعداد المسبق"
    }
    
    val presetSaved: String get() = when (lang) {
        AppLanguage.CHINESE -> "方案已保存"
        AppLanguage.ENGLISH -> "Preset saved"
        AppLanguage.ARABIC -> "تم حفظ الإعداد المسبق"
    }
    
    val copied: String get() = when (lang) {
        AppLanguage.CHINESE -> "已复制"
        AppLanguage.ENGLISH -> "Copied"
        AppLanguage.ARABIC -> "تم النسخ"
    }
    
    val duplicated: String get() = when (lang) {
        AppLanguage.CHINESE -> "已复制"
        AppLanguage.ENGLISH -> "Duplicated"
        AppLanguage.ARABIC -> "تم النسخ"
    }
    
    val deleted: String get() = when (lang) {
        AppLanguage.CHINESE -> "已删除"
        AppLanguage.ENGLISH -> "Deleted"
        AppLanguage.ARABIC -> "تم الحذف"
    }
    
    val shareCodeCopiedMsg: String get() = when (lang) {
        AppLanguage.CHINESE -> "分享码已复制"
        AppLanguage.ENGLISH -> "Share code copied"
        AppLanguage.ARABIC -> "تم نسخ رمز المشاركة"
    }
    
    val cannotOpenInBrowser: String get() = when (lang) {
        AppLanguage.CHINESE -> "无法在外部浏览器中打开"
        AppLanguage.ENGLISH -> "Cannot open in external browser"
        AppLanguage.ARABIC -> "لا يمكن الفتح في المتصفح الخارجي"
    }
    
    val noFilePathAvailable: String get() = when (lang) {
        AppLanguage.CHINESE -> "没有可用的文件路径"
        AppLanguage.ENGLISH -> "No file path available"
        AppLanguage.ARABIC -> "لا يوجد مسار ملف متاح"
    }
    
    val copiedAllLogs: String get() = when (lang) {
        AppLanguage.CHINESE -> "已复制全部日志"
        AppLanguage.ENGLISH -> "All logs copied"
        AppLanguage.ARABIC -> "تم نسخ جميع السجلات"
    }
    
    val copiedFullLog: String get() = when (lang) {
        AppLanguage.CHINESE -> "已复制完整日志"
        AppLanguage.ENGLISH -> "Full log copied"
        AppLanguage.ARABIC -> "تم نسخ السجل الكامل"
    }
    
    val copiedSourceCode: String get() = when (lang) {
        AppLanguage.CHINESE -> "已复制源代码"
        AppLanguage.ENGLISH -> "Source code copied"
        AppLanguage.ARABIC -> "تم نسخ الكود المصدري"
    }
    
    val pleaseSelectTextModel: String get() = when (lang) {
        AppLanguage.CHINESE -> "请先选择文本模型"
        AppLanguage.ENGLISH -> "Please select a text model first"
        AppLanguage.ARABIC -> "يرجى اختيار نموذج نصي أولاً"
    }
    
    val sendFailed: String get() = when (lang) {
        AppLanguage.CHINESE -> "发送失败"
        AppLanguage.ENGLISH -> "Send failed"
        AppLanguage.ARABIC -> "فشل الإرسال"
    }
    
    val previewFailed: String get() = when (lang) {
        AppLanguage.CHINESE -> "预览失败"
        AppLanguage.ENGLISH -> "Preview failed"
        AppLanguage.ARABIC -> "فشلت المعاينة"
    }
    
    val errorPrefix: String get() = when (lang) {
        AppLanguage.CHINESE -> "错误"
        AppLanguage.ENGLISH -> "Error"
        AppLanguage.ARABIC -> "خطأ"
    }

    // ==================== HTML编程助手 ====================
    val htmlCodingAssistant: String get() = when (lang) {
        AppLanguage.CHINESE -> "HTML编程助手"
        AppLanguage.ENGLISH -> "HTML Coding Assistant"
        AppLanguage.ARABIC -> "مساعد برمجة HTML"
    }
    
    val messagesCount: String get() = when (lang) {
        AppLanguage.CHINESE -> "%d 条消息"
        AppLanguage.ENGLISH -> "%d messages"
        AppLanguage.ARABIC -> "%d رسائل"
    }
    
    val modelConfigInvalid: String get() = when (lang) {
        AppLanguage.CHINESE -> "模型配置无效"
        AppLanguage.ENGLISH -> "Model configuration invalid"
        AppLanguage.ARABIC -> "تكوين النموذج غير صالح"
    }
    
    val generatingCode: String get() = when (lang) {
        AppLanguage.CHINESE -> "正在生成代码..."
        AppLanguage.ENGLISH -> "Generating code..."
        AppLanguage.ARABIC -> "جاري إنشاء الكود..."
    }
    
    val codeGenerated: String get() = when (lang) {
        AppLanguage.CHINESE -> "代码已生成，请查看下方预览"
        AppLanguage.ENGLISH -> "Code generated, see preview below"
        AppLanguage.ARABIC -> "تم إنشاء الكود، انظر المعاينة أدناه"
    }
    
    val aiNoValidResponse: String get() = when (lang) {
        AppLanguage.CHINESE -> "⚠️ AI 未返回有效内容"
        AppLanguage.ENGLISH -> "⚠️ AI returned no valid content"
        AppLanguage.ARABIC -> "⚠️ لم يُرجع الذكاء الاصطناعي محتوى صالحًا"
    }
    
    val debugInfo: String get() = when (lang) {
        AppLanguage.CHINESE -> "调试信息："
        AppLanguage.ENGLISH -> "Debug info:"
        AppLanguage.ARABIC -> "معلومات التصحيح:"
    }
    
    val textContent: String get() = when (lang) {
        AppLanguage.CHINESE -> "文本内容"
        AppLanguage.ENGLISH -> "Text content"
        AppLanguage.ARABIC -> "محتوى النص"
    }
    
    val streamContent: String get() = when (lang) {
        AppLanguage.CHINESE -> "流式内容"
        AppLanguage.ENGLISH -> "Stream content"
        AppLanguage.ARABIC -> "محتوى البث"
    }
    
    val thinkingContent: String get() = when (lang) {
        AppLanguage.CHINESE -> "思考内容"
        AppLanguage.ENGLISH -> "Thinking content"
        AppLanguage.ARABIC -> "محتوى التفكير"
    }
    
    val htmlCode: String get() = when (lang) {
        AppLanguage.CHINESE -> "HTML代码"
        AppLanguage.ENGLISH -> "HTML code"
        AppLanguage.ARABIC -> "كود HTML"
    }
    
    val emptyText: String get() = when (lang) {
        AppLanguage.CHINESE -> "空"
        AppLanguage.ENGLISH -> "empty"
        AppLanguage.ARABIC -> "فارغ"
    }
    
    val characters: String get() = when (lang) {
        AppLanguage.CHINESE -> "字符"
        AppLanguage.ENGLISH -> "characters"
        AppLanguage.ARABIC -> "أحرف"
    }
    
    val possibleReasons: String get() = when (lang) {
        AppLanguage.CHINESE -> "可能原因："
        AppLanguage.ENGLISH -> "Possible reasons:"
        AppLanguage.ARABIC -> "الأسباب المحتملة:"
    }
    
    val apiFormatIncompatible: String get() = when (lang) {
        AppLanguage.CHINESE -> "1. API 返回格式不兼容"
        AppLanguage.ENGLISH -> "1. API response format incompatible"
        AppLanguage.ARABIC -> "1. تنسيق استجابة API غير متوافق"
    }
    
    val modelNotSupported: String get() = when (lang) {
        AppLanguage.CHINESE -> "2. 模型不支持当前请求"
        AppLanguage.ENGLISH -> "2. Model does not support current request"
        AppLanguage.ARABIC -> "2. النموذج لا يدعم الطلب الحالي"
    }
    
    val apiKeyQuotaInsufficient: String get() = when (lang) {
        AppLanguage.CHINESE -> "3. API Key 配额不足"
        AppLanguage.ENGLISH -> "3. API Key quota insufficient"
        AppLanguage.ARABIC -> "3. حصة مفتاح API غير كافية"
    }
    
    val suggestionChangeModel: String get() = when (lang) {
        AppLanguage.CHINESE -> "建议：尝试更换模型或检查 API 设置"
        AppLanguage.ENGLISH -> "Suggestion: Try changing model or check API settings"
        AppLanguage.ARABIC -> "اقتراح: جرب تغيير النموذج أو تحقق من إعدادات API"
    }
    
    val conversationCheckpoint: String get() = when (lang) {
        AppLanguage.CHINESE -> "对话 #%d"
        AppLanguage.ENGLISH -> "Conversation #%d"
        AppLanguage.ARABIC -> "المحادثة #%d"
    }
    
    val preview: String get() = when (lang) {
        AppLanguage.CHINESE -> "预览"
        AppLanguage.ENGLISH -> "Preview"
        AppLanguage.ARABIC -> "معاينة"
    }
    
    val savedToPath: String get() = when (lang) {
        AppLanguage.CHINESE -> "已保存到: %s"
        AppLanguage.ENGLISH -> "Saved to: %s"
        AppLanguage.ARABIC -> "تم الحفظ في: %s"
    }
    
    val noCodeToExport: String get() = when (lang) {
        AppLanguage.CHINESE -> "没有可导出的代码"
        AppLanguage.ENGLISH -> "No code to export"
        AppLanguage.ARABIC -> "لا يوجد كود للتصدير"
    }
    
    val aiGeneratedProject: String get() = when (lang) {
        AppLanguage.CHINESE -> "AI生成项目"
        AppLanguage.ENGLISH -> "AI Generated Project"
        AppLanguage.ARABIC -> "مشروع مُنشأ بالذكاء الاصطناعي"
    }
    
    val exportedToHtmlProject: String get() = when (lang) {
        AppLanguage.CHINESE -> "已导出到HTML项目"
        AppLanguage.ENGLISH -> "Exported to HTML project"
        AppLanguage.ARABIC -> "تم التصدير إلى مشروع HTML"
    }
    
    val exportFailed: String get() = when (lang) {
        AppLanguage.CHINESE -> "导出失败"
        AppLanguage.ENGLISH -> "Export failed"
        AppLanguage.ARABIC -> "فشل التصدير"
    }
    
    val codeLibrary: String get() = when (lang) {
        AppLanguage.CHINESE -> "代码库"
        AppLanguage.ENGLISH -> "Code Library"
        AppLanguage.ARABIC -> "مكتبة الكود"
    }
    
    val rollback: String get() = when (lang) {
        AppLanguage.CHINESE -> "回退"
        AppLanguage.ENGLISH -> "Rollback"
        AppLanguage.ARABIC -> "التراجع"
    }
    
    val templates: String get() = when (lang) {
        AppLanguage.CHINESE -> "模板"
        AppLanguage.ENGLISH -> "Templates"
        AppLanguage.ARABIC -> "القوالب"
    }
    
    val sessionList: String get() = when (lang) {
        AppLanguage.CHINESE -> "会话列表"
        AppLanguage.ENGLISH -> "Session List"
        AppLanguage.ARABIC -> "قائمة الجلسات"
    }
    
    val aiHelpsGenerateWebpage: String get() = when (lang) {
        AppLanguage.CHINESE -> "AI 帮你快速生成精美网页"
        AppLanguage.ENGLISH -> "AI helps you quickly generate beautiful webpages"
        AppLanguage.ARABIC -> "يساعدك الذكاء الاصطناعي على إنشاء صفحات ويب جميلة بسرعة"
    }
    
    val startNewConversation: String get() = when (lang) {
        AppLanguage.CHINESE -> "开始新对话"
        AppLanguage.ENGLISH -> "Start New Conversation"
        AppLanguage.ARABIC -> "بدء محادثة جديدة"
    }
    
    val tutorial: String get() = when (lang) {
        AppLanguage.CHINESE -> "教程"
        AppLanguage.ENGLISH -> "Tutorial"
        AppLanguage.ARABIC -> "الدليل التعليمي"
    }
    
    val quickStart: String get() = when (lang) {
        AppLanguage.CHINESE -> "快速开始"
        AppLanguage.ENGLISH -> "Quick Start"
        AppLanguage.ARABIC -> "البدء السريع"
    }
    
    val aiThinking: String get() = when (lang) {
        AppLanguage.CHINESE -> "AI 正在思考..."
        AppLanguage.ENGLISH -> "AI is thinking..."
        AppLanguage.ARABIC -> "الذكاء الاصطناعي يفكر..."
    }
    
    val generatingImage: String get() = when (lang) {
        AppLanguage.CHINESE -> "正在生成图像..."
        AppLanguage.ENGLISH -> "Generating image..."
        AppLanguage.ARABIC -> "جاري إنشاء الصورة..."
    }
    
    val conversationHistory: String get() = when (lang) {
        AppLanguage.CHINESE -> "对话历史"
        AppLanguage.ENGLISH -> "Conversation History"
        AppLanguage.ARABIC -> "سجل المحادثات"
    }
    
    val newConversation: String get() = when (lang) {
        AppLanguage.CHINESE -> "新建对话"
        AppLanguage.ENGLISH -> "New Conversation"
        AppLanguage.ARABIC -> "محادثة جديدة"
    }
    
    val noConversationRecords: String get() = when (lang) {
        AppLanguage.CHINESE -> "暂无对话记录"
        AppLanguage.ENGLISH -> "No conversation records"
        AppLanguage.ARABIC -> "لا توجد سجلات محادثات"
    }
    
    val selectStyleTemplate: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择风格模板"
        AppLanguage.ENGLISH -> "Select Style Template"
        AppLanguage.ARABIC -> "اختيار قالب النمط"
    }
    
    val selected: String get() = when (lang) {
        AppLanguage.CHINESE -> "已选择"
        AppLanguage.ENGLISH -> "Selected"
        AppLanguage.ARABIC -> "محدد"
    }
    
    val selectTemplateHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择一个风格模板，AI将根据该风格生成代码"
        AppLanguage.ENGLISH -> "Select a style template, AI will generate code based on this style"
        AppLanguage.ARABIC -> "اختر قالب نمط، سيقوم الذكاء الاصطناعي بإنشاء الكود بناءً على هذا النمط"
    }
    
    val designTemplates: String get() = when (lang) {
        AppLanguage.CHINESE -> "设计模板"
        AppLanguage.ENGLISH -> "Design Templates"
        AppLanguage.ARABIC -> "قوالب التصميم"
    }
    
    val styleReferences: String get() = when (lang) {
        AppLanguage.CHINESE -> "风格参考"
        AppLanguage.ENGLISH -> "Style References"
        AppLanguage.ARABIC -> "مراجع النمط"
    }
    
    val totalTemplates: String get() = when (lang) {
        AppLanguage.CHINESE -> "共 %d 个模板"
        AppLanguage.ENGLISH -> "%d templates total"
        AppLanguage.ARABIC -> "إجمالي %d قوالب"
    }
    
    val totalStyleReferences: String get() = when (lang) {
        AppLanguage.CHINESE -> "共 %d 个风格参考"
        AppLanguage.ENGLISH -> "%d style references total"
        AppLanguage.ARABIC -> "إجمالي %d مراجع نمط"
    }
    
    val usageTutorial: String get() = when (lang) {
        AppLanguage.CHINESE -> "使用教程"
        AppLanguage.ENGLISH -> "Usage Tutorial"
        AppLanguage.ARABIC -> "دليل الاستخدام"
    }
    
    val chapters: String get() = when (lang) {
        AppLanguage.CHINESE -> "%d 章节"
        AppLanguage.ENGLISH -> "%d chapters"
        AppLanguage.ARABIC -> "%d فصول"
    }
    
    val noTutorialContent: String get() = when (lang) {
        AppLanguage.CHINESE -> "暂无教程内容"
        AppLanguage.ENGLISH -> "No tutorial content"
        AppLanguage.ARABIC -> "لا يوجد محتوى تعليمي"
    }
    
    val sections: String get() = when (lang) {
        AppLanguage.CHINESE -> "%d 个小节"
        AppLanguage.ENGLISH -> "%d sections"
        AppLanguage.ARABIC -> "%d أقسام"
    }
    
    val codeExample: String get() = when (lang) {
        AppLanguage.CHINESE -> "代码示例"
        AppLanguage.ENGLISH -> "Code Example"
        AppLanguage.ARABIC -> "مثال الكود"
    }
    
    val tips: String get() = when (lang) {
        AppLanguage.CHINESE -> "小贴士"
        AppLanguage.ENGLISH -> "Tips"
        AppLanguage.ARABIC -> "نصائح"
    }
    
    val versionManagement: String get() = when (lang) {
        AppLanguage.CHINESE -> "版本管理"
        AppLanguage.ENGLISH -> "Version Management"
        AppLanguage.ARABIC -> "إدارة الإصدارات"
    }
    
    val saveVersion: String get() = when (lang) {
        AppLanguage.CHINESE -> "保存版本"
        AppLanguage.ENGLISH -> "Save Version"
        AppLanguage.ARABIC -> "حفظ الإصدار"
    }
    
    val export: String get() = when (lang) {
        AppLanguage.CHINESE -> "导出"
        AppLanguage.ENGLISH -> "Export"
        AppLanguage.ARABIC -> "تصدير"
    }
    
    val noSavedVersions: String get() = when (lang) {
        AppLanguage.CHINESE -> "暂无保存的版本\n对话中自动创建检查点，或手动保存版本"
        AppLanguage.ENGLISH -> "No saved versions\nCheckpoints are created automatically during conversation, or save manually"
        AppLanguage.ARABIC -> "لا توجد إصدارات محفوظة\nيتم إنشاء نقاط التحقق تلقائيًا أثناء المحادثة، أو احفظ يدويًا"
    }
    
    val manualSave: String get() = when (lang) {
        AppLanguage.CHINESE -> "手动保存 %d"
        AppLanguage.ENGLISH -> "Manual Save %d"
        AppLanguage.ARABIC -> "حفظ يدوي %d"
    }
    
    val editMessage: String get() = when (lang) {
        AppLanguage.CHINESE -> "编辑消息"
        AppLanguage.ENGLISH -> "Edit Message"
        AppLanguage.ARABIC -> "تعديل الرسالة"
    }
    
    val imagesCount: String get() = when (lang) {
        AppLanguage.CHINESE -> "%d 张图片"
        AppLanguage.ENGLISH -> "%d images"
        AppLanguage.ARABIC -> "%d صور"
    }
    
    val editWarning: String get() = when (lang) {
        AppLanguage.CHINESE -> "⚠️ 编辑后，该消息之后的对话将被删除"
        AppLanguage.ENGLISH -> "⚠️ After editing, conversations after this message will be deleted"
        AppLanguage.ARABIC -> "⚠️ بعد التعديل، سيتم حذف المحادثات بعد هذه الرسالة"
    }
    
    val resend: String get() = when (lang) {
        AppLanguage.CHINESE -> "重新发送"
        AppLanguage.ENGLISH -> "Resend"
        AppLanguage.ARABIC -> "إعادة الإرسال"
    }
    
    val saveProject: String get() = when (lang) {
        AppLanguage.CHINESE -> "保存项目"
        AppLanguage.ENGLISH -> "Save Project"
        AppLanguage.ARABIC -> "حفظ المشروع"
    }
    
    val projectName: String get() = when (lang) {
        AppLanguage.CHINESE -> "项目名称"
        AppLanguage.ENGLISH -> "Project Name"
        AppLanguage.ARABIC -> "اسم المشروع"
    }
    
    val saveLocation: String get() = when (lang) {
        AppLanguage.CHINESE -> "保存位置"
        AppLanguage.ENGLISH -> "Save Location"
        AppLanguage.ARABIC -> "موقع الحفظ"
    }
    
    val createProjectFolder: String get() = when (lang) {
        AppLanguage.CHINESE -> "创建项目文件夹"
        AppLanguage.ENGLISH -> "Create Project Folder"
        AppLanguage.ARABIC -> "إنشاء مجلد المشروع"
    }
    
    val willSaveFiles: String get() = when (lang) {
        AppLanguage.CHINESE -> "将保存 %d 个文件"
        AppLanguage.ENGLISH -> "Will save %d files"
        AppLanguage.ARABIC -> "سيتم حفظ %d ملفات"
    }
    
    val save: String get() = when (lang) {
        AppLanguage.CHINESE -> "保存"
        AppLanguage.ENGLISH -> "Save"
        AppLanguage.ARABIC -> "حفظ"
    }
    
    val favorites: String get() = when (lang) {
        AppLanguage.CHINESE -> "收藏"
        AppLanguage.ENGLISH -> "Favorites"
        AppLanguage.ARABIC -> "المفضلة"
    }
    
    val aiCodeAutoSaved: String get() = when (lang) {
        AppLanguage.CHINESE -> "AI生成的代码会自动保存到这里"
        AppLanguage.ENGLISH -> "AI generated code is automatically saved here"
        AppLanguage.ARABIC -> "يتم حفظ الكود المُنشأ بالذكاء الاصطناعي تلقائيًا هنا"
    }
    
    val noFavorites: String get() = when (lang) {
        AppLanguage.CHINESE -> "暂无收藏"
        AppLanguage.ENGLISH -> "No favorites"
        AppLanguage.ARABIC -> "لا توجد مفضلات"
    }
    
    val codeLibraryEmpty: String get() = when (lang) {
        AppLanguage.CHINESE -> "代码库为空"
        AppLanguage.ENGLISH -> "Code library is empty"
        AppLanguage.ARABIC -> "مكتبة الكود فارغة"
    }
    
    val use: String get() = when (lang) {
        AppLanguage.CHINESE -> "使用"
        AppLanguage.ENGLISH -> "Use"
        AppLanguage.ARABIC -> "استخدام"
    }
    
    val unfavorite: String get() = when (lang) {
        AppLanguage.CHINESE -> "取消收藏"
        AppLanguage.ENGLISH -> "Unfavorite"
        AppLanguage.ARABIC -> "إلغاء المفضلة"
    }
    
    val favorite: String get() = when (lang) {
        AppLanguage.CHINESE -> "收藏"
        AppLanguage.ENGLISH -> "Favorite"
        AppLanguage.ARABIC -> "مفضلة"
    }
    
    val exportToProjectLibrary: String get() = when (lang) {
        AppLanguage.CHINESE -> "导出到项目库"
        AppLanguage.ENGLISH -> "Export to Project Library"
        AppLanguage.ARABIC -> "تصدير إلى مكتبة المشاريع"
    }
    
    val delete: String get() = when (lang) {
        AppLanguage.CHINESE -> "删除"
        AppLanguage.ENGLISH -> "Delete"
        AppLanguage.ARABIC -> "حذف"
    }
    
    val conversationCheckpoints: String get() = when (lang) {
        AppLanguage.CHINESE -> "对话检查点"
        AppLanguage.ENGLISH -> "Conversation Checkpoints"
        AppLanguage.ARABIC -> "نقاط تحقق المحادثة"
    }
    
    val rollbackHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "回退到之前的对话状态，同时恢复代码库"
        AppLanguage.ENGLISH -> "Rollback to previous conversation state and restore code library"
        AppLanguage.ARABIC -> "التراجع إلى حالة المحادثة السابقة واستعادة مكتبة الكود"
    }
    
    val noCheckpoints: String get() = when (lang) {
        AppLanguage.CHINESE -> "暂无检查点"
        AppLanguage.ENGLISH -> "No checkpoints"
        AppLanguage.ARABIC -> "لا توجد نقاط تحقق"
    }
    
    val autoCreateCheckpointHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "每次对话后会自动创建检查点"
        AppLanguage.ENGLISH -> "Checkpoints are created automatically after each conversation"
        AppLanguage.ARABIC -> "يتم إنشاء نقاط التحقق تلقائيًا بعد كل محادثة"
    }
    
    val codesCount: String get() = when (lang) {
        AppLanguage.CHINESE -> "%d 个代码"
        AppLanguage.ENGLISH -> "%d codes"
        AppLanguage.ARABIC -> "%d أكواد"
    }
    
    val continueDevBasedOnCode: String get() = when (lang) {
        AppLanguage.CHINESE -> "基于这个代码继续开发:"
        AppLanguage.ENGLISH -> "Continue development based on this code:"
        AppLanguage.ARABIC -> "متابعة التطوير بناءً على هذا الكود:"
    }
    
    val exportedToProjectLibrary: String get() = when (lang) {
        AppLanguage.CHINESE -> "已导出到项目库"
        AppLanguage.ENGLISH -> "Exported to project library"
        AppLanguage.ARABIC -> "تم التصدير إلى مكتبة المشاريع"
    }
    
    val rolledBackTo: String get() = when (lang) {
        AppLanguage.CHINESE -> "已回退到: %s"
        AppLanguage.ENGLISH -> "Rolled back to: %s"
        AppLanguage.ARABIC -> "تم التراجع إلى: %s"
    }
    
    val rolledBackWithInputHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "已回退到: %s\n最后的消息已填入输入框，点击发送重新生成"
        AppLanguage.ENGLISH -> "Rolled back to: %s\nLast message filled in input, click send to regenerate"
        AppLanguage.ARABIC -> "تم التراجع إلى: %s\nتم ملء الرسالة الأخيرة في الإدخال، انقر إرسال لإعادة الإنشاء"
    }
    
    val rollbackFailed: String get() = when (lang) {
        AppLanguage.CHINESE -> "回退失败"
        AppLanguage.ENGLISH -> "Rollback failed"
        AppLanguage.ARABIC -> "فشل التراجع"
    }

    // ==================== 模块编辑器 ====================
    val pleaseEnterModuleName: String get() = when (lang) {
        AppLanguage.CHINESE -> "请输入模块名称"
        AppLanguage.ENGLISH -> "Please enter module name"
        AppLanguage.ARABIC -> "يرجى إدخال اسم الوحدة"
    }
    
    val pleaseEnterCodeContent: String get() = when (lang) {
        AppLanguage.CHINESE -> "请输入代码内容"
        AppLanguage.ENGLISH -> "Please enter code content"
        AppLanguage.ARABIC -> "يرجى إدخال محتوى الكود"
    }
    
    val saveSuccess: String get() = when (lang) {
        AppLanguage.CHINESE -> "保存成功"
        AppLanguage.ENGLISH -> "Save successful"
        AppLanguage.ARABIC -> "تم الحفظ بنجاح"
    }
    
    val pleaseEnterRequirement: String get() = when (lang) {
        AppLanguage.CHINESE -> "请输入功能需求"
        AppLanguage.ENGLISH -> "Please enter feature requirement"
        AppLanguage.ARABIC -> "يرجى إدخال متطلبات الميزة"
    }
    
    val jumpToModuleEditor: String get() = when (lang) {
        AppLanguage.CHINESE -> "即将跳转到模块编辑器"
        AppLanguage.ENGLISH -> "Jumping to module editor"
        AppLanguage.ARABIC -> "الانتقال إلى محرر الوحدة"
    }
    
    val storagePermissionRequired: String get() = when (lang) {
        AppLanguage.CHINESE -> "需要存储权限才能下载文件"
        AppLanguage.ENGLISH -> "Storage permission required to download files"
        AppLanguage.ARABIC -> "يلزم إذن التخزين لتحميل الملفات"
    }
    
    val appConfigLoadFailed: String get() = when (lang) {
        AppLanguage.CHINESE -> "应用配置加载失败，请重新安装"
        AppLanguage.ENGLISH -> "App configuration load failed, please reinstall"
        AppLanguage.ARABIC -> "فشل تحميل تكوين التطبيق، يرجى إعادة التثبيت"
    }
    
    val frontendProject: String get() = when (lang) {
        AppLanguage.CHINESE -> "前端项目"
        AppLanguage.ENGLISH -> "Frontend Project"
        AppLanguage.ARABIC -> "مشروع الواجهة الأمامية"
    }
    
    val shortcutCreatedSuccess: String get() = when (lang) {
        AppLanguage.CHINESE -> "快捷方式创建成功"
        AppLanguage.ENGLISH -> "Shortcut created successfully"
        AppLanguage.ARABIC -> "تم إنشاء الاختصار بنجاح"
    }
    
    val projectExportedTo: String get() = when (lang) {
        AppLanguage.CHINESE -> "项目已导出到: %s"
        AppLanguage.ENGLISH -> "Project exported to: %s"
        AppLanguage.ARABIC -> "تم تصدير المشروع إلى: %s"
    }
    
    val preparing: String get() = when (lang) {
        AppLanguage.CHINESE -> "准备中..."
        AppLanguage.ENGLISH -> "Preparing..."
        AppLanguage.ARABIC -> "جاري التحضير..."
    }
    
    val buildApkForApp: String get() = when (lang) {
        AppLanguage.CHINESE -> "将为「%s」构建独立的 APK 安装包。"
        AppLanguage.ENGLISH -> "Will build standalone APK for \"%s\"."
        AppLanguage.ARABIC -> "سيتم بناء APK مستقل لـ \"%s\"."
    }
    
    val buildCompleteInstallHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "构建完成后可直接安装到设备上，无需创建快捷方式。"
        AppLanguage.ENGLISH -> "After build, can be installed directly without creating shortcut."
        AppLanguage.ARABIC -> "بعد البناء، يمكن التثبيت مباشرة دون إنشاء اختصار."
    }
    
    val buildFailed: String get() = when (lang) {
        AppLanguage.CHINESE -> "构建失败"
        AppLanguage.ENGLISH -> "Build failed"
        AppLanguage.ARABIC -> "فشل البناء"
    }

    // ==================== 图标库 ====================

    // ==================== 扩展模块卡片 ====================
    val saveAsScheme: String get() = when (lang) {
        AppLanguage.CHINESE -> "存为方案"
        AppLanguage.ENGLISH -> "Save as Scheme"
        AppLanguage.ARABIC -> "حفظ كمخطط"
    }
    
    val clearAll: String get() = when (lang) {
        AppLanguage.CHINESE -> "清空"
        AppLanguage.ENGLISH -> "Clear"
        AppLanguage.ARABIC -> "مسح"
    }
    
    val selectModules: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择模块"
        AppLanguage.ENGLISH -> "Select Modules"
        AppLanguage.ARABIC -> "اختيار الوحدات"
    }
    
    val selectExtensionModules: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择扩展模块"
        AppLanguage.ENGLISH -> "Select Extension Modules"
        AppLanguage.ARABIC -> "اختيار الوحدات الإضافية"
    }
    
    val doneWithCount: String get() = when (lang) {
        AppLanguage.CHINESE -> "完成 (%d)"
        AppLanguage.ENGLISH -> "Done (%d)"
        AppLanguage.ARABIC -> "تم (%d)"
    }
    
    val searchModulesHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "搜索模块名称、描述或标签..."
        AppLanguage.ENGLISH -> "Search module name, description or tags..."
        AppLanguage.ARABIC -> "البحث عن اسم الوحدة أو الوصف أو العلامات..."
    }
    
    val testModule: String get() = when (lang) {
        AppLanguage.CHINESE -> "测试模块"
        AppLanguage.ENGLISH -> "Test Module"
        AppLanguage.ARABIC -> "اختبار الوحدة"
    }
    
    val startTest: String get() = when (lang) {
        AppLanguage.CHINESE -> "开始测试"
        AppLanguage.ENGLISH -> "Start Test"
        AppLanguage.ARABIC -> "بدء الاختبار"
    }
    
    val addThisModule: String get() = when (lang) {
        AppLanguage.CHINESE -> "添加此模块"
        AppLanguage.ENGLISH -> "Add This Module"
        AppLanguage.ARABIC -> "إضافة هذه الوحدة"
    }
    
    val allSchemes: String get() = when (lang) {
        AppLanguage.CHINESE -> "全部方案"
        AppLanguage.ENGLISH -> "All Schemes"
        AppLanguage.ARABIC -> "جميع المخططات"
    }
    
    val moduleSchemes: String get() = when (lang) {
        AppLanguage.CHINESE -> "模块方案"
        AppLanguage.ENGLISH -> "Module Schemes"
        AppLanguage.ARABIC -> "مخططات الوحدات"
    }
    
    val saveAsSchemeTitle: String get() = when (lang) {
        AppLanguage.CHINESE -> "保存为方案"
        AppLanguage.ENGLISH -> "Save as Scheme"
        AppLanguage.ARABIC -> "حفظ كمخطط"
    }
    
    val schemeName: String get() = when (lang) {
        AppLanguage.CHINESE -> "方案名称"
        AppLanguage.ENGLISH -> "Scheme Name"
        AppLanguage.ARABIC -> "اسم المخطط"
    }
    
    val inputSchemeName: String get() = when (lang) {
        AppLanguage.CHINESE -> "输入方案名称"
        AppLanguage.ENGLISH -> "Enter scheme name"
        AppLanguage.ARABIC -> "أدخل اسم المخطط"
    }
    
    val descriptionOptional: String get() = when (lang) {
        AppLanguage.CHINESE -> "描述（可选）"
        AppLanguage.ENGLISH -> "Description (optional)"
        AppLanguage.ARABIC -> "الوصف (اختياري)"
    }
    
    val briefDescriptionHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "简要描述方案用途"
        AppLanguage.ENGLISH -> "Brief description of scheme purpose"
        AppLanguage.ARABIC -> "وصف موجز لغرض المخطط"
    }
    
    val selectIcon: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择图标"
        AppLanguage.ENGLISH -> "Select Icon"
        AppLanguage.ARABIC -> "اختيار أيقونة"
    }

    // ==================== 公告模板 ====================

    // ==================== 歌词对齐 ====================
    
    val tapToMark: String get() = when (lang) {
        AppLanguage.CHINESE -> "打点"
        AppLanguage.ENGLISH -> "Tap to Mark"
        AppLanguage.ARABIC -> "انقر للتحديد"
    }
    
    val goBackToModify: String get() = when (lang) {
        AppLanguage.CHINESE -> "返回修改"
        AppLanguage.ENGLISH -> "Go Back to Modify"
        AppLanguage.ARABIC -> "العودة للتعديل"
    }

    // ==================== 数据备份 ====================
    val exportData: String get() = when (lang) {
        AppLanguage.CHINESE -> "导出数据"
        AppLanguage.ENGLISH -> "Export Data"
        AppLanguage.ARABIC -> "تصدير البيانات"
    }
    
    val importData: String get() = when (lang) {
        AppLanguage.CHINESE -> "导入数据"
        AppLanguage.ENGLISH -> "Import Data"
        AppLanguage.ARABIC -> "استيراد البيانات"
    }

    // ==================== 自动启动 ====================
    val launchTime: String get() = when (lang) {
        AppLanguage.CHINESE -> "启动时间"
        AppLanguage.ENGLISH -> "Launch Time"
        AppLanguage.ARABIC -> "وقت التشغيل"
    }
    
    val selectLaunchTime: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择启动时间"
        AppLanguage.ENGLISH -> "Select Launch Time"
        AppLanguage.ARABIC -> "اختيار وقت التشغيل"
    }

    // ==================== HTML编程 ====================
    val downloadFile: String get() = when (lang) {
        AppLanguage.CHINESE -> "下载"
        AppLanguage.ENGLISH -> "Download"
        AppLanguage.ARABIC -> "تحميل"
    }
    
    val exportAll: String get() = when (lang) {
        AppLanguage.CHINESE -> "导出全部"
        AppLanguage.ENGLISH -> "Export All"
        AppLanguage.ARABIC -> "تصدير الكل"
    }
    
    val thinking: String get() = when (lang) {
        AppLanguage.CHINESE -> "思考中"
        AppLanguage.ENGLISH -> "Thinking"
        AppLanguage.ARABIC -> "جاري التفكير"
    }
    
    val thinkingDots: String get() = when (lang) {
        AppLanguage.CHINESE -> "思考中..."
        AppLanguage.ENGLISH -> "Thinking..."
        AppLanguage.ARABIC -> "جاري التفكير..."
    }
    
    val describeHtmlPage: String get() = when (lang) {
        AppLanguage.CHINESE -> "描述你想要的 HTML 页面..."
        AppLanguage.ENGLISH -> "Describe the HTML page you want..."
        AppLanguage.ARABIC -> "صف صفحة HTML التي تريدها..."
    }
    
    val btnSend: String get() = when (lang) {
        AppLanguage.CHINESE -> "发送"
        AppLanguage.ENGLISH -> "Send"
        AppLanguage.ARABIC -> "إرسال"
    }
    
    val btnRestore: String get() = when (lang) {
        AppLanguage.CHINESE -> "恢复"
        AppLanguage.ENGLISH -> "Restore"
        AppLanguage.ARABIC -> "استعادة"
    }
    
    val fileCountFormat: String get() = when (lang) {
        AppLanguage.CHINESE -> "%d / %d 个文件"
        AppLanguage.ENGLISH -> "%d / %d files"
        AppLanguage.ARABIC -> "%d / %d ملفات"
    }
    
    val linesCount: String get() = when (lang) {
        AppLanguage.CHINESE -> "%d 行"
        AppLanguage.ENGLISH -> "%d lines"
        AppLanguage.ARABIC -> "%d سطر"
    }
    
    val filesCountShort: String get() = when (lang) {
        AppLanguage.CHINESE -> "%d 个文件"
        AppLanguage.ENGLISH -> "%d files"
        AppLanguage.ARABIC -> "%d ملفات"
    }
    
    val rules: String get() = when (lang) {
        AppLanguage.CHINESE -> "规则"
        AppLanguage.ENGLISH -> "Rules"
        AppLanguage.ARABIC -> "القواعد"
    }
    
    val selectFromTemplate: String get() = when (lang) {
        AppLanguage.CHINESE -> "从模板选择"
        AppLanguage.ENGLISH -> "Select from template"
        AppLanguage.ARABIC -> "اختر من القالب"
    }
    
    val selectRuleTemplate: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择规则模板"
        AppLanguage.ENGLISH -> "Select rule template"
        AppLanguage.ARABIC -> "اختر قالب القاعدة"
    }
    
    val noImageModel: String get() = when (lang) {
        AppLanguage.CHINESE -> "不使用图像模型"
        AppLanguage.ENGLISH -> "No image model"
        AppLanguage.ARABIC -> "بدون نموذج صور"
    }
    
    val selectImageModel: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择图像模型"
        AppLanguage.ENGLISH -> "Select image model"
        AppLanguage.ARABIC -> "اختر نموذج الصور"
    }
    
    val configureMoreModels: String get() = when (lang) {
        AppLanguage.CHINESE -> "配置更多模型"
        AppLanguage.ENGLISH -> "Configure more models"
        AppLanguage.ARABIC -> "تكوين المزيد من النماذج"
    }
    
    val projectFiles: String get() = when (lang) {
        AppLanguage.CHINESE -> "项目文件"
        AppLanguage.ENGLISH -> "Project Files"
        AppLanguage.ARABIC -> "ملفات المشروع"
    }
    
    val refresh: String get() = when (lang) {
        AppLanguage.CHINESE -> "刷新"
        AppLanguage.ENGLISH -> "Refresh"
        AppLanguage.ARABIC -> "تحديث"
    }
    
    val noFilesYet: String get() = when (lang) {
        AppLanguage.CHINESE -> "暂无文件"
        AppLanguage.ENGLISH -> "No files yet"
        AppLanguage.ARABIC -> "لا توجد ملفات بعد"
    }
    
    val aiCodeSavedHere: String get() = when (lang) {
        AppLanguage.CHINESE -> "AI 生成的代码将保存在这里"
        AppLanguage.ENGLISH -> "AI generated code will be saved here"
        AppLanguage.ARABIC -> "سيتم حفظ الكود المُنشأ بواسطة AI هنا"
    }
    
    val versionHistory: String get() = when (lang) {
        AppLanguage.CHINESE -> "版本历史"
        AppLanguage.ENGLISH -> "Version History"
        AppLanguage.ARABIC -> "سجل الإصدارات"
    }
    
    val addNewRule: String get() = when (lang) {
        AppLanguage.CHINESE -> "添加新规则..."
        AppLanguage.ENGLISH -> "Add new rule..."
        AppLanguage.ARABIC -> "إضافة قاعدة جديدة..."
    }

    // ==================== HTML编程AI样式模板 ====================
    val styleModernMinimal: String get() = when (lang) {
        AppLanguage.CHINESE -> "现代简约"
        AppLanguage.ENGLISH -> "Modern Minimal"
        AppLanguage.ARABIC -> "حديث بسيط"
    }
    val styleModernMinimalDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "干净利落的现代设计，大量留白，强调内容"
        AppLanguage.ENGLISH -> "Clean modern design with ample whitespace, content-focused"
        AppLanguage.ARABIC -> "تصميم حديث نظيف مع مساحات بيضاء واسعة، يركز على المحتوى"
    }
    val styleGlassmorphism: String get() = when (lang) {
        AppLanguage.CHINESE -> "玻璃拟态"
        AppLanguage.ENGLISH -> "Glassmorphism"
        AppLanguage.ARABIC -> "تأثير الزجاج"
    }
    val styleGlassmorphismDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "透明模糊效果，创造深度层次感"
        AppLanguage.ENGLISH -> "Transparent blur effect, creates depth and layers"
        AppLanguage.ARABIC -> "تأثير ضبابي شفاف، يخلق عمقًا وطبقات"
    }
    val styleNeumorphism: String get() = when (lang) {
        AppLanguage.CHINESE -> "新拟物化"
        AppLanguage.ENGLISH -> "Neumorphism"
        AppLanguage.ARABIC -> "التصميم الجديد"
    }
    val styleNeumorphismDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "软阴影创造的凸起/凹陷效果"
        AppLanguage.ENGLISH -> "Soft shadows creating raised/sunken effects"
        AppLanguage.ARABIC -> "ظلال ناعمة تخلق تأثيرات بارزة/غائرة"
    }
    val styleDarkMode: String get() = when (lang) {
        AppLanguage.CHINESE -> "暗黑主题"
        AppLanguage.ENGLISH -> "Dark Mode"
        AppLanguage.ARABIC -> "الوضع الداكن"
    }
    val styleDarkModeDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "深色背景配亮色文字，护眼且现代"
        AppLanguage.ENGLISH -> "Dark background with light text, eye-friendly and modern"
        AppLanguage.ARABIC -> "خلفية داكنة مع نص فاتح، مريح للعين وعصري"
    }
    val styleCyberpunk: String get() = when (lang) {
        AppLanguage.CHINESE -> "赛博朋克"
        AppLanguage.ENGLISH -> "Cyberpunk"
        AppLanguage.ARABIC -> "سايبربانك"
    }
    val styleCyberpunkDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "霓虹灯效、科技感、未来主义"
        AppLanguage.ENGLISH -> "Neon lights, tech vibes, futurism"
        AppLanguage.ARABIC -> "أضواء نيون، أجواء تقنية، مستقبلية"
    }
    val styleGradient: String get() = when (lang) {
        AppLanguage.CHINESE -> "渐变炫彩"
        AppLanguage.ENGLISH -> "Gradient Colors"
        AppLanguage.ARABIC -> "ألوان متدرجة"
    }
    val styleGradientDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "丰富的渐变色彩，活力四射"
        AppLanguage.ENGLISH -> "Rich gradient colors, vibrant and energetic"
        AppLanguage.ARABIC -> "ألوان متدرجة غنية، حيوية ونشطة"
    }
    val styleMinimal: String get() = when (lang) {
        AppLanguage.CHINESE -> "极简主义"
        AppLanguage.ENGLISH -> "Minimalist"
        AppLanguage.ARABIC -> "بساطة متناهية"
    }
    val styleMinimalDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "去除一切不必要的装饰，只保留核心"
        AppLanguage.ENGLISH -> "Remove all unnecessary decoration, keep only essentials"
        AppLanguage.ARABIC -> "إزالة كل الزخارف غير الضرورية، الاحتفاظ بالأساسيات فقط"
    }
    val styleNature: String get() = when (lang) {
        AppLanguage.CHINESE -> "自然清新"
        AppLanguage.ENGLISH -> "Nature Fresh"
        AppLanguage.ARABIC -> "طبيعي منعش"
    }
    val styleNatureDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "来自自然的配色，宁静舒适"
        AppLanguage.ENGLISH -> "Natural color palette, calm and comfortable"
        AppLanguage.ARABIC -> "لوحة ألوان طبيعية، هادئة ومريحة"
    }
    val styleCuteCartoon: String get() = when (lang) {
        AppLanguage.CHINESE -> "卡通可爱"
        AppLanguage.ENGLISH -> "Cute Cartoon"
        AppLanguage.ARABIC -> "كرتون لطيف"
    }
    val styleCuteCartoonDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "萌系卡通风格，圆润可爱"
        AppLanguage.ENGLISH -> "Cute cartoon style, rounded and adorable"
        AppLanguage.ARABIC -> "نمط كرتوني لطيف، مستدير وجميل"
    }
    val styleNeonGlow: String get() = when (lang) {
        AppLanguage.CHINESE -> "霓虹灯光"
        AppLanguage.ENGLISH -> "Neon Glow"
        AppLanguage.ARABIC -> "توهج النيون"
    }
    val styleNeonGlowDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "发光霓虹效果，夜店风格"
        AppLanguage.ENGLISH -> "Glowing neon effect, nightclub style"
        AppLanguage.ARABIC -> "تأثير نيون متوهج، نمط الملهى الليلي"
    }

    // ==================== HTML编程AI风格参考 ====================
    val styleHarryPotter: String get() = when (lang) {
        AppLanguage.CHINESE -> "哈利波特风格"
        AppLanguage.ENGLISH -> "Harry Potter Style"
        AppLanguage.ARABIC -> "نمط هاري بوتر"
    }
    val styleHarryPotterDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "霍格沃茨的魔法世界"
        AppLanguage.ENGLISH -> "The magical world of Hogwarts"
        AppLanguage.ARABIC -> "عالم هوجورتس السحري"
    }
    val styleGhibli: String get() = when (lang) {
        AppLanguage.CHINESE -> "吉卜力风格"
        AppLanguage.ENGLISH -> "Ghibli Style"
        AppLanguage.ARABIC -> "نمط جيبلي"
    }
    val styleGhibliDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "宫崎骏的温暖治愈世界"
        AppLanguage.ENGLISH -> "Miyazaki's warm and healing world"
        AppLanguage.ARABIC -> "عالم ميازاكي الدافئ والشافي"
    }
    val styleYourName: String get() = when (lang) {
        AppLanguage.CHINESE -> "你的名字风格"
        AppLanguage.ENGLISH -> "Your Name Style"
        AppLanguage.ARABIC -> "نمط اسمك"
    }
    val styleYourNameDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "新海诚的唯美光影"
        AppLanguage.ENGLISH -> "Shinkai's beautiful lighting"
        AppLanguage.ARABIC -> "إضاءة شينكاي الجميلة"
    }
    val styleApple: String get() = when (lang) {
        AppLanguage.CHINESE -> "苹果设计风格"
        AppLanguage.ENGLISH -> "Apple Design Style"
        AppLanguage.ARABIC -> "نمط تصميم آبل"
    }
    val styleAppleDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "简约、优雅、科技感"
        AppLanguage.ENGLISH -> "Simple, elegant, tech-forward"
        AppLanguage.ARABIC -> "بسيط، أنيق، تقني"
    }
    val styleLittlePrince: String get() = when (lang) {
        AppLanguage.CHINESE -> "小王子风格"
        AppLanguage.ENGLISH -> "Little Prince Style"
        AppLanguage.ARABIC -> "نمط الأمير الصغير"
    }
    val styleLittlePrinceDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "充满诗意的童话风格"
        AppLanguage.ENGLISH -> "Poetic fairytale style"
        AppLanguage.ARABIC -> "نمط قصة خيالية شاعري"
    }
    val styleZeldaBotw: String get() = when (lang) {
        AppLanguage.CHINESE -> "塞尔达荒野之息"
        AppLanguage.ENGLISH -> "Zelda: Breath of the Wild"
        AppLanguage.ARABIC -> "زيلدا: نفس البرية"
    }
    val styleZeldaBotwDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "海拉鲁的广袤世界"
        AppLanguage.ENGLISH -> "The vast world of Hyrule"
        AppLanguage.ARABIC -> "عالم هايرول الشاسع"
    }
    val styleArtDeco: String get() = when (lang) {
        AppLanguage.CHINESE -> "装饰艺术风格"
        AppLanguage.ENGLISH -> "Art Deco Style"
        AppLanguage.ARABIC -> "نمط آرت ديكو"
    }
    val styleArtDecoDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "1920年代的装饰艺术运动"
        AppLanguage.ENGLISH -> "1920s Art Deco movement"
        AppLanguage.ARABIC -> "حركة آرت ديكو في العشرينيات"
    }
    val styleJapanese: String get() = when (lang) {
        AppLanguage.CHINESE -> "日式和风"
        AppLanguage.ENGLISH -> "Japanese Style"
        AppLanguage.ARABIC -> "النمط الياباني"
    }
    val styleJapaneseDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "日本传统美学，禅意与留白"
        AppLanguage.ENGLISH -> "Japanese aesthetics, zen and whitespace"
        AppLanguage.ARABIC -> "الجماليات اليابانية، الزن والمساحات البيضاء"
    }

    // ==================== HTML编程AI规则模板 ====================
    val rulesChinese: String get() = when (lang) {
        AppLanguage.CHINESE -> "中文对话"
        AppLanguage.ENGLISH -> "Chinese Dialogue"
        AppLanguage.ARABIC -> "حوار صيني"
    }
    val rulesChineseDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "使用中文进行所有交流"
        AppLanguage.ENGLISH -> "Use Chinese for all communication"
        AppLanguage.ARABIC -> "استخدم الصينية في جميع الاتصالات"
    }
    val rulesGame: String get() = when (lang) {
        AppLanguage.CHINESE -> "游戏开发"
        AppLanguage.ENGLISH -> "Game Development"
        AppLanguage.ARABIC -> "تطوير الألعاب"
    }
    val rulesGameDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "适合开发小游戏"
        AppLanguage.ENGLISH -> "Suitable for developing mini games"
        AppLanguage.ARABIC -> "مناسب لتطوير الألعاب الصغيرة"
    }
    val rulesAnimation: String get() = when (lang) {
        AppLanguage.CHINESE -> "动画效果"
        AppLanguage.ENGLISH -> "Animation Effects"
        AppLanguage.ARABIC -> "تأثيرات الحركة"
    }
    val rulesAnimationDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "注重动画和交互效果"
        AppLanguage.ENGLISH -> "Focus on animation and interaction"
        AppLanguage.ARABIC -> "التركيز على الحركة والتفاعل"
    }
    val rulesForm: String get() = when (lang) {
        AppLanguage.CHINESE -> "表单页面"
        AppLanguage.ENGLISH -> "Form Pages"
        AppLanguage.ARABIC -> "صفحات النماذج"
    }
    val rulesFormDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "适合创建表单和数据收集页面"
        AppLanguage.ENGLISH -> "Suitable for creating forms and data collection pages"
        AppLanguage.ARABIC -> "مناسب لإنشاء النماذج وصفحات جمع البيانات"
    }

    // ==================== 隔离配置 ====================
    val countryRegion: String get() = when (lang) {
        AppLanguage.CHINESE -> "国家/地区"
        AppLanguage.ENGLISH -> "Country/Region"
        AppLanguage.ARABIC -> "البلد/المنطقة"
    }
    
    val countryRegionHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "如：日本、韩国、英国..."
        AppLanguage.ENGLISH -> "e.g.: Japan, Korea, UK..."
        AppLanguage.ARABIC -> "مثال: اليابان، كوريا، المملكة المتحدة..."
    }

    // ==================== 代码片段 ====================
    val searchCodeSnippets: String get() = when (lang) {
        AppLanguage.CHINESE -> "搜索代码块..."
        AppLanguage.ENGLISH -> "Search code snippets..."
        AppLanguage.ARABIC -> "البحث عن مقتطفات الكود..."
    }

    // ==================== 模块编辑器 ====================
    val moduleNameRequired: String get() = when (lang) {
        AppLanguage.CHINESE -> "模块名称 *"
        AppLanguage.ENGLISH -> "Module Name *"
        AppLanguage.ARABIC -> "اسم الوحدة *"
    }
    
    val inputModuleName: String get() = when (lang) {
        AppLanguage.CHINESE -> "输入模块名称"
        AppLanguage.ENGLISH -> "Enter module name"
        AppLanguage.ARABIC -> "أدخل اسم الوحدة"
    }
    
    val editModule: String get() = when (lang) {
        AppLanguage.CHINESE -> "编辑模块"
        AppLanguage.ENGLISH -> "Edit Module"
        AppLanguage.ARABIC -> "تعديل الوحدة"
    }
    
    val useTemplate: String get() = when (lang) {
        AppLanguage.CHINESE -> "使用模板"
        AppLanguage.ENGLISH -> "Use Template"
        AppLanguage.ARABIC -> "استخدام القالب"
    }
    
    val basicInfo: String get() = when (lang) {
        AppLanguage.CHINESE -> "基本信息"
        AppLanguage.ENGLISH -> "Basic Info"
        AppLanguage.ARABIC -> "المعلومات الأساسية"
    }
    
    val code: String get() = when (lang) {
        AppLanguage.CHINESE -> "代码"
        AppLanguage.ENGLISH -> "Code"
        AppLanguage.ARABIC -> "الكود"
    }
    
    val advancedSettings: String get() = when (lang) {
        AppLanguage.CHINESE -> "高级设置"
        AppLanguage.ENGLISH -> "Advanced Settings"
        AppLanguage.ARABIC -> "الإعدادات المتقدمة"
    }
    
    val selectCategory: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择分类"
        AppLanguage.ENGLISH -> "Select Category"
        AppLanguage.ARABIC -> "اختيار الفئة"
    }
    
    val runTime: String get() = when (lang) {
        AppLanguage.CHINESE -> "执行时机"
        AppLanguage.ENGLISH -> "Run Time"
        AppLanguage.ARABIC -> "وقت التشغيل"
    }
    
    val requiredPermissions: String get() = when (lang) {
        AppLanguage.CHINESE -> "所需权限"
        AppLanguage.ENGLISH -> "Required Permissions"
        AppLanguage.ARABIC -> "الأذونات المطلوبة"
    }
    
    val sensitive: String get() = when (lang) {
        AppLanguage.CHINESE -> "敏感"
        AppLanguage.ENGLISH -> "Sensitive"
        AppLanguage.ARABIC -> "حساس"
    }
    
    val confirm: String get() = when (lang) {
        AppLanguage.CHINESE -> "确定"
        AppLanguage.ENGLISH -> "Confirm"
        AppLanguage.ARABIC -> "تأكيد"
    }
    
    val category: String get() = when (lang) {
        AppLanguage.CHINESE -> "分类"
        AppLanguage.ENGLISH -> "Category"
        AppLanguage.ARABIC -> "الفئة"
    }
    
    val codeSnippets: String get() = when (lang) {
        AppLanguage.CHINESE -> "代码块"
        AppLanguage.ENGLISH -> "Code Snippets"
        AppLanguage.ARABIC -> "مقتطفات الكود"
    }
    
    val availableFunctions: String get() = when (lang) {
        AppLanguage.CHINESE -> "💡 可用函数"
        AppLanguage.ENGLISH -> "💡 Available Functions"
        AppLanguage.ARABIC -> "💡 الدوال المتاحة"
    }
    
    val cssTips: String get() = when (lang) {
        AppLanguage.CHINESE -> "💡 CSS 提示"
        AppLanguage.ENGLISH -> "💡 CSS Tips"
        AppLanguage.ARABIC -> "💡 نصائح CSS"
    }
    
    val jsFunctionsHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "• getConfig(key, defaultValue) - 获取用户配置\n• __MODULE_INFO__ - 模块信息对象\n• __MODULE_CONFIG__ - 配置值对象"
        AppLanguage.ENGLISH -> "• getConfig(key, defaultValue) - Get user config\n• __MODULE_INFO__ - Module info object\n• __MODULE_CONFIG__ - Config values object"
        AppLanguage.ARABIC -> "• getConfig(key, defaultValue) - الحصول على تكوين المستخدم\n• __MODULE_INFO__ - كائن معلومات الوحدة\n• __MODULE_CONFIG__ - كائن قيم التكوين"
    }
    
    val cssHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "• CSS 会自动注入到页面 <head>\n• 使用 !important 确保样式生效"
        AppLanguage.ENGLISH -> "• CSS will be auto-injected into page <head>\n• Use !important to ensure styles take effect"
        AppLanguage.ARABIC -> "• سيتم حقن CSS تلقائيًا في <head> الصفحة\n• استخدم !important لضمان تطبيق الأنماط"
    }
    
    val javascriptCode: String get() = when (lang) {
        AppLanguage.CHINESE -> "JavaScript 代码"
        AppLanguage.ENGLISH -> "JavaScript Code"
        AppLanguage.ARABIC -> "كود JavaScript"
    }
    
    val cssCode: String get() = when (lang) {
        AppLanguage.CHINESE -> "CSS 代码"
        AppLanguage.ENGLISH -> "CSS Code"
        AppLanguage.ARABIC -> "كود CSS"
    }
    
    val noSpecialPermissions: String get() = when (lang) {
        AppLanguage.CHINESE -> "无特殊权限"
        AppLanguage.ENGLISH -> "No special permissions"
        AppLanguage.ARABIC -> "لا توجد أذونات خاصة"
    }
    
    val urlMatchRules: String get() = when (lang) {
        AppLanguage.CHINESE -> "URL 匹配规则"
        AppLanguage.ENGLISH -> "URL Match Rules"
        AppLanguage.ARABIC -> "قواعد مطابقة URL"
    }
    
    val matchAllWebsites: String get() = when (lang) {
        AppLanguage.CHINESE -> "匹配所有网站"
        AppLanguage.ENGLISH -> "Match all websites"
        AppLanguage.ARABIC -> "مطابقة جميع المواقع"
    }
    
    val rulesCount: String get() = when (lang) {
        AppLanguage.CHINESE -> "%d 条规则"
        AppLanguage.ENGLISH -> "%d rules"
        AppLanguage.ARABIC -> "%d قواعد"
    }
    
    val userConfigItems: String get() = when (lang) {
        AppLanguage.CHINESE -> "用户配置项"
        AppLanguage.ENGLISH -> "User Config Items"
        AppLanguage.ARABIC -> "عناصر تكوين المستخدم"
    }
    
    val noConfigItems: String get() = when (lang) {
        AppLanguage.CHINESE -> "无可配置项"
        AppLanguage.ENGLISH -> "No config items"
        AppLanguage.ARABIC -> "لا توجد عناصر تكوين"
    }
    
    val configItemsCount: String get() = when (lang) {
        AppLanguage.CHINESE -> "%d 个配置项"
        AppLanguage.ENGLISH -> "%d config items"
        AppLanguage.ARABIC -> "%d عناصر تكوين"
    }
    
    val developerGuide: String get() = when (lang) {
        AppLanguage.CHINESE -> "📚 开发指南"
        AppLanguage.ENGLISH -> "📚 Developer Guide"
        AppLanguage.ARABIC -> "📚 دليل المطور"
    }
    
    val developerGuideContent: String get() = when (lang) {
        AppLanguage.CHINESE -> "• URL 匹配：留空则在所有网站生效\n• 配置项：让用户自定义模块行为\n• 权限声明：告知用户模块需要的能力\n• 执行时机：控制代码何时运行"
        AppLanguage.ENGLISH -> "• URL Match: Leave empty to apply on all websites\n• Config Items: Let users customize module behavior\n• Permissions: Inform users of required capabilities\n• Run Time: Control when code runs"
        AppLanguage.ARABIC -> "• مطابقة URL: اتركه فارغًا للتطبيق على جميع المواقع\n• عناصر التكوين: السماح للمستخدمين بتخصيص سلوك الوحدة\n• الأذونات: إعلام المستخدمين بالقدرات المطلوبة\n• وقت التشغيل: التحكم في وقت تشغيل الكود"
    }
    
    val regex: String get() = when (lang) {
        AppLanguage.CHINESE -> "正则"
        AppLanguage.ENGLISH -> "Regex"
        AppLanguage.ARABIC -> "تعبير نمطي"
    }
    
    val exclude: String get() = when (lang) {
        AppLanguage.CHINESE -> "排除"
        AppLanguage.ENGLISH -> "Exclude"
        AppLanguage.ARABIC -> "استبعاد"
    }
    
    val include: String get() = when (lang) {
        AppLanguage.CHINESE -> "包含"
        AppLanguage.ENGLISH -> "Include"
        AppLanguage.ARABIC -> "تضمين"
    }
    
    val description: String get() = when (lang) {
        AppLanguage.CHINESE -> "描述"
        AppLanguage.ENGLISH -> "Description"
        AppLanguage.ARABIC -> "الوصف"
    }
    
    val briefModuleDescription: String get() = when (lang) {
        AppLanguage.CHINESE -> "简要描述模块功能"
        AppLanguage.ENGLISH -> "Brief description of module function"
        AppLanguage.ARABIC -> "وصف موجز لوظيفة الوحدة"
    }
    
    val tags: String get() = when (lang) {
        AppLanguage.CHINESE -> "标签"
        AppLanguage.ENGLISH -> "Tags"
        AppLanguage.ARABIC -> "العلامات"
    }
    
    val tagsHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "用逗号分隔，如：广告, 屏蔽, 工具"
        AppLanguage.ENGLISH -> "Comma separated, e.g.: ads, block, tools"
        AppLanguage.ARABIC -> "مفصولة بفواصل، مثال: إعلانات، حظر، أدوات"
    }
    
    val author: String get() = when (lang) {
        AppLanguage.CHINESE -> "作者"
        AppLanguage.ENGLISH -> "Author"
        AppLanguage.ARABIC -> "المؤلف"
    }
    
    val yourName: String get() = when (lang) {
        AppLanguage.CHINESE -> "你的名字"
        AppLanguage.ENGLISH -> "Your name"
        AppLanguage.ARABIC -> "اسمك"
    }
    
    val keyNameRequired: String get() = when (lang) {
        AppLanguage.CHINESE -> "键名 *"
        AppLanguage.ENGLISH -> "Key Name *"
        AppLanguage.ARABIC -> "اسم المفتاح *"
    }
    
    val keyNameHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "如: fontSize"
        AppLanguage.ENGLISH -> "e.g.: fontSize"
        AppLanguage.ARABIC -> "مثال: fontSize"
    }
    
    val displayNameRequired: String get() = when (lang) {
        AppLanguage.CHINESE -> "显示名称 *"
        AppLanguage.ENGLISH -> "Display Name *"
        AppLanguage.ARABIC -> "اسم العرض *"
    }
    
    val displayNameHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "如: 字体大小"
        AppLanguage.ENGLISH -> "e.g.: Font Size"
        AppLanguage.ARABIC -> "مثال: حجم الخط"
    }
    
    val configDescription: String get() = when (lang) {
        AppLanguage.CHINESE -> "说明"
        AppLanguage.ENGLISH -> "Description"
        AppLanguage.ARABIC -> "الوصف"
    }
    
    val configDescriptionHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "配置项的说明文字"
        AppLanguage.ENGLISH -> "Description text for config item"
        AppLanguage.ARABIC -> "نص وصف عنصر التكوين"
    }
    
    val configType: String get() = when (lang) {
        AppLanguage.CHINESE -> "类型"
        AppLanguage.ENGLISH -> "Type"
        AppLanguage.ARABIC -> "النوع"
    }
    
    val defaultValue: String get() = when (lang) {
        AppLanguage.CHINESE -> "默认值"
        AppLanguage.ENGLISH -> "Default Value"
        AppLanguage.ARABIC -> "القيمة الافتراضية"
    }

    // ==================== AI设置 ====================
    val provider: String get() = when (lang) {
        AppLanguage.CHINESE -> "供应商"
        AppLanguage.ENGLISH -> "Provider"
        AppLanguage.ARABIC -> "المزود"
    }
    
    val modelId: String get() = when (lang) {
        AppLanguage.CHINESE -> "模型 ID"
        AppLanguage.ENGLISH -> "Model ID"
        AppLanguage.ARABIC -> "معرف النموذج"
    }
    
    val modelIdHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "例如：gpt-4o-mini"
        AppLanguage.ENGLISH -> "e.g.: gpt-4o-mini"
        AppLanguage.ARABIC -> "مثال: gpt-4o-mini"
    }
    
    val aliasOptional: String get() = when (lang) {
        AppLanguage.CHINESE -> "别名（可选）"
        AppLanguage.ENGLISH -> "Alias (optional)"
        AppLanguage.ARABIC -> "الاسم المستعار (اختياري)"
    }
    
    val alias: String get() = when (lang) {
        AppLanguage.CHINESE -> "别名"
        AppLanguage.ENGLISH -> "Alias"
        AppLanguage.ARABIC -> "الاسم المستعار"
    }

    // ==================== 创建应用 ====================
    val activationCode: String get() = when (lang) {
        AppLanguage.CHINESE -> "激活码"
        AppLanguage.ENGLISH -> "Activation Code"
        AppLanguage.ARABIC -> "رمز التفعيل"
    }
    
    val inputActivationCodeHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "输入激活码"
        AppLanguage.ENGLISH -> "Enter activation code"
        AppLanguage.ARABIC -> "أدخل رمز التفعيل"
    }
    
    val customPackageName: String get() = when (lang) {
        AppLanguage.CHINESE -> "自定义包名"
        AppLanguage.ENGLISH -> "Custom Package Name"
        AppLanguage.ARABIC -> "اسم الحزمة المخصص"
    }
    
    val packageNameTooLong: String get() = when (lang) {
        AppLanguage.CHINESE -> "包名过长！最多%d字符（当前%d）"
        AppLanguage.ENGLISH -> "Package name too long! Max %d characters (current %d)"
        AppLanguage.ARABIC -> "اسم الحزمة طويل جدًا! الحد الأقصى %d حرف (الحالي %d)"
    }
    
    val packageNameInvalidFormat: String get() = when (lang) {
        AppLanguage.CHINESE -> "格式错误，应为小写字母开头，如：com.w2a.app"
        AppLanguage.ENGLISH -> "Invalid format, should start with lowercase letter, e.g.: com.w2a.app"
        AppLanguage.ARABIC -> "تنسيق غير صالح، يجب أن يبدأ بحرف صغير، مثال: com.w2a.app"
    }
    
    val packageNameHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "留空自动生成，最多%d字符，如：com.w2a.app"
        AppLanguage.ENGLISH -> "Leave empty for auto-generation, max %d characters, e.g.: com.w2a.app"
        AppLanguage.ARABIC -> "اتركه فارغًا للإنشاء التلقائي، الحد الأقصى %d حرف، مثال: com.w2a.app"
    }
    
    val apkConfigNote: String get() = when (lang) {
        AppLanguage.CHINESE -> "以下配置仅在打包APK时生效"
        AppLanguage.ENGLISH -> "The following settings only take effect when building APK"
        AppLanguage.ARABIC -> "الإعدادات التالية تسري فقط عند بناء APK"
    }
    
    val versionName: String get() = when (lang) {
        AppLanguage.CHINESE -> "版本名"
        AppLanguage.ENGLISH -> "Version Name"
        AppLanguage.ARABIC -> "اسم الإصدار"
    }
    
    val versionCode: String get() = when (lang) {
        AppLanguage.CHINESE -> "版本号"
        AppLanguage.ENGLISH -> "Version Code"
        AppLanguage.ARABIC -> "رقم الإصدار"
    }
    
    val selectTheme: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择主题"
        AppLanguage.ENGLISH -> "Select Theme"
        AppLanguage.ARABIC -> "اختيار السمة"
    }
    
    val translateTargetLanguage: String get() = when (lang) {
        AppLanguage.CHINESE -> "翻译目标语言"
        AppLanguage.ENGLISH -> "Translation Target Language"
        AppLanguage.ARABIC -> "لغة الترجمة المستهدفة"
    }
    
    val adBlockRuleHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "如：ads.example.com"
        AppLanguage.ENGLISH -> "e.g.: ads.example.com"
        AppLanguage.ARABIC -> "مثال: ads.example.com"
    }
    
    val adBlockDescription: String get() = when (lang) {
        AppLanguage.CHINESE -> "启用后将自动拦截网页中的广告内容"
        AppLanguage.ENGLISH -> "When enabled, ads in web pages will be automatically blocked"
        AppLanguage.ARABIC -> "عند التفعيل، سيتم حظر الإعلانات في صفحات الويب تلقائيًا"
    }
    
    val customBlockRules: String get() = when (lang) {
        AppLanguage.CHINESE -> "自定义拦截规则（可选）"
        AppLanguage.ENGLISH -> "Custom Block Rules (optional)"
        AppLanguage.ARABIC -> "قواعد الحظر المخصصة (اختياري)"
    }

    // ==================== 通用 ====================
    val done: String get() = when (lang) {
        AppLanguage.CHINESE -> "完成"
        AppLanguage.ENGLISH -> "Done"
        AppLanguage.ARABIC -> "تم"
    }
    
    val edit: String get() = when (lang) {
        AppLanguage.CHINESE -> "编辑"
        AppLanguage.ENGLISH -> "Edit"
        AppLanguage.ARABIC -> "تعديل"
    }
    
    val newUpdate: String get() = when (lang) {
        AppLanguage.CHINESE -> "发现新版本"
        AppLanguage.ENGLISH -> "New Update Available"
        AppLanguage.ARABIC -> "تحديث جديد متاح"
    }
    
    val updateNow: String get() = when (lang) {
        AppLanguage.CHINESE -> "立即更新"
        AppLanguage.ENGLISH -> "Update Now"
        AppLanguage.ARABIC -> "التحديث الآن"
    }
    
    val latestVersion: String get() = when (lang) {
        AppLanguage.CHINESE -> "已是最新版本"
        AppLanguage.ENGLISH -> "Already latest version"
        AppLanguage.ARABIC -> "أحدث إصدار بالفعل"
    }
    
    val networkError: String get() = when (lang) {
        AppLanguage.CHINESE -> "网络错误"
        AppLanguage.ENGLISH -> "Network Error"
        AppLanguage.ARABIC -> "خطأ في الشبكة"
    }
    
    val loading: String get() = when (lang) {
        AppLanguage.CHINESE -> "加载中..."
        AppLanguage.ENGLISH -> "Loading..."
        AppLanguage.ARABIC -> "جاري التحميل..."
    }
    
    val noData: String get() = when (lang) {
        AppLanguage.CHINESE -> "暂无数据"
        AppLanguage.ENGLISH -> "No data"
        AppLanguage.ARABIC -> "لا توجد بيانات"
    }
    
    val saved: String get() = when (lang) {
        AppLanguage.CHINESE -> "已保存"
        AppLanguage.ENGLISH -> "Saved"
        AppLanguage.ARABIC -> "تم الحفظ"
    }
    
    val operationSuccess: String get() = when (lang) {
        AppLanguage.CHINESE -> "操作成功"
        AppLanguage.ENGLISH -> "Operation successful"
        AppLanguage.ARABIC -> "تمت العملية بنجاح"
    }
    
    val operationFailed: String get() = when (lang) {
        AppLanguage.CHINESE -> "操作失败"
        AppLanguage.ENGLISH -> "Operation failed"
        AppLanguage.ARABIC -> "فشلت العملية"
    }
    
    val unknownError: String get() = when (lang) {
        AppLanguage.CHINESE -> "未知错误"
        AppLanguage.ENGLISH -> "Unknown error"
        AppLanguage.ARABIC -> "خطأ غير معروف"
    }
    
    val pleaseWait: String get() = when (lang) {
        AppLanguage.CHINESE -> "请稍候..."
        AppLanguage.ENGLISH -> "Please wait..."
        AppLanguage.ARABIC -> "يرجى الانتظار..."
    }
    
    val processing: String get() = when (lang) {
        AppLanguage.CHINESE -> "处理中..."
        AppLanguage.ENGLISH -> "Processing..."
        AppLanguage.ARABIC -> "جاري المعالجة..."
    }
    
    val on: String get() = when (lang) {
        AppLanguage.CHINESE -> "开"
        AppLanguage.ENGLISH -> "On"
        AppLanguage.ARABIC -> "تشغيل"
    }
    
    val off: String get() = when (lang) {
        AppLanguage.CHINESE -> "关"
        AppLanguage.ENGLISH -> "Off"
        AppLanguage.ARABIC -> "إيقاف"
    }
    
    val selectFile: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择文件"
        AppLanguage.ENGLISH -> "Select File"
        AppLanguage.ARABIC -> "اختيار ملف"
    }
    
    val selectFolder: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择文件夹"
        AppLanguage.ENGLISH -> "Select Folder"
        AppLanguage.ARABIC -> "اختيار مجلد"
    }
    
    val fileNotFound: String get() = when (lang) {
        AppLanguage.CHINESE -> "文件未找到"
        AppLanguage.ENGLISH -> "File not found"
        AppLanguage.ARABIC -> "الملف غير موجود"
    }
    
    val invalidFormat: String get() = when (lang) {
        AppLanguage.CHINESE -> "格式无效"
        AppLanguage.ENGLISH -> "Invalid format"
        AppLanguage.ARABIC -> "تنسيق غير صالح"
    }
    
    val permissionDenied: String get() = when (lang) {
        AppLanguage.CHINESE -> "权限被拒绝"
        AppLanguage.ENGLISH -> "Permission denied"
        AppLanguage.ARABIC -> "تم رفض الإذن"
    }
    
    val grantPermission: String get() = when (lang) {
        AppLanguage.CHINESE -> "授予权限"
        AppLanguage.ENGLISH -> "Grant Permission"
        AppLanguage.ARABIC -> "منح الإذن"
    }

    // ==================== AI 模块开发帮助 ====================
    val howToUse: String get() = when (lang) {
        AppLanguage.CHINESE -> "如何使用"
        AppLanguage.ENGLISH -> "How to Use"
        AppLanguage.ARABIC -> "كيفية الاستخدام"
    }
    
    val howToUseContent: String get() = when (lang) {
        AppLanguage.CHINESE -> "在输入框中用自然语言描述你想要的功能，AI 会自动分析需求并生成对应的扩展模块代码。"
        AppLanguage.ENGLISH -> "Describe the feature you want in natural language in the input box, AI will automatically analyze requirements and generate corresponding extension module code."
        AppLanguage.ARABIC -> "صف الميزة التي تريدها بلغة طبيعية في مربع الإدخال، سيقوم الذكاء الاصطناعي بتحليل المتطلبات تلقائيًا وإنشاء كود وحدة الإضافة المقابل."
    }
    
    val requirementDescriptionTips: String get() = when (lang) {
        AppLanguage.CHINESE -> "需求描述技巧"
        AppLanguage.ENGLISH -> "Requirement Description Tips"
        AppLanguage.ARABIC -> "نصائح وصف المتطلبات"
    }
    
    val requirementDescriptionTipsContent: String get() = when (lang) {
        AppLanguage.CHINESE -> "• 描述具体的功能效果\n• 说明目标网站或页面类型\n• 可以参考示例需求的写法"
        AppLanguage.ENGLISH -> "• Describe specific feature effects\n• Specify target website or page type\n• Can refer to example requirements"
        AppLanguage.ARABIC -> "• وصف تأثيرات الميزة المحددة\n• تحديد الموقع أو نوع الصفحة المستهدفة\n• يمكن الرجوع إلى أمثلة المتطلبات"
    }
    
    val modelSelection: String get() = when (lang) {
        AppLanguage.CHINESE -> "模型选择"
        AppLanguage.ENGLISH -> "Model Selection"
        AppLanguage.ARABIC -> "اختيار النموذج"
    }
    
    val modelSelectionContent: String get() = when (lang) {
        AppLanguage.CHINESE -> "可以选择不同的 AI 模型来生成代码。不同模型可能有不同的效果和速度。"
        AppLanguage.ENGLISH -> "You can choose different AI models to generate code. Different models may have different effects and speeds."
        AppLanguage.ARABIC -> "يمكنك اختيار نماذج ذكاء اصطناعي مختلفة لإنشاء الكود. قد يكون للنماذج المختلفة تأثيرات وسرعات مختلفة."
    }
    
    val categorySelection: String get() = when (lang) {
        AppLanguage.CHINESE -> "分类选择"
        AppLanguage.ENGLISH -> "Category Selection"
        AppLanguage.ARABIC -> "اختيار الفئة"
    }
    
    val categorySelectionContent: String get() = when (lang) {
        AppLanguage.CHINESE -> "可以手动选择模块分类，也可以让 AI 自动识别。手动选择可以让生成的代码更精准。"
        AppLanguage.ENGLISH -> "You can manually select module category or let AI auto-detect. Manual selection can make generated code more precise."
        AppLanguage.ARABIC -> "يمكنك اختيار فئة الوحدة يدويًا أو السماح للذكاء الاصطناعي بالكشف التلقائي. الاختيار اليدوي يجعل الكود المُنشأ أكثر دقة."
    }
    
    val autoCheck: String get() = when (lang) {
        AppLanguage.CHINESE -> "自动检查"
        AppLanguage.ENGLISH -> "Auto Check"
        AppLanguage.ARABIC -> "الفحص التلقائي"
    }
    
    val autoCheckContent: String get() = when (lang) {
        AppLanguage.CHINESE -> "AI 会自动进行语法检查和安全扫描，确保生成的代码可以正常运行且没有安全隐患。"
        AppLanguage.ENGLISH -> "AI will automatically perform syntax check and security scan to ensure generated code runs properly without security risks."
        AppLanguage.ARABIC -> "سيقوم الذكاء الاصطناعي تلقائيًا بإجراء فحص بناء الجملة والمسح الأمني لضمان تشغيل الكود المُنشأ بشكل صحيح دون مخاطر أمنية."
    }
    
    val codeEditing: String get() = when (lang) {
        AppLanguage.CHINESE -> "代码编辑"
        AppLanguage.ENGLISH -> "Code Editing"
        AppLanguage.ARABIC -> "تحرير الكود"
    }
    
    val codeEditingContent: String get() = when (lang) {
        AppLanguage.CHINESE -> "生成的代码可以直接编辑修改，保存时会使用修改后的版本。"
        AppLanguage.ENGLISH -> "Generated code can be directly edited, modified version will be used when saving."
        AppLanguage.ARABIC -> "يمكن تحرير الكود المُنشأ مباشرة، سيتم استخدام النسخة المعدلة عند الحفظ."
    }
    
    val saveModule: String get() = when (lang) {
        AppLanguage.CHINESE -> "保存模块"
        AppLanguage.ENGLISH -> "Save Module"
        AppLanguage.ARABIC -> "حفظ الوحدة"
    }
    
    val saveModuleContent: String get() = when (lang) {
        AppLanguage.CHINESE -> "生成完成后，点击「保存」将其添加到你的模块库中，之后可以在创建应用时使用。"
        AppLanguage.ENGLISH -> "After generation, click 'Save' to add it to your module library, then you can use it when creating apps."
        AppLanguage.ARABIC -> "بعد الإنشاء، انقر على 'حفظ' لإضافته إلى مكتبة الوحدات الخاصة بك، ثم يمكنك استخدامه عند إنشاء التطبيقات."
    }

    // ==================== WebView 高级设置 ====================
    val javaScriptSetting: String get() = when (lang) {
        AppLanguage.CHINESE -> "JavaScript"
        AppLanguage.ENGLISH -> "JavaScript"
        AppLanguage.ARABIC -> "JavaScript"
    }
    
    val javaScriptSettingHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "启用JavaScript执行"
        AppLanguage.ENGLISH -> "Enable JavaScript execution"
        AppLanguage.ARABIC -> "تفعيل تنفيذ JavaScript"
    }
    
    val domStorageSetting: String get() = when (lang) {
        AppLanguage.CHINESE -> "DOM存储"
        AppLanguage.ENGLISH -> "DOM Storage"
        AppLanguage.ARABIC -> "تخزين DOM"
    }
    
    val domStorageSettingHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "启用本地存储功能"
        AppLanguage.ENGLISH -> "Enable local storage"
        AppLanguage.ARABIC -> "تفعيل التخزين المحلي"
    }
    
    val zoomSetting: String get() = when (lang) {
        AppLanguage.CHINESE -> "缩放功能"
        AppLanguage.ENGLISH -> "Zoom"
        AppLanguage.ARABIC -> "التكبير/التصغير"
    }
    
    val zoomSettingHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "允许用户缩放页面"
        AppLanguage.ENGLISH -> "Allow user to zoom page"
        AppLanguage.ARABIC -> "السماح للمستخدم بتكبير/تصغير الصفحة"
    }
    
    val swipeRefreshSetting: String get() = when (lang) {
        AppLanguage.CHINESE -> "下拉刷新"
        AppLanguage.ENGLISH -> "Swipe Refresh"
        AppLanguage.ARABIC -> "السحب للتحديث"
    }
    
    val swipeRefreshSettingHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "允许下拉刷新页面"
        AppLanguage.ENGLISH -> "Allow swipe down to refresh"
        AppLanguage.ARABIC -> "السماح بالسحب لأسفل للتحديث"
    }
    
    val desktopModeSetting: String get() = when (lang) {
        AppLanguage.CHINESE -> "桌面模式"
        AppLanguage.ENGLISH -> "Desktop Mode"
        AppLanguage.ARABIC -> "وضع سطح المكتب"
    }
    
    val desktopModeSettingHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "以桌面版网页模式加载"
        AppLanguage.ENGLISH -> "Load as desktop website"
        AppLanguage.ARABIC -> "التحميل كموقع سطح المكتب"
    }
    
    val fullscreenVideoSetting: String get() = when (lang) {
        AppLanguage.CHINESE -> "全屏视频"
        AppLanguage.ENGLISH -> "Fullscreen Video"
        AppLanguage.ARABIC -> "فيديو ملء الشاشة"
    }
    
    val fullscreenVideoSettingHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "允许视频全屏播放"
        AppLanguage.ENGLISH -> "Allow video fullscreen playback"
        AppLanguage.ARABIC -> "السماح بتشغيل الفيديو بملء الشاشة"
    }
    
    val externalLinksSetting: String get() = when (lang) {
        AppLanguage.CHINESE -> "外部链接"
        AppLanguage.ENGLISH -> "External Links"
        AppLanguage.ARABIC -> "الروابط الخارجية"
    }
    
    val externalLinksSettingHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "在浏览器中打开外部链接"
        AppLanguage.ENGLISH -> "Open external links in browser"
        AppLanguage.ARABIC -> "فتح الروابط الخارجية في المتصفح"
    }
    
    val customUserAgentSuffix: String get() = when (lang) {
        AppLanguage.CHINESE -> "自定义UA后缀"
        AppLanguage.ENGLISH -> "Custom UA Suffix"
        AppLanguage.ARABIC -> "لاحقة وكيل المستخدم المخصصة"
    }
    
    val customUserAgentSuffixHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "附加到User-Agent末尾的字符串"
        AppLanguage.ENGLISH -> "String appended to the end of User-Agent"
        AppLanguage.ARABIC -> "سلسلة مضافة إلى نهاية وكيل المستخدم"
    }
    
    val customUserAgentSuffixPlaceholder: String get() = when (lang) {
        AppLanguage.CHINESE -> "例如: MyApp/1.0"
        AppLanguage.ENGLISH -> "e.g., MyApp/1.0"
        AppLanguage.ARABIC -> "مثال: MyApp/1.0"
    }

    // ==================== 隔离配置选项 ====================
    val fingerprintProtection: String get() = when (lang) {
        AppLanguage.CHINESE -> "指纹防护"
        AppLanguage.ENGLISH -> "Fingerprint Protection"
        AppLanguage.ARABIC -> "حماية البصمة"
    }
    
    val networkProtection: String get() = when (lang) {
        AppLanguage.CHINESE -> "网络防护"
        AppLanguage.ENGLISH -> "Network Protection"
        AppLanguage.ARABIC -> "حماية الشبكة"
    }
    
    val advancedOptions: String get() = when (lang) {
        AppLanguage.CHINESE -> "高级选项"
        AppLanguage.ENGLISH -> "Advanced Options"
        AppLanguage.ARABIC -> "خيارات متقدمة"
    }
    
    val expand: String get() = when (lang) {
        AppLanguage.CHINESE -> "展开"
        AppLanguage.ENGLISH -> "Expand"
        AppLanguage.ARABIC -> "توسيع"
    }
    
    val collapse: String get() = when (lang) {
        AppLanguage.CHINESE -> "收起"
        AppLanguage.ENGLISH -> "Collapse"
        AppLanguage.ARABIC -> "طي"
    }
    
    val custom: String get() = when (lang) {
        AppLanguage.CHINESE -> "自定义"
        AppLanguage.ENGLISH -> "Custom"
        AppLanguage.ARABIC -> "مخصص"
    }
    
    val maximum: String get() = when (lang) {
        AppLanguage.CHINESE -> "最高"
        AppLanguage.ENGLISH -> "Maximum"
        AppLanguage.ARABIC -> "الأقصى"
    }
    
    val full: String get() = when (lang) {
        AppLanguage.CHINESE -> "完全"
        AppLanguage.ENGLISH -> "Full"
        AppLanguage.ARABIC -> "كامل"
    }
    
    val notEnabled: String get() = when (lang) {
        AppLanguage.CHINESE -> "未启用"
        AppLanguage.ENGLISH -> "Not Enabled"
        AppLanguage.ARABIC -> "غير مفعل"
    }
    
    val ipRegion: String get() = when (lang) {
        AppLanguage.CHINESE -> "IP 地区"
        AppLanguage.ENGLISH -> "IP Region"
        AppLanguage.ARABIC -> "منطقة IP"
    }
    
    val supportedCountriesHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "支持：中国、美国、日本、韩国、英国、德国、法国、俄罗斯、巴西、印度、澳大利亚、加拿大、新加坡、香港、台湾、欧洲、亚洲"
        AppLanguage.ENGLISH -> "Supported: China, USA, Japan, Korea, UK, Germany, France, Russia, Brazil, India, Australia, Canada, Singapore, Hong Kong, Taiwan, Europe, Asia"
        AppLanguage.ARABIC -> "مدعوم: الصين، الولايات المتحدة، اليابان، كوريا، المملكة المتحدة، ألمانيا، فرنسا، روسيا، البرازيل، الهند، أستراليا، كندا، سنغافورة، هونغ كونغ، تايوان، أوروبا، آسيا"
    }
    
    val isolationDescription: String get() = when (lang) {
        AppLanguage.CHINESE -> "独立环境为每个应用创建隔离的浏览器环境，包括随机指纹、伪造 Header 和 IP 伪装，可有效防止网站追踪和检测。适用于多开、防关联等场景。"
        AppLanguage.ENGLISH -> "Isolated environment creates a separate browser environment for each app, including random fingerprint, forged headers and IP spoofing, effectively preventing website tracking and detection. Suitable for multi-instance and anti-association scenarios."
        AppLanguage.ARABIC -> "تنشئ البيئة المعزولة بيئة متصفح منفصلة لكل تطبيق، بما في ذلك البصمة العشوائية والرؤوس المزيفة وتزييف IP، مما يمنع بشكل فعال تتبع الموقع والكشف. مناسب لسيناريوهات التشغيل المتعدد ومكافحة الارتباط."
    }
    
    val canvasProtection: String get() = when (lang) {
        AppLanguage.CHINESE -> "Canvas 防护"
        AppLanguage.ENGLISH -> "Canvas Protection"
        AppLanguage.ARABIC -> "حماية Canvas"
    }
    
    val canvasProtectionHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "防止 Canvas 指纹追踪"
        AppLanguage.ENGLISH -> "Prevent Canvas fingerprint tracking"
        AppLanguage.ARABIC -> "منع تتبع بصمة Canvas"
    }
    
    val webglProtection: String get() = when (lang) {
        AppLanguage.CHINESE -> "WebGL 防护"
        AppLanguage.ENGLISH -> "WebGL Protection"
        AppLanguage.ARABIC -> "حماية WebGL"
    }
    
    val webglProtectionHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "伪造 WebGL 渲染器信息"
        AppLanguage.ENGLISH -> "Spoof WebGL renderer information"
        AppLanguage.ARABIC -> "تزييف معلومات عارض WebGL"
    }
    
    val audioProtection: String get() = when (lang) {
        AppLanguage.CHINESE -> "Audio 防护"
        AppLanguage.ENGLISH -> "Audio Protection"
        AppLanguage.ARABIC -> "حماية الصوت"
    }
    
    val audioProtectionHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "防止 AudioContext 指纹"
        AppLanguage.ENGLISH -> "Prevent AudioContext fingerprint"
        AppLanguage.ARABIC -> "منع بصمة AudioContext"
    }
    
    val webrtcProtection: String get() = when (lang) {
        AppLanguage.CHINESE -> "WebRTC 防泄漏"
        AppLanguage.ENGLISH -> "WebRTC Leak Protection"
        AppLanguage.ARABIC -> "حماية تسرب WebRTC"
    }
    
    val webrtcProtectionHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "阻止真实 IP 通过 WebRTC 泄漏"
        AppLanguage.ENGLISH -> "Block real IP leakage through WebRTC"
        AppLanguage.ARABIC -> "منع تسرب IP الحقيقي عبر WebRTC"
    }
    
    val headerSpoofing: String get() = when (lang) {
        AppLanguage.CHINESE -> "Header 伪造"
        AppLanguage.ENGLISH -> "Header Spoofing"
        AppLanguage.ARABIC -> "تزييف الرؤوس"
    }
    
    val headerSpoofingHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "伪造 HTTP 请求头"
        AppLanguage.ENGLISH -> "Spoof HTTP request headers"
        AppLanguage.ARABIC -> "تزييف رؤوس طلبات HTTP"
    }
    
    val ipSpoofing: String get() = when (lang) {
        AppLanguage.CHINESE -> "IP 伪装"
        AppLanguage.ENGLISH -> "IP Spoofing"
        AppLanguage.ARABIC -> "تزييف IP"
    }
    
    val ipSpoofingHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "通过 Header 伪装 IP 地址"
        AppLanguage.ENGLISH -> "Spoof IP address through headers"
        AppLanguage.ARABIC -> "تزييف عنوان IP عبر الرؤوس"
    }
    
    val randomFingerprint: String get() = when (lang) {
        AppLanguage.CHINESE -> "随机指纹"
        AppLanguage.ENGLISH -> "Random Fingerprint"
        AppLanguage.ARABIC -> "بصمة عشوائية"
    }
    
    val randomFingerprintHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "生成随机浏览器指纹"
        AppLanguage.ENGLISH -> "Generate random browser fingerprint"
        AppLanguage.ARABIC -> "إنشاء بصمة متصفح عشوائية"
    }
    
    val fontProtection: String get() = when (lang) {
        AppLanguage.CHINESE -> "字体防护"
        AppLanguage.ENGLISH -> "Font Protection"
        AppLanguage.ARABIC -> "حماية الخطوط"
    }
    
    val fontProtectionHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "防止字体指纹检测"
        AppLanguage.ENGLISH -> "Prevent font fingerprint detection"
        AppLanguage.ARABIC -> "منع اكتشاف بصمة الخطوط"
    }
    
    val storageIsolation: String get() = when (lang) {
        AppLanguage.CHINESE -> "存储隔离"
        AppLanguage.ENGLISH -> "Storage Isolation"
        AppLanguage.ARABIC -> "عزل التخزين"
    }
    
    val storageIsolationHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "独立的 Cookie 和 LocalStorage"
        AppLanguage.ENGLISH -> "Independent Cookie and LocalStorage"
        AppLanguage.ARABIC -> "Cookie و LocalStorage مستقلة"
    }
    
    val timezoneSpoofing: String get() = when (lang) {
        AppLanguage.CHINESE -> "时区伪装"
        AppLanguage.ENGLISH -> "Timezone Spoofing"
        AppLanguage.ARABIC -> "تزييف المنطقة الزمنية"
    }
    
    val timezoneSpoofingHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "伪装系统时区"
        AppLanguage.ENGLISH -> "Spoof system timezone"
        AppLanguage.ARABIC -> "تزييف المنطقة الزمنية للنظام"
    }
    
    val languageSpoofing: String get() = when (lang) {
        AppLanguage.CHINESE -> "语言伪装"
        AppLanguage.ENGLISH -> "Language Spoofing"
        AppLanguage.ARABIC -> "تزييف اللغة"
    }
    
    val languageSpoofingHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "伪装浏览器语言"
        AppLanguage.ENGLISH -> "Spoof browser language"
        AppLanguage.ARABIC -> "تزييف لغة المتصفح"
    }
    
    val resolutionSpoofing: String get() = when (lang) {
        AppLanguage.CHINESE -> "分辨率伪装"
        AppLanguage.ENGLISH -> "Resolution Spoofing"
        AppLanguage.ARABIC -> "تزييف الدقة"
    }
    
    val resolutionSpoofingHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "伪装屏幕分辨率"
        AppLanguage.ENGLISH -> "Spoof screen resolution"
        AppLanguage.ARABIC -> "تزييف دقة الشاشة"
    }
    
    val regenerateOnLaunch: String get() = when (lang) {
        AppLanguage.CHINESE -> "每次启动重新生成"
        AppLanguage.ENGLISH -> "Regenerate on Launch"
        AppLanguage.ARABIC -> "إعادة الإنشاء عند التشغيل"
    }
    
    val regenerateOnLaunchHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "每次启动应用时生成新指纹"
        AppLanguage.ENGLISH -> "Generate new fingerprint on each app launch"
        AppLanguage.ARABIC -> "إنشاء بصمة جديدة في كل تشغيل للتطبيق"
    }

    // ==================== 加密配置选项 ====================
    val configFileEncryption: String get() = when (lang) {
        AppLanguage.CHINESE -> "配置文件"
        AppLanguage.ENGLISH -> "Config File"
        AppLanguage.ARABIC -> "ملف التكوين"
    }
    
    val configFileEncryptionHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "加密 app_config.json"
        AppLanguage.ENGLISH -> "Encrypt app_config.json"
        AppLanguage.ARABIC -> "تشفير app_config.json"
    }
    
    val htmlCssJsEncryption: String get() = when (lang) {
        AppLanguage.CHINESE -> "HTML/CSS/JS"
        AppLanguage.ENGLISH -> "HTML/CSS/JS"
        AppLanguage.ARABIC -> "HTML/CSS/JS"
    }
    
    val htmlCssJsEncryptionHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "加密网页代码文件"
        AppLanguage.ENGLISH -> "Encrypt web code files"
        AppLanguage.ARABIC -> "تشفير ملفات كود الويب"
    }
    
    val mediaFileEncryption: String get() = when (lang) {
        AppLanguage.CHINESE -> "媒体文件"
        AppLanguage.ENGLISH -> "Media Files"
        AppLanguage.ARABIC -> "ملفات الوسائط"
    }
    
    val mediaFileEncryptionHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "加密图片和视频"
        AppLanguage.ENGLISH -> "Encrypt images and videos"
        AppLanguage.ARABIC -> "تشفير الصور ومقاطع الفيديو"
    }
    
    val splashEncryption: String get() = when (lang) {
        AppLanguage.CHINESE -> "启动画面"
        AppLanguage.ENGLISH -> "Splash Screen"
        AppLanguage.ARABIC -> "شاشة البداية"
    }
    
    val splashEncryptionHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "加密启动画面资源"
        AppLanguage.ENGLISH -> "Encrypt splash screen resources"
        AppLanguage.ARABIC -> "تشفير موارد شاشة البداية"
    }
    
    val bgmEncryption: String get() = when (lang) {
        AppLanguage.CHINESE -> "背景音乐"
        AppLanguage.ENGLISH -> "Background Music"
        AppLanguage.ARABIC -> "موسيقى الخلفية"
    }
    
    val bgmEncryptionHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "加密 BGM 文件"
        AppLanguage.ENGLISH -> "Encrypt BGM files"
        AppLanguage.ARABIC -> "تشفير ملفات BGM"
    }
    
    val encryptionStrength: String get() = when (lang) {
        AppLanguage.CHINESE -> "加密强度"
        AppLanguage.ENGLISH -> "Encryption Strength"
        AppLanguage.ARABIC -> "قوة التشفير"
    }
    
    val securityProtection: String get() = when (lang) {
        AppLanguage.CHINESE -> "安全保护"
        AppLanguage.ENGLISH -> "Security Protection"
        AppLanguage.ARABIC -> "الحماية الأمنية"
    }
    
    val integrityCheck: String get() = when (lang) {
        AppLanguage.CHINESE -> "完整性检查"
        AppLanguage.ENGLISH -> "Integrity Check"
        AppLanguage.ARABIC -> "فحص السلامة"
    }
    
    val integrityCheckHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "验证 APK 是否被篡改"
        AppLanguage.ENGLISH -> "Verify if APK has been tampered"
        AppLanguage.ARABIC -> "التحقق مما إذا كان APK قد تم العبث به"
    }
    
    val antiDebugProtection: String get() = when (lang) {
        AppLanguage.CHINESE -> "反调试保护"
        AppLanguage.ENGLISH -> "Anti-Debug Protection"
        AppLanguage.ARABIC -> "حماية مكافحة التصحيح"
    }
    
    val antiDebugProtectionHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "检测并阻止调试器附加"
        AppLanguage.ENGLISH -> "Detect and block debugger attachment"
        AppLanguage.ARABIC -> "اكتشاف ومنع إرفاق المصحح"
    }
    
    val antiTamperProtection: String get() = when (lang) {
        AppLanguage.CHINESE -> "防篡改保护"
        AppLanguage.ENGLISH -> "Anti-Tamper Protection"
        AppLanguage.ARABIC -> "حماية مكافحة العبث"
    }
    
    val antiTamperProtectionHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "检测代码和资源修改"
        AppLanguage.ENGLISH -> "Detect code and resource modifications"
        AppLanguage.ARABIC -> "اكتشاف تعديلات الكود والموارد"
    }
    
    val stringObfuscation: String get() = when (lang) {
        AppLanguage.CHINESE -> "字符串混淆"
        AppLanguage.ENGLISH -> "String Obfuscation"
        AppLanguage.ARABIC -> "تشويش السلاسل"
    }
    
    val stringObfuscationHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "混淆敏感字符串（实验性）"
        AppLanguage.ENGLISH -> "Obfuscate sensitive strings (experimental)"
        AppLanguage.ARABIC -> "تشويش السلاسل الحساسة (تجريبي)"
    }
    
    val securityWarning: String get() = when (lang) {
        AppLanguage.CHINESE -> "安全保护可能影响在模拟器或已 Root 设备上的运行"
        AppLanguage.ENGLISH -> "Security protection may affect running on emulators or rooted devices"
        AppLanguage.ARABIC -> "قد تؤثر الحماية الأمنية على التشغيل على المحاكيات أو الأجهزة ذات صلاحيات الجذر"
    }
    
    val encryptionDescription: String get() = when (lang) {
        AppLanguage.CHINESE -> "加密后的资源无法被直接查看或提取，可有效保护您的代码和内容。加密基于 AES-256-GCM 算法，密钥与应用签名绑定。"
        AppLanguage.ENGLISH -> "Encrypted resources cannot be directly viewed or extracted, effectively protecting your code and content. Encryption is based on AES-256-GCM algorithm, with keys bound to app signature."
        AppLanguage.ARABIC -> "لا يمكن عرض أو استخراج الموارد المشفرة مباشرة، مما يحمي الكود والمحتوى بشكل فعال. يعتمد التشفير على خوارزمية AES-256-GCM، مع ربط المفاتيح بتوقيع التطبيق."
    }
    
    val pbkdf2Iterations: String get() = when (lang) {
        AppLanguage.CHINESE -> "PBKDF2 迭代"
        AppLanguage.ENGLISH -> "PBKDF2 Iterations"
        AppLanguage.ARABIC -> "تكرارات PBKDF2"
    }

    // ==================== 错误恢复操作 ====================
    val retryAction: String get() = when (lang) {
        AppLanguage.CHINESE -> "重试"
        AppLanguage.ENGLISH -> "Retry"
        AppLanguage.ARABIC -> "إعادة المحاولة"
    }
    
    val retryActionHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "重新尝试上一次操作"
        AppLanguage.ENGLISH -> "Retry the last operation"
        AppLanguage.ARABIC -> "إعادة محاولة العملية الأخيرة"
    }
    
    val retryWithDifferentModel: String get() = when (lang) {
        AppLanguage.CHINESE -> "换个模型重试"
        AppLanguage.ENGLISH -> "Retry with Different Model"
        AppLanguage.ARABIC -> "إعادة المحاولة بنموذج مختلف"
    }
    
    val retryWithDifferentModelHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "使用其他 AI 模型重试"
        AppLanguage.ENGLISH -> "Retry using another AI model"
        AppLanguage.ARABIC -> "إعادة المحاولة باستخدام نموذج ذكاء اصطناعي آخر"
    }
    
    val showRawResponse: String get() = when (lang) {
        AppLanguage.CHINESE -> "查看原始响应"
        AppLanguage.ENGLISH -> "Show Raw Response"
        AppLanguage.ARABIC -> "عرض الاستجابة الأصلية"
    }
    
    val showRawResponseHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "显示 AI 返回的原始内容"
        AppLanguage.ENGLISH -> "Show original content returned by AI"
        AppLanguage.ARABIC -> "عرض المحتوى الأصلي الذي أرجعه الذكاء الاصطناعي"
    }
    
    val goToSettings: String get() = when (lang) {
        AppLanguage.CHINESE -> "前往设置"
        AppLanguage.ENGLISH -> "Go to Settings"
        AppLanguage.ARABIC -> "الذهاب إلى الإعدادات"
    }
    
    val goToSettingsHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "检查 API Key 配置"
        AppLanguage.ENGLISH -> "Check API Key configuration"
        AppLanguage.ARABIC -> "التحقق من تكوين مفتاح API"
    }
    
    val manualEdit: String get() = when (lang) {
        AppLanguage.CHINESE -> "手动编辑"
        AppLanguage.ENGLISH -> "Manual Edit"
        AppLanguage.ARABIC -> "التحرير اليدوي"
    }
    
    val manualEditHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "手动修改代码"
        AppLanguage.ENGLISH -> "Manually modify code"
        AppLanguage.ARABIC -> "تعديل الكود يدويًا"
    }
    
    val dismissAction: String get() = when (lang) {
        AppLanguage.CHINESE -> "关闭"
        AppLanguage.ENGLISH -> "Dismiss"
        AppLanguage.ARABIC -> "إغلاق"
    }
    
    val dismissActionHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "关闭错误提示"
        AppLanguage.ENGLISH -> "Dismiss error message"
        AppLanguage.ARABIC -> "إغلاق رسالة الخطأ"
    }

    // ==================== 主题设置预览 ====================
    val lightModePreview: String get() = when (lang) {
        AppLanguage.CHINESE -> "浅色模式"
        AppLanguage.ENGLISH -> "Light Mode"
        AppLanguage.ARABIC -> "الوضع الفاتح"
    }
    
    val darkModePreview: String get() = when (lang) {
        AppLanguage.CHINESE -> "深色模式"
        AppLanguage.ENGLISH -> "Dark Mode"
        AppLanguage.ARABIC -> "الوضع الداكن"
    }

    // ==================== 关于页面 ====================
    val communityGroup: String get() = when (lang) {
        AppLanguage.CHINESE -> "交流群"
        AppLanguage.ENGLISH -> "Community Group"
        AppLanguage.ARABIC -> "مجموعة المجتمع"
    }
    
    val openSourceRepository: String get() = when (lang) {
        AppLanguage.CHINESE -> "开源仓库"
        AppLanguage.ENGLISH -> "Open Source Repository"
        AppLanguage.ARABIC -> "مستودع مفتوح المصدر"
    }
    
    val videoTutorialLabel: String get() = when (lang) {
        AppLanguage.CHINESE -> "视频教程"
        AppLanguage.ENGLISH -> "Video Tutorial"
        AppLanguage.ARABIC -> "فيديو تعليمي"
    }
    
    val okButton: String get() = when (lang) {
        AppLanguage.CHINESE -> "好的"
        AppLanguage.ENGLISH -> "OK"
        AppLanguage.ARABIC -> "حسنًا"
    }
    
    val updateLaterButton: String get() = when (lang) {
        AppLanguage.CHINESE -> "稍后更新"
        AppLanguage.ENGLISH -> "Update Later"
        AppLanguage.ARABIC -> "التحديث لاحقًا"
    }

    // ==================== 前端项目 ====================
    val frameworkLabel: String get() = when (lang) {
        AppLanguage.CHINESE -> "框架"
        AppLanguage.ENGLISH -> "Framework"
        AppLanguage.ARABIC -> "إطار العمل"
    }
    
    val versionLabel: String get() = when (lang) {
        AppLanguage.CHINESE -> "版本"
        AppLanguage.ENGLISH -> "Version"
        AppLanguage.ARABIC -> "الإصدار"
    }
    
    val packageManagerLabel: String get() = when (lang) {
        AppLanguage.CHINESE -> "包管理器"
        AppLanguage.ENGLISH -> "Package Manager"
        AppLanguage.ARABIC -> "مدير الحزم"
    }
    
    val dependencyCountLabel: String get() = when (lang) {
        AppLanguage.CHINESE -> "依赖数量"
        AppLanguage.ENGLISH -> "Dependency Count"
        AppLanguage.ARABIC -> "عدد التبعيات"
    }
    
    val outputDirLabel: String get() = when (lang) {
        AppLanguage.CHINESE -> "输出目录"
        AppLanguage.ENGLISH -> "Output Directory"
        AppLanguage.ARABIC -> "دليل الإخراج"
    }
    
    val dependencyCountValue: String get() = when (lang) {
        AppLanguage.CHINESE -> "%d 个"
        AppLanguage.ENGLISH -> "%d"
        AppLanguage.ARABIC -> "%d"
    }
    
    // ==================== 模块编辑器补充 ====================
    val urlPattern: String get() = when (lang) {
        AppLanguage.CHINESE -> "URL 模式"
        AppLanguage.ENGLISH -> "URL Pattern"
        AppLanguage.ARABIC -> "نمط URL"
    }
    
    val regexExpression: String get() = when (lang) {
        AppLanguage.CHINESE -> "正则表达式"
        AppLanguage.ENGLISH -> "Regular Expression"
        AppLanguage.ARABIC -> "تعبير نمطي"
    }
    
    val excludeRule: String get() = when (lang) {
        AppLanguage.CHINESE -> "排除规则"
        AppLanguage.ENGLISH -> "Exclude Rule"
        AppLanguage.ARABIC -> "قاعدة الاستبعاد"
    }
    
    val noConfigItemsHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "暂无配置项\n添加配置项让用户可以自定义模块行为"
        AppLanguage.ENGLISH -> "No config items yet\nAdd config items to let users customize module behavior"
        AppLanguage.ARABIC -> "لا توجد عناصر تكوين بعد\nأضف عناصر تكوين للسماح للمستخدمين بتخصيص سلوك الوحدة"
    }
    
    val addConfigItem: String get() = when (lang) {
        AppLanguage.CHINESE -> "添加配置项"
        AppLanguage.ENGLISH -> "Add Config Item"
        AppLanguage.ARABIC -> "إضافة عنصر تكوين"
    }
    
    val keyNamePlaceholder: String get() = when (lang) {
        AppLanguage.CHINESE -> "如: fontSize"
        AppLanguage.ENGLISH -> "e.g. fontSize"
        AppLanguage.ARABIC -> "مثال: fontSize"
    }
    
    val displayNamePlaceholder: String get() = when (lang) {
        AppLanguage.CHINESE -> "如: 字体大小"
        AppLanguage.ENGLISH -> "e.g. Font Size"
        AppLanguage.ARABIC -> "مثال: حجم الخط"
    }
    
    val explanationLabel: String get() = when (lang) {
        AppLanguage.CHINESE -> "说明"
        AppLanguage.ENGLISH -> "Description"
        AppLanguage.ARABIC -> "الوصف"
    }
    
    val configExplanationPlaceholder: String get() = when (lang) {
        AppLanguage.CHINESE -> "配置项的说明文字"
        AppLanguage.ENGLISH -> "Description text for the config item"
        AppLanguage.ARABIC -> "نص وصف عنصر التكوين"
    }
    
    val typeLabel: String get() = when (lang) {
        AppLanguage.CHINESE -> "类型"
        AppLanguage.ENGLISH -> "Type"
        AppLanguage.ARABIC -> "النوع"
    }
    
    val defaultValueLabel: String get() = when (lang) {
        AppLanguage.CHINESE -> "默认值"
        AppLanguage.ENGLISH -> "Default Value"
        AppLanguage.ARABIC -> "القيمة الافتراضية"
    }
    
    val requiredField: String get() = when (lang) {
        AppLanguage.CHINESE -> "必填项"
        AppLanguage.ENGLISH -> "Required"
        AppLanguage.ARABIC -> "مطلوب"
    }
    
    val selectTemplate: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择模板"
        AppLanguage.ENGLISH -> "Select Template"
        AppLanguage.ARABIC -> "اختر قالب"
    }
    
    val jsCodePlaceholder: String get() = when (lang) {
        AppLanguage.CHINESE -> "// 在这里编写 JavaScript 代码\nconsole.log('Hello from module!');"
        AppLanguage.ENGLISH -> "// Write JavaScript code here\nconsole.log('Hello from module!');"
        AppLanguage.ARABIC -> "// اكتب كود JavaScript هنا\nconsole.log('Hello from module!');"
    }
    
    val cssCodePlaceholder: String get() = when (lang) {
        AppLanguage.CHINESE -> "/* 在这里编写 CSS 样式 */\n.ad-banner {\n    display: none !important;\n}"
        AppLanguage.ENGLISH -> "/* Write CSS styles here */\n.ad-banner {\n    display: none !important;\n}"
        AppLanguage.ARABIC -> "/* اكتب أنماط CSS هنا */\n.ad-banner {\n    display: none !important;\n}"
    }
    
    // ==================== 关于页面补充 ====================
    val authorTagline: String get() = when (lang) {
        AppLanguage.CHINESE -> "独立开发者 · AI 爱好者"
        AppLanguage.ENGLISH -> "Indie Developer · AI Enthusiast"
        AppLanguage.ARABIC -> "مطور مستقل · متحمس للذكاء الاصطناعي"
    }
    
    val joinCommunityGroup: String get() = when (lang) {
        AppLanguage.CHINESE -> "加入交流群"
        AppLanguage.ENGLISH -> "Join Community"
        AppLanguage.ARABIC -> "انضم إلى المجتمع"
    }
    
    val communityGroupDescription: String get() = when (lang) {
        AppLanguage.CHINESE -> "一起学习进步，获取最新消息 🚀"
        AppLanguage.ENGLISH -> "Learn together, get latest updates 🚀"
        AppLanguage.ARABIC -> "تعلم معًا، احصل على آخر التحديثات 🚀"
    }
    
    val contactAuthorDescription: String get() = when (lang) {
        AppLanguage.CHINESE -> "问题反馈、合作咨询、功能建议 💬"
        AppLanguage.ENGLISH -> "Feedback, collaboration, feature suggestions 💬"
        AppLanguage.ARABIC -> "ملاحظات، تعاون، اقتراحات الميزات 💬"
    }
    
    val welcomeStarSupport: String get() = when (lang) {
        AppLanguage.CHINESE -> "欢迎 Star ⭐ 支持一下！"
        AppLanguage.ENGLISH -> "Welcome to Star ⭐ and support!"
        AppLanguage.ARABIC -> "مرحبًا بك في Star ⭐ والدعم!"
    }
    
    val changelog: String get() = when (lang) {
        AppLanguage.CHINESE -> "更新日志"
        AppLanguage.ENGLISH -> "Changelog"
        AppLanguage.ARABIC -> "سجل التغييرات"
    }
    
    val latestTag: String get() = when (lang) {
        AppLanguage.CHINESE -> "最新"
        AppLanguage.ENGLISH -> "Latest"
        AppLanguage.ARABIC -> "الأحدث"
    }
    
    val newVersionFound: String get() = when (lang) {
        AppLanguage.CHINESE -> "发现新版本"
        AppLanguage.ENGLISH -> "New Version Found"
        AppLanguage.ARABIC -> "تم العثور على إصدار جديد"
    }
    
    val updateRecommendation: String get() = when (lang) {
        AppLanguage.CHINESE -> "建议更新到最新版本以获得更好的体验"
        AppLanguage.ENGLISH -> "Recommend updating to the latest version for better experience"
        AppLanguage.ARABIC -> "يوصى بالتحديث إلى أحدث إصدار للحصول على تجربة أفضل"
    }
    
    val currentVersionIs: String get() = when (lang) {
        AppLanguage.CHINESE -> "当前版本 v%s 已是最新版本"
        AppLanguage.ENGLISH -> "Current version v%s is already the latest"
        AppLanguage.ARABIC -> "الإصدار الحالي v%s هو الأحدث بالفعل"
    }
    
    val openAction: String get() = when (lang) {
        AppLanguage.CHINESE -> "打开"
        AppLanguage.ENGLISH -> "Open"
        AppLanguage.ARABIC -> "فتح"
    }
    
    val qqGroupLabel: String get() = when (lang) {
        AppLanguage.CHINESE -> "QQ 群"
        AppLanguage.ENGLISH -> "QQ Group"
        AppLanguage.ARABIC -> "مجموعة QQ"
    }
    
    val telegramGroupLabel: String get() = when (lang) {
        AppLanguage.CHINESE -> "Telegram 群"
        AppLanguage.ENGLISH -> "Telegram Group"
        AppLanguage.ARABIC -> "مجموعة Telegram"
    }
    
    val exchangeLearningUpdates: String get() = when (lang) {
        AppLanguage.CHINESE -> "交流学习、更新消息"
        AppLanguage.ENGLISH -> "Exchange, learn, get updates"
        AppLanguage.ARABIC -> "تبادل، تعلم، احصل على التحديثات"
    }
    
    val internationalUserGroup: String get() = when (lang) {
        AppLanguage.CHINESE -> "国际用户交流群"
        AppLanguage.ENGLISH -> "International user group"
        AppLanguage.ARABIC -> "مجموعة المستخدمين الدوليين"
    }
    
    val feedbackConsultation: String get() = when (lang) {
        AppLanguage.CHINESE -> "问题反馈、合作咨询"
        AppLanguage.ENGLISH -> "Feedback, consultation"
        AppLanguage.ARABIC -> "ملاحظات، استشارة"
    }
    
    val internationalAccess: String get() = when (lang) {
        AppLanguage.CHINESE -> "国际访问"
        AppLanguage.ENGLISH -> "International access"
        AppLanguage.ARABIC -> "الوصول الدولي"
    }
    
    val domesticDirectFaster: String get() = when (lang) {
        AppLanguage.CHINESE -> "国内直连，访问更快"
        AppLanguage.ENGLISH -> "Direct access in China, faster"
        AppLanguage.ARABIC -> "وصول مباشر في الصين، أسرع"
    }
    
    val authorAvatar: String get() = when (lang) {
        AppLanguage.CHINESE -> "作者头像"
        AppLanguage.ENGLISH -> "Author Avatar"
        AppLanguage.ARABIC -> "صورة المؤلف"
    }
    
    // ==================== AI 模块开发器 ====================
    val aiModuleDeveloperTitle: String get() = when (lang) {
        AppLanguage.CHINESE -> "AI 模块开发"
        AppLanguage.ENGLISH -> "AI Module Developer"
        AppLanguage.ARABIC -> "مطور وحدات AI"
    }
    
    val restart: String get() = when (lang) {
        AppLanguage.CHINESE -> "重新开始"
        AppLanguage.ENGLISH -> "Restart"
        AppLanguage.ARABIC -> "إعادة البدء"
    }
    
    val aiAssistant: String get() = when (lang) {
        AppLanguage.CHINESE -> "AI 模块开发助手"
        AppLanguage.ENGLISH -> "AI Module Development Assistant"
        AppLanguage.ARABIC -> "مساعد تطوير وحدات AI"
    }
    
    val aiAssistantDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "用自然语言描述你想要的功能\nAI 将自动生成扩展模块代码"
        AppLanguage.ENGLISH -> "Describe the feature you want in natural language\nAI will automatically generate extension module code"
        AppLanguage.ARABIC -> "صف الميزة التي تريدها بلغة طبيعية\nسيقوم AI بإنشاء كود وحدة الامتداد تلقائيًا"
    }
    
    val syntaxCheck: String get() = when (lang) {
        AppLanguage.CHINESE -> "语法检查"
        AppLanguage.ENGLISH -> "Syntax Check"
        AppLanguage.ARABIC -> "فحص بناء الجملة"
    }
    
    val securityScan: String get() = when (lang) {
        AppLanguage.CHINESE -> "安全扫描"
        AppLanguage.ENGLISH -> "Security Scan"
        AppLanguage.ARABIC -> "فحص الأمان"
    }
    
    val autoFix: String get() = when (lang) {
        AppLanguage.CHINESE -> "自动修复"
        AppLanguage.ENGLISH -> "Auto Fix"
        AppLanguage.ARABIC -> "إصلاح تلقائي"
    }
    
    val codeTemplate: String get() = when (lang) {
        AppLanguage.CHINESE -> "代码模板"
        AppLanguage.ENGLISH -> "Code Template"
        AppLanguage.ARABIC -> "قالب الكود"
    }
    
    val instantTest: String get() = when (lang) {
        AppLanguage.CHINESE -> "即时测试"
        AppLanguage.ENGLISH -> "Instant Test"
        AppLanguage.ARABIC -> "اختبار فوري"
    }
    
    val tryTheseExamples: String get() = when (lang) {
        AppLanguage.CHINESE -> "试试这些示例"
        AppLanguage.ENGLISH -> "Try these examples"
        AppLanguage.ARABIC -> "جرب هذه الأمثلة"
    }
    
    val exampleBlockAds: String get() = when (lang) {
        AppLanguage.CHINESE -> "屏蔽网页上的广告弹窗和横幅"
        AppLanguage.ENGLISH -> "Block ad popups and banners on web pages"
        AppLanguage.ARABIC -> "حظر النوافذ المنبثقة واللافتات الإعلانية على صفحات الويب"
    }
    
    val exampleDarkMode: String get() = when (lang) {
        AppLanguage.CHINESE -> "为网页添加深色模式"
        AppLanguage.ENGLISH -> "Add dark mode to web pages"
        AppLanguage.ARABIC -> "إضافة الوضع الداكن لصفحات الويب"
    }
    
    val exampleAutoScroll: String get() = when (lang) {
        AppLanguage.CHINESE -> "自动滚动页面，方便阅读长文章"
        AppLanguage.ENGLISH -> "Auto scroll page for reading long articles"
        AppLanguage.ARABIC -> "التمرير التلقائي للصفحة لقراءة المقالات الطويلة"
    }
    
    val exampleUnlockCopy: String get() = when (lang) {
        AppLanguage.CHINESE -> "解除网页的复制限制"
        AppLanguage.ENGLISH -> "Remove copy restrictions on web pages"
        AppLanguage.ARABIC -> "إزالة قيود النسخ على صفحات الويب"
    }
    
    val exampleVideoSpeed: String get() = when (lang) {
        AppLanguage.CHINESE -> "为视频添加倍速播放控制"
        AppLanguage.ENGLISH -> "Add playback speed control for videos"
        AppLanguage.ARABIC -> "إضافة التحكم في سرعة التشغيل للفيديو"
    }
    
    val exampleBackToTop: String get() = when (lang) {
        AppLanguage.CHINESE -> "添加返回顶部悬浮按钮"
        AppLanguage.ENGLISH -> "Add floating back-to-top button"
        AppLanguage.ARABIC -> "إضافة زر عائم للعودة إلى الأعلى"
    }
    
    val statusAnalyzing: String get() = when (lang) {
        AppLanguage.CHINESE -> "分析中"
        AppLanguage.ENGLISH -> "Analyzing"
        AppLanguage.ARABIC -> "جاري التحليل"
    }
    
    val statusPlanning: String get() = when (lang) {
        AppLanguage.CHINESE -> "规划中"
        AppLanguage.ENGLISH -> "Planning"
        AppLanguage.ARABIC -> "جاري التخطيط"
    }
    
    val statusExecuting: String get() = when (lang) {
        AppLanguage.CHINESE -> "执行中"
        AppLanguage.ENGLISH -> "Executing"
        AppLanguage.ARABIC -> "جاري التنفيذ"
    }
    
    val statusGenerating: String get() = when (lang) {
        AppLanguage.CHINESE -> "生成中"
        AppLanguage.ENGLISH -> "Generating"
        AppLanguage.ARABIC -> "جاري الإنشاء"
    }
    
    val statusReviewing: String get() = when (lang) {
        AppLanguage.CHINESE -> "审查中"
        AppLanguage.ENGLISH -> "Reviewing"
        AppLanguage.ARABIC -> "جاري المراجعة"
    }
    
    val statusFixing: String get() = when (lang) {
        AppLanguage.CHINESE -> "修复中"
        AppLanguage.ENGLISH -> "Fixing"
        AppLanguage.ARABIC -> "جاري الإصلاح"
    }
    
    val statusProcessing: String get() = when (lang) {
        AppLanguage.CHINESE -> "处理中"
        AppLanguage.ENGLISH -> "Processing"
        AppLanguage.ARABIC -> "جاري المعالجة"
    }
    
    val statusChecking: String get() = when (lang) {
        AppLanguage.CHINESE -> "检查中"
        AppLanguage.ENGLISH -> "Checking"
        AppLanguage.ARABIC -> "جاري الفحص"
    }
    
    val statusScanning: String get() = when (lang) {
        AppLanguage.CHINESE -> "扫描中"
        AppLanguage.ENGLISH -> "Scanning"
        AppLanguage.ARABIC -> "جاري المسح"
    }
    
    val syntaxCheckingStatus: String get() = when (lang) {
        AppLanguage.CHINESE -> "语法检查中..."
        AppLanguage.ENGLISH -> "Checking syntax..."
        AppLanguage.ARABIC -> "جاري فحص بناء الجملة..."
    }
    
    val fixingIssuesStatus: String get() = when (lang) {
        AppLanguage.CHINESE -> "修复检测到的问题..."
        AppLanguage.ENGLISH -> "Fixing detected issues..."
        AppLanguage.ARABIC -> "جاري إصلاح المشاكل المكتشفة..."
    }
    
    val securityScanningStatus: String get() = when (lang) {
        AppLanguage.CHINESE -> "安全扫描中..."
        AppLanguage.ENGLISH -> "Security scanning..."
        AppLanguage.ARABIC -> "جاري فحص الأمان..."
    }
    
    val codeModifiedHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "代码已修改，保存时将使用修改后的版本"
        AppLanguage.ENGLISH -> "Code modified, the modified version will be used when saving"
        AppLanguage.ARABIC -> "تم تعديل الكود، سيتم استخدام النسخة المعدلة عند الحفظ"
    }
    
    val secureStatus: String get() = when (lang) {
        AppLanguage.CHINESE -> "安全"
        AppLanguage.ENGLISH -> "Secure"
        AppLanguage.ARABIC -> "آمن"
    }
    
    val analyzingRequirements: String get() = when (lang) {
        AppLanguage.CHINESE -> "正在分析需求..."
        AppLanguage.ENGLISH -> "Analyzing requirements..."
        AppLanguage.ARABIC -> "جاري تحليل المتطلبات..."
    }
    
    val planningDevelopment: String get() = when (lang) {
        AppLanguage.CHINESE -> "制定开发计划..."
        AppLanguage.ENGLISH -> "Planning development..."
        AppLanguage.ARABIC -> "جاري تخطيط التطوير..."
    }
    
    val executingToolCalls: String get() = when (lang) {
        AppLanguage.CHINESE -> "执行工具调用..."
        AppLanguage.ENGLISH -> "Executing tool calls..."
        AppLanguage.ARABIC -> "جاري تنفيذ استدعاءات الأدوات..."
    }
    
    val generatingCodeStatus: String get() = when (lang) {
        AppLanguage.CHINESE -> "生成代码中..."
        AppLanguage.ENGLISH -> "Generating code..."
        AppLanguage.ARABIC -> "جاري إنشاء الكود..."
    }
    
    val reviewingCodeQuality: String get() = when (lang) {
        AppLanguage.CHINESE -> "审查代码质量..."
        AppLanguage.ENGLISH -> "Reviewing code quality..."
        AppLanguage.ARABIC -> "جاري مراجعة جودة الكود..."
    }
    
    val fixingDetectedIssues: String get() = when (lang) {
        AppLanguage.CHINESE -> "修复检测到的问题..."
        AppLanguage.ENGLISH -> "Fixing detected issues..."
        AppLanguage.ARABIC -> "جاري إصلاح المشاكل المكتشفة..."
    }
    
    val categoryLabel: String get() = when (lang) {
        AppLanguage.CHINESE -> "分类:"
        AppLanguage.ENGLISH -> "Category:"
        AppLanguage.ARABIC -> "الفئة:"
    }
    
    val autoDetectCategory: String get() = when (lang) {
        AppLanguage.CHINESE -> "🤖 自动识别"
        AppLanguage.ENGLISH -> "🤖 Auto Detect"
        AppLanguage.ARABIC -> "🤖 كشف تلقائي"
    }
    
    val inputPlaceholder: String get() = when (lang) {
        AppLanguage.CHINESE -> "描述你想要的功能，例如：屏蔽网页上的广告弹窗..."
        AppLanguage.ENGLISH -> "Describe the feature you want, e.g.: Block ad popups on web pages..."
        AppLanguage.ARABIC -> "صف الميزة التي تريدها، مثال: حظر النوافذ المنبثقة الإعلانية على صفحات الويب..."
    }
    
    val startDevelopment: String get() = when (lang) {
        AppLanguage.CHINESE -> "开始开发"
        AppLanguage.ENGLISH -> "Start Development"
        AppLanguage.ARABIC -> "بدء التطوير"
    }
    
    // ==================== 背景音乐选择器 ====================
    val selectBgm: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择背景音乐"
        AppLanguage.ENGLISH -> "Select Background Music"
        AppLanguage.ARABIC -> "اختيار موسيقى الخلفية"
    }
    
    val selectedMusic: String get() = when (lang) {
        AppLanguage.CHINESE -> "已选音乐"
        AppLanguage.ENGLISH -> "Selected Music"
        AppLanguage.ARABIC -> "الموسيقى المحددة"
    }
    
    val availableMusic: String get() = when (lang) {
        AppLanguage.CHINESE -> "可用音乐"
        AppLanguage.ENGLISH -> "Available Music"
        AppLanguage.ARABIC -> "الموسيقى المتاحة"
    }
    
    val uploadMusic: String get() = when (lang) {
        AppLanguage.CHINESE -> "上传音乐"
        AppLanguage.ENGLISH -> "Upload Music"
        AppLanguage.ARABIC -> "رفع موسيقى"
    }
    
    val clickArrowToReorder: String get() = when (lang) {
        AppLanguage.CHINESE -> "点击箭头调整顺序"
        AppLanguage.ENGLISH -> "Click arrows to reorder"
        AppLanguage.ARABIC -> "انقر على الأسهم لإعادة الترتيب"
    }
    
    val noMusicAvailable: String get() = when (lang) {
        AppLanguage.CHINESE -> "暂无音乐"
        AppLanguage.ENGLISH -> "No music available"
        AppLanguage.ARABIC -> "لا توجد موسيقى متاحة"
    }
    
    val clickToUploadMusic: String get() = when (lang) {
        AppLanguage.CHINESE -> "点击上方按钮上传音乐"
        AppLanguage.ENGLISH -> "Click button above to upload music"
        AppLanguage.ARABIC -> "انقر على الزر أعلاه لرفع الموسيقى"
    }
    
    val noMusicWithTag: String get() = when (lang) {
        AppLanguage.CHINESE -> "没有此标签的音乐"
        AppLanguage.ENGLISH -> "No music with this tag"
        AppLanguage.ARABIC -> "لا توجد موسيقى بهذه العلامة"
    }
    
    val playMode: String get() = when (lang) {
        AppLanguage.CHINESE -> "播放模式"
        AppLanguage.ENGLISH -> "Play Mode"
        AppLanguage.ARABIC -> "وضع التشغيل"
    }
    
    val loopMode: String get() = when (lang) {
        AppLanguage.CHINESE -> "循环"
        AppLanguage.ENGLISH -> "Loop"
        AppLanguage.ARABIC -> "تكرار"
    }
    
    val sequentialMode: String get() = when (lang) {
        AppLanguage.CHINESE -> "顺序"
        AppLanguage.ENGLISH -> "Sequential"
        AppLanguage.ARABIC -> "تسلسلي"
    }
    
    val shuffleMode: String get() = when (lang) {
        AppLanguage.CHINESE -> "随机"
        AppLanguage.ENGLISH -> "Shuffle"
        AppLanguage.ARABIC -> "عشوائي"
    }
    
    val volume: String get() = when (lang) {
        AppLanguage.CHINESE -> "音量"
        AppLanguage.ENGLISH -> "Volume"
        AppLanguage.ARABIC -> "مستوى الصوت"
    }
    
    val showLyrics: String get() = when (lang) {
        AppLanguage.CHINESE -> "显示歌词"
        AppLanguage.ENGLISH -> "Show Lyrics"
        AppLanguage.ARABIC -> "عرض كلمات الأغنية"
    }
    
    val lyricsTheme: String get() = when (lang) {
        AppLanguage.CHINESE -> "字幕主题"
        AppLanguage.ENGLISH -> "Lyrics Theme"
        AppLanguage.ARABIC -> "سمة كلمات الأغنية"
    }
    
    val allTag: String get() = when (lang) {
        AppLanguage.CHINESE -> "全部"
        AppLanguage.ENGLISH -> "All"
        AppLanguage.ARABIC -> "الكل"
    }
    
    val lyricsSaved: String get() = when (lang) {
        AppLanguage.CHINESE -> "✓ 歌词已保存"
        AppLanguage.ENGLISH -> "✓ Lyrics saved"
        AppLanguage.ARABIC -> "✓ تم حفظ كلمات الأغنية"
    }
    
    // ==================== AI 模块开发器补充 ====================
    val syntaxCorrect: String get() = when (lang) {
        AppLanguage.CHINESE -> "语法正确"
        AppLanguage.ENGLISH -> "Syntax Correct"
        AppLanguage.ARABIC -> "بناء الجملة صحيح"
    }
    
    val safe: String get() = when (lang) {
        AppLanguage.CHINESE -> "安全"
        AppLanguage.ENGLISH -> "Safe"
        AppLanguage.ARABIC -> "آمن"
    }
    
    val moduleGeneratedSuccess: String get() = when (lang) {
        AppLanguage.CHINESE -> "模块生成成功"
        AppLanguage.ENGLISH -> "Module Generated Successfully"
        AppLanguage.ARABIC -> "تم إنشاء الوحدة بنجاح"
    }
    
    val developmentFailed: String get() = when (lang) {
        AppLanguage.CHINESE -> "开发失败"
        AppLanguage.ENGLISH -> "Development Failed"
        AppLanguage.ARABIC -> "فشل التطوير"
    }
    
    val lines: String get() = when (lang) {
        AppLanguage.CHINESE -> "行"
        AppLanguage.ENGLISH -> "lines"
        AppLanguage.ARABIC -> "سطر"
    }
    
    val requirementTips: String get() = when (lang) {
        AppLanguage.CHINESE -> "需求描述技巧"
        AppLanguage.ENGLISH -> "Requirement Description Tips"
        AppLanguage.ARABIC -> "نصائح وصف المتطلبات"
    }
    
    val requirementTipsContent: String get() = when (lang) {
        AppLanguage.CHINESE -> "• 描述具体的功能效果\n• 说明目标网站或页面类型\n• 可以参考示例需求的写法"
        AppLanguage.ENGLISH -> "• Describe specific feature effects\n• Specify target website or page type\n• Refer to example requirements for guidance"
        AppLanguage.ARABIC -> "• صف تأثيرات الميزة المحددة\n• حدد الموقع أو نوع الصفحة المستهدف\n• راجع أمثلة المتطلبات للإرشاد"
    }
    
    val saveModuleTitle: String get() = when (lang) {
        AppLanguage.CHINESE -> "保存模块"
        AppLanguage.ENGLISH -> "Save Module"
        AppLanguage.ARABIC -> "حفظ الوحدة"
    }
    
    val notes: String get() = when (lang) {
        AppLanguage.CHINESE -> "注意事项"
        AppLanguage.ENGLISH -> "Notes"
        AppLanguage.ARABIC -> "ملاحظات"
    }
    
    val notesContent: String get() = when (lang) {
        AppLanguage.CHINESE -> "• 需要配置 AI API 密钥才能使用\n• 复杂功能可能需要多次调整\n• 建议在测试页面验证效果"
        AppLanguage.ENGLISH -> "• AI API key configuration required\n• Complex features may need multiple adjustments\n• Recommend testing on test pages"
        AppLanguage.ARABIC -> "• مطلوب تكوين مفتاح API للذكاء الاصطناعي\n• قد تحتاج الميزات المعقدة إلى تعديلات متعددة\n• يوصى بالاختبار على صفحات الاختبار"
    }
    
    // ==================== 背景音乐补充 ====================
    val previewLyrics: String get() = when (lang) {
        AppLanguage.CHINESE -> "预览歌词"
        AppLanguage.ENGLISH -> "Preview Lyrics"
        AppLanguage.ARABIC -> "معاينة كلمات الأغنية"
    }
    
    val hasLyrics: String get() = when (lang) {
        AppLanguage.CHINESE -> "已有歌词"
        AppLanguage.ENGLISH -> "Has Lyrics"
        AppLanguage.ARABIC -> "يحتوي على كلمات"
    }
    
    val aiGenerateLyrics: String get() = when (lang) {
        AppLanguage.CHINESE -> "AI生成歌词"
        AppLanguage.ENGLISH -> "AI Generate Lyrics"
        AppLanguage.ARABIC -> "إنشاء كلمات بالذكاء الاصطناعي"
    }
    
    val editTags: String get() = when (lang) {
        AppLanguage.CHINESE -> "编辑标签"
        AppLanguage.ENGLISH -> "Edit Tags"
        AppLanguage.ARABIC -> "تعديل العلامات"
    }
    
    val stop: String get() = when (lang) {
        AppLanguage.CHINESE -> "停止"
        AppLanguage.ENGLISH -> "Stop"
        AppLanguage.ARABIC -> "إيقاف"
    }
    
    val moveUp: String get() = when (lang) {
        AppLanguage.CHINESE -> "上移"
        AppLanguage.ENGLISH -> "Move Up"
        AppLanguage.ARABIC -> "نقل لأعلى"
    }
    
    val moveDown: String get() = when (lang) {
        AppLanguage.CHINESE -> "下移"
        AppLanguage.ENGLISH -> "Move Down"
        AppLanguage.ARABIC -> "نقل لأسفل"
    }
    
    val presetMusic: String get() = when (lang) {
        AppLanguage.CHINESE -> "预置音乐"
        AppLanguage.ENGLISH -> "Preset Music"
        AppLanguage.ARABIC -> "موسيقى مسبقة"
    }
    
    val userUploaded: String get() = when (lang) {
        AppLanguage.CHINESE -> "用户上传"
        AppLanguage.ENGLISH -> "User Uploaded"
        AppLanguage.ARABIC -> "رفع المستخدم"
    }
    
    val uploadMusicTitle: String get() = when (lang) {
        AppLanguage.CHINESE -> "上传音乐"
        AppLanguage.ENGLISH -> "Upload Music"
        AppLanguage.ARABIC -> "رفع موسيقى"
    }
    
    val musicName: String get() = when (lang) {
        AppLanguage.CHINESE -> "音乐名称"
        AppLanguage.ENGLISH -> "Music Name"
        AppLanguage.ARABIC -> "اسم الموسيقى"
    }
    
    val selectMusic: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择音乐"
        AppLanguage.ENGLISH -> "Select Music"
        AppLanguage.ARABIC -> "اختيار موسيقى"
    }
    
    val selectCoverOptional: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择封面(可选)"
        AppLanguage.ENGLISH -> "Select Cover (Optional)"
        AppLanguage.ARABIC -> "اختيار غلاف (اختياري)"
    }
    
    val coverTip: String get() = when (lang) {
        AppLanguage.CHINESE -> "提示: 封面图片用于在选择界面展示"
        AppLanguage.ENGLISH -> "Tip: Cover image is displayed in the selection interface"
        AppLanguage.ARABIC -> "تلميح: يتم عرض صورة الغلاف في واجهة الاختيار"
    }
    
    val upload: String get() = when (lang) {
        AppLanguage.CHINESE -> "上传"
        AppLanguage.ENGLISH -> "Upload"
        AppLanguage.ARABIC -> "رفع"
    }
    
    val editTagsTitle: String get() = when (lang) {
        AppLanguage.CHINESE -> "编辑标签"
        AppLanguage.ENGLISH -> "Edit Tags"
        AppLanguage.ARABIC -> "تعديل العلامات"
    }
    
    val selectTagsHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择适合的标签(可多选)"
        AppLanguage.ENGLISH -> "Select suitable tags (multiple selection)"
        AppLanguage.ARABIC -> "اختر العلامات المناسبة (اختيار متعدد)"
    }
    
    val selectLyricsTheme: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择字幕主题"
        AppLanguage.ENGLISH -> "Select Lyrics Theme"
        AppLanguage.ARABIC -> "اختيار سمة كلمات الأغنية"
    }
    
    val selectLyricsThemeHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择歌词显示的视觉风格"
        AppLanguage.ENGLISH -> "Select visual style for lyrics display"
        AppLanguage.ARABIC -> "اختر النمط المرئي لعرض كلمات الأغنية"
    }
    
    val sampleLyricsText: String get() = when (lang) {
        AppLanguage.CHINESE -> "示例歌词文本"
        AppLanguage.ENGLISH -> "Sample Lyrics Text"
        AppLanguage.ARABIC -> "نص كلمات نموذجي"
    }
    
    val lyricsPreview: String get() = when (lang) {
        AppLanguage.CHINESE -> "歌词预览"
        AppLanguage.ENGLISH -> "Lyrics Preview"
        AppLanguage.ARABIC -> "معاينة كلمات الأغنية"
    }
    
    val lyricsUpdated: String get() = when (lang) {
        AppLanguage.CHINESE -> "✓ 歌词已更新"
        AppLanguage.ENGLISH -> "✓ Lyrics updated"
        AppLanguage.ARABIC -> "✓ تم تحديث كلمات الأغنية"
    }
    
    val backward10s: String get() = when (lang) {
        AppLanguage.CHINESE -> "后退10秒"
        AppLanguage.ENGLISH -> "Rewind 10s"
        AppLanguage.ARABIC -> "ترجيع 10 ثوانٍ"
    }
    
    val forward10s: String get() = when (lang) {
        AppLanguage.CHINESE -> "前进10秒"
        AppLanguage.ENGLISH -> "Forward 10s"
        AppLanguage.ARABIC -> "تقديم 10 ثوانٍ"
    }
    
    // ==================== AI 设置页面补充 ====================
    val free: String get() = when (lang) {
        AppLanguage.CHINESE -> "免费"
        AppLanguage.ENGLISH -> "Free"
        AppLanguage.ARABIC -> "مجاني"
    }
    
    val selectedCount: String get() = when (lang) {
        AppLanguage.CHINESE -> "已选 %d 个功能"
        AppLanguage.ENGLISH -> "%d features selected"
        AppLanguage.ARABIC -> "تم اختيار %d ميزات"
    }
    
    val collapseExpand: String get() = when (lang) {
        AppLanguage.CHINESE -> "收起/展开"
        AppLanguage.ENGLISH -> "Collapse/Expand"
        AppLanguage.ARABIC -> "طي/توسيع"
    }
    
    val selectCapabilitiesForFeatures: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择此能力可用于哪些功能："
        AppLanguage.ENGLISH -> "Select which features this capability can be used for:"
        AppLanguage.ARABIC -> "اختر الميزات التي يمكن استخدام هذه القدرة لها:"
    }
    
    val selectAll: String get() = when (lang) {
        AppLanguage.CHINESE -> "全选"
        AppLanguage.ENGLISH -> "Select All"
        AppLanguage.ARABIC -> "تحديد الكل"
    }
    
    // ==================== 更新日志 ====================
    // v1.8.0
    val multiLanguageSupport: String get() = when (lang) {
        AppLanguage.CHINESE -> "多语言支持：中文、英文、阿拉伯语"
        AppLanguage.ENGLISH -> "Multi-language support: Chinese, English, Arabic"
        AppLanguage.ARABIC -> "دعم متعدد اللغات: الصينية والإنجليزية والعربية"
    }
    
    val shareApkFeature: String get() = when (lang) {
        AppLanguage.CHINESE -> "分享APK功能：支持分享已构建的APK文件"
        AppLanguage.ENGLISH -> "Share APK feature: share built APK files"
        AppLanguage.ARABIC -> "ميزة مشاركة APK: مشاركة ملفات APK المبنية"
    }
    
    val elementBlockerModule: String get() = when (lang) {
        AppLanguage.CHINESE -> "元素屏蔽器扩展模块：可视化屏蔽网页元素"
        AppLanguage.ENGLISH -> "Element blocker module: visually block webpage elements"
        AppLanguage.ARABIC -> "وحدة حجب العناصر: حجب عناصر صفحة الويب بصريًا"
    }
    
    val forcedRunFeature: String get() = when (lang) {
        AppLanguage.CHINESE -> "强制运行功能：支持应用强制运行模式"
        AppLanguage.ENGLISH -> "Forced run feature: app forced run mode support"
        AppLanguage.ARABIC -> "ميزة التشغيل القسري: دعم وضع التشغيل القسري للتطبيق"
    }
    
    val linuxOneClickBuild: String get() = when (lang) {
        AppLanguage.CHINESE -> "Linux一键构建前端项目"
        AppLanguage.ENGLISH -> "Linux one-click frontend project build"
        AppLanguage.ARABIC -> "بناء مشروع الواجهة الأمامية بنقرة واحدة على Linux"
    }
    
    val frontendFrameworkToApk: String get() = when (lang) {
        AppLanguage.CHINESE -> "Vue/React/Vite转APK功能"
        AppLanguage.ENGLISH -> "Vue/React/Vite to APK feature"
        AppLanguage.ARABIC -> "ميزة تحويل Vue/React/Vite إلى APK"
    }
    
    val optimizeThemeFeature: String get() = when (lang) {
        AppLanguage.CHINESE -> "优化主题功能"
        AppLanguage.ENGLISH -> "Optimized theme functionality"
        AppLanguage.ARABIC -> "تحسين وظيفة السمة"
    }
    
    val optimizeAboutPageUi: String get() = when (lang) {
        AppLanguage.CHINESE -> "优化关于页面UI"
        AppLanguage.ENGLISH -> "Optimized About page UI"
        AppLanguage.ARABIC -> "تحسين واجهة صفحة حول"
    }
    
    val fixFullscreenStatusBarIssue: String get() = when (lang) {
        AppLanguage.CHINESE -> "修复全屏模式中状态栏问题"
        AppLanguage.ENGLISH -> "Fix status bar issue in fullscreen mode"
        AppLanguage.ARABIC -> "إصلاح مشكلة شريط الحالة في وضع ملء الشاشة"
    }
    
    val fixDeviceCrashIssue: String get() = when (lang) {
        AppLanguage.CHINESE -> "修复部分机型/模拟器闪退问题"
        AppLanguage.ENGLISH -> "Fix crash issue on some devices/emulators"
        AppLanguage.ARABIC -> "إصلاح مشكلة التعطل على بعض الأجهزة/المحاكيات"
    }
    
    // v1.7.7
    val statusBarStyleConfig: String get() = when (lang) {
        AppLanguage.CHINESE -> "状态栏样式配置：自定义高度/背景/透明度"
        AppLanguage.ENGLISH -> "Status bar style config: custom height/background/transparency"
        AppLanguage.ARABIC -> "تكوين نمط شريط الحالة: ارتفاع/خلفية/شفافية مخصصة"
    }
    
    val apkEncryptionProtection: String get() = when (lang) {
        AppLanguage.CHINESE -> "APK加密保护：配置和资源文件加密"
        AppLanguage.ENGLISH -> "APK encryption protection: config and resource file encryption"
        AppLanguage.ARABIC -> "حماية تشفير APK: تشفير ملفات التكوين والموارد"
    }
    
    val bootAutoStartAndScheduled: String get() = when (lang) {
        AppLanguage.CHINESE -> "开机自启动和定时自启动功能"
        AppLanguage.ENGLISH -> "Boot auto-start and scheduled auto-start features"
        AppLanguage.ARABIC -> "ميزات التشغيل التلقائي عند الإقلاع والمجدول"
    }
    
    val dataBackupExportImport: String get() = when (lang) {
        AppLanguage.CHINESE -> "数据备份：一键导出/导入所有数据"
        AppLanguage.ENGLISH -> "Data backup: one-click export/import all data"
        AppLanguage.ARABIC -> "نسخ البيانات احتياطيًا: تصدير/استيراد جميع البيانات بنقرة واحدة"
    }
    
    val fullscreenStatusBarOverlay: String get() = when (lang) {
        AppLanguage.CHINESE -> "全屏模式状态栏透明叠加显示"
        AppLanguage.ENGLISH -> "Fullscreen mode status bar transparent overlay"
        AppLanguage.ARABIC -> "تراكب شفاف لشريط الحالة في وضع ملء الشاشة"
    }
    
    val fullscreenShowStatusBar: String get() = when (lang) {
        AppLanguage.CHINESE -> "全屏模式下可选择显示状态栏"
        AppLanguage.ENGLISH -> "Optional status bar display in fullscreen mode"
        AppLanguage.ARABIC -> "عرض شريط الحالة اختياري في وضع ملء الشاشة"
    }
    
    val fixHtmlLongPressCopy: String get() = when (lang) {
        AppLanguage.CHINESE -> "修复HTML项目长按文字无法复制"
        AppLanguage.ENGLISH -> "Fix HTML project long press text cannot copy"
        AppLanguage.ARABIC -> "إصلاح عدم إمكانية نسخ النص بالضغط المطول في مشروع HTML"
    }
    
    val supportAndroid6: String get() = when (lang) {
        AppLanguage.CHINESE -> "支持Android 6.0系统"
        AppLanguage.ENGLISH -> "Support Android 6.0 system"
        AppLanguage.ARABIC -> "دعم نظام Android 6.0"
    }
    
    val fixHtmlStatusBar: String get() = when (lang) {
        AppLanguage.CHINESE -> "修复HTML应用不显示状态栏的问题"
        AppLanguage.ENGLISH -> "Fix HTML app not showing status bar issue"
        AppLanguage.ARABIC -> "إصلاح مشكلة عدم عرض شريط الحالة في تطبيق HTML"
    }
    
    val fixEmptyAppName: String get() = when (lang) {
        AppLanguage.CHINESE -> "修复部分系统应用名称显示为空"
        AppLanguage.ENGLISH -> "Fix some system app names showing empty"
        AppLanguage.ARABIC -> "إصلاح عرض أسماء بعض تطبيقات النظام فارغة"
    }
    
    val fixAiModuleCodeOverlay: String get() = when (lang) {
        AppLanguage.CHINESE -> "修复AI模块开发代码块内容叠加"
        AppLanguage.ENGLISH -> "Fix AI module development code block content overlay"
        AppLanguage.ARABIC -> "إصلاح تراكب محتوى كتلة الكود في تطوير وحدة AI"
    }
    
    val fixAiHtmlToolCallFailed: String get() = when (lang) {
        AppLanguage.CHINESE -> "修复AI HTML编程工具调用失败"
        AppLanguage.ENGLISH -> "Fix AI HTML coding tool call failed"
        AppLanguage.ARABIC -> "إصلاح فشل استدعاء أداة برمجة AI HTML"
    }
    
    val optimizeAiHtmlPrompt: String get() = when (lang) {
        AppLanguage.CHINESE -> "优化AI HTML编程提示词和模型兼容性"
        AppLanguage.ENGLISH -> "Optimize AI HTML coding prompts and model compatibility"
        AppLanguage.ARABIC -> "تحسين مطالبات برمجة AI HTML وتوافق النموذج"
    }
    
    val statusBarFollowTheme: String get() = when (lang) {
        AppLanguage.CHINESE -> "状态栏颜色跟随主题：默认跟随主题色彩"
        AppLanguage.ENGLISH -> "Status bar color follows theme: default follows theme color"
        AppLanguage.ARABIC -> "لون شريط الحالة يتبع السمة: الافتراضي يتبع لون السمة"
    }
    
    val customStatusBarBgColor: String get() = when (lang) {
        AppLanguage.CHINESE -> "支持自定义状态栏背景颜色"
        AppLanguage.ENGLISH -> "Support custom status bar background color"
        AppLanguage.ARABIC -> "دعم لون خلفية شريط الحالة المخصص"
    }
    
    val fixStatusBarTextVisibility: String get() = when (lang) {
        AppLanguage.CHINESE -> "修复状态栏文字看不清的问题"
        AppLanguage.ENGLISH -> "Fix status bar text visibility issue"
        AppLanguage.ARABIC -> "إصلاح مشكلة رؤية نص شريط الحالة"
    }
    
    val fixJsFileSelectorCompat: String get() = when (lang) {
        AppLanguage.CHINESE -> "修复JS文件选择器兼容性问题"
        AppLanguage.ENGLISH -> "Fix JS file selector compatibility issue"
        AppLanguage.ARABIC -> "إصلاح مشكلة توافق محدد ملفات JS"
    }
    
    val fixVideoFullscreenRotation: String get() = when (lang) {
        AppLanguage.CHINESE -> "修复视频全屏未自动横屏"
        AppLanguage.ENGLISH -> "Fix video fullscreen not auto rotating to landscape"
        AppLanguage.ARABIC -> "إصلاح عدم التدوير التلقائي للفيديو بملء الشاشة إلى الوضع الأفقي"
    }
    
    val fixXhsImageSave: String get() = when (lang) {
        AppLanguage.CHINESE -> "修复小红书等网站图片长按无法保存"
        AppLanguage.ENGLISH -> "Fix Xiaohongshu and similar sites image long press cannot save"
        AppLanguage.ARABIC -> "إصلاح عدم إمكانية حفظ الصور بالضغط المطول في مواقع مثل Xiaohongshu"
    }
    
    val newXhsImageDownloader: String get() = when (lang) {
        AppLanguage.CHINESE -> "新增小红书图片下载器模块"
        AppLanguage.ENGLISH -> "New Xiaohongshu image downloader module"
        AppLanguage.ARABIC -> "وحدة تنزيل صور Xiaohongshu الجديدة"
    }
    
    val fixBlobExportFailed: String get() = when (lang) {
        AppLanguage.CHINESE -> "修复Blob格式文件导出失败"
        AppLanguage.ENGLISH -> "Fix Blob format file export failed"
        AppLanguage.ARABIC -> "إصلاح فشل تصدير ملف بتنسيق Blob"
    }
    
    val fixHtmlCssJsNotWorking: String get() = when (lang) {
        AppLanguage.CHINESE -> "修复HTML项目CSS/JS不生效"
        AppLanguage.ENGLISH -> "Fix HTML project CSS/JS not working"
        AppLanguage.ARABIC -> "إصلاح عدم عمل CSS/JS في مشروع HTML"
    }
    
    val fixTaskListDuplicateName: String get() = when (lang) {
        AppLanguage.CHINESE -> "修复任务列表显示双重名称"
        AppLanguage.ENGLISH -> "Fix task list showing duplicate names"
        AppLanguage.ARABIC -> "إصلاح عرض أسماء مكررة في قائمة المهام"
    }
    
    val fixKnownIssues: String get() = when (lang) {
        AppLanguage.CHINESE -> "修复数十个已知问题"
        AppLanguage.ENGLISH -> "Fix dozens of known issues"
        AppLanguage.ARABIC -> "إصلاح عشرات المشاكل المعروفة"
    }
    
    val optimizeAiAgentArch: String get() = when (lang) {
        AppLanguage.CHINESE -> "优化AI Agent编程架构"
        AppLanguage.ENGLISH -> "Optimize AI Agent programming architecture"
        AppLanguage.ARABIC -> "تحسين بنية برمجة AI Agent"
    }
    
    val extensionModuleSystem: String get() = when (lang) {
        AppLanguage.CHINESE -> "扩展模块系统：类油猴脚本JS/CSS注入"
        AppLanguage.ENGLISH -> "Extension module system: Tampermonkey-like JS/CSS injection"
        AppLanguage.ARABIC -> "نظام وحدات الامتداد: حقن JS/CSS مثل Tampermonkey"
    }
    
    val aiModuleDeveloperAgent: String get() = when (lang) {
        AppLanguage.CHINESE -> "AI模块开发Agent：自然语言生成模块"
        AppLanguage.ENGLISH -> "AI module developer agent: natural language module generation"
        AppLanguage.ARABIC -> "وكيل مطور وحدة AI: إنشاء وحدة باللغة الطبيعية"
    }
    
    val aiIconGeneration: String get() = when (lang) {
        AppLanguage.CHINESE -> "AI图标生成：AI生成应用图标"
        AppLanguage.ENGLISH -> "AI icon generation: AI generates app icons"
        AppLanguage.ARABIC -> "إنشاء أيقونات AI: AI ينشئ أيقونات التطبيق"
    }
    
    val onlineMusicSearch: String get() = when (lang) {
        AppLanguage.CHINESE -> "在线音乐搜索：在线搜索下载BGM"
        AppLanguage.ENGLISH -> "Online music search: search and download BGM online"
        AppLanguage.ARABIC -> "البحث عن الموسيقى عبر الإنترنت: البحث وتنزيل BGM عبر الإنترنت"
    }
    
    val announcementTemplates: String get() = when (lang) {
        AppLanguage.CHINESE -> "公告模板：10种精美公告弹窗模板"
        AppLanguage.ENGLISH -> "Announcement templates: 10 beautiful announcement popup templates"
        AppLanguage.ARABIC -> "قوالب الإعلانات: 10 قوالب منبثقة جميلة للإعلانات"
    }
    
    val webAutoTranslate: String get() = when (lang) {
        AppLanguage.CHINESE -> "网页自动翻译：网页内容自动翻译"
        AppLanguage.ENGLISH -> "Web auto translate: automatic web content translation"
        AppLanguage.ARABIC -> "الترجمة التلقائية للويب: ترجمة محتوى الويب تلقائيًا"
    }
    
    val aiHtmlCoding: String get() = when (lang) {
        AppLanguage.CHINESE -> "AI HTML编程：AI辅助生成代码"
        AppLanguage.ENGLISH -> "AI HTML coding: AI-assisted code generation"
        AppLanguage.ARABIC -> "برمجة AI HTML: إنشاء الكود بمساعدة AI"
    }
    
    val htmlAppFeature: String get() = when (lang) {
        AppLanguage.CHINESE -> "HTML应用：HTML/CSS/JS转独立App"
        AppLanguage.ENGLISH -> "HTML app: convert HTML/CSS/JS to standalone app"
        AppLanguage.ARABIC -> "تطبيق HTML: تحويل HTML/CSS/JS إلى تطبيق مستقل"
    }
    
    val themeSystemFeature: String get() = when (lang) {
        AppLanguage.CHINESE -> "主题系统：多款精美主题+深色模式"
        AppLanguage.ENGLISH -> "Theme system: multiple beautiful themes + dark mode"
        AppLanguage.ARABIC -> "نظام السمات: سمات جميلة متعددة + الوضع الداكن"
    }
    
    val bgmLrcFeature: String get() = when (lang) {
        AppLanguage.CHINESE -> "背景音乐：BGM+LRC歌词同步显示"
        AppLanguage.ENGLISH -> "Background music: BGM + LRC lyrics sync display"
        AppLanguage.ARABIC -> "موسيقى الخلفية: BGM + عرض كلمات LRC متزامن"
    }
    
    val aiSettingsFeature: String get() = when (lang) {
        AppLanguage.CHINESE -> "AI设置：统一管理API密钥和模型"
        AppLanguage.ENGLISH -> "AI settings: unified API key and model management"
        AppLanguage.ARABIC -> "إعدادات AI: إدارة موحدة لمفاتيح API والنماذج"
    }
    
    val mediaAppFeature: String get() = when (lang) {
        AppLanguage.CHINESE -> "媒体应用：图片/视频转独立App"
        AppLanguage.ENGLISH -> "Media app: convert images/videos to standalone app"
        AppLanguage.ARABIC -> "تطبيق الوسائط: تحويل الصور/الفيديو إلى تطبيق مستقل"
    }
    
    val userScriptInjection: String get() = when (lang) {
        AppLanguage.CHINESE -> "用户脚本注入：自定义JS脚本"
        AppLanguage.ENGLISH -> "User script injection: custom JS scripts"
        AppLanguage.ARABIC -> "حقن سكريبت المستخدم: سكريبتات JS مخصصة"
    }
    
    val splashScreenFeature: String get() = when (lang) {
        AppLanguage.CHINESE -> "启动画面：图片/视频启动动画"
        AppLanguage.ENGLISH -> "Splash screen: image/video startup animation"
        AppLanguage.ARABIC -> "شاشة البداية: رسوم متحركة للصور/الفيديو عند البدء"
    }
    
    val videoTrimFeature: String get() = when (lang) {
        AppLanguage.CHINESE -> "视频裁剪：可视化选择视频片段"
        AppLanguage.ENGLISH -> "Video trim: visual video segment selection"
        AppLanguage.ARABIC -> "قص الفيديو: اختيار مقطع الفيديو بصريًا"
    }
    
    val fixShortcutIconError: String get() = when (lang) {
        AppLanguage.CHINESE -> "修复快捷方式图标错误问题"
        AppLanguage.ENGLISH -> "Fix shortcut icon error issue"
        AppLanguage.ARABIC -> "إصلاح مشكلة خطأ أيقونة الاختصار"
    }
    
    val fullscreenModeFeature: String get() = when (lang) {
        AppLanguage.CHINESE -> "全屏模式：隐藏工具栏"
        AppLanguage.ENGLISH -> "Fullscreen mode: hide toolbar"
        AppLanguage.ARABIC -> "وضع ملء الشاشة: إخفاء شريط الأدوات"
    }
    
    val fixApkIconCrop: String get() = when (lang) {
        AppLanguage.CHINESE -> "修复APK图标裁剪问题"
        AppLanguage.ENGLISH -> "Fix APK icon cropping issue"
        AppLanguage.ARABIC -> "إصلاح مشكلة قص أيقونة APK"
    }
    
    val fixReleaseIconNotWorking: String get() = when (lang) {
        AppLanguage.CHINESE -> "修复Release版图标不生效"
        AppLanguage.ENGLISH -> "Fix Release version icon not working"
        AppLanguage.ARABIC -> "إصلاح عدم عمل أيقونة إصدار Release"
    }
    
    val fixApkPackageConflict: String get() = when (lang) {
        AppLanguage.CHINESE -> "修复APK包名/权限冲突"
        AppLanguage.ENGLISH -> "Fix APK package name/permission conflict"
        AppLanguage.ARABIC -> "إصلاح تعارض اسم حزمة/أذونات APK"
    }
    
    val oneClickBuildApk: String get() = when (lang) {
        AppLanguage.CHINESE -> "一键构建独立APK安装包"
        AppLanguage.ENGLISH -> "One-click build standalone APK package"
        AppLanguage.ARABIC -> "بناء حزمة APK مستقلة بنقرة واحدة"
    }
    
    val appModifierFeature: String get() = when (lang) {
        AppLanguage.CHINESE -> "应用修改器：修改图标和名称"
        AppLanguage.ENGLISH -> "App modifier: modify icon and name"
        AppLanguage.ARABIC -> "معدل التطبيق: تعديل الأيقونة والاسم"
    }
    
    val cloneInstallFeature: String get() = when (lang) {
        AppLanguage.CHINESE -> "克隆安装：独立包名克隆应用"
        AppLanguage.ENGLISH -> "Clone install: clone app with independent package name"
        AppLanguage.ARABIC -> "تثبيت النسخ: نسخ التطبيق باسم حزمة مستقل"
    }
    
    val desktopModeFeature: String get() = when (lang) {
        AppLanguage.CHINESE -> "访问电脑版：强制桌面模式"
        AppLanguage.ENGLISH -> "Desktop mode: force desktop version"
        AppLanguage.ARABIC -> "وضع سطح المكتب: فرض إصدار سطح المكتب"
    }
    
    // ==================== 错误消息 ====================
    
    // ==================== 更新检查 ====================
    
    val networkRequestFailed: String get() = when (lang) {
        AppLanguage.CHINESE -> "网络请求失败"
        AppLanguage.ENGLISH -> "Network request failed"
        AppLanguage.ARABIC -> "فشل طلب الشبكة"
    }
    
    val versionInfoNotFound: String get() = when (lang) {
        AppLanguage.CHINESE -> "未找到版本信息"
        AppLanguage.ENGLISH -> "Version info not found"
        AppLanguage.ARABIC -> "لم يتم العثور على معلومات الإصدار"
    }
    
    val webToAppUpdate: String get() = when (lang) {
        AppLanguage.CHINESE -> "WebToApp 更新"
        AppLanguage.ENGLISH -> "WebToApp Update"
        AppLanguage.ARABIC -> "تحديث WebToApp"
    }
    
    val downloadingVersion: String get() = when (lang) {
        AppLanguage.CHINESE -> "正在下载 %s ..."
        AppLanguage.ENGLISH -> "Downloading %s ..."
        AppLanguage.ARABIC -> "جاري تنزيل %s ..."
    }
    
    // ==================== 图标库 ====================
    val aiIcon: String get() = when (lang) {
        AppLanguage.CHINESE -> "AI图标"
        AppLanguage.ENGLISH -> "AI Icon"
        AppLanguage.ARABIC -> "أيقونة AI"
    }
    
    val icon: String get() = when (lang) {
        AppLanguage.CHINESE -> "图标"
        AppLanguage.ENGLISH -> "Icon"
        AppLanguage.ARABIC -> "أيقونة"
    }
    
    // ==================== AI 模块开发 ====================
    val aiModuleDevelopment: String get() = when (lang) {
        AppLanguage.CHINESE -> "AI 模块开发"
        AppLanguage.ENGLISH -> "AI Module Development"
        AppLanguage.ARABIC -> "تطوير وحدة AI"
    }
    
    // ==================== 可用于功能 ====================
    val availableFor: String get() = when (lang) {
        AppLanguage.CHINESE -> "可用于"
        AppLanguage.ENGLISH -> "Available for"
        AppLanguage.ARABIC -> "متاح لـ"
    }
    
    // ==================== 更新日志补充 ====================
    val materialDesign3UI: String get() = when (lang) {
        AppLanguage.CHINESE -> "Material Design 3 界面"
        AppLanguage.ENGLISH -> "Material Design 3 UI"
        AppLanguage.ARABIC -> "واجهة Material Design 3"
    }
    
    val initialVersionRelease: String get() = when (lang) {
        AppLanguage.CHINESE -> "初始版本发布"
        AppLanguage.ENGLISH -> "Initial version release"
        AppLanguage.ARABIC -> "إصدار النسخة الأولية"
    }
    
    val urlToShortcutBasic: String get() = when (lang) {
        AppLanguage.CHINESE -> "URL转快捷方式基本功能"
        AppLanguage.ENGLISH -> "URL to shortcut basic functionality"
        AppLanguage.ARABIC -> "وظيفة تحويل URL إلى اختصار الأساسية"
    }
    
    val activationCodeAnnouncementAdBlock: String get() = when (lang) {
        AppLanguage.CHINESE -> "激活码/公告/广告拦截"
        AppLanguage.ENGLISH -> "Activation code/Announcement/Ad blocking"
        AppLanguage.ARABIC -> "رمز التفعيل/الإعلانات/حظر الإعلانات"
    }
    
    // ==================== 媒体保存 ====================
    
    val savedToGallery: String get() = when (lang) {
        AppLanguage.CHINESE -> "%s已保存到相册"
        AppLanguage.ENGLISH -> "%s saved to gallery"
        AppLanguage.ARABIC -> "تم حفظ %s في المعرض"
    }
    
    // ==================== 代码块库 ====================
    val codeBlockLibrary: String get() = when (lang) {
        AppLanguage.CHINESE -> "代码块库"
        AppLanguage.ENGLISH -> "Code Block Library"
        AppLanguage.ARABIC -> "مكتبة كتل الكود"
    }
    
    val searchCodeBlocks: String get() = when (lang) {
        AppLanguage.CHINESE -> "搜索代码块..."
        AppLanguage.ENGLISH -> "Search code blocks..."
        AppLanguage.ARABIC -> "البحث عن كتل الكود..."
    }
    
    val hotTag: String get() = when (lang) {
        AppLanguage.CHINESE -> "🔥 热门"
        AppLanguage.ENGLISH -> "🔥 Hot"
        AppLanguage.ARABIC -> "🔥 شائع"
    }
    
    val insertCode: String get() = when (lang) {
        AppLanguage.CHINESE -> "插入代码"
        AppLanguage.ENGLISH -> "Insert Code"
        AppLanguage.ARABIC -> "إدراج الكود"
    }
    
    val browseAll: String get() = when (lang) {
        AppLanguage.CHINESE -> "浏览全部"
        AppLanguage.ENGLISH -> "Browse All"
        AppLanguage.ARABIC -> "تصفح الكل"
    }
    
    // ==================== 模块测试 ====================
    
    val enterSchemeName: String get() = when (lang) {
        AppLanguage.CHINESE -> "输入方案名称"
        AppLanguage.ENGLISH -> "Enter scheme name"
        AppLanguage.ARABIC -> "أدخل اسم المخطط"
    }
    
    val briefDescribeScheme: String get() = when (lang) {
        AppLanguage.CHINESE -> "简要描述方案用途"
        AppLanguage.ENGLISH -> "Briefly describe scheme purpose"
        AppLanguage.ARABIC -> "وصف موجز لغرض المخطط"
    }
    
    // ==================== 激活相关 ====================
    val pleaseActivateApp: String get() = when (lang) {
        AppLanguage.CHINESE -> "请先激活应用"
        AppLanguage.ENGLISH -> "Please activate the app first"
        AppLanguage.ARABIC -> "يرجى تفعيل التطبيق أولاً"
    }
    
    val enterActivationCode: String get() = when (lang) {
        AppLanguage.CHINESE -> "输入激活码"
        AppLanguage.ENGLISH -> "Enter Activation Code"
        AppLanguage.ARABIC -> "أدخل رمز التفعيل"
    }
    
    val enterCodeToContinue: String get() = when (lang) {
        AppLanguage.CHINESE -> "请输入激活码以继续使用"
        AppLanguage.ENGLISH -> "Please enter activation code to continue"
        AppLanguage.ARABIC -> "يرجى إدخال رمز التفعيل للمتابعة"
    }
    
    // ==================== 数据备份 ====================
    
    // ==================== 自动启动 ====================
    val startTime: String get() = when (lang) {
        AppLanguage.CHINESE -> "启动时间"
        AppLanguage.ENGLISH -> "Start Time"
        AppLanguage.ARABIC -> "وقت البدء"
    }
    
    val selectStartTime: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择启动时间"
        AppLanguage.ENGLISH -> "Select Start Time"
        AppLanguage.ARABIC -> "اختيار وقت البدء"
    }
    
    // ==================== LRC编辑器 ====================
    
    // ==================== 主题相关 ====================
    val themeAurora: String get() = when (lang) {
        AppLanguage.CHINESE -> "极光梦境"
        AppLanguage.ENGLISH -> "Aurora Dreams"
        AppLanguage.ARABIC -> "أحلام الشفق القطبي"
    }
    
    val themeAuroraDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "北极光般流动的梦幻渐变，如置身极地夜空"
        AppLanguage.ENGLISH -> "Flowing aurora-like gradients, like being in the polar night sky"
        AppLanguage.ARABIC -> "تدرجات متدفقة مثل الشفق القطبي، كأنك في سماء القطب الليلية"
    }
    
    val themeCyberpunk: String get() = when (lang) {
        AppLanguage.CHINESE -> "赛博霓虹"
        AppLanguage.ENGLISH -> "Cyber Neon"
        AppLanguage.ARABIC -> "نيون سايبر"
    }
    
    val themeCyberpunkDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "霓虹闪烁的未来都市，科技与叛逆的交融"
        AppLanguage.ENGLISH -> "Neon-lit future city, fusion of tech and rebellion"
        AppLanguage.ARABIC -> "مدينة المستقبل المضاءة بالنيون، اندماج التكنولوجيا والتمرد"
    }
    
    val themeSakura: String get() = when (lang) {
        AppLanguage.CHINESE -> "樱花物语"
        AppLanguage.ENGLISH -> "Sakura Story"
        AppLanguage.ARABIC -> "قصة الساكورا"
    }
    
    val themeSakuraDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "粉色花瓣轻舞飞扬，日式和风的诗意美学"
        AppLanguage.ENGLISH -> "Pink petals dancing gracefully, Japanese poetic aesthetics"
        AppLanguage.ARABIC -> "بتلات وردية ترقص برشاقة، جماليات شعرية يابانية"
    }
    
    val themeOcean: String get() = when (lang) {
        AppLanguage.CHINESE -> "深海幽蓝"
        AppLanguage.ENGLISH -> "Deep Ocean Blue"
        AppLanguage.ARABIC -> "أزرق المحيط العميق"
    }
    
    val themeOceanDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "海洋深处的神秘光芒，波光粼粼的宁静"
        AppLanguage.ENGLISH -> "Mysterious glow from ocean depths, sparkling tranquility"
        AppLanguage.ARABIC -> "توهج غامض من أعماق المحيط، هدوء متلألئ"
    }
    
    val themeForest: String get() = when (lang) {
        AppLanguage.CHINESE -> "森林晨曦"
        AppLanguage.ENGLISH -> "Forest Dawn"
        AppLanguage.ARABIC -> "فجر الغابة"
    }
    
    val themeForestDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "阳光穿透树叶的斑驳，大自然的清新呼吸"
        AppLanguage.ENGLISH -> "Sunlight filtering through leaves, nature's fresh breath"
        AppLanguage.ARABIC -> "ضوء الشمس يتسلل عبر الأوراق، نفس الطبيعة المنعش"
    }
    
    val themeGalaxy: String get() = when (lang) {
        AppLanguage.CHINESE -> "星空银河"
        AppLanguage.ENGLISH -> "Galaxy Stars"
        AppLanguage.ARABIC -> "نجوم المجرة"
    }
    
    val themeGalaxyDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "浩瀚宇宙的璀璨星河，无垠深空的浪漫"
        AppLanguage.ENGLISH -> "Brilliant galaxy of vast universe, romance of infinite space"
        AppLanguage.ARABIC -> "مجرة رائعة من الكون الشاسع، رومانسية الفضاء اللانهائي"
    }
    
    val themeVolcano: String get() = when (lang) {
        AppLanguage.CHINESE -> "熔岩之心"
        AppLanguage.ENGLISH -> "Lava Heart"
        AppLanguage.ARABIC -> "قلب الحمم"
    }
    
    val themeVolcanoDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "岩浆奔涌的炽热能量，燃烧的生命力"
        AppLanguage.ENGLISH -> "Scorching energy of flowing lava, burning vitality"
        AppLanguage.ARABIC -> "طاقة حارقة من الحمم المتدفقة، حيوية مشتعلة"
    }
    
    val themeFrost: String get() = when (lang) {
        AppLanguage.CHINESE -> "冰晶之境"
        AppLanguage.ENGLISH -> "Frost Crystal"
        AppLanguage.ARABIC -> "بلورة الصقيع"
    }
    
    val themeFrostDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "冰雪世界的纯净光辉，晶莹剔透的优雅"
        AppLanguage.ENGLISH -> "Pure radiance of ice world, crystal clear elegance"
        AppLanguage.ARABIC -> "إشراق نقي لعالم الجليد، أناقة بلورية صافية"
    }
    
    val themeSunset: String get() = when (lang) {
        AppLanguage.CHINESE -> "紫金黄昏"
        AppLanguage.ENGLISH -> "Purple Gold Sunset"
        AppLanguage.ARABIC -> "غروب ذهبي بنفسجي"
    }
    
    val themeSunsetDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "落日余晖的温暖拥抱，黄昏时分的诗意"
        AppLanguage.ENGLISH -> "Warm embrace of sunset glow, poetry of twilight"
        AppLanguage.ARABIC -> "عناق دافئ لتوهج الغروب، شعر الشفق"
    }
    
    val themeMinimal: String get() = when (lang) {
        AppLanguage.CHINESE -> "极简主义"
        AppLanguage.ENGLISH -> "Minimalism"
        AppLanguage.ARABIC -> "البساطة"
    }
    
    val themeMinimalDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "去繁就简的纯粹美学，精致细节的禅意"
        AppLanguage.ENGLISH -> "Pure aesthetics of simplicity, zen of refined details"
        AppLanguage.ARABIC -> "جماليات نقية للبساطة، زن التفاصيل المصقولة"
    }
    
    val themeNeonTokyo: String get() = when (lang) {
        AppLanguage.CHINESE -> "东京霓虹"
        AppLanguage.ENGLISH -> "Tokyo Neon"
        AppLanguage.ARABIC -> "نيون طوكيو"
    }
    
    val themeNeonTokyoDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "雨夜东京的霓虹倒影，赛博朋克的浪漫"
        AppLanguage.ENGLISH -> "Neon reflections of rainy Tokyo night, cyberpunk romance"
        AppLanguage.ARABIC -> "انعكاسات النيون لليلة طوكيو الممطرة، رومانسية سايبربانك"
    }
    
    val themeLavender: String get() = when (lang) {
        AppLanguage.CHINESE -> "薰衣草田"
        AppLanguage.ENGLISH -> "Lavender Field"
        AppLanguage.ARABIC -> "حقل اللافندر"
    }
    
    val themeLavenderDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "普罗旺斯的紫色海洋，芬芳宁静的治愈"
        AppLanguage.ENGLISH -> "Purple ocean of Provence, fragrant and peaceful healing"
        AppLanguage.ARABIC -> "محيط بنفسجي من بروفانس، شفاء عطري وهادئ"
    }
    
    // ==================== 动画风格 ====================
    val animSmooth: String get() = when (lang) {
        AppLanguage.CHINESE -> "丝滑流畅"
        AppLanguage.ENGLISH -> "Smooth"
        AppLanguage.ARABIC -> "سلس"
    }
    
    val animBouncy: String get() = when (lang) {
        AppLanguage.CHINESE -> "弹性活力"
        AppLanguage.ENGLISH -> "Bouncy"
        AppLanguage.ARABIC -> "مرن"
    }
    
    val animSnappy: String get() = when (lang) {
        AppLanguage.CHINESE -> "干脆利落"
        AppLanguage.ENGLISH -> "Snappy"
        AppLanguage.ARABIC -> "سريع"
    }
    
    val animElegant: String get() = when (lang) {
        AppLanguage.CHINESE -> "优雅缓慢"
        AppLanguage.ENGLISH -> "Elegant"
        AppLanguage.ARABIC -> "أنيق"
    }
    
    val animPlayful: String get() = when (lang) {
        AppLanguage.CHINESE -> "俏皮跳跃"
        AppLanguage.ENGLISH -> "Playful"
        AppLanguage.ARABIC -> "مرح"
    }
    
    val animDramatic: String get() = when (lang) {
        AppLanguage.CHINESE -> "戏剧张力"
        AppLanguage.ENGLISH -> "Dramatic"
        AppLanguage.ARABIC -> "درامي"
    }
    
    // ==================== 交互风格 ====================
    val interRipple: String get() = when (lang) {
        AppLanguage.CHINESE -> "水波涟漪"
        AppLanguage.ENGLISH -> "Ripple"
        AppLanguage.ARABIC -> "تموج"
    }
    
    val interGlow: String get() = when (lang) {
        AppLanguage.CHINESE -> "光晕扩散"
        AppLanguage.ENGLISH -> "Glow"
        AppLanguage.ARABIC -> "توهج"
    }
    
    val interScale: String get() = when (lang) {
        AppLanguage.CHINESE -> "缩放脉冲"
        AppLanguage.ENGLISH -> "Scale"
        AppLanguage.ARABIC -> "تكبير"
    }
    
    val interShake: String get() = when (lang) {
        AppLanguage.CHINESE -> "微震反馈"
        AppLanguage.ENGLISH -> "Shake"
        AppLanguage.ARABIC -> "اهتزاز"
    }
    
    val interMorph: String get() = when (lang) {
        AppLanguage.CHINESE -> "形态变换"
        AppLanguage.ENGLISH -> "Morph"
        AppLanguage.ARABIC -> "تحول"
    }
    
    val interParticle: String get() = when (lang) {
        AppLanguage.CHINESE -> "粒子迸发"
        AppLanguage.ENGLISH -> "Particle"
        AppLanguage.ARABIC -> "جسيمات"
    }
    
    // ==================== 模块分类 ====================
    val catContentFilter: String get() = when (lang) {
        AppLanguage.CHINESE -> "内容过滤"
        AppLanguage.ENGLISH -> "Content Filter"
        AppLanguage.ARABIC -> "تصفية المحتوى"
    }
    val catContentFilterDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "屏蔽元素、广告过滤、内容隐藏"
        AppLanguage.ENGLISH -> "Block elements, ad filtering, content hiding"
        AppLanguage.ARABIC -> "حظر العناصر، تصفية الإعلانات، إخفاء المحتوى"
    }
    val catContentEnhance: String get() = when (lang) {
        AppLanguage.CHINESE -> "内容增强"
        AppLanguage.ENGLISH -> "Content Enhance"
        AppLanguage.ARABIC -> "تحسين المحتوى"
    }
    val catContentEnhanceDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "内容优化、排版美化、阅读增强"
        AppLanguage.ENGLISH -> "Content optimization, typography beautification, reading enhancement"
        AppLanguage.ARABIC -> "تحسين المحتوى، تجميل التخطيط، تحسين القراءة"
    }
    val catStyleModifier: String get() = when (lang) {
        AppLanguage.CHINESE -> "样式修改"
        AppLanguage.ENGLISH -> "Style Modifier"
        AppLanguage.ARABIC -> "معدل الأنماط"
    }
    val catStyleModifierDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "自定义CSS、主题美化、界面调整"
        AppLanguage.ENGLISH -> "Custom CSS, theme beautification, interface adjustment"
        AppLanguage.ARABIC -> "CSS مخصص، تجميل السمة، تعديل الواجهة"
    }
    val catTheme: String get() = when (lang) {
        AppLanguage.CHINESE -> "主题美化"
        AppLanguage.ENGLISH -> "Theme"
        AppLanguage.ARABIC -> "السمة"
    }
    val catThemeDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "深色模式、配色方案、字体替换"
        AppLanguage.ENGLISH -> "Dark mode, color schemes, font replacement"
        AppLanguage.ARABIC -> "الوضع الداكن، مخططات الألوان، استبدال الخط"
    }
    val catFunctionEnhance: String get() = when (lang) {
        AppLanguage.CHINESE -> "功能增强"
        AppLanguage.ENGLISH -> "Function Enhance"
        AppLanguage.ARABIC -> "تحسين الوظائف"
    }
    val catFunctionEnhanceDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "自动化操作、快捷功能、效率工具"
        AppLanguage.ENGLISH -> "Automation, shortcuts, efficiency tools"
        AppLanguage.ARABIC -> "الأتمتة، الاختصارات، أدوات الكفاءة"
    }
    val catAutomation: String get() = when (lang) {
        AppLanguage.CHINESE -> "自动化"
        AppLanguage.ENGLISH -> "Automation"
        AppLanguage.ARABIC -> "الأتمتة"
    }
    val catAutomationDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "自动点击、自动填表、定时任务"
        AppLanguage.ENGLISH -> "Auto click, auto fill, scheduled tasks"
        AppLanguage.ARABIC -> "النقر التلقائي، الملء التلقائي، المهام المجدولة"
    }
    val catNavigation: String get() = when (lang) {
        AppLanguage.CHINESE -> "导航辅助"
        AppLanguage.ENGLISH -> "Navigation"
        AppLanguage.ARABIC -> "المساعدة في التنقل"
    }
    val catNavigationDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "返回顶部、快速跳转、页面导航"
        AppLanguage.ENGLISH -> "Back to top, quick jump, page navigation"
        AppLanguage.ARABIC -> "العودة للأعلى، القفز السريع، التنقل بين الصفحات"
    }
    val catDataExtract: String get() = when (lang) {
        AppLanguage.CHINESE -> "数据提取"
        AppLanguage.ENGLISH -> "Data Extract"
        AppLanguage.ARABIC -> "استخراج البيانات"
    }
    val catDataExtractDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "内容抓取、数据导出、信息收集"
        AppLanguage.ENGLISH -> "Content scraping, data export, info collection"
        AppLanguage.ARABIC -> "استخراج المحتوى، تصدير البيانات، جمع المعلومات"
    }
    val catDataSave: String get() = when (lang) {
        AppLanguage.CHINESE -> "数据保存"
        AppLanguage.ENGLISH -> "Data Save"
        AppLanguage.ARABIC -> "حفظ البيانات"
    }
    val catDataSaveDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "页面保存、截图、内容导出"
        AppLanguage.ENGLISH -> "Page save, screenshot, content export"
        AppLanguage.ARABIC -> "حفظ الصفحة، لقطة الشاشة، تصدير المحتوى"
    }
    val catInteraction: String get() = when (lang) {
        AppLanguage.CHINESE -> "交互增强"
        AppLanguage.ENGLISH -> "Interaction"
        AppLanguage.ARABIC -> "تحسين التفاعل"
    }
    val catInteractionDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "手势操作、快捷键、自动填表"
        AppLanguage.ENGLISH -> "Gestures, shortcuts, auto fill"
        AppLanguage.ARABIC -> "الإيماءات، الاختصارات، الملء التلقائي"
    }
    val catAccessibility: String get() = when (lang) {
        AppLanguage.CHINESE -> "无障碍"
        AppLanguage.ENGLISH -> "Accessibility"
        AppLanguage.ARABIC -> "إمكانية الوصول"
    }
    val catAccessibilityDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "辅助阅读、语音朗读、高对比度"
        AppLanguage.ENGLISH -> "Assistive reading, text-to-speech, high contrast"
        AppLanguage.ARABIC -> "القراءة المساعدة، تحويل النص إلى كلام، التباين العالي"
    }
    val catMedia: String get() = when (lang) {
        AppLanguage.CHINESE -> "媒体处理"
        AppLanguage.ENGLISH -> "Media"
        AppLanguage.ARABIC -> "معالجة الوسائط"
    }
    val catMediaDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "视频增强、图片处理、音频控制"
        AppLanguage.ENGLISH -> "Video enhance, image processing, audio control"
        AppLanguage.ARABIC -> "تحسين الفيديو، معالجة الصور، التحكم في الصوت"
    }
    val catVideo: String get() = when (lang) {
        AppLanguage.CHINESE -> "视频增强"
        AppLanguage.ENGLISH -> "Video"
        AppLanguage.ARABIC -> "تحسين الفيديو"
    }
    val catVideoDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "倍速播放、画中画、视频下载"
        AppLanguage.ENGLISH -> "Speed control, PiP, video download"
        AppLanguage.ARABIC -> "التحكم في السرعة، صورة في صورة، تنزيل الفيديو"
    }
    val catImage: String get() = when (lang) {
        AppLanguage.CHINESE -> "图片处理"
        AppLanguage.ENGLISH -> "Image"
        AppLanguage.ARABIC -> "معالجة الصور"
    }
    val catImageDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "图片放大、批量下载、懒加载"
        AppLanguage.ENGLISH -> "Image zoom, batch download, lazy load"
        AppLanguage.ARABIC -> "تكبير الصور، التنزيل الدفعي، التحميل الكسول"
    }
    val catAudio: String get() = when (lang) {
        AppLanguage.CHINESE -> "音频控制"
        AppLanguage.ENGLISH -> "Audio"
        AppLanguage.ARABIC -> "التحكم في الصوت"
    }
    val catAudioDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "音量控制、音频提取、播放增强"
        AppLanguage.ENGLISH -> "Volume control, audio extract, playback enhance"
        AppLanguage.ARABIC -> "التحكم في الصوت، استخراج الصوت، تحسين التشغيل"
    }
    val catSecurity: String get() = when (lang) {
        AppLanguage.CHINESE -> "安全隐私"
        AppLanguage.ENGLISH -> "Security"
        AppLanguage.ARABIC -> "الأمان والخصوصية"
    }
    val catSecurityDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "隐私保护、指纹防护、追踪拦截"
        AppLanguage.ENGLISH -> "Privacy protection, fingerprint defense, tracking block"
        AppLanguage.ARABIC -> "حماية الخصوصية، الدفاع عن البصمات، حظر التتبع"
    }
    val catAntiTracking: String get() = when (lang) {
        AppLanguage.CHINESE -> "反追踪"
        AppLanguage.ENGLISH -> "Anti-Tracking"
        AppLanguage.ARABIC -> "مكافحة التتبع"
    }
    val catAntiTrackingDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "阻止追踪、Cookie管理、隐私模式"
        AppLanguage.ENGLISH -> "Block tracking, cookie management, privacy mode"
        AppLanguage.ARABIC -> "حظر التتبع، إدارة الكوكيز، وضع الخصوصية"
    }
    val catSocial: String get() = when (lang) {
        AppLanguage.CHINESE -> "社交增强"
        AppLanguage.ENGLISH -> "Social"
        AppLanguage.ARABIC -> "تحسين التواصل الاجتماعي"
    }
    val catSocialDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "评论过滤、社交优化、消息增强"
        AppLanguage.ENGLISH -> "Comment filter, social optimization, message enhance"
        AppLanguage.ARABIC -> "تصفية التعليقات، تحسين التواصل، تحسين الرسائل"
    }
    val catShopping: String get() = when (lang) {
        AppLanguage.CHINESE -> "购物助手"
        AppLanguage.ENGLISH -> "Shopping"
        AppLanguage.ARABIC -> "مساعد التسوق"
    }
    val catShoppingDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "比价工具、优惠提醒、历史价格"
        AppLanguage.ENGLISH -> "Price compare, deal alerts, price history"
        AppLanguage.ARABIC -> "مقارنة الأسعار، تنبيهات العروض، سجل الأسعار"
    }
    val catReading: String get() = when (lang) {
        AppLanguage.CHINESE -> "阅读模式"
        AppLanguage.ENGLISH -> "Reading"
        AppLanguage.ARABIC -> "وضع القراءة"
    }
    val catReadingDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "正文提取、排版优化、护眼模式"
        AppLanguage.ENGLISH -> "Content extract, typography, eye care mode"
        AppLanguage.ARABIC -> "استخراج المحتوى، التخطيط، وضع حماية العين"
    }
    val catTranslate: String get() = when (lang) {
        AppLanguage.CHINESE -> "翻译工具"
        AppLanguage.ENGLISH -> "Translate"
        AppLanguage.ARABIC -> "أدوات الترجمة"
    }
    val catTranslateDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "划词翻译、全文翻译、多语言"
        AppLanguage.ENGLISH -> "Selection translate, full page translate, multi-language"
        AppLanguage.ARABIC -> "ترجمة التحديد، ترجمة الصفحة الكاملة، متعدد اللغات"
    }
    val catDeveloper: String get() = when (lang) {
        AppLanguage.CHINESE -> "开发调试"
        AppLanguage.ENGLISH -> "Developer"
        AppLanguage.ARABIC -> "أدوات المطور"
    }
    val catDeveloperDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "调试工具、性能监控、日志输出"
        AppLanguage.ENGLISH -> "Debug tools, performance monitor, log output"
        AppLanguage.ARABIC -> "أدوات التصحيح، مراقبة الأداء، إخراج السجل"
    }
    val catOther: String get() = when (lang) {
        AppLanguage.CHINESE -> "其他"
        AppLanguage.ENGLISH -> "Other"
        AppLanguage.ARABIC -> "أخرى"
    }
    val catOtherDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "未分类的扩展模块"
        AppLanguage.ENGLISH -> "Uncategorized extension modules"
        AppLanguage.ARABIC -> "وحدات إضافية غير مصنفة"
    }
    
    // ==================== 模块执行时机 ====================
    val runTimeDocStart: String get() = when (lang) {
        AppLanguage.CHINESE -> "页面开始"
        AppLanguage.ENGLISH -> "Document Start"
        AppLanguage.ARABIC -> "بداية المستند"
    }
    val runTimeDocStartDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "DOM 未就绪时执行，适合拦截请求和早期修改"
        AppLanguage.ENGLISH -> "Execute before DOM ready, suitable for request interception and early modifications"
        AppLanguage.ARABIC -> "التنفيذ قبل جاهزية DOM، مناسب لاعتراض الطلبات والتعديلات المبكرة"
    }
    val runTimeDocEnd: String get() = when (lang) {
        AppLanguage.CHINESE -> "DOM 就绪"
        AppLanguage.ENGLISH -> "DOM Ready"
        AppLanguage.ARABIC -> "جاهزية DOM"
    }
    val runTimeDocEndDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "DOM 加载完成后执行（推荐），适合大多数场景"
        AppLanguage.ENGLISH -> "Execute after DOM loaded (recommended), suitable for most scenarios"
        AppLanguage.ARABIC -> "التنفيذ بعد تحميل DOM (موصى به)، مناسب لمعظم السيناريوهات"
    }
    val runTimeDocIdle: String get() = when (lang) {
        AppLanguage.CHINESE -> "页面空闲"
        AppLanguage.ENGLISH -> "Page Idle"
        AppLanguage.ARABIC -> "صفحة خاملة"
    }
    val runTimeDocIdleDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "页面完全加载后执行，适合后处理和性能优化"
        AppLanguage.ENGLISH -> "Execute after page fully loaded, suitable for post-processing and performance optimization"
        AppLanguage.ARABIC -> "التنفيذ بعد تحميل الصفحة بالكامل، مناسب للمعالجة اللاحقة وتحسين الأداء"
    }
    val runTimeContextMenu: String get() = when (lang) {
        AppLanguage.CHINESE -> "右键菜单"
        AppLanguage.ENGLISH -> "Context Menu"
        AppLanguage.ARABIC -> "قائمة السياق"
    }
    val runTimeContextMenuDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "右键菜单打开时执行"
        AppLanguage.ENGLISH -> "Execute when context menu opens"
        AppLanguage.ARABIC -> "التنفيذ عند فتح قائمة السياق"
    }
    val runTimeBeforeUnload: String get() = when (lang) {
        AppLanguage.CHINESE -> "页面关闭前"
        AppLanguage.ENGLISH -> "Before Unload"
        AppLanguage.ARABIC -> "قبل إغلاق الصفحة"
    }
    val runTimeBeforeUnloadDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "页面即将关闭时执行，适合保存数据"
        AppLanguage.ENGLISH -> "Execute before page closes, suitable for saving data"
        AppLanguage.ARABIC -> "التنفيذ قبل إغلاق الصفحة، مناسب لحفظ البيانات"
    }
    
    // ==================== 风格参考分类 ====================
    val styleRefMovie: String get() = when (lang) {
        AppLanguage.CHINESE -> "电影"
        AppLanguage.ENGLISH -> "Movie"
        AppLanguage.ARABIC -> "فيلم"
    }
    val styleRefBook: String get() = when (lang) {
        AppLanguage.CHINESE -> "书籍"
        AppLanguage.ENGLISH -> "Book"
        AppLanguage.ARABIC -> "كتاب"
    }
    val styleRefAnime: String get() = when (lang) {
        AppLanguage.CHINESE -> "动画"
        AppLanguage.ENGLISH -> "Anime"
        AppLanguage.ARABIC -> "أنمي"
    }
    val styleRefGame: String get() = when (lang) {
        AppLanguage.CHINESE -> "游戏"
        AppLanguage.ENGLISH -> "Game"
        AppLanguage.ARABIC -> "لعبة"
    }
    val styleRefBrand: String get() = when (lang) {
        AppLanguage.CHINESE -> "品牌"
        AppLanguage.ENGLISH -> "Brand"
        AppLanguage.ARABIC -> "علامة تجارية"
    }
    val styleRefArt: String get() = when (lang) {
        AppLanguage.CHINESE -> "艺术流派"
        AppLanguage.ENGLISH -> "Art Style"
        AppLanguage.ARABIC -> "نمط فني"
    }
    val styleRefEra: String get() = when (lang) {
        AppLanguage.CHINESE -> "时代风格"
        AppLanguage.ENGLISH -> "Era Style"
        AppLanguage.ARABIC -> "نمط العصر"
    }
    val styleRefCulture: String get() = when (lang) {
        AppLanguage.CHINESE -> "文化风格"
        AppLanguage.ENGLISH -> "Cultural Style"
        AppLanguage.ARABIC -> "نمط ثقافي"
    }
    
    // ==================== 颜色名称 ====================
    val colorRed: String get() = when (lang) {
        AppLanguage.CHINESE -> "红色"
        AppLanguage.ENGLISH -> "Red"
        AppLanguage.ARABIC -> "أحمر"
    }
    
    val colorPink: String get() = when (lang) {
        AppLanguage.CHINESE -> "粉色"
        AppLanguage.ENGLISH -> "Pink"
        AppLanguage.ARABIC -> "وردي"
    }
    
    val colorPurple: String get() = when (lang) {
        AppLanguage.CHINESE -> "紫色"
        AppLanguage.ENGLISH -> "Purple"
        AppLanguage.ARABIC -> "بنفسجي"
    }
    
    val colorDeepPurple: String get() = when (lang) {
        AppLanguage.CHINESE -> "深紫"
        AppLanguage.ENGLISH -> "Deep Purple"
        AppLanguage.ARABIC -> "بنفسجي داكن"
    }
    
    val colorIndigo: String get() = when (lang) {
        AppLanguage.CHINESE -> "靛蓝"
        AppLanguage.ENGLISH -> "Indigo"
        AppLanguage.ARABIC -> "نيلي"
    }
    
    val colorBlue: String get() = when (lang) {
        AppLanguage.CHINESE -> "蓝色"
        AppLanguage.ENGLISH -> "Blue"
        AppLanguage.ARABIC -> "أزرق"
    }
    
    val colorLightBlue: String get() = when (lang) {
        AppLanguage.CHINESE -> "浅蓝"
        AppLanguage.ENGLISH -> "Light Blue"
        AppLanguage.ARABIC -> "أزرق فاتح"
    }
    
    val colorCyan: String get() = when (lang) {
        AppLanguage.CHINESE -> "青色"
        AppLanguage.ENGLISH -> "Cyan"
        AppLanguage.ARABIC -> "سماوي"
    }
    
    val colorTeal: String get() = when (lang) {
        AppLanguage.CHINESE -> "蓝绿"
        AppLanguage.ENGLISH -> "Teal"
        AppLanguage.ARABIC -> "أزرق مخضر"
    }
    
    val colorGreen: String get() = when (lang) {
        AppLanguage.CHINESE -> "绿色"
        AppLanguage.ENGLISH -> "Green"
        AppLanguage.ARABIC -> "أخضر"
    }
    
    val colorLightGreen: String get() = when (lang) {
        AppLanguage.CHINESE -> "浅绿"
        AppLanguage.ENGLISH -> "Light Green"
        AppLanguage.ARABIC -> "أخضر فاتح"
    }
    
    val colorLime: String get() = when (lang) {
        AppLanguage.CHINESE -> "黄绿"
        AppLanguage.ENGLISH -> "Lime"
        AppLanguage.ARABIC -> "ليموني"
    }
    
    val colorYellow: String get() = when (lang) {
        AppLanguage.CHINESE -> "黄色"
        AppLanguage.ENGLISH -> "Yellow"
        AppLanguage.ARABIC -> "أصفر"
    }
    
    val colorAmber: String get() = when (lang) {
        AppLanguage.CHINESE -> "琥珀"
        AppLanguage.ENGLISH -> "Amber"
        AppLanguage.ARABIC -> "كهرماني"
    }
    
    val colorOrange: String get() = when (lang) {
        AppLanguage.CHINESE -> "橙色"
        AppLanguage.ENGLISH -> "Orange"
        AppLanguage.ARABIC -> "برتقالي"
    }
    
    val colorDeepOrange: String get() = when (lang) {
        AppLanguage.CHINESE -> "深橙"
        AppLanguage.ENGLISH -> "Deep Orange"
        AppLanguage.ARABIC -> "برتقالي داكن"
    }
    
    val colorBrown: String get() = when (lang) {
        AppLanguage.CHINESE -> "棕色"
        AppLanguage.ENGLISH -> "Brown"
        AppLanguage.ARABIC -> "بني"
    }
    
    val colorGrey: String get() = when (lang) {
        AppLanguage.CHINESE -> "灰色"
        AppLanguage.ENGLISH -> "Grey"
        AppLanguage.ARABIC -> "رمادي"
    }
    
    val colorBlueGrey: String get() = when (lang) {
        AppLanguage.CHINESE -> "蓝灰"
        AppLanguage.ENGLISH -> "Blue Grey"
        AppLanguage.ARABIC -> "رمادي مزرق"
    }
    
    val colorBlack: String get() = when (lang) {
        AppLanguage.CHINESE -> "黑色"
        AppLanguage.ENGLISH -> "Black"
        AppLanguage.ARABIC -> "أسود"
    }
    
    val colorWhite: String get() = when (lang) {
        AppLanguage.CHINESE -> "白色"
        AppLanguage.ENGLISH -> "White"
        AppLanguage.ARABIC -> "أبيض"
    }
    
    val colorDarkTheme: String get() = when (lang) {
        AppLanguage.CHINESE -> "深色主题"
        AppLanguage.ENGLISH -> "Dark Theme"
        AppLanguage.ARABIC -> "سمة داكنة"
    }
    
    val colorLightTheme: String get() = when (lang) {
        AppLanguage.CHINESE -> "浅色主题"
        AppLanguage.ENGLISH -> "Light Theme"
        AppLanguage.ARABIC -> "سمة فاتحة"
    }
    
    val colorTransparent: String get() = when (lang) {
        AppLanguage.CHINESE -> "透明"
        AppLanguage.ENGLISH -> "Transparent"
        AppLanguage.ARABIC -> "شفاف"
    }
    
    val colorSelected: String get() = when (lang) {
        AppLanguage.CHINESE -> "已选择"
        AppLanguage.ENGLISH -> "Selected"
        AppLanguage.ARABIC -> "محدد"
    }
    
    // ==================== 扩展模块相关 ====================
    val selectedCount2: String get() = when (lang) {
        AppLanguage.CHINESE -> "已选 %d 个"
        AppLanguage.ENGLISH -> "%d selected"
        AppLanguage.ARABIC -> "تم اختيار %d"
    }
    
    val addCustomFeatures: String get() = when (lang) {
        AppLanguage.CHINESE -> "为应用添加自定义功能，如元素屏蔽、深色模式、自动滚动等"
        AppLanguage.ENGLISH -> "Add custom features like element blocking, dark mode, auto scroll, etc."
        AppLanguage.ARABIC -> "إضافة ميزات مخصصة مثل حظر العناصر، الوضع الداكن، التمرير التلقائي، إلخ."
    }
    
    val quickSelect: String get() = when (lang) {
        AppLanguage.CHINESE -> "快速选择"
        AppLanguage.ENGLISH -> "Quick Select"
        AppLanguage.ARABIC -> "اختيار سريع"
    }
    
    val enableModulesFirst: String get() = when (lang) {
        AppLanguage.CHINESE -> "请先在「扩展模块」中启用需要使用的模块"
        AppLanguage.ENGLISH -> "Please enable modules in 'Extension Modules' first"
        AppLanguage.ARABIC -> "يرجى تمكين الوحدات في 'وحدات الامتداد' أولاً"
    }
    
    val selectedModulesCount: String get() = when (lang) {
        AppLanguage.CHINESE -> "已选择 %d 个模块"
        AppLanguage.ENGLISH -> "%d modules selected"
        AppLanguage.ARABIC -> "تم اختيار %d وحدات"
    }
    
    val removeModule: String get() = when (lang) {
        AppLanguage.CHINESE -> "移除"
        AppLanguage.ENGLISH -> "Remove"
        AppLanguage.ARABIC -> "إزالة"
    }
    
    val noMatchingModules: String get() = when (lang) {
        AppLanguage.CHINESE -> "没有找到匹配的模块"
        AppLanguage.ENGLISH -> "No matching modules found"
        AppLanguage.ARABIC -> "لم يتم العثور على وحدات مطابقة"
    }
    
    val willTestModules: String get() = when (lang) {
        AppLanguage.CHINESE -> "将测试 %d 个模块"
        AppLanguage.ENGLISH -> "Will test %d modules"
        AppLanguage.ARABIC -> "سيتم اختبار %d وحدات"
    }
    
    val selectTestPage: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择测试页面"
        AppLanguage.ENGLISH -> "Select Test Page"
        AppLanguage.ARABIC -> "اختيار صفحة الاختبار"
    }
    
    val testPageHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "💡 测试页面会加载选中的模块，你可以观察模块的实际效果"
        AppLanguage.ENGLISH -> "💡 Test page will load selected modules, you can observe actual effects"
        AppLanguage.ARABIC -> "💡 ستقوم صفحة الاختبار بتحميل الوحدات المحددة، يمكنك ملاحظة التأثيرات الفعلية"
    }
    
    val builtInModule: String get() = when (lang) {
        AppLanguage.CHINESE -> "内置模块"
        AppLanguage.ENGLISH -> "Built-in Module"
        AppLanguage.ARABIC -> "وحدة مدمجة"
    }
    
    val configurableItems: String get() = when (lang) {
        AppLanguage.CHINESE -> "可配置项 (%d)"
        AppLanguage.ENGLISH -> "Configurable Items (%d)"
        AppLanguage.ARABIC -> "عناصر قابلة للتكوين (%d)"
    }
    
    // ==================== 媒体内容 ====================
    val mediaContent: String get() = when (lang) {
        AppLanguage.CHINESE -> "媒体内容"
        AppLanguage.ENGLISH -> "Media Content"
        AppLanguage.ARABIC -> "محتوى الوسائط"
    }
    
    val statusBarBackground: String get() = when (lang) {
        AppLanguage.CHINESE -> "状态栏背景"
        AppLanguage.ENGLISH -> "Status Bar Background"
        AppLanguage.ARABIC -> "خلفية شريط الحالة"
    }
    
    // ==================== 激活相关补充 ====================
    val appNeedsActivation: String get() = when (lang) {
        AppLanguage.CHINESE -> "应用需要激活"
        AppLanguage.ENGLISH -> "App needs activation"
        AppLanguage.ARABIC -> "التطبيق يحتاج إلى تفعيل"
    }
    
    val skip: String get() = when (lang) {
        AppLanguage.CHINESE -> "跳过"
        AppLanguage.ENGLISH -> "Skip"
        AppLanguage.ARABIC -> "تخطي"
    }
    
    // ==================== 项目模板 ====================
    val projectTemplateExport: String get() = when (lang) {
        AppLanguage.CHINESE -> "项目模板导出"
        AppLanguage.ENGLISH -> "Project Template Export"
        AppLanguage.ARABIC -> "تصدير قالب المشروع"
    }
    
    // ==================== 公告模板按钮 ====================
    val iKnow: String get() = when (lang) {
        AppLanguage.CHINESE -> "我知道了"
        AppLanguage.ENGLISH -> "I Know"
        AppLanguage.ARABIC -> "فهمت"
    }
    
    val gotItCute: String get() = when (lang) {
        AppLanguage.CHINESE -> "知道啦~ 💕"
        AppLanguage.ENGLISH -> "Got it~ 💕"
        AppLanguage.ARABIC -> "فهمت~ 💕"
    }
    
    val receivedGift: String get() = when (lang) {
        AppLanguage.CHINESE -> "🎁 收到啦"
        AppLanguage.ENGLISH -> "🎁 Received"
        AppLanguage.ARABIC -> "🎁 تم الاستلام"
    }
    
    val okayNature: String get() = when (lang) {
        AppLanguage.CHINESE -> "🌱 好的"
        AppLanguage.ENGLISH -> "🌱 Okay"
        AppLanguage.ARABIC -> "🌱 حسناً"
    }
    
    // ==================== 代码块选择器 ====================
    val codeBlockLibraryTitle: String get() = when (lang) {
        AppLanguage.CHINESE -> "代码块库"
        AppLanguage.ENGLISH -> "Code Block Library"
        AppLanguage.ARABIC -> "مكتبة كتل الكود"
    }
    
    val searchCodeBlocksPlaceholder: String get() = when (lang) {
        AppLanguage.CHINESE -> "搜索代码块..."
        AppLanguage.ENGLISH -> "Search code blocks..."
        AppLanguage.ARABIC -> "البحث عن كتل الكود..."
    }
    
    val categoriesAndBlocks: String get() = when (lang) {
        AppLanguage.CHINESE -> "%d 分类 · %d 代码块"
        AppLanguage.ENGLISH -> "%d categories · %d code blocks"
        AppLanguage.ARABIC -> "%d فئات · %d كتل كود"
    }
    
    val foundResults: String get() = when (lang) {
        AppLanguage.CHINESE -> "找到 %d 个结果"
        AppLanguage.ENGLISH -> "Found %d results"
        AppLanguage.ARABIC -> "تم العثور على %d نتائج"
    }
    
    val noMatchingCodeBlocks: String get() = when (lang) {
        AppLanguage.CHINESE -> "没有找到匹配的代码块"
        AppLanguage.ENGLISH -> "No matching code blocks found"
        AppLanguage.ARABIC -> "لم يتم العثور على كتل كود مطابقة"
    }
    
    val insert: String get() = when (lang) {
        AppLanguage.CHINESE -> "插入"
        AppLanguage.ENGLISH -> "Insert"
        AppLanguage.ARABIC -> "إدراج"
    }
    
    val quickInsertCodeSnippets: String get() = when (lang) {
        AppLanguage.CHINESE -> "快速插入常用代码片段"
        AppLanguage.ENGLISH -> "Quick insert common code snippets"
        AppLanguage.ARABIC -> "إدراج سريع لمقتطفات الكود الشائعة"
    }
    
    val codeBlocksCount: String get() = when (lang) {
        AppLanguage.CHINESE -> "%d 个代码块"
        AppLanguage.ENGLISH -> "%d code blocks"
        AppLanguage.ARABIC -> "%d كتل كود"
    }
    
    // ==================== LRC 编辑器 ====================
    
    val totalLinesCount: String get() = when (lang) {
        AppLanguage.CHINESE -> "共 %d 行歌词"
        AppLanguage.ENGLISH -> "%d lines of lyrics"
        AppLanguage.ARABIC -> "%d سطر من الكلمات"
    }
    
    // ==================== 模块测试 ====================
    val testModuleTitle: String get() = when (lang) {
        AppLanguage.CHINESE -> "测试模块"
        AppLanguage.ENGLISH -> "Test Module"
        AppLanguage.ARABIC -> "اختبار الوحدة"
    }
    
    val willTestModulesFormat: String get() = when (lang) {
        AppLanguage.CHINESE -> "将测试 %d 个模块"
        AppLanguage.ENGLISH -> "Will test %d modules"
        AppLanguage.ARABIC -> "سيتم اختبار %d وحدات"
    }
    
    val selectTestPageTitle: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择测试页面"
        AppLanguage.ENGLISH -> "Select Test Page"
        AppLanguage.ARABIC -> "اختيار صفحة الاختبار"
    }
    
    val startTestBtn: String get() = when (lang) {
        AppLanguage.CHINESE -> "开始测试"
        AppLanguage.ENGLISH -> "Start Test"
        AppLanguage.ARABIC -> "بدء الاختبار"
    }
    
    val testPageHintText: String get() = when (lang) {
        AppLanguage.CHINESE -> "💡 测试页面会加载选中的模块，你可以观察模块的实际效果"
        AppLanguage.ENGLISH -> "💡 Test page will load selected modules, you can observe actual effects"
        AppLanguage.ARABIC -> "💡 ستقوم صفحة الاختبار بتحميل الوحدات المحددة، يمكنك ملاحظة التأثيرات الفعلية"
    }
    
    // ==================== 方案管理 ====================
    val quickSchemes: String get() = when (lang) {
        AppLanguage.CHINESE -> "快捷方案"
        AppLanguage.ENGLISH -> "Quick Schemes"
        AppLanguage.ARABIC -> "مخططات سريعة"
    }
    
    val allSchemesBtn: String get() = when (lang) {
        AppLanguage.CHINESE -> "全部方案"
        AppLanguage.ENGLISH -> "All Schemes"
        AppLanguage.ARABIC -> "جميع المخططات"
    }
    
    val builtInSchemes: String get() = when (lang) {
        AppLanguage.CHINESE -> "📦 内置方案"
        AppLanguage.ENGLISH -> "📦 Built-in Schemes"
        AppLanguage.ARABIC -> "📦 مخططات مدمجة"
    }
    
    val mySchemes: String get() = when (lang) {
        AppLanguage.CHINESE -> "⭐ 我的方案"
        AppLanguage.ENGLISH -> "⭐ My Schemes"
        AppLanguage.ARABIC -> "⭐ مخططاتي"
    }
    
    val schemeTip: String get() = when (lang) {
        AppLanguage.CHINESE -> "💡 提示：选择模块后点击「存为方案」可保存自定义方案"
        AppLanguage.ENGLISH -> "💡 Tip: Select modules and click 'Save as Scheme' to save custom scheme"
        AppLanguage.ARABIC -> "💡 نصيحة: حدد الوحدات وانقر على 'حفظ كمخطط' لحفظ مخطط مخصص"
    }
    
    val containsModules: String get() = when (lang) {
        AppLanguage.CHINESE -> "包含 %d 个模块"
        AppLanguage.ENGLISH -> "Contains %d modules"
        AppLanguage.ARABIC -> "يحتوي على %d وحدات"
    }
    
    val applied: String get() = when (lang) {
        AppLanguage.CHINESE -> "已应用"
        AppLanguage.ENGLISH -> "Applied"
        AppLanguage.ARABIC -> "مطبق"
    }
    
    val schemeNameLabel: String get() = when (lang) {
        AppLanguage.CHINESE -> "方案名称"
        AppLanguage.ENGLISH -> "Scheme Name"
        AppLanguage.ARABIC -> "اسم المخطط"
    }
    
    val enterSchemeNameHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "输入方案名称"
        AppLanguage.ENGLISH -> "Enter scheme name"
        AppLanguage.ARABIC -> "أدخل اسم المخطط"
    }
    
    val descriptionOptionalLabel: String get() = when (lang) {
        AppLanguage.CHINESE -> "描述（可选）"
        AppLanguage.ENGLISH -> "Description (Optional)"
        AppLanguage.ARABIC -> "الوصف (اختياري)"
    }
    
    val briefDescribeSchemeHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "简要描述方案用途"
        AppLanguage.ENGLISH -> "Briefly describe scheme purpose"
        AppLanguage.ARABIC -> "وصف موجز لغرض المخطط"
    }
    
    val willSaveModules: String get() = when (lang) {
        AppLanguage.CHINESE -> "将保存 %d 个模块到此方案"
        AppLanguage.ENGLISH -> "Will save %d modules to this scheme"
        AppLanguage.ARABIC -> "سيتم حفظ %d وحدات في هذا المخطط"
    }
    
    val selectIconTitle: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择图标"
        AppLanguage.ENGLISH -> "Select Icon"
        AppLanguage.ARABIC -> "اختيار أيقونة"
    }
    
    // ==================== 颜色选择器 ====================
    
    // ==================== 扩展模块卡片 ====================
    
    val selectedCountFormat: String get() = when (lang) {
        AppLanguage.CHINESE -> "已选 %d 个"
        AppLanguage.ENGLISH -> "%d selected"
        AppLanguage.ARABIC -> "تم اختيار %d"
    }
    
    // ==================== 启动画面 ====================
    
    // ==================== LRC预览 ====================
    val previewLrcHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "预览生成的 LRC 效果，确认无误后保存"
        AppLanguage.ENGLISH -> "Preview generated LRC effect, save after confirmation"
        AppLanguage.ARABIC -> "معاينة تأثير LRC المُنشأ، احفظ بعد التأكيد"
    }
    
    // ==================== 主题名称 ====================
    
    // ==================== 动画风格 ====================
    
    // ==================== 交互风格 ====================
    
    // ==================== AI功能场景 ====================
    val featureWriteHtml: String get() = when (lang) {
        AppLanguage.CHINESE -> "写入 HTML"
        AppLanguage.ENGLISH -> "Write HTML"
        AppLanguage.ARABIC -> "كتابة HTML"
    }
    
    val featureEditHtml: String get() = when (lang) {
        AppLanguage.CHINESE -> "编辑 HTML"
        AppLanguage.ENGLISH -> "Edit HTML"
        AppLanguage.ARABIC -> "تحرير HTML"
    }
    
    val featureGetConsoleLogs: String get() = when (lang) {
        AppLanguage.CHINESE -> "获取控制台日志"
        AppLanguage.ENGLISH -> "Get Console Logs"
        AppLanguage.ARABIC -> "الحصول على سجلات وحدة التحكم"
    }
    
    val featureCheckSyntax: String get() = when (lang) {
        AppLanguage.CHINESE -> "语法检查"
        AppLanguage.ENGLISH -> "Check Syntax"
        AppLanguage.ARABIC -> "فحص بناء الجملة"
    }
    
    val featureAutoFix: String get() = when (lang) {
        AppLanguage.CHINESE -> "自动修复"
        AppLanguage.ENGLISH -> "Auto Fix"
        AppLanguage.ARABIC -> "إصلاح تلقائي"
    }
    
    val featureIconGeneration: String get() = when (lang) {
        AppLanguage.CHINESE -> "图标生成"
        AppLanguage.ENGLISH -> "Icon Generation"
        AppLanguage.ARABIC -> "إنشاء الأيقونات"
    }
    
    val featureModuleDevelopment: String get() = when (lang) {
        AppLanguage.CHINESE -> "模块开发"
        AppLanguage.ENGLISH -> "Module Development"
        AppLanguage.ARABIC -> "تطوير الوحدات"
    }
    
    val featureLrcGeneration: String get() = when (lang) {
        AppLanguage.CHINESE -> "歌词生成"
        AppLanguage.ENGLISH -> "LRC Generation"
        AppLanguage.ARABIC -> "إنشاء كلمات الأغاني"
    }
    
    val featureTranslation: String get() = when (lang) {
        AppLanguage.CHINESE -> "翻译"
        AppLanguage.ENGLISH -> "Translation"
        AppLanguage.ARABIC -> "ترجمة"
    }
    
    val featureGeneralChat: String get() = when (lang) {
        AppLanguage.CHINESE -> "通用对话"
        AppLanguage.ENGLISH -> "General Chat"
        AppLanguage.ARABIC -> "محادثة عامة"
    }
    
    // ==================== AI供应商 ====================
    val providerGlm: String get() = when (lang) {
        AppLanguage.CHINESE -> "智谱GLM"
        AppLanguage.ENGLISH -> "Zhipu GLM"
        AppLanguage.ARABIC -> "Zhipu GLM"
    }
    
    val providerVolcano: String get() = when (lang) {
        AppLanguage.CHINESE -> "火山引擎"
        AppLanguage.ENGLISH -> "Volcano Engine"
        AppLanguage.ARABIC -> "محرك البركان"
    }
    
    val providerSiliconflow: String get() = when (lang) {
        AppLanguage.CHINESE -> "硅基流动"
        AppLanguage.ENGLISH -> "SiliconFlow"
        AppLanguage.ARABIC -> "SiliconFlow"
    }
    
    val providerQwen: String get() = when (lang) {
        AppLanguage.CHINESE -> "通义千问"
        AppLanguage.ENGLISH -> "Qwen"
        AppLanguage.ARABIC -> "Qwen"
    }
    
    val providerCustom: String get() = when (lang) {
        AppLanguage.CHINESE -> "自定义"
        AppLanguage.ENGLISH -> "Custom"
        AppLanguage.ARABIC -> "مخصص"
    }
    
    // ==================== 编程相关 ====================
    val coding: String get() = when (lang) {
        AppLanguage.CHINESE -> "编程"
        AppLanguage.ENGLISH -> "Coding"
        AppLanguage.ARABIC -> "البرمجة"
    }
    
    // ==================== AI功能描述 ====================
    val htmlCodingDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "AI 辅助生成和修改 HTML/CSS/JS 代码"
        AppLanguage.ENGLISH -> "AI-assisted HTML/CSS/JS code generation and modification"
        AppLanguage.ARABIC -> "إنشاء وتعديل كود HTML/CSS/JS بمساعدة الذكاء الاصطناعي"
    }
    
    val htmlCodingImageDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "HTML 编程中的图像生成功能"
        AppLanguage.ENGLISH -> "Image generation in HTML coding"
        AppLanguage.ARABIC -> "إنشاء الصور في برمجة HTML"
    }
    
    val iconGenerationDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "使用 AI 生成应用图标"
        AppLanguage.ENGLISH -> "Generate app icons using AI"
        AppLanguage.ARABIC -> "إنشاء أيقونات التطبيق باستخدام الذكاء الاصطناعي"
    }
    
    val moduleDevelopmentDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "AI Agent 辅助开发扩展模块"
        AppLanguage.ENGLISH -> "AI Agent assisted extension module development"
        AppLanguage.ARABIC -> "تطوير وحدات الإضافة بمساعدة وكيل الذكاء الاصطناعي"
    }
    
    val lrcGenerationDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "AI 生成 LRC 歌词文件"
        AppLanguage.ENGLISH -> "AI-generated LRC lyrics files"
        AppLanguage.ARABIC -> "ملفات كلمات LRC المُنشأة بالذكاء الاصطناعي"
    }
    
    val translationDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "网页内容翻译"
        AppLanguage.ENGLISH -> "Web content translation"
        AppLanguage.ARABIC -> "ترجمة محتوى الويب"
    }
    
    val generalChatDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "通用 AI 对话功能"
        AppLanguage.ENGLISH -> "General AI chat functionality"
        AppLanguage.ARABIC -> "وظيفة الدردشة العامة بالذكاء الاصطناعي"
    }
    
    // ==================== HTML工具描述 ====================
    val aiImageGeneration: String get() = when (lang) {
        AppLanguage.CHINESE -> "AI 图像生成"
        AppLanguage.ENGLISH -> "AI Image Generation"
        AppLanguage.ARABIC -> "إنشاء صور بالذكاء الاصطناعي"
    }
    
    val writeHtmlDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "创建或覆盖完整的 HTML 页面"
        AppLanguage.ENGLISH -> "Create or overwrite complete HTML pages"
        AppLanguage.ARABIC -> "إنشاء أو استبدال صفحات HTML كاملة"
    }
    
    val editHtmlDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "在指定位置替换、插入或删除代码片段"
        AppLanguage.ENGLISH -> "Replace, insert or delete code snippets at specified locations"
        AppLanguage.ARABIC -> "استبدال أو إدراج أو حذف مقاطع الكود في المواقع المحددة"
    }
    
    val generateImageDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "使用 AI 生成图像并嵌入到 HTML 中作为插图"
        AppLanguage.ENGLISH -> "Generate images using AI and embed them in HTML as illustrations"
        AppLanguage.ARABIC -> "إنشاء صور باستخدام الذكاء الاصطناعي وتضمينها في HTML كرسوم توضيحية"
    }
    
    val getConsoleLogsDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "获取页面运行时的 console.log 输出和错误信息"
        AppLanguage.ENGLISH -> "Get console.log output and error messages during page runtime"
        AppLanguage.ARABIC -> "الحصول على مخرجات console.log ورسائل الخطأ أثناء تشغيل الصفحة"
    }
    
    val checkSyntaxDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "检查 HTML/CSS/JavaScript 语法错误"
        AppLanguage.ENGLISH -> "Check HTML/CSS/JavaScript syntax errors"
        AppLanguage.ARABIC -> "فحص أخطاء بناء جملة HTML/CSS/JavaScript"
    }
    
    val autoFixDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "自动修复检测到的语法错误"
        AppLanguage.ENGLISH -> "Automatically fix detected syntax errors"
        AppLanguage.ARABIC -> "إصلاح أخطاء بناء الجملة المكتشفة تلقائيًا"
    }
    
    // ==================== 模板分类 ====================
    val templateModern: String get() = when (lang) {
        AppLanguage.CHINESE -> "现代简约"
        AppLanguage.ENGLISH -> "Modern Minimal"
        AppLanguage.ARABIC -> "حديث بسيط"
    }
    
    val templateGlassmorphism: String get() = when (lang) {
        AppLanguage.CHINESE -> "玻璃拟态"
        AppLanguage.ENGLISH -> "Glassmorphism"
        AppLanguage.ARABIC -> "تأثير الزجاج"
    }
    
    val templateNeumorphism: String get() = when (lang) {
        AppLanguage.CHINESE -> "新拟物"
        AppLanguage.ENGLISH -> "Neumorphism"
        AppLanguage.ARABIC -> "نيومورفيزم"
    }
    
    val templateGradient: String get() = when (lang) {
        AppLanguage.CHINESE -> "渐变炫彩"
        AppLanguage.ENGLISH -> "Gradient Colors"
        AppLanguage.ARABIC -> "ألوان متدرجة"
    }
    
    val templateDark: String get() = when (lang) {
        AppLanguage.CHINESE -> "暗黑主题"
        AppLanguage.ENGLISH -> "Dark Theme"
        AppLanguage.ARABIC -> "السمة الداكنة"
    }
    
    val templateMinimal: String get() = when (lang) {
        AppLanguage.CHINESE -> "极简风格"
        AppLanguage.ENGLISH -> "Minimal Style"
        AppLanguage.ARABIC -> "أسلوب بسيط"
    }
    
    val templateRetro: String get() = when (lang) {
        AppLanguage.CHINESE -> "复古风格"
        AppLanguage.ENGLISH -> "Retro Style"
        AppLanguage.ARABIC -> "أسلوب كلاسيكي"
    }
    
    val templateCyberpunk: String get() = when (lang) {
        AppLanguage.CHINESE -> "赛博朋克"
        AppLanguage.ENGLISH -> "Cyberpunk"
        AppLanguage.ARABIC -> "سايبربانك"
    }
    
    val templateNature: String get() = when (lang) {
        AppLanguage.CHINESE -> "自然清新"
        AppLanguage.ENGLISH -> "Nature Fresh"
        AppLanguage.ARABIC -> "طبيعة منعشة"
    }
    
    val templateBusiness: String get() = when (lang) {
        AppLanguage.CHINESE -> "商务专业"
        AppLanguage.ENGLISH -> "Business Professional"
        AppLanguage.ARABIC -> "أعمال احترافية"
    }
    
    val templateCreative: String get() = when (lang) {
        AppLanguage.CHINESE -> "创意艺术"
        AppLanguage.ENGLISH -> "Creative Art"
        AppLanguage.ARABIC -> "فن إبداعي"
    }
    
    val templateGame: String get() = when (lang) {
        AppLanguage.CHINESE -> "游戏风格"
        AppLanguage.ENGLISH -> "Game Style"
        AppLanguage.ARABIC -> "أسلوب الألعاب"
    }
    
    // ==================== 会话配置 ====================
    val sessionConfig: String get() = when (lang) {
        AppLanguage.CHINESE -> "会话配置"
        AppLanguage.ENGLISH -> "Session Config"
        AppLanguage.ARABIC -> "إعدادات الجلسة"
    }
    
    val textModel: String get() = when (lang) {
        AppLanguage.CHINESE -> "文本模型"
        AppLanguage.ENGLISH -> "Text Model"
        AppLanguage.ARABIC -> "نموذج النص"
    }
    
    val imageModelOptional: String get() = when (lang) {
        AppLanguage.CHINESE -> "图像模型（可选）"
        AppLanguage.ENGLISH -> "Image Model (Optional)"
        AppLanguage.ARABIC -> "نموذج الصورة (اختياري)"
    }
    
    val temperature: String get() = when (lang) {
        AppLanguage.CHINESE -> "温度"
        AppLanguage.ENGLISH -> "Temperature"
        AppLanguage.ARABIC -> "درجة الحرارة"
    }
    
    val temperatureHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "低(0): 确定性输出 - 高(2): 创意性输出"
        AppLanguage.ENGLISH -> "Low(0): Deterministic - High(2): Creative"
        AppLanguage.ARABIC -> "منخفض(0): حتمي - مرتفع(2): إبداعي"
    }
    
    val toolbox: String get() = when (lang) {
        AppLanguage.CHINESE -> "工具包"
        AppLanguage.ENGLISH -> "Toolbox"
        AppLanguage.ARABIC -> "صندوق الأدوات"
    }
    
    val nEnabled: String get() = when (lang) {
        AppLanguage.CHINESE -> "%d 个已启用"
        AppLanguage.ENGLISH -> "%d enabled"
        AppLanguage.ARABIC -> "%d مفعّل"
    }
    
    val toolboxHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择 AI 可以使用的工具，启用更多工具可以增强 AI 的能力"
        AppLanguage.ENGLISH -> "Select tools for AI to use, more tools enhance AI capabilities"
        AppLanguage.ARABIC -> "اختر الأدوات التي يمكن للذكاء الاصطناعي استخدامها"
    }
    
    val nMessages: String get() = when (lang) {
        AppLanguage.CHINESE -> "%d 条消息"
        AppLanguage.ENGLISH -> "%d messages"
        AppLanguage.ARABIC -> "%d رسالة"
    }
    
    val dataBackupTitle: String get() = when (lang) {
        AppLanguage.CHINESE -> "数据备份"
        AppLanguage.ENGLISH -> "Data Backup"
        AppLanguage.ARABIC -> "نسخ البيانات احتياطيًا"
    }
    
    val dataBackupDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "导出或导入所有应用数据，包括配置、图标、启动画面、BGM等资源文件"
        AppLanguage.ENGLISH -> "Export or import all app data including config, icons, splash screens, BGM and other resources"
        AppLanguage.ARABIC -> "تصدير أو استيراد جميع بيانات التطبيق"
    }
    
    val dataBackupNote: String get() = when (lang) {
        AppLanguage.CHINESE -> "导入数据会添加新应用，不会覆盖现有数据。建议在更新应用前先导出备份。"
        AppLanguage.ENGLISH -> "Importing data adds new apps without overwriting existing data. It's recommended to export backup before updating."
        AppLanguage.ARABIC -> "استيراد البيانات يضيف تطبيقات جديدة دون الكتابة فوق البيانات الموجودة."
    }
    
    val legalDisclaimer: String get() = when (lang) {
        AppLanguage.CHINESE -> "法律声明与免责条款"
        AppLanguage.ENGLISH -> "Legal Disclaimer"
        AppLanguage.ARABIC -> "إخلاء المسؤولية القانونية"
    }
    
    // ==================== HTML 工具类型 ====================
    val toolWriteHtml: String get() = when (lang) {
        AppLanguage.CHINESE -> "写入 HTML"
        AppLanguage.ENGLISH -> "Write HTML"
        AppLanguage.ARABIC -> "كتابة HTML"
    }
    val toolWriteHtmlDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "创建或覆盖完整的 HTML 页面"
        AppLanguage.ENGLISH -> "Create or overwrite complete HTML page"
        AppLanguage.ARABIC -> "إنشاء أو الكتابة فوق صفحة HTML كاملة"
    }
    val toolEditHtml: String get() = when (lang) {
        AppLanguage.CHINESE -> "编辑 HTML"
        AppLanguage.ENGLISH -> "Edit HTML"
        AppLanguage.ARABIC -> "تحرير HTML"
    }
    val toolEditHtmlDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "在指定位置替换、插入或删除代码片段"
        AppLanguage.ENGLISH -> "Replace, insert or delete code at specified location"
        AppLanguage.ARABIC -> "استبدال أو إدراج أو حذف الكود في موقع محدد"
    }
    val toolGenerateImage: String get() = when (lang) {
        AppLanguage.CHINESE -> "AI 图像生成"
        AppLanguage.ENGLISH -> "AI Image Generation"
        AppLanguage.ARABIC -> "توليد صورة بالذكاء الاصطناعي"
    }
    val toolGenerateImageDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "使用 AI 生成图像并嵌入到 HTML 中作为插图"
        AppLanguage.ENGLISH -> "Generate images with AI and embed them in HTML"
        AppLanguage.ARABIC -> "إنشاء صور بالذكاء الاصطناعي وتضمينها في HTML"
    }
    val toolGetConsoleLogs: String get() = when (lang) {
        AppLanguage.CHINESE -> "获取控制台日志"
        AppLanguage.ENGLISH -> "Get Console Logs"
        AppLanguage.ARABIC -> "الحصول على سجلات وحدة التحكم"
    }
    val toolGetConsoleLogsDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "获取页面运行时的 console.log 输出和错误信息"
        AppLanguage.ENGLISH -> "Get console.log output and error info from page runtime"
        AppLanguage.ARABIC -> "الحصول على مخرجات console.log ومعلومات الأخطاء"
    }
    val toolCheckSyntax: String get() = when (lang) {
        AppLanguage.CHINESE -> "语法检查"
        AppLanguage.ENGLISH -> "Syntax Check"
        AppLanguage.ARABIC -> "فحص بناء الجملة"
    }
    val toolCheckSyntaxDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "检查 HTML/CSS/JavaScript 语法错误"
        AppLanguage.ENGLISH -> "Check HTML/CSS/JavaScript syntax errors"
        AppLanguage.ARABIC -> "فحص أخطاء بناء جملة HTML/CSS/JavaScript"
    }
    val toolAutoFix: String get() = when (lang) {
        AppLanguage.CHINESE -> "自动修复"
        AppLanguage.ENGLISH -> "Auto Fix"
        AppLanguage.ARABIC -> "إصلاح تلقائي"
    }
    val toolAutoFixDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "自动修复检测到的语法错误"
        AppLanguage.ENGLISH -> "Automatically fix detected syntax errors"
        AppLanguage.ARABIC -> "إصلاح أخطاء بناء الجملة المكتشفة تلقائيًا"
    }
    val required: String get() = when (lang) {
        AppLanguage.CHINESE -> "必需"
        AppLanguage.ENGLISH -> "Required"
        AppLanguage.ARABIC -> "مطلوب"
    }
    val requiresImageModel: String get() = when (lang) {
        AppLanguage.CHINESE -> "需选择图像模型"
        AppLanguage.ENGLISH -> "Requires image model"
        AppLanguage.ARABIC -> "يتطلب نموذج صورة"
    }
    
    // ==================== 模块模板 ====================
    val tplElementHider: String get() = when (lang) {
        AppLanguage.CHINESE -> "元素隐藏器"
        AppLanguage.ENGLISH -> "Element Hider"
        AppLanguage.ARABIC -> "إخفاء العناصر"
    }
    val tplElementHiderDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "通过 CSS 选择器隐藏页面元素，支持多种隐藏方式"
        AppLanguage.ENGLISH -> "Hide page elements via CSS selector, supports multiple hiding methods"
        AppLanguage.ARABIC -> "إخفاء عناصر الصفحة عبر محدد CSS"
    }
    val tplAdBlocker: String get() = when (lang) {
        AppLanguage.CHINESE -> "广告拦截增强"
        AppLanguage.ENGLISH -> "Ad Blocker Pro"
        AppLanguage.ARABIC -> "مانع الإعلانات المتقدم"
    }
    val tplAdBlockerDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "强力广告过滤，屏蔽常见广告元素、弹窗和追踪脚本"
        AppLanguage.ENGLISH -> "Powerful ad filter, blocks common ad elements, popups and tracking scripts"
        AppLanguage.ARABIC -> "فلتر إعلانات قوي، يحظر عناصر الإعلانات والنوافذ المنبثقة"
    }
    val tplPopupBlocker: String get() = when (lang) {
        AppLanguage.CHINESE -> "弹窗拦截器"
        AppLanguage.ENGLISH -> "Popup Blocker"
        AppLanguage.ARABIC -> "مانع النوافذ المنبثقة"
    }
    val tplPopupBlockerDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "自动关闭烦人的弹窗、对话框和通知请求"
        AppLanguage.ENGLISH -> "Auto close annoying popups, dialogs and notification requests"
        AppLanguage.ARABIC -> "إغلاق تلقائي للنوافذ المنبثقة المزعجة"
    }
    val tplCookieBanner: String get() = when (lang) {
        AppLanguage.CHINESE -> "Cookie横幅移除"
        AppLanguage.ENGLISH -> "Cookie Banner Remover"
        AppLanguage.ARABIC -> "إزالة لافتة ملفات تعريف الارتباط"
    }
    val tplCookieBannerDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "自动移除Cookie同意横幅和GDPR提示"
        AppLanguage.ENGLISH -> "Auto remove cookie consent banners and GDPR notices"
        AppLanguage.ARABIC -> "إزالة تلقائية للافتات الموافقة على ملفات تعريف الارتباط"
    }
    val tplCssInjector: String get() = when (lang) {
        AppLanguage.CHINESE -> "CSS样式注入"
        AppLanguage.ENGLISH -> "CSS Style Injector"
        AppLanguage.ARABIC -> "حقن أنماط CSS"
    }
    val tplCssInjectorDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "向页面注入自定义CSS样式"
        AppLanguage.ENGLISH -> "Inject custom CSS styles into page"
        AppLanguage.ARABIC -> "حقن أنماط CSS مخصصة في الصفحة"
    }
    val tplDarkMode: String get() = when (lang) {
        AppLanguage.CHINESE -> "强制深色模式"
        AppLanguage.ENGLISH -> "Force Dark Mode"
        AppLanguage.ARABIC -> "فرض الوضع الداكن"
    }
    val tplDarkModeDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "为任意网页强制启用深色模式"
        AppLanguage.ENGLISH -> "Force enable dark mode for any webpage"
        AppLanguage.ARABIC -> "فرض تمكين الوضع الداكن لأي صفحة ويب"
    }
    val tplFontChanger: String get() = when (lang) {
        AppLanguage.CHINESE -> "字体替换器"
        AppLanguage.ENGLISH -> "Font Changer"
        AppLanguage.ARABIC -> "مغير الخط"
    }
    val tplFontChangerDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "替换网页字体为指定字体"
        AppLanguage.ENGLISH -> "Replace webpage fonts with specified font"
        AppLanguage.ARABIC -> "استبدال خطوط صفحة الويب بالخط المحدد"
    }
    val tplScrollToTop: String get() = when (lang) {
        AppLanguage.CHINESE -> "滚动到顶部"
        AppLanguage.ENGLISH -> "Scroll to Top"
        AppLanguage.ARABIC -> "التمرير إلى الأعلى"
    }
    val tplScrollToTopDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "添加一键回到页面顶部按钮"
        AppLanguage.ENGLISH -> "Add a button to scroll back to top"
        AppLanguage.ARABIC -> "إضافة زر للعودة إلى أعلى الصفحة"
    }
    
    // ==================== 代码片段分类 ====================
    val snippetNative: String get() = when (lang) {
        AppLanguage.CHINESE -> "原生能力"
        AppLanguage.ENGLISH -> "Native Features"
        AppLanguage.ARABIC -> "الميزات الأصلية"
    }
    val snippetNativeDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "调用原生能力，如分享、震动、剪贴板等"
        AppLanguage.ENGLISH -> "Call native capabilities like share, vibrate, clipboard, etc."
        AppLanguage.ARABIC -> "استدعاء القدرات الأصلية مثل المشاركة والاهتزاز والحافظة وما إلى ذلك"
    }
    val snippetShowToast: String get() = when (lang) {
        AppLanguage.CHINESE -> "显示 Toast 提示"
        AppLanguage.ENGLISH -> "Show Toast Message"
        AppLanguage.ARABIC -> "عرض رسالة Toast"
    }
    val snippetShowToastDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "显示原生 Toast 消息提示"
        AppLanguage.ENGLISH -> "Show native Toast message"
        AppLanguage.ARABIC -> "عرض رسالة Toast الأصلية"
    }
    val snippetVibrate: String get() = when (lang) {
        AppLanguage.CHINESE -> "震动反馈"
        AppLanguage.ENGLISH -> "Vibration Feedback"
        AppLanguage.ARABIC -> "استجابة الاهتزاز"
    }
    val snippetVibrateDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "触发手机震动"
        AppLanguage.ENGLISH -> "Trigger phone vibration"
        AppLanguage.ARABIC -> "تشغيل اهتزاز الهاتف"
    }
    val snippetCopyToClipboard: String get() = when (lang) {
        AppLanguage.CHINESE -> "复制到剪贴板"
        AppLanguage.ENGLISH -> "Copy to Clipboard"
        AppLanguage.ARABIC -> "نسخ إلى الحافظة"
    }
    val snippetCopyToClipboardDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "复制文本到系统剪贴板"
        AppLanguage.ENGLISH -> "Copy text to system clipboard"
        AppLanguage.ARABIC -> "نسخ النص إلى حافظة النظام"
    }
    val snippetSaveVideoToGallery: String get() = when (lang) {
        AppLanguage.CHINESE -> "保存视频到相册"
        AppLanguage.ENGLISH -> "Save Video to Gallery"
        AppLanguage.ARABIC -> "حفظ الفيديو في المعرض"
    }
    val snippetSaveVideoToGalleryDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "将视频保存到手机相册"
        AppLanguage.ENGLISH -> "Save video to phone gallery"
        AppLanguage.ARABIC -> "حفظ الفيديو في معرض الهاتف"
    }
    val snippetOpenInBrowser: String get() = when (lang) {
        AppLanguage.CHINESE -> "用浏览器打开链接"
        AppLanguage.ENGLISH -> "Open Link in Browser"
        AppLanguage.ARABIC -> "فتح الرابط في المتصفح"
    }
    val snippetOpenInBrowserDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "使用系统浏览器打开外部链接"
        AppLanguage.ENGLISH -> "Open external link with system browser"
        AppLanguage.ARABIC -> "فتح الرابط الخارجي باستخدام متصفح النظام"
    }
    val snippetDeviceInfo: String get() = when (lang) {
        AppLanguage.CHINESE -> "获取设备信息"
        AppLanguage.ENGLISH -> "Get Device Info"
        AppLanguage.ARABIC -> "الحصول على معلومات الجهاز"
    }
    val snippetDeviceInfoDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "获取手机设备和应用信息"
        AppLanguage.ENGLISH -> "Get phone device and app info"
        AppLanguage.ARABIC -> "الحصول على معلومات الجهاز والتطبيق"
    }
    val snippetNetworkStatus: String get() = when (lang) {
        AppLanguage.CHINESE -> "检查网络状态"
        AppLanguage.ENGLISH -> "Check Network Status"
        AppLanguage.ARABIC -> "التحقق من حالة الشبكة"
    }
    val snippetNetworkStatusDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "检查网络连接状态和类型"
        AppLanguage.ENGLISH -> "Check network connection status and type"
        AppLanguage.ARABIC -> "التحقق من حالة ونوع اتصال الشبكة"
    }
    val snippetSaveFile: String get() = when (lang) {
        AppLanguage.CHINESE -> "保存文件"
        AppLanguage.ENGLISH -> "Save File"
        AppLanguage.ARABIC -> "حفظ الملف"
    }
    val snippetSaveFileDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "将内容保存为文件"
        AppLanguage.ENGLISH -> "Save content as file"
        AppLanguage.ARABIC -> "حفظ المحتوى كملف"
    }
    val snippetImageDownloadBtn: String get() = when (lang) {
        AppLanguage.CHINESE -> "图片下载按钮"
        AppLanguage.ENGLISH -> "Image Download Button"
        AppLanguage.ARABIC -> "زر تنزيل الصورة"
    }
    val snippetImageDownloadBtnDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "为图片添加悬浮下载按钮"
        AppLanguage.ENGLISH -> "Add floating download button to images"
        AppLanguage.ARABIC -> "إضافة زر تنزيل عائم للصور"
    }
    val snippetDom: String get() = when (lang) {
        AppLanguage.CHINESE -> "DOM 操作"
        AppLanguage.ENGLISH -> "DOM Operations"
        AppLanguage.ARABIC -> "عمليات DOM"
    }
    val snippetDomDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "页面元素的查询、修改、创建和删除"
        AppLanguage.ENGLISH -> "Query, modify, create and delete page elements"
        AppLanguage.ARABIC -> "استعلام وتعديل وإنشاء وحذف عناصر الصفحة"
    }
    val snippetStyle: String get() = when (lang) {
        AppLanguage.CHINESE -> "样式操作"
        AppLanguage.ENGLISH -> "Style Operations"
        AppLanguage.ARABIC -> "عمليات الأنماط"
    }
    val snippetStyleDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "CSS 样式的注入、修改和动态控制"
        AppLanguage.ENGLISH -> "CSS style injection, modification and dynamic control"
        AppLanguage.ARABIC -> "حقن وتعديل وتحكم ديناميكي في أنماط CSS"
    }
    val snippetEvent: String get() = when (lang) {
        AppLanguage.CHINESE -> "事件处理"
        AppLanguage.ENGLISH -> "Event Handling"
        AppLanguage.ARABIC -> "معالجة الأحداث"
    }
    val snippetEventDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "点击、滚动、键盘等事件的监听和处理"
        AppLanguage.ENGLISH -> "Listen and handle click, scroll, keyboard events"
        AppLanguage.ARABIC -> "الاستماع ومعالجة أحداث النقر والتمرير ولوحة المفاتيح"
    }
    val snippetStorage: String get() = when (lang) {
        AppLanguage.CHINESE -> "本地存储"
        AppLanguage.ENGLISH -> "Local Storage"
        AppLanguage.ARABIC -> "التخزين المحلي"
    }
    val snippetStorageDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "数据的本地存储和读取"
        AppLanguage.ENGLISH -> "Local data storage and retrieval"
        AppLanguage.ARABIC -> "تخزين واسترجاع البيانات المحلية"
    }
    val snippetNetwork: String get() = when (lang) {
        AppLanguage.CHINESE -> "网络请求"
        AppLanguage.ENGLISH -> "Network Requests"
        AppLanguage.ARABIC -> "طلبات الشبكة"
    }
    val snippetNetworkDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "发起网络请求和处理响应"
        AppLanguage.ENGLISH -> "Make network requests and handle responses"
        AppLanguage.ARABIC -> "إجراء طلبات الشبكة ومعالجة الاستجابات"
    }
    val snippetUi: String get() = when (lang) {
        AppLanguage.CHINESE -> "UI 增强"
        AppLanguage.ENGLISH -> "UI Enhancement"
        AppLanguage.ARABIC -> "تحسين واجهة المستخدم"
    }
    val snippetUiDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "悬浮按钮、弹窗、通知等 UI 组件"
        AppLanguage.ENGLISH -> "Floating buttons, popups, notifications and other UI components"
        AppLanguage.ARABIC -> "أزرار عائمة، نوافذ منبثقة، إشعارات ومكونات واجهة أخرى"
    }
    val snippetWidget: String get() = when (lang) {
        AppLanguage.CHINESE -> "悬浮组件"
        AppLanguage.ENGLISH -> "Floating Widgets"
        AppLanguage.ARABIC -> "أدوات عائمة"
    }
    val snippetWidgetDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "悬浮面板、工具栏、侧边栏等"
        AppLanguage.ENGLISH -> "Floating panels, toolbars, sidebars"
        AppLanguage.ARABIC -> "لوحات عائمة، أشرطة أدوات، أشرطة جانبية"
    }
    val snippetNotification: String get() = when (lang) {
        AppLanguage.CHINESE -> "通知系统"
        AppLanguage.ENGLISH -> "Notification System"
        AppLanguage.ARABIC -> "نظام الإشعارات"
    }
    val snippetNotificationDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "各种通知和提醒功能"
        AppLanguage.ENGLISH -> "Various notification and alert features"
        AppLanguage.ARABIC -> "ميزات الإشعارات والتنبيهات المختلفة"
    }
    val snippetScroll: String get() = when (lang) {
        AppLanguage.CHINESE -> "滚动操作"
        AppLanguage.ENGLISH -> "Scroll Operations"
        AppLanguage.ARABIC -> "عمليات التمرير"
    }
    val snippetScrollDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "页面滚动控制和自动滚动"
        AppLanguage.ENGLISH -> "Page scroll control and auto-scroll"
        AppLanguage.ARABIC -> "التحكم في تمرير الصفحة والتمرير التلقائي"
    }
    
    // DOM 操作代码片段
    val snippetQuerySingle: String get() = when (lang) {
        AppLanguage.CHINESE -> "查询单个元素"
        AppLanguage.ENGLISH -> "Query Single Element"
        AppLanguage.ARABIC -> "استعلام عنصر واحد"
    }
    val snippetQuerySingleDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "使用 CSS 选择器查询单个元素"
        AppLanguage.ENGLISH -> "Query single element using CSS selector"
        AppLanguage.ARABIC -> "استعلام عنصر واحد باستخدام محدد CSS"
    }
    val snippetQueryAll: String get() = when (lang) {
        AppLanguage.CHINESE -> "查询所有元素"
        AppLanguage.ENGLISH -> "Query All Elements"
        AppLanguage.ARABIC -> "استعلام جميع العناصر"
    }
    val snippetQueryAllDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "使用 CSS 选择器查询所有匹配元素"
        AppLanguage.ENGLISH -> "Query all matching elements using CSS selector"
        AppLanguage.ARABIC -> "استعلام جميع العناصر المطابقة باستخدام محدد CSS"
    }
    val snippetHideElement: String get() = when (lang) {
        AppLanguage.CHINESE -> "隐藏元素"
        AppLanguage.ENGLISH -> "Hide Element"
        AppLanguage.ARABIC -> "إخفاء العنصر"
    }
    val snippetHideElementDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "隐藏指定的页面元素"
        AppLanguage.ENGLISH -> "Hide specified page element"
        AppLanguage.ARABIC -> "إخفاء عنصر الصفحة المحدد"
    }
    val snippetRemoveElement: String get() = when (lang) {
        AppLanguage.CHINESE -> "删除元素"
        AppLanguage.ENGLISH -> "Remove Element"
        AppLanguage.ARABIC -> "إزالة العنصر"
    }
    val snippetRemoveElementDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "从页面中删除指定元素"
        AppLanguage.ENGLISH -> "Remove specified element from page"
        AppLanguage.ARABIC -> "إزالة العنصر المحدد من الصفحة"
    }
    val snippetCreateElement: String get() = when (lang) {
        AppLanguage.CHINESE -> "创建元素"
        AppLanguage.ENGLISH -> "Create Element"
        AppLanguage.ARABIC -> "إنشاء عنصر"
    }
    val snippetCreateElementDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "创建并添加新元素到页面"
        AppLanguage.ENGLISH -> "Create and add new element to page"
        AppLanguage.ARABIC -> "إنشاء وإضافة عنصر جديد إلى الصفحة"
    }
    val snippetModifyText: String get() = when (lang) {
        AppLanguage.CHINESE -> "修改文本内容"
        AppLanguage.ENGLISH -> "Modify Text Content"
        AppLanguage.ARABIC -> "تعديل محتوى النص"
    }
    val snippetModifyTextDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "修改元素的文本内容"
        AppLanguage.ENGLISH -> "Modify element's text content"
        AppLanguage.ARABIC -> "تعديل محتوى نص العنصر"
    }
    val snippetModifyAttr: String get() = when (lang) {
        AppLanguage.CHINESE -> "修改属性"
        AppLanguage.ENGLISH -> "Modify Attribute"
        AppLanguage.ARABIC -> "تعديل السمة"
    }
    val snippetModifyAttrDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "修改元素的属性值"
        AppLanguage.ENGLISH -> "Modify element's attribute value"
        AppLanguage.ARABIC -> "تعديل قيمة سمة العنصر"
    }
    val snippetInsertBefore: String get() = when (lang) {
        AppLanguage.CHINESE -> "在元素前插入"
        AppLanguage.ENGLISH -> "Insert Before Element"
        AppLanguage.ARABIC -> "إدراج قبل العنصر"
    }
    val snippetInsertBeforeDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "在指定元素前插入新元素"
        AppLanguage.ENGLISH -> "Insert new element before specified element"
        AppLanguage.ARABIC -> "إدراج عنصر جديد قبل العنصر المحدد"
    }
    val snippetInsertAfter: String get() = when (lang) {
        AppLanguage.CHINESE -> "在元素后插入"
        AppLanguage.ENGLISH -> "Insert After Element"
        AppLanguage.ARABIC -> "إدراج بعد العنصر"
    }
    val snippetInsertAfterDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "在指定元素后插入新元素"
        AppLanguage.ENGLISH -> "Insert new element after specified element"
        AppLanguage.ARABIC -> "إدراج عنصر جديد بعد العنصر المحدد"
    }
    val snippetCloneElement: String get() = when (lang) {
        AppLanguage.CHINESE -> "克隆元素"
        AppLanguage.ENGLISH -> "Clone Element"
        AppLanguage.ARABIC -> "استنساخ العنصر"
    }
    val snippetCloneElementDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "克隆一个元素及其子元素"
        AppLanguage.ENGLISH -> "Clone an element and its children"
        AppLanguage.ARABIC -> "استنساخ عنصر وعناصره الفرعية"
    }
    val snippetWrapElement: String get() = when (lang) {
        AppLanguage.CHINESE -> "包裹元素"
        AppLanguage.ENGLISH -> "Wrap Element"
        AppLanguage.ARABIC -> "لف العنصر"
    }
    val snippetWrapElementDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "用新元素包裹现有元素"
        AppLanguage.ENGLISH -> "Wrap existing element with new element"
        AppLanguage.ARABIC -> "لف العنصر الموجود بعنصر جديد"
    }
    val snippetReplaceElement: String get() = when (lang) {
        AppLanguage.CHINESE -> "替换元素"
        AppLanguage.ENGLISH -> "Replace Element"
        AppLanguage.ARABIC -> "استبدال العنصر"
    }
    val snippetReplaceElementDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "用新元素替换现有元素"
        AppLanguage.ENGLISH -> "Replace existing element with new element"
        AppLanguage.ARABIC -> "استبدال العنصر الموجود بعنصر جديد"
    }
    val snippetUtil: String get() = when (lang) {
        AppLanguage.CHINESE -> "工具函数"
        AppLanguage.ENGLISH -> "Utility Functions"
        AppLanguage.ARABIC -> "الوظائف المساعدة"
    }
    val snippetUtilDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "常用工具函数和辅助方法"
        AppLanguage.ENGLISH -> "Common utility functions and helper methods"
        AppLanguage.ARABIC -> "الوظائف المساعدة والأساليب الشائعة"
    }
    val snippetData: String get() = when (lang) {
        AppLanguage.CHINESE -> "数据处理"
        AppLanguage.ENGLISH -> "Data Processing"
        AppLanguage.ARABIC -> "معالجة البيانات"
    }
    val snippetDataDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "数据提取、转换、导出等操作"
        AppLanguage.ENGLISH -> "Data extraction, transformation, export operations"
        AppLanguage.ARABIC -> "استخراج البيانات وتحويلها وتصديرها"
    }
    val snippetSaveImageToGallery: String get() = when (lang) {
        AppLanguage.CHINESE -> "保存图片到相册"
        AppLanguage.ENGLISH -> "Save Image to Gallery"
        AppLanguage.ARABIC -> "حفظ الصورة في المعرض"
    }
    val snippetSaveImageToGalleryDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "将图片保存到手机相册"
        AppLanguage.ENGLISH -> "Save image to phone gallery"
        AppLanguage.ARABIC -> "حفظ الصورة في معرض الهاتف"
    }
    val snippetShareContent: String get() = when (lang) {
        AppLanguage.CHINESE -> "分享内容"
        AppLanguage.ENGLISH -> "Share Content"
        AppLanguage.ARABIC -> "مشاركة المحتوى"
    }
    val snippetShareContentDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "调用系统分享功能"
        AppLanguage.ENGLISH -> "Call system share function"
        AppLanguage.ARABIC -> "استدعاء وظيفة المشاركة في النظام"
    }
    val snippetInjectCss: String get() = when (lang) {
        AppLanguage.CHINESE -> "注入 CSS 样式"
        AppLanguage.ENGLISH -> "Inject CSS Styles"
        AppLanguage.ARABIC -> "حقن أنماط CSS"
    }
    val snippetInjectCssDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "向页面注入自定义 CSS"
        AppLanguage.ENGLISH -> "Inject custom CSS into page"
        AppLanguage.ARABIC -> "حقن CSS مخصص في الصفحة"
    }
    val snippetModifyInline: String get() = when (lang) {
        AppLanguage.CHINESE -> "修改内联样式"
        AppLanguage.ENGLISH -> "Modify Inline Style"
        AppLanguage.ARABIC -> "تعديل النمط المضمن"
    }
    val snippetModifyInlineDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "直接修改元素的内联样式"
        AppLanguage.ENGLISH -> "Directly modify element's inline style"
        AppLanguage.ARABIC -> "تعديل النمط المضمن للعنصر مباشرة"
    }
    val snippetAddClass: String get() = when (lang) {
        AppLanguage.CHINESE -> "添加/移除类名"
        AppLanguage.ENGLISH -> "Add/Remove Class"
        AppLanguage.ARABIC -> "إضافة/إزالة الفئة"
    }
    val snippetAddClassDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "操作元素的 CSS 类"
        AppLanguage.ENGLISH -> "Manipulate element's CSS classes"
        AppLanguage.ARABIC -> "التعامل مع فئات CSS للعنصر"
    }
    val snippetDarkMode: String get() = when (lang) {
        AppLanguage.CHINESE -> "深色模式"
        AppLanguage.ENGLISH -> "Dark Mode"
        AppLanguage.ARABIC -> "الوضع الداكن"
    }
    val snippetDarkModeDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "为页面启用深色模式"
        AppLanguage.ENGLISH -> "Enable dark mode for page"
        AppLanguage.ARABIC -> "تمكين الوضع الداكن للصفحة"
    }
    val snippetSepiaMode: String get() = when (lang) {
        AppLanguage.CHINESE -> "护眼模式（暖色）"
        AppLanguage.ENGLISH -> "Eye Protection Mode (Warm)"
        AppLanguage.ARABIC -> "وضع حماية العين (دافئ)"
    }
    val snippetSepiaModeDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "为页面添加暖色滤镜"
        AppLanguage.ENGLISH -> "Add warm color filter to page"
        AppLanguage.ARABIC -> "إضافة فلتر لون دافئ للصفحة"
    }
    val snippetGrayscale: String get() = when (lang) {
        AppLanguage.CHINESE -> "灰度模式"
        AppLanguage.ENGLISH -> "Grayscale Mode"
        AppLanguage.ARABIC -> "وضع التدرج الرمادي"
    }
    val snippetGrayscaleDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "将页面转为灰度显示"
        AppLanguage.ENGLISH -> "Convert page to grayscale"
        AppLanguage.ARABIC -> "تحويل الصفحة إلى تدرج رمادي"
    }
    val snippetCustomFont: String get() = when (lang) {
        AppLanguage.CHINESE -> "自定义字体"
        AppLanguage.ENGLISH -> "Custom Font"
        AppLanguage.ARABIC -> "خط مخصص"
    }
    val snippetCustomFontDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "替换页面字体"
        AppLanguage.ENGLISH -> "Replace page font"
        AppLanguage.ARABIC -> "استبدال خط الصفحة"
    }
    val snippetFontSize: String get() = when (lang) {
        AppLanguage.CHINESE -> "调整字体大小"
        AppLanguage.ENGLISH -> "Adjust Font Size"
        AppLanguage.ARABIC -> "ضبط حجم الخط"
    }
    val snippetFontSizeDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "统一调整页面字体大小"
        AppLanguage.ENGLISH -> "Uniformly adjust page font size"
        AppLanguage.ARABIC -> "ضبط حجم خط الصفحة بشكل موحد"
    }
    val snippetHideScrollbar: String get() = when (lang) {
        AppLanguage.CHINESE -> "隐藏滚动条"
        AppLanguage.ENGLISH -> "Hide Scrollbar"
        AppLanguage.ARABIC -> "إخفاء شريط التمرير"
    }
    val snippetHideScrollbarDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "隐藏页面滚动条但保留滚动功能"
        AppLanguage.ENGLISH -> "Hide scrollbar but keep scroll function"
        AppLanguage.ARABIC -> "إخفاء شريط التمرير مع الاحتفاظ بوظيفة التمرير"
    }
    val snippetHighlightLinks: String get() = when (lang) {
        AppLanguage.CHINESE -> "高亮链接"
        AppLanguage.ENGLISH -> "Highlight Links"
        AppLanguage.ARABIC -> "تمييز الروابط"
    }
    val snippetHighlightLinksDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "高亮显示页面所有链接"
        AppLanguage.ENGLISH -> "Highlight all links on page"
        AppLanguage.ARABIC -> "تمييز جميع الروابط في الصفحة"
    }
    val snippetMaxWidth: String get() = when (lang) {
        AppLanguage.CHINESE -> "限制内容宽度"
        AppLanguage.ENGLISH -> "Limit Content Width"
        AppLanguage.ARABIC -> "تحديد عرض المحتوى"
    }
    val snippetMaxWidthDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "限制页面内容最大宽度，提升阅读体验"
        AppLanguage.ENGLISH -> "Limit max content width for better reading"
        AppLanguage.ARABIC -> "تحديد أقصى عرض للمحتوى لقراءة أفضل"
    }
    val snippetLineHeight: String get() = when (lang) {
        AppLanguage.CHINESE -> "调整行高"
        AppLanguage.ENGLISH -> "Adjust Line Height"
        AppLanguage.ARABIC -> "ضبط ارتفاع السطر"
    }
    val snippetLineHeightDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "增加行高提升阅读舒适度"
        AppLanguage.ENGLISH -> "Increase line height for reading comfort"
        AppLanguage.ARABIC -> "زيادة ارتفاع السطر لراحة القراءة"
    }
    
    // 事件监听代码片段
    val snippetClickEvent: String get() = when (lang) {
        AppLanguage.CHINESE -> "点击事件"
        AppLanguage.ENGLISH -> "Click Event"
        AppLanguage.ARABIC -> "حدث النقر"
    }
    val snippetClickEventDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "监听元素点击事件"
        AppLanguage.ENGLISH -> "Listen for element click events"
        AppLanguage.ARABIC -> "الاستماع لأحداث نقر العناصر"
    }
    val snippetKeyboardEvent: String get() = when (lang) {
        AppLanguage.CHINESE -> "键盘事件"
        AppLanguage.ENGLISH -> "Keyboard Event"
        AppLanguage.ARABIC -> "حدث لوحة المفاتيح"
    }
    val snippetKeyboardEventDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "监听键盘按键"
        AppLanguage.ENGLISH -> "Listen for keyboard keys"
        AppLanguage.ARABIC -> "الاستماع لمفاتيح لوحة المفاتيح"
    }
    val snippetScrollEvent: String get() = when (lang) {
        AppLanguage.CHINESE -> "滚动事件"
        AppLanguage.ENGLISH -> "Scroll Event"
        AppLanguage.ARABIC -> "حدث التمرير"
    }
    val snippetScrollEventDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "监听页面滚动"
        AppLanguage.ENGLISH -> "Listen for page scroll"
        AppLanguage.ARABIC -> "الاستماع لتمرير الصفحة"
    }
    val snippetMutationEvent: String get() = when (lang) {
        AppLanguage.CHINESE -> "DOM 变化监听"
        AppLanguage.ENGLISH -> "DOM Mutation Observer"
        AppLanguage.ARABIC -> "مراقب تغييرات DOM"
    }
    val snippetMutationEventDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "监听 DOM 结构变化，适合处理动态加载内容"
        AppLanguage.ENGLISH -> "Observe DOM changes, suitable for dynamic content"
        AppLanguage.ARABIC -> "مراقبة تغييرات DOM، مناسب للمحتوى الديناميكي"
    }
    val snippetResizeEvent: String get() = when (lang) {
        AppLanguage.CHINESE -> "窗口大小变化"
        AppLanguage.ENGLISH -> "Window Resize"
        AppLanguage.ARABIC -> "تغيير حجم النافذة"
    }
    val snippetResizeEventDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "监听窗口大小变化"
        AppLanguage.ENGLISH -> "Listen for window resize"
        AppLanguage.ARABIC -> "الاستماع لتغيير حجم النافذة"
    }
    val snippetCopyEvent: String get() = when (lang) {
        AppLanguage.CHINESE -> "复制事件"
        AppLanguage.ENGLISH -> "Copy Event"
        AppLanguage.ARABIC -> "حدث النسخ"
    }
    val snippetCopyEventDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "监听或拦截复制操作"
        AppLanguage.ENGLISH -> "Listen or intercept copy operation"
        AppLanguage.ARABIC -> "الاستماع أو اعتراض عملية النسخ"
    }
    val snippetContextMenu: String get() = when (lang) {
        AppLanguage.CHINESE -> "右键菜单"
        AppLanguage.ENGLISH -> "Context Menu"
        AppLanguage.ARABIC -> "قائمة السياق"
    }
    val snippetContextMenuDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "自定义或禁用右键菜单"
        AppLanguage.ENGLISH -> "Customize or disable context menu"
        AppLanguage.ARABIC -> "تخصيص أو تعطيل قائمة السياق"
    }
    val snippetVisibility: String get() = when (lang) {
        AppLanguage.CHINESE -> "页面可见性变化"
        AppLanguage.ENGLISH -> "Page Visibility Change"
        AppLanguage.ARABIC -> "تغيير رؤية الصفحة"
    }
    val snippetVisibilityDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "监听页面切换到后台/前台"
        AppLanguage.ENGLISH -> "Listen for page background/foreground switch"
        AppLanguage.ARABIC -> "الاستماع لتبديل الصفحة للخلفية/المقدمة"
    }
    val snippetBeforeUnload: String get() = when (lang) {
        AppLanguage.CHINESE -> "页面关闭前"
        AppLanguage.ENGLISH -> "Before Page Unload"
        AppLanguage.ARABIC -> "قبل إغلاق الصفحة"
    }
    val snippetBeforeUnloadDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "页面关闭前执行操作"
        AppLanguage.ENGLISH -> "Execute operations before page closes"
        AppLanguage.ARABIC -> "تنفيذ العمليات قبل إغلاق الصفحة"
    }
    val snippetTouchEvent: String get() = when (lang) {
        AppLanguage.CHINESE -> "触摸事件"
        AppLanguage.ENGLISH -> "Touch Event"
        AppLanguage.ARABIC -> "حدث اللمس"
    }
    val snippetTouchEventDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "监听触摸操作"
        AppLanguage.ENGLISH -> "Listen for touch operations"
        AppLanguage.ARABIC -> "الاستماع لعمليات اللمس"
    }
    val snippetLongPress: String get() = when (lang) {
        AppLanguage.CHINESE -> "长按事件"
        AppLanguage.ENGLISH -> "Long Press Event"
        AppLanguage.ARABIC -> "حدث الضغط المطول"
    }
    val snippetLongPressDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "监听长按操作"
        AppLanguage.ENGLISH -> "Listen for long press operations"
        AppLanguage.ARABIC -> "الاستماع لعمليات الضغط المطول"
    }
    
    // 存储操作代码片段
    val snippetLocalSet: String get() = when (lang) {
        AppLanguage.CHINESE -> "保存到本地存储"
        AppLanguage.ENGLISH -> "Save to Local Storage"
        AppLanguage.ARABIC -> "حفظ في التخزين المحلي"
    }
    val snippetLocalSetDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "将数据保存到 localStorage"
        AppLanguage.ENGLISH -> "Save data to localStorage"
        AppLanguage.ARABIC -> "حفظ البيانات في localStorage"
    }
    val snippetLocalGet: String get() = when (lang) {
        AppLanguage.CHINESE -> "从本地存储读取"
        AppLanguage.ENGLISH -> "Read from Local Storage"
        AppLanguage.ARABIC -> "قراءة من التخزين المحلي"
    }
    val snippetLocalGetDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "从 localStorage 读取数据"
        AppLanguage.ENGLISH -> "Read data from localStorage"
        AppLanguage.ARABIC -> "قراءة البيانات من localStorage"
    }
    val snippetSessionStorage: String get() = when (lang) {
        AppLanguage.CHINESE -> "会话存储"
        AppLanguage.ENGLISH -> "Session Storage"
        AppLanguage.ARABIC -> "تخزين الجلسة"
    }
    val snippetSessionStorageDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "使用 sessionStorage 临时存储"
        AppLanguage.ENGLISH -> "Use sessionStorage for temporary storage"
        AppLanguage.ARABIC -> "استخدام sessionStorage للتخزين المؤقت"
    }
    val snippetSetCookie: String get() = when (lang) {
        AppLanguage.CHINESE -> "设置 Cookie"
        AppLanguage.ENGLISH -> "Set Cookie"
        AppLanguage.ARABIC -> "تعيين ملف تعريف الارتباط"
    }
    val snippetSetCookieDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "设置浏览器 Cookie"
        AppLanguage.ENGLISH -> "Set browser Cookie"
        AppLanguage.ARABIC -> "تعيين ملف تعريف ارتباط المتصفح"
    }
    val snippetGetCookie: String get() = when (lang) {
        AppLanguage.CHINESE -> "读取 Cookie"
        AppLanguage.ENGLISH -> "Get Cookie"
        AppLanguage.ARABIC -> "قراءة ملف تعريف الارتباط"
    }
    val snippetGetCookieDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "读取浏览器 Cookie"
        AppLanguage.ENGLISH -> "Read browser Cookie"
        AppLanguage.ARABIC -> "قراءة ملف تعريف ارتباط المتصفح"
    }
    val snippetDeleteCookie: String get() = when (lang) {
        AppLanguage.CHINESE -> "删除 Cookie"
        AppLanguage.ENGLISH -> "Delete Cookie"
        AppLanguage.ARABIC -> "حذف ملف تعريف الارتباط"
    }
    val snippetDeleteCookieDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "删除指定 Cookie"
        AppLanguage.ENGLISH -> "Delete specified Cookie"
        AppLanguage.ARABIC -> "حذف ملف تعريف الارتباط المحدد"
    }
    val snippetIndexedDB: String get() = when (lang) {
        AppLanguage.CHINESE -> "IndexedDB 存储"
        AppLanguage.ENGLISH -> "IndexedDB Storage"
        AppLanguage.ARABIC -> "تخزين IndexedDB"
    }
    val snippetIndexedDBDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "使用 IndexedDB 存储大量数据"
        AppLanguage.ENGLISH -> "Use IndexedDB for large data storage"
        AppLanguage.ARABIC -> "استخدام IndexedDB لتخزين كميات كبيرة من البيانات"
    }
    
    // 网络请求代码片段
    val snippetGetRequest: String get() = when (lang) {
        AppLanguage.CHINESE -> "GET 请求"
        AppLanguage.ENGLISH -> "GET Request"
        AppLanguage.ARABIC -> "طلب GET"
    }
    val snippetGetRequestDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "发送 GET 请求获取数据"
        AppLanguage.ENGLISH -> "Send GET request to fetch data"
        AppLanguage.ARABIC -> "إرسال طلب GET لجلب البيانات"
    }
    val snippetPostRequest: String get() = when (lang) {
        AppLanguage.CHINESE -> "POST 请求"
        AppLanguage.ENGLISH -> "POST Request"
        AppLanguage.ARABIC -> "طلب POST"
    }
    val snippetPostRequestDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "发送 POST 请求提交数据"
        AppLanguage.ENGLISH -> "Send POST request to submit data"
        AppLanguage.ARABIC -> "إرسال طلب POST لإرسال البيانات"
    }
    val snippetTimeoutRequest: String get() = when (lang) {
        AppLanguage.CHINESE -> "带超时的请求"
        AppLanguage.ENGLISH -> "Request with Timeout"
        AppLanguage.ARABIC -> "طلب مع مهلة"
    }
    val snippetTimeoutRequestDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "设置请求超时时间"
        AppLanguage.ENGLISH -> "Set request timeout"
        AppLanguage.ARABIC -> "تعيين مهلة الطلب"
    }
    val snippetRetryRequest: String get() = when (lang) {
        AppLanguage.CHINESE -> "请求重试"
        AppLanguage.ENGLISH -> "Request Retry"
        AppLanguage.ARABIC -> "إعادة محاولة الطلب"
    }
    val snippetRetryRequestDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "失败后自动重试"
        AppLanguage.ENGLISH -> "Auto retry on failure"
        AppLanguage.ARABIC -> "إعادة المحاولة تلقائياً عند الفشل"
    }
    val snippetDownloadFile: String get() = when (lang) {
        AppLanguage.CHINESE -> "下载文件"
        AppLanguage.ENGLISH -> "Download File"
        AppLanguage.ARABIC -> "تنزيل الملف"
    }
    val snippetDownloadFileDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "下载文件到本地"
        AppLanguage.ENGLISH -> "Download file to local"
        AppLanguage.ARABIC -> "تنزيل الملف محلياً"
    }
    val snippetJsonp: String get() = when (lang) {
        AppLanguage.CHINESE -> "JSONP 请求"
        AppLanguage.ENGLISH -> "JSONP Request"
        AppLanguage.ARABIC -> "طلب JSONP"
    }
    val snippetJsonpDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "跨域 JSONP 请求"
        AppLanguage.ENGLISH -> "Cross-domain JSONP request"
        AppLanguage.ARABIC -> "طلب JSONP عبر النطاقات"
    }
    
    // 数据处理代码片段
    val snippetExtractTable: String get() = when (lang) {
        AppLanguage.CHINESE -> "提取表格数据"
        AppLanguage.ENGLISH -> "Extract Table Data"
        AppLanguage.ARABIC -> "استخراج بيانات الجدول"
    }
    val snippetExtractTableDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "将 HTML 表格转换为 JSON"
        AppLanguage.ENGLISH -> "Convert HTML table to JSON"
        AppLanguage.ARABIC -> "تحويل جدول HTML إلى JSON"
    }
    val snippetExtractLinks: String get() = when (lang) {
        AppLanguage.CHINESE -> "提取所有链接"
        AppLanguage.ENGLISH -> "Extract All Links"
        AppLanguage.ARABIC -> "استخراج جميع الروابط"
    }
    val snippetExtractLinksDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "提取页面所有链接"
        AppLanguage.ENGLISH -> "Extract all links from page"
        AppLanguage.ARABIC -> "استخراج جميع الروابط من الصفحة"
    }
    val snippetExtractImages: String get() = when (lang) {
        AppLanguage.CHINESE -> "提取所有图片"
        AppLanguage.ENGLISH -> "Extract All Images"
        AppLanguage.ARABIC -> "استخراج جميع الصور"
    }
    val snippetExtractImagesDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "提取页面所有图片地址"
        AppLanguage.ENGLISH -> "Extract all image URLs from page"
        AppLanguage.ARABIC -> "استخراج جميع عناوين الصور من الصفحة"
    }
    val snippetExportJson: String get() = when (lang) {
        AppLanguage.CHINESE -> "导出为 JSON"
        AppLanguage.ENGLISH -> "Export as JSON"
        AppLanguage.ARABIC -> "تصدير كـ JSON"
    }
    val snippetExportJsonDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "将数据导出为 JSON 文件"
        AppLanguage.ENGLISH -> "Export data as JSON file"
        AppLanguage.ARABIC -> "تصدير البيانات كملف JSON"
    }
    val snippetExportCsv: String get() = when (lang) {
        AppLanguage.CHINESE -> "导出为 CSV"
        AppLanguage.ENGLISH -> "Export as CSV"
        AppLanguage.ARABIC -> "تصدير كـ CSV"
    }
    val snippetExportCsvDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "将数据导出为 CSV 文件"
        AppLanguage.ENGLISH -> "Export data as CSV file"
        AppLanguage.ARABIC -> "تصدير البيانات كملف CSV"
    }
    val snippetParseUrl: String get() = when (lang) {
        AppLanguage.CHINESE -> "解析 URL 参数"
        AppLanguage.ENGLISH -> "Parse URL Parameters"
        AppLanguage.ARABIC -> "تحليل معلمات URL"
    }
    val snippetParseUrlDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "解析 URL 查询参数"
        AppLanguage.ENGLISH -> "Parse URL query parameters"
        AppLanguage.ARABIC -> "تحليل معلمات استعلام URL"
    }
    val snippetBuildUrl: String get() = when (lang) {
        AppLanguage.CHINESE -> "构建 URL"
        AppLanguage.ENGLISH -> "Build URL"
        AppLanguage.ARABIC -> "بناء URL"
    }
    val snippetBuildUrlDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "构建带参数的 URL"
        AppLanguage.ENGLISH -> "Build URL with parameters"
        AppLanguage.ARABIC -> "بناء URL مع المعلمات"
    }
    val snippetFloatingButton: String get() = when (lang) {
        AppLanguage.CHINESE -> "悬浮按钮"
        AppLanguage.ENGLISH -> "Floating Button"
        AppLanguage.ARABIC -> "زر عائم"
    }
    val snippetFloatingButtonDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "创建一个悬浮操作按钮"
        AppLanguage.ENGLISH -> "Create a floating action button"
        AppLanguage.ARABIC -> "إنشاء زر إجراء عائم"
    }
    val snippetToastUi: String get() = when (lang) {
        AppLanguage.CHINESE -> "Toast 提示"
        AppLanguage.ENGLISH -> "Toast Message"
        AppLanguage.ARABIC -> "رسالة Toast"
    }
    val snippetToastUiDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "显示短暂的提示消息"
        AppLanguage.ENGLISH -> "Show brief toast message"
        AppLanguage.ARABIC -> "عرض رسالة Toast قصيرة"
    }
    val snippetModal: String get() = when (lang) {
        AppLanguage.CHINESE -> "模态弹窗"
        AppLanguage.ENGLISH -> "Modal Dialog"
        AppLanguage.ARABIC -> "نافذة حوار نموذجية"
    }
    val snippetModalDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "创建模态对话框"
        AppLanguage.ENGLISH -> "Create modal dialog"
        AppLanguage.ARABIC -> "إنشاء نافذة حوار نموذجية"
    }
    val snippetProgressBar: String get() = when (lang) {
        AppLanguage.CHINESE -> "阅读进度条"
        AppLanguage.ENGLISH -> "Reading Progress Bar"
        AppLanguage.ARABIC -> "شريط تقدم القراءة"
    }
    val snippetProgressBarDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "显示页面阅读进度"
        AppLanguage.ENGLISH -> "Show page reading progress"
        AppLanguage.ARABIC -> "عرض تقدم قراءة الصفحة"
    }
    val snippetLoading: String get() = when (lang) {
        AppLanguage.CHINESE -> "加载动画"
        AppLanguage.ENGLISH -> "Loading Animation"
        AppLanguage.ARABIC -> "رسوم متحركة للتحميل"
    }
    val snippetLoadingDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "显示加载中动画"
        AppLanguage.ENGLISH -> "Show loading animation"
        AppLanguage.ARABIC -> "عرض رسوم التحميل المتحركة"
    }
    val snippetSnackbar: String get() = when (lang) {
        AppLanguage.CHINESE -> "Snackbar 通知"
        AppLanguage.ENGLISH -> "Snackbar Notification"
        AppLanguage.ARABIC -> "إشعار Snackbar"
    }
    val snippetSnackbarDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "底部滑出通知"
        AppLanguage.ENGLISH -> "Bottom slide-out notification"
        AppLanguage.ARABIC -> "إشعار منزلق من الأسفل"
    }
    
    // 悬浮组件代码片段
    val snippetToolbar: String get() = when (lang) {
        AppLanguage.CHINESE -> "悬浮工具栏"
        AppLanguage.ENGLISH -> "Floating Toolbar"
        AppLanguage.ARABIC -> "شريط أدوات عائم"
    }
    val snippetToolbarDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "创建可拖动的悬浮工具栏"
        AppLanguage.ENGLISH -> "Create draggable floating toolbar"
        AppLanguage.ARABIC -> "إنشاء شريط أدوات عائم قابل للسحب"
    }
    val snippetSidebar: String get() = when (lang) {
        AppLanguage.CHINESE -> "侧边栏面板"
        AppLanguage.ENGLISH -> "Sidebar Panel"
        AppLanguage.ARABIC -> "لوحة الشريط الجانبي"
    }
    val snippetSidebarDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "创建可展开的侧边栏"
        AppLanguage.ENGLISH -> "Create expandable sidebar"
        AppLanguage.ARABIC -> "إنشاء شريط جانبي قابل للتوسيع"
    }
    val snippetDraggable: String get() = when (lang) {
        AppLanguage.CHINESE -> "可拖动元素"
        AppLanguage.ENGLISH -> "Draggable Element"
        AppLanguage.ARABIC -> "عنصر قابل للسحب"
    }
    val snippetDraggableDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "使元素可拖动"
        AppLanguage.ENGLISH -> "Make element draggable"
        AppLanguage.ARABIC -> "جعل العنصر قابلاً للسحب"
    }
    val snippetMiniPlayer: String get() = when (lang) {
        AppLanguage.CHINESE -> "迷你播放器"
        AppLanguage.ENGLISH -> "Mini Player"
        AppLanguage.ARABIC -> "مشغل صغير"
    }
    val snippetMiniPlayerDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "创建悬浮迷你播放器"
        AppLanguage.ENGLISH -> "Create floating mini player"
        AppLanguage.ARABIC -> "إنشاء مشغل صغير عائم"
    }
    
    // 通知系统代码片段
    val snippetBrowserNotif: String get() = when (lang) {
        AppLanguage.CHINESE -> "浏览器通知"
        AppLanguage.ENGLISH -> "Browser Notification"
        AppLanguage.ARABIC -> "إشعار المتصفح"
    }
    val snippetBrowserNotifDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "发送浏览器原生通知"
        AppLanguage.ENGLISH -> "Send browser native notification"
        AppLanguage.ARABIC -> "إرسال إشعار المتصفح الأصلي"
    }
    val snippetBadge: String get() = when (lang) {
        AppLanguage.CHINESE -> "角标提醒"
        AppLanguage.ENGLISH -> "Badge Notification"
        AppLanguage.ARABIC -> "إشعار الشارة"
    }
    val snippetBadgeDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "在元素上显示数字角标"
        AppLanguage.ENGLISH -> "Show number badge on element"
        AppLanguage.ARABIC -> "عرض شارة رقمية على العنصر"
    }
    val snippetBanner: String get() = when (lang) {
        AppLanguage.CHINESE -> "顶部横幅提醒"
        AppLanguage.ENGLISH -> "Top Banner Alert"
        AppLanguage.ARABIC -> "تنبيه اللافتة العلوية"
    }
    val snippetBannerDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "显示顶部横幅通知"
        AppLanguage.ENGLISH -> "Show top banner notification"
        AppLanguage.ARABIC -> "عرض إشعار اللافتة العلوية"
    }
    val snippetScrollToTop: String get() = when (lang) {
        AppLanguage.CHINESE -> "滚动到顶部"
        AppLanguage.ENGLISH -> "Scroll to Top"
        AppLanguage.ARABIC -> "التمرير إلى الأعلى"
    }
    val snippetScrollToTopDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "平滑滚动到页面顶部"
        AppLanguage.ENGLISH -> "Smooth scroll to page top"
        AppLanguage.ARABIC -> "التمرير السلس إلى أعلى الصفحة"
    }
    val snippetScrollToBottom: String get() = when (lang) {
        AppLanguage.CHINESE -> "滚动到底部"
        AppLanguage.ENGLISH -> "Scroll to Bottom"
        AppLanguage.ARABIC -> "التمرير إلى الأسفل"
    }
    val snippetScrollToBottomDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "平滑滚动到页面底部"
        AppLanguage.ENGLISH -> "Smooth scroll to page bottom"
        AppLanguage.ARABIC -> "التمرير السلس إلى أسفل الصفحة"
    }
    val snippetScrollToElement: String get() = when (lang) {
        AppLanguage.CHINESE -> "滚动到元素"
        AppLanguage.ENGLISH -> "Scroll to Element"
        AppLanguage.ARABIC -> "التمرير إلى العنصر"
    }
    val snippetScrollToElementDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "滚动到指定元素位置"
        AppLanguage.ENGLISH -> "Scroll to specified element position"
        AppLanguage.ARABIC -> "التمرير إلى موضع العنصر المحدد"
    }
    val snippetAutoScroll: String get() = when (lang) {
        AppLanguage.CHINESE -> "自动滚动"
        AppLanguage.ENGLISH -> "Auto Scroll"
        AppLanguage.ARABIC -> "التمرير التلقائي"
    }
    val snippetAutoScrollDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "自动滚动页面"
        AppLanguage.ENGLISH -> "Auto scroll page"
        AppLanguage.ARABIC -> "التمرير التلقائي للصفحة"
    }
    val snippetBackToTopBtn: String get() = when (lang) {
        AppLanguage.CHINESE -> "返回顶部按钮"
        AppLanguage.ENGLISH -> "Back to Top Button"
        AppLanguage.ARABIC -> "زر العودة للأعلى"
    }
    val snippetBackToTopBtnDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "添加返回顶部悬浮按钮"
        AppLanguage.ENGLISH -> "Add floating back to top button"
        AppLanguage.ARABIC -> "إضافة زر عائم للعودة للأعلى"
    }
    val snippetInfiniteScroll: String get() = when (lang) {
        AppLanguage.CHINESE -> "无限滚动加载"
        AppLanguage.ENGLISH -> "Infinite Scroll Load"
        AppLanguage.ARABIC -> "تحميل التمرير اللانهائي"
    }
    val snippetInfiniteScrollDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "滚动到底部时自动加载更多"
        AppLanguage.ENGLISH -> "Auto load more when scrolling to bottom"
        AppLanguage.ARABIC -> "تحميل المزيد تلقائياً عند التمرير للأسفل"
    }
    val snippetScrollReveal: String get() = when (lang) {
        AppLanguage.CHINESE -> "滚动显示动画"
        AppLanguage.ENGLISH -> "Scroll Reveal Animation"
        AppLanguage.ARABIC -> "رسوم متحركة للكشف عند التمرير"
    }
    val snippetScrollRevealDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "元素滚动到视口时显示动画"
        AppLanguage.ENGLISH -> "Animate elements when scrolled into viewport"
        AppLanguage.ARABIC -> "تحريك العناصر عند التمرير إلى منفذ العرض"
    }
    val snippetScrollSpy: String get() = when (lang) {
        AppLanguage.CHINESE -> "滚动监听导航"
        AppLanguage.ENGLISH -> "Scroll Spy Navigation"
        AppLanguage.ARABIC -> "مراقبة التمرير للتنقل"
    }
    val snippetScrollSpyDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "根据滚动位置高亮导航项"
        AppLanguage.ENGLISH -> "Highlight nav items based on scroll position"
        AppLanguage.ARABIC -> "تمييز عناصر التنقل بناءً على موضع التمرير"
    }
    
    // 表单操作代码片段
    val snippetForm: String get() = when (lang) {
        AppLanguage.CHINESE -> "表单操作"
        AppLanguage.ENGLISH -> "Form Operations"
        AppLanguage.ARABIC -> "عمليات النموذج"
    }
    val snippetFormDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "表单填充、验证、提交等操作"
        AppLanguage.ENGLISH -> "Form filling, validation, submission operations"
        AppLanguage.ARABIC -> "عمليات ملء النموذج والتحقق والإرسال"
    }
    val snippetAutoFill: String get() = when (lang) {
        AppLanguage.CHINESE -> "自动填充表单"
        AppLanguage.ENGLISH -> "Auto Fill Form"
        AppLanguage.ARABIC -> "ملء النموذج تلقائياً"
    }
    val snippetAutoFillDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "自动填充表单字段"
        AppLanguage.ENGLISH -> "Auto fill form fields"
        AppLanguage.ARABIC -> "ملء حقول النموذج تلقائياً"
    }
    val snippetGetFormData: String get() = when (lang) {
        AppLanguage.CHINESE -> "获取表单数据"
        AppLanguage.ENGLISH -> "Get Form Data"
        AppLanguage.ARABIC -> "الحصول على بيانات النموذج"
    }
    val snippetGetFormDataDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "获取表单所有字段值"
        AppLanguage.ENGLISH -> "Get all form field values"
        AppLanguage.ARABIC -> "الحصول على جميع قيم حقول النموذج"
    }
    val snippetFormValidate: String get() = when (lang) {
        AppLanguage.CHINESE -> "表单验证"
        AppLanguage.ENGLISH -> "Form Validation"
        AppLanguage.ARABIC -> "التحقق من النموذج"
    }
    val snippetFormValidateDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "验证表单字段"
        AppLanguage.ENGLISH -> "Validate form fields"
        AppLanguage.ARABIC -> "التحقق من حقول النموذج"
    }
    val snippetFormIntercept: String get() = when (lang) {
        AppLanguage.CHINESE -> "拦截表单提交"
        AppLanguage.ENGLISH -> "Intercept Form Submit"
        AppLanguage.ARABIC -> "اعتراض إرسال النموذج"
    }
    val snippetFormInterceptDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "拦截并处理表单提交"
        AppLanguage.ENGLISH -> "Intercept and handle form submission"
        AppLanguage.ARABIC -> "اعتراض ومعالجة إرسال النموذج"
    }
    val snippetFormClear: String get() = when (lang) {
        AppLanguage.CHINESE -> "清空表单"
        AppLanguage.ENGLISH -> "Clear Form"
        AppLanguage.ARABIC -> "مسح النموذج"
    }
    val snippetFormClearDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "清空表单所有字段"
        AppLanguage.ENGLISH -> "Clear all form fields"
        AppLanguage.ARABIC -> "مسح جميع حقول النموذج"
    }
    val snippetPasswordToggle: String get() = when (lang) {
        AppLanguage.CHINESE -> "密码显示切换"
        AppLanguage.ENGLISH -> "Password Toggle"
        AppLanguage.ARABIC -> "تبديل عرض كلمة المرور"
    }
    val snippetPasswordToggleDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "切换密码显示/隐藏"
        AppLanguage.ENGLISH -> "Toggle password show/hide"
        AppLanguage.ARABIC -> "تبديل إظهار/إخفاء كلمة المرور"
    }
    
    // 媒体操作代码片段
    val snippetMedia: String get() = when (lang) {
        AppLanguage.CHINESE -> "媒体操作"
        AppLanguage.ENGLISH -> "Media Operations"
        AppLanguage.ARABIC -> "عمليات الوسائط"
    }
    val snippetMediaDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "视频、音频、图片等媒体控制"
        AppLanguage.ENGLISH -> "Video, audio, image media control"
        AppLanguage.ARABIC -> "التحكم في وسائط الفيديو والصوت والصور"
    }
    val snippetVideoSpeed: String get() = when (lang) {
        AppLanguage.CHINESE -> "视频倍速控制"
        AppLanguage.ENGLISH -> "Video Speed Control"
        AppLanguage.ARABIC -> "التحكم في سرعة الفيديو"
    }
    val snippetVideoSpeedDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "控制视频播放速度"
        AppLanguage.ENGLISH -> "Control video playback speed"
        AppLanguage.ARABIC -> "التحكم في سرعة تشغيل الفيديو"
    }
    val snippetPiP: String get() = when (lang) {
        AppLanguage.CHINESE -> "画中画模式"
        AppLanguage.ENGLISH -> "Picture in Picture"
        AppLanguage.ARABIC -> "صورة في صورة"
    }
    val snippetPiPDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "启用视频画中画"
        AppLanguage.ENGLISH -> "Enable video picture-in-picture"
        AppLanguage.ARABIC -> "تمكين صورة داخل صورة للفيديو"
    }
    val snippetVideoScreenshot: String get() = when (lang) {
        AppLanguage.CHINESE -> "视频截图"
        AppLanguage.ENGLISH -> "Video Screenshot"
        AppLanguage.ARABIC -> "لقطة شاشة الفيديو"
    }
    val snippetVideoScreenshotDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "截取视频当前帧"
        AppLanguage.ENGLISH -> "Capture current video frame"
        AppLanguage.ARABIC -> "التقاط الإطار الحالي للفيديو"
    }
    val snippetImageZoom: String get() = when (lang) {
        AppLanguage.CHINESE -> "图片放大查看"
        AppLanguage.ENGLISH -> "Image Zoom View"
        AppLanguage.ARABIC -> "عرض الصورة مكبرة"
    }
    val snippetImageZoomDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "点击图片放大显示"
        AppLanguage.ENGLISH -> "Click image to zoom"
        AppLanguage.ARABIC -> "انقر على الصورة للتكبير"
    }
    val snippetDownloadImages: String get() = when (lang) {
        AppLanguage.CHINESE -> "批量下载图片"
        AppLanguage.ENGLISH -> "Batch Download Images"
        AppLanguage.ARABIC -> "تنزيل الصور دفعة واحدة"
    }
    val snippetDownloadImagesDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "下载页面所有图片"
        AppLanguage.ENGLISH -> "Download all images from page"
        AppLanguage.ARABIC -> "تنزيل جميع الصور من الصفحة"
    }
    val snippetAudioControl: String get() = when (lang) {
        AppLanguage.CHINESE -> "音频控制"
        AppLanguage.ENGLISH -> "Audio Control"
        AppLanguage.ARABIC -> "التحكم في الصوت"
    }
    val snippetAudioControlDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "控制页面音频播放"
        AppLanguage.ENGLISH -> "Control page audio playback"
        AppLanguage.ARABIC -> "التحكم في تشغيل صوت الصفحة"
    }
    val snippetLazyLoad: String get() = when (lang) {
        AppLanguage.CHINESE -> "图片懒加载"
        AppLanguage.ENGLISH -> "Image Lazy Load"
        AppLanguage.ARABIC -> "التحميل الكسول للصور"
    }
    val snippetLazyLoadDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "实现图片懒加载"
        AppLanguage.ENGLISH -> "Implement image lazy loading"
        AppLanguage.ARABIC -> "تنفيذ التحميل الكسول للصور"
    }
    val snippetFullscreen: String get() = when (lang) {
        AppLanguage.CHINESE -> "全屏控制"
        AppLanguage.ENGLISH -> "Fullscreen Control"
        AppLanguage.ARABIC -> "التحكم في ملء الشاشة"
    }
    val snippetFullscreenDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "控制元素全屏显示"
        AppLanguage.ENGLISH -> "Control element fullscreen display"
        AppLanguage.ARABIC -> "التحكم في عرض العنصر بملء الشاشة"
    }
    
    // 页面增强代码片段
    val snippetEnhance: String get() = when (lang) {
        AppLanguage.CHINESE -> "页面增强"
        AppLanguage.ENGLISH -> "Page Enhancement"
        AppLanguage.ARABIC -> "تحسين الصفحة"
    }
    val snippetEnhanceDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "页面功能增强和优化"
        AppLanguage.ENGLISH -> "Page feature enhancement and optimization"
        AppLanguage.ARABIC -> "تحسين وتعزيز ميزات الصفحة"
    }
    val snippetReadingMode: String get() = when (lang) {
        AppLanguage.CHINESE -> "阅读模式"
        AppLanguage.ENGLISH -> "Reading Mode"
        AppLanguage.ARABIC -> "وضع القراءة"
    }
    val snippetReadingModeDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "提取正文，简化页面"
        AppLanguage.ENGLISH -> "Extract content, simplify page"
        AppLanguage.ARABIC -> "استخراج المحتوى وتبسيط الصفحة"
    }
    val snippetCopyUnlock: String get() = when (lang) {
        AppLanguage.CHINESE -> "解除复制限制"
        AppLanguage.ENGLISH -> "Unlock Copy Restriction"
        AppLanguage.ARABIC -> "إلغاء قيود النسخ"
    }
    val snippetCopyUnlockDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "移除网页复制保护"
        AppLanguage.ENGLISH -> "Remove webpage copy protection"
        AppLanguage.ARABIC -> "إزالة حماية نسخ صفحة الويب"
    }
    val snippetPrintFriendly: String get() = when (lang) {
        AppLanguage.CHINESE -> "打印优化"
        AppLanguage.ENGLISH -> "Print Friendly"
        AppLanguage.ARABIC -> "تحسين الطباعة"
    }
    val snippetPrintFriendlyDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "优化页面打印效果"
        AppLanguage.ENGLISH -> "Optimize page print output"
        AppLanguage.ARABIC -> "تحسين إخراج طباعة الصفحة"
    }
    val snippetTextToSpeech: String get() = when (lang) {
        AppLanguage.CHINESE -> "文字转语音"
        AppLanguage.ENGLISH -> "Text to Speech"
        AppLanguage.ARABIC -> "النص إلى كلام"
    }
    val snippetTextToSpeechDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "朗读选中文字"
        AppLanguage.ENGLISH -> "Read selected text aloud"
        AppLanguage.ARABIC -> "قراءة النص المحدد بصوت عالٍ"
    }
    val snippetWordCount: String get() = when (lang) {
        AppLanguage.CHINESE -> "字数统计"
        AppLanguage.ENGLISH -> "Word Count"
        AppLanguage.ARABIC -> "عدد الكلمات"
    }
    val snippetWordCountDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "统计页面文字数量"
        AppLanguage.ENGLISH -> "Count page text quantity"
        AppLanguage.ARABIC -> "إحصاء كمية نص الصفحة"
    }
    val snippetHighlightSearch: String get() = when (lang) {
        AppLanguage.CHINESE -> "页内搜索高亮"
        AppLanguage.ENGLISH -> "In-page Search Highlight"
        AppLanguage.ARABIC -> "تمييز البحث في الصفحة"
    }
    val snippetHighlightSearchDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "搜索并高亮关键词"
        AppLanguage.ENGLISH -> "Search and highlight keywords"
        AppLanguage.ARABIC -> "البحث وتمييز الكلمات المفتاحية"
    }
    val snippetHideAds: String get() = when (lang) {
        AppLanguage.CHINESE -> "隐藏常见广告"
        AppLanguage.ENGLISH -> "Hide Common Ads"
        AppLanguage.ARABIC -> "إخفاء الإعلانات الشائعة"
    }
    val snippetHideAdsDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "隐藏常见的广告元素"
        AppLanguage.ENGLISH -> "Hide common ad elements"
        AppLanguage.ARABIC -> "إخفاء عناصر الإعلانات الشائعة"
    }
    
    // 内容过滤代码片段
    val snippetFilter: String get() = when (lang) {
        AppLanguage.CHINESE -> "内容过滤"
        AppLanguage.ENGLISH -> "Content Filter"
        AppLanguage.ARABIC -> "تصفية المحتوى"
    }
    val snippetFilterDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "过滤和筛选页面内容"
        AppLanguage.ENGLISH -> "Filter and screen page content"
        AppLanguage.ARABIC -> "تصفية وفحص محتوى الصفحة"
    }
    val snippetKeywordFilter: String get() = when (lang) {
        AppLanguage.CHINESE -> "关键词过滤"
        AppLanguage.ENGLISH -> "Keyword Filter"
        AppLanguage.ARABIC -> "تصفية الكلمات المفتاحية"
    }
    val snippetKeywordFilterDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "隐藏包含特定关键词的元素"
        AppLanguage.ENGLISH -> "Hide elements containing specific keywords"
        AppLanguage.ARABIC -> "إخفاء العناصر التي تحتوي على كلمات مفتاحية معينة"
    }
    val snippetRemoveEmpty: String get() = when (lang) {
        AppLanguage.CHINESE -> "移除空元素"
        AppLanguage.ENGLISH -> "Remove Empty Elements"
        AppLanguage.ARABIC -> "إزالة العناصر الفارغة"
    }
    val snippetRemoveEmptyDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "移除页面中的空元素"
        AppLanguage.ENGLISH -> "Remove empty elements from page"
        AppLanguage.ARABIC -> "إزالة العناصر الفارغة من الصفحة"
    }
    val snippetFilterComments: String get() = when (lang) {
        AppLanguage.CHINESE -> "过滤评论"
        AppLanguage.ENGLISH -> "Filter Comments"
        AppLanguage.ARABIC -> "تصفية التعليقات"
    }
    val snippetFilterCommentsDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "根据条件过滤评论"
        AppLanguage.ENGLISH -> "Filter comments by conditions"
        AppLanguage.ARABIC -> "تصفية التعليقات حسب الشروط"
    }
    val snippetFilterSmallImages: String get() = when (lang) {
        AppLanguage.CHINESE -> "过滤小图片"
        AppLanguage.ENGLISH -> "Filter Small Images"
        AppLanguage.ARABIC -> "تصفية الصور الصغيرة"
    }
    val snippetFilterSmallImagesDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "隐藏尺寸过小的图片"
        AppLanguage.ENGLISH -> "Hide images with small dimensions"
        AppLanguage.ARABIC -> "إخفاء الصور ذات الأبعاد الصغيرة"
    }
    
    // 广告拦截代码片段
    val snippetAdBlock: String get() = when (lang) {
        AppLanguage.CHINESE -> "广告拦截"
        AppLanguage.ENGLISH -> "Ad Blocker"
        AppLanguage.ARABIC -> "حظر الإعلانات"
    }
    val snippetAdBlockDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "屏蔽广告和弹窗"
        AppLanguage.ENGLISH -> "Block ads and popups"
        AppLanguage.ARABIC -> "حظر الإعلانات والنوافذ المنبثقة"
    }
    val snippetBlockPopup: String get() = when (lang) {
        AppLanguage.CHINESE -> "阻止弹窗"
        AppLanguage.ENGLISH -> "Block Popups"
        AppLanguage.ARABIC -> "حظر النوافذ المنبثقة"
    }
    val snippetBlockPopupDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "阻止弹窗和新窗口"
        AppLanguage.ENGLISH -> "Block popups and new windows"
        AppLanguage.ARABIC -> "حظر النوافذ المنبثقة والنوافذ الجديدة"
    }
    val snippetRemoveOverlay: String get() = when (lang) {
        AppLanguage.CHINESE -> "移除遮罩层"
        AppLanguage.ENGLISH -> "Remove Overlay"
        AppLanguage.ARABIC -> "إزالة طبقة التغطية"
    }
    val snippetRemoveOverlayDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "移除阻止阅读的遮罩"
        AppLanguage.ENGLISH -> "Remove overlays blocking reading"
        AppLanguage.ARABIC -> "إزالة طبقات التغطية التي تحجب القراءة"
    }
    val snippetCssAdBlock: String get() = when (lang) {
        AppLanguage.CHINESE -> "CSS 广告屏蔽"
        AppLanguage.ENGLISH -> "CSS Ad Blocker"
        AppLanguage.ARABIC -> "حظر الإعلانات بـ CSS"
    }
    val snippetCssAdBlockDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "使用 CSS 隐藏广告"
        AppLanguage.ENGLISH -> "Use CSS to hide ads"
        AppLanguage.ARABIC -> "استخدام CSS لإخفاء الإعلانات"
    }
    val snippetAntiAdblock: String get() = when (lang) {
        AppLanguage.CHINESE -> "反反广告检测"
        AppLanguage.ENGLISH -> "Anti-Adblock Detection"
        AppLanguage.ARABIC -> "مكافحة كشف حظر الإعلانات"
    }
    val snippetAntiAdblockDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "绕过广告拦截检测"
        AppLanguage.ENGLISH -> "Bypass ad blocker detection"
        AppLanguage.ARABIC -> "تجاوز كشف حظر الإعلانات"
    }
    
    // 工具函数代码片段
    val snippetUtility: String get() = when (lang) {
        AppLanguage.CHINESE -> "工具函数"
        AppLanguage.ENGLISH -> "Utility Functions"
        AppLanguage.ARABIC -> "دوال مساعدة"
    }
    val snippetUtilityDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "常用的工具函数和辅助方法"
        AppLanguage.ENGLISH -> "Common utility functions and helper methods"
        AppLanguage.ARABIC -> "دوال مساعدة شائعة وطرق مساندة"
    }
    val snippetDebounce: String get() = when (lang) {
        AppLanguage.CHINESE -> "防抖函数"
        AppLanguage.ENGLISH -> "Debounce Function"
        AppLanguage.ARABIC -> "دالة منع الارتداد"
    }
    val snippetDebounceDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "限制函数执行频率（延迟执行）"
        AppLanguage.ENGLISH -> "Limit function execution frequency (delayed)"
        AppLanguage.ARABIC -> "تحديد تردد تنفيذ الدالة (مؤجل)"
    }
    val snippetThrottle: String get() = when (lang) {
        AppLanguage.CHINESE -> "节流函数"
        AppLanguage.ENGLISH -> "Throttle Function"
        AppLanguage.ARABIC -> "دالة الخنق"
    }
    val snippetThrottleDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "限制函数执行频率（固定间隔）"
        AppLanguage.ENGLISH -> "Limit function execution frequency (fixed interval)"
        AppLanguage.ARABIC -> "تحديد تردد تنفيذ الدالة (فاصل ثابت)"
    }
    val snippetWaitElement: String get() = when (lang) {
        AppLanguage.CHINESE -> "等待元素出现"
        AppLanguage.ENGLISH -> "Wait for Element"
        AppLanguage.ARABIC -> "انتظار ظهور العنصر"
    }
    val snippetWaitElementDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "等待指定元素出现在页面中"
        AppLanguage.ENGLISH -> "Wait for specified element to appear"
        AppLanguage.ARABIC -> "انتظار ظهور العنصر المحدد"
    }
    val snippetCopyText: String get() = when (lang) {
        AppLanguage.CHINESE -> "复制文本"
        AppLanguage.ENGLISH -> "Copy Text"
        AppLanguage.ARABIC -> "نسخ النص"
    }
    val snippetCopyTextDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "复制文本到剪贴板"
        AppLanguage.ENGLISH -> "Copy text to clipboard"
        AppLanguage.ARABIC -> "نسخ النص إلى الحافظة"
    }
    val snippetFormatDate: String get() = when (lang) {
        AppLanguage.CHINESE -> "格式化日期"
        AppLanguage.ENGLISH -> "Format Date"
        AppLanguage.ARABIC -> "تنسيق التاريخ"
    }
    val snippetFormatDateDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "将日期格式化为指定格式"
        AppLanguage.ENGLISH -> "Format date to specified format"
        AppLanguage.ARABIC -> "تنسيق التاريخ بالشكل المحدد"
    }
    val snippetRandomString: String get() = when (lang) {
        AppLanguage.CHINESE -> "生成随机字符串"
        AppLanguage.ENGLISH -> "Generate Random String"
        AppLanguage.ARABIC -> "إنشاء سلسلة عشوائية"
    }
    val snippetRandomStringDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "生成指定长度的随机字符串"
        AppLanguage.ENGLISH -> "Generate random string of specified length"
        AppLanguage.ARABIC -> "إنشاء سلسلة عشوائية بطول محدد"
    }
    val snippetSleep: String get() = when (lang) {
        AppLanguage.CHINESE -> "延迟执行"
        AppLanguage.ENGLISH -> "Sleep/Delay"
        AppLanguage.ARABIC -> "تأخير التنفيذ"
    }
    val snippetSleepDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "异步延迟指定时间"
        AppLanguage.ENGLISH -> "Async delay for specified time"
        AppLanguage.ARABIC -> "تأخير غير متزامن لوقت محدد"
    }
    val snippetRetry: String get() = when (lang) {
        AppLanguage.CHINESE -> "重试函数"
        AppLanguage.ENGLISH -> "Retry Function"
        AppLanguage.ARABIC -> "دالة إعادة المحاولة"
    }
    val snippetRetryDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "失败后自动重试"
        AppLanguage.ENGLISH -> "Auto retry on failure"
        AppLanguage.ARABIC -> "إعادة المحاولة تلقائياً عند الفشل"
    }
    
    // 文本处理代码片段
    val snippetText: String get() = when (lang) {
        AppLanguage.CHINESE -> "文本处理"
        AppLanguage.ENGLISH -> "Text Processing"
        AppLanguage.ARABIC -> "معالجة النص"
    }
    val snippetTextDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "文本提取、转换、处理"
        AppLanguage.ENGLISH -> "Text extraction, conversion, processing"
        AppLanguage.ARABIC -> "استخراج النص وتحويله ومعالجته"
    }
    val snippetExtractArticle: String get() = when (lang) {
        AppLanguage.CHINESE -> "提取文章正文"
        AppLanguage.ENGLISH -> "Extract Article Content"
        AppLanguage.ARABIC -> "استخراج محتوى المقال"
    }
    val snippetExtractArticleDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "智能提取页面正文内容"
        AppLanguage.ENGLISH -> "Intelligently extract page content"
        AppLanguage.ARABIC -> "استخراج محتوى الصفحة بذكاء"
    }
    val snippetReplaceText: String get() = when (lang) {
        AppLanguage.CHINESE -> "批量替换文本"
        AppLanguage.ENGLISH -> "Batch Replace Text"
        AppLanguage.ARABIC -> "استبدال النص دفعة واحدة"
    }
    val snippetReplaceTextDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "替换页面中的文本"
        AppLanguage.ENGLISH -> "Replace text in page"
        AppLanguage.ARABIC -> "استبدال النص في الصفحة"
    }
    val snippetTranslateSelection: String get() = when (lang) {
        AppLanguage.CHINESE -> "选中文字翻译"
        AppLanguage.ENGLISH -> "Translate Selection"
        AppLanguage.ARABIC -> "ترجمة النص المحدد"
    }
    val snippetTranslateSelectionDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "选中文字后显示翻译"
        AppLanguage.ENGLISH -> "Show translation for selected text"
        AppLanguage.ARABIC -> "عرض الترجمة للنص المحدد"
    }
    val snippetHtmlToMarkdown: String get() = when (lang) {
        AppLanguage.CHINESE -> "HTML 转 Markdown"
        AppLanguage.ENGLISH -> "HTML to Markdown"
        AppLanguage.ARABIC -> "تحويل HTML إلى Markdown"
    }
    val snippetHtmlToMarkdownDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "将 HTML 转换为 Markdown"
        AppLanguage.ENGLISH -> "Convert HTML to Markdown"
        AppLanguage.ARABIC -> "تحويل HTML إلى Markdown"
    }
    
    // 请求拦截代码片段
    val snippetIntercept: String get() = when (lang) {
        AppLanguage.CHINESE -> "请求拦截"
        AppLanguage.ENGLISH -> "Request Intercept"
        AppLanguage.ARABIC -> "اعتراض الطلبات"
    }
    val snippetInterceptDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "拦截和修改网络请求"
        AppLanguage.ENGLISH -> "Intercept and modify network requests"
        AppLanguage.ARABIC -> "اعتراض وتعديل طلبات الشبكة"
    }
    val snippetInterceptFetch: String get() = when (lang) {
        AppLanguage.CHINESE -> "拦截 Fetch 请求"
        AppLanguage.ENGLISH -> "Intercept Fetch Request"
        AppLanguage.ARABIC -> "اعتراض طلب Fetch"
    }
    val snippetInterceptFetchDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "拦截和修改 fetch 请求"
        AppLanguage.ENGLISH -> "Intercept and modify fetch requests"
        AppLanguage.ARABIC -> "اعتراض وتعديل طلبات fetch"
    }
    val snippetInterceptXhr: String get() = when (lang) {
        AppLanguage.CHINESE -> "拦截 XHR 请求"
        AppLanguage.ENGLISH -> "Intercept XHR Request"
        AppLanguage.ARABIC -> "اعتراض طلب XHR"
    }
    val snippetInterceptXhrDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "拦截 XMLHttpRequest 请求"
        AppLanguage.ENGLISH -> "Intercept XMLHttpRequest requests"
        AppLanguage.ARABIC -> "اعتراض طلبات XMLHttpRequest"
    }
    val snippetInterceptWebSocket: String get() = when (lang) {
        AppLanguage.CHINESE -> "拦截 WebSocket"
        AppLanguage.ENGLISH -> "Intercept WebSocket"
        AppLanguage.ARABIC -> "اعتراض WebSocket"
    }
    val snippetInterceptWebSocketDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "监听 WebSocket 消息"
        AppLanguage.ENGLISH -> "Monitor WebSocket messages"
        AppLanguage.ARABIC -> "مراقبة رسائل WebSocket"
    }
    val snippetBlockRequests: String get() = when (lang) {
        AppLanguage.CHINESE -> "阻止特定请求"
        AppLanguage.ENGLISH -> "Block Specific Requests"
        AppLanguage.ARABIC -> "حظر طلبات محددة"
    }
    val snippetBlockRequestsDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "阻止包含特定关键词的请求"
        AppLanguage.ENGLISH -> "Block requests containing specific keywords"
        AppLanguage.ARABIC -> "حظر الطلبات التي تحتوي على كلمات مفتاحية معينة"
    }
    
    // 自动化代码片段
    val snippetAutomation: String get() = when (lang) {
        AppLanguage.CHINESE -> "自动化"
        AppLanguage.ENGLISH -> "Automation"
        AppLanguage.ARABIC -> "الأتمتة"
    }
    val snippetAutomationDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "自动化操作和任务"
        AppLanguage.ENGLISH -> "Automated operations and tasks"
        AppLanguage.ARABIC -> "العمليات والمهام الآلية"
    }
    val snippetAutoClick: String get() = when (lang) {
        AppLanguage.CHINESE -> "自动点击"
        AppLanguage.ENGLISH -> "Auto Click"
        AppLanguage.ARABIC -> "النقر التلقائي"
    }
    val snippetAutoClickDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "自动点击指定元素"
        AppLanguage.ENGLISH -> "Auto click specified element"
        AppLanguage.ARABIC -> "النقر تلقائياً على العنصر المحدد"
    }
    val snippetAutoClickInterval: String get() = when (lang) {
        AppLanguage.CHINESE -> "定时自动点击"
        AppLanguage.ENGLISH -> "Timed Auto Click"
        AppLanguage.ARABIC -> "النقر التلقائي المؤقت"
    }
    val snippetAutoClickIntervalDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "定时重复点击元素"
        AppLanguage.ENGLISH -> "Repeatedly click element at intervals"
        AppLanguage.ARABIC -> "النقر المتكرر على العنصر على فترات"
    }
    val snippetAutoFillSubmit: String get() = when (lang) {
        AppLanguage.CHINESE -> "自动填写表单"
        AppLanguage.ENGLISH -> "Auto Fill Form"
        AppLanguage.ARABIC -> "ملء النموذج تلقائياً"
    }
    val snippetAutoFillSubmitDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "自动填写并提交表单"
        AppLanguage.ENGLISH -> "Auto fill and submit form"
        AppLanguage.ARABIC -> "ملء النموذج وإرساله تلقائياً"
    }
    val snippetAutoRefresh: String get() = when (lang) {
        AppLanguage.CHINESE -> "自动刷新页面"
        AppLanguage.ENGLISH -> "Auto Refresh Page"
        AppLanguage.ARABIC -> "تحديث الصفحة تلقائياً"
    }
    val snippetAutoRefreshDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "定时刷新页面"
        AppLanguage.ENGLISH -> "Refresh page at intervals"
        AppLanguage.ARABIC -> "تحديث الصفحة على فترات"
    }
    val snippetAutoScrollLoad: String get() = when (lang) {
        AppLanguage.CHINESE -> "自动滚动加载"
        AppLanguage.ENGLISH -> "Auto Scroll Load"
        AppLanguage.ARABIC -> "التحميل بالتمرير التلقائي"
    }
    val snippetAutoScrollLoadDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "自动滚动到底部加载更多"
        AppLanguage.ENGLISH -> "Auto scroll to bottom to load more"
        AppLanguage.ARABIC -> "التمرير تلقائياً للأسفل لتحميل المزيد"
    }
    val snippetAutoLoginCheck: String get() = when (lang) {
        AppLanguage.CHINESE -> "自动登录检测"
        AppLanguage.ENGLISH -> "Auto Login Check"
        AppLanguage.ARABIC -> "فحص تسجيل الدخول التلقائي"
    }
    val snippetAutoLoginCheckDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "检测登录状态并提醒"
        AppLanguage.ENGLISH -> "Check login status and alert"
        AppLanguage.ARABIC -> "فحص حالة تسجيل الدخول والتنبيه"
    }
    
    // 调试工具代码片段
    val snippetDebug: String get() = when (lang) {
        AppLanguage.CHINESE -> "调试工具"
        AppLanguage.ENGLISH -> "Debug Tools"
        AppLanguage.ARABIC -> "أدوات التصحيح"
    }
    val snippetDebugDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "开发调试辅助工具"
        AppLanguage.ENGLISH -> "Development debugging tools"
        AppLanguage.ARABIC -> "أدوات تصحيح التطوير"
    }
    val snippetConsolePanel: String get() = when (lang) {
        AppLanguage.CHINESE -> "悬浮控制台"
        AppLanguage.ENGLISH -> "Floating Console"
        AppLanguage.ARABIC -> "وحدة تحكم عائمة"
    }
    val snippetConsolePanelDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "创建悬浮日志面板"
        AppLanguage.ENGLISH -> "Create floating log panel"
        AppLanguage.ARABIC -> "إنشاء لوحة سجل عائمة"
    }
    val snippetElementInfo: String get() = when (lang) {
        AppLanguage.CHINESE -> "元素信息查看"
        AppLanguage.ENGLISH -> "Element Info Viewer"
        AppLanguage.ARABIC -> "عارض معلومات العنصر"
    }
    val snippetElementInfoDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "点击查看元素信息"
        AppLanguage.ENGLISH -> "Click to view element info"
        AppLanguage.ARABIC -> "انقر لعرض معلومات العنصر"
    }
    val snippetPerformance: String get() = when (lang) {
        AppLanguage.CHINESE -> "性能监控"
        AppLanguage.ENGLISH -> "Performance Monitor"
        AppLanguage.ARABIC -> "مراقب الأداء"
    }
    val snippetPerformanceDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "显示页面性能信息"
        AppLanguage.ENGLISH -> "Show page performance info"
        AppLanguage.ARABIC -> "عرض معلومات أداء الصفحة"
    }
    val snippetNetworkLog: String get() = when (lang) {
        AppLanguage.CHINESE -> "网络请求日志"
        AppLanguage.ENGLISH -> "Network Request Log"
        AppLanguage.ARABIC -> "سجل طلبات الشبكة"
    }
    val snippetNetworkLogDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "记录所有网络请求"
        AppLanguage.ENGLISH -> "Log all network requests"
        AppLanguage.ARABIC -> "تسجيل جميع طلبات الشبكة"
    }
    
    // ==================== 模块模板 ====================
    val templateColorTheme: String get() = when (lang) {
        AppLanguage.CHINESE -> "配色主题"
        AppLanguage.ENGLISH -> "Color Theme"
        AppLanguage.ARABIC -> "نظام الألوان"
    }
    val templateColorThemeDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "自定义页面配色方案"
        AppLanguage.ENGLISH -> "Customize page color scheme"
        AppLanguage.ARABIC -> "تخصيص نظام ألوان الصفحة"
    }
    val templateBgColor: String get() = when (lang) {
        AppLanguage.CHINESE -> "背景色"
        AppLanguage.ENGLISH -> "Background Color"
        AppLanguage.ARABIC -> "لون الخلفية"
    }
    val templateTextColor: String get() = when (lang) {
        AppLanguage.CHINESE -> "文字色"
        AppLanguage.ENGLISH -> "Text Color"
        AppLanguage.ARABIC -> "لون النص"
    }
    val templateLinkColor: String get() = when (lang) {
        AppLanguage.CHINESE -> "链接色"
        AppLanguage.ENGLISH -> "Link Color"
        AppLanguage.ARABIC -> "لون الرابط"
    }
    val templateLayoutFixer: String get() = when (lang) {
        AppLanguage.CHINESE -> "布局修复器"
        AppLanguage.ENGLISH -> "Layout Fixer"
        AppLanguage.ARABIC -> "مصلح التخطيط"
    }
    val templateLayoutFixerDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "修复页面布局问题，如宽度限制、居中等"
        AppLanguage.ENGLISH -> "Fix page layout issues like width limits, centering, etc."
        AppLanguage.ARABIC -> "إصلاح مشاكل تخطيط الصفحة مثل حدود العرض والتوسيط"
    }
    val templateMaxWidth: String get() = when (lang) {
        AppLanguage.CHINESE -> "最大宽度(px)"
        AppLanguage.ENGLISH -> "Max Width (px)"
        AppLanguage.ARABIC -> "الحد الأقصى للعرض (بكسل)"
    }
    val templateCenterContent: String get() = when (lang) {
        AppLanguage.CHINESE -> "内容居中"
        AppLanguage.ENGLISH -> "Center Content"
        AppLanguage.ARABIC -> "توسيط المحتوى"
    }
    val templateAutoClicker: String get() = when (lang) {
        AppLanguage.CHINESE -> "自动点击器"
        AppLanguage.ENGLISH -> "Auto Clicker"
        AppLanguage.ARABIC -> "النقر التلقائي"
    }
    val templateAutoClickerDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "自动点击指定元素，如关闭按钮、确认按钮等"
        AppLanguage.ENGLISH -> "Auto-click specified elements like close buttons, confirm buttons, etc."
        AppLanguage.ARABIC -> "النقر التلقائي على العناصر المحددة مثل أزرار الإغلاق والتأكيد"
    }
    val templateClickTarget: String get() = when (lang) {
        AppLanguage.CHINESE -> "点击目标"
        AppLanguage.ENGLISH -> "Click Target"
        AppLanguage.ARABIC -> "هدف النقر"
    }
    val templateDelay: String get() = when (lang) {
        AppLanguage.CHINESE -> "延迟(ms)"
        AppLanguage.ENGLISH -> "Delay (ms)"
        AppLanguage.ARABIC -> "التأخير (مللي ثانية)"
    }
    val templateRepeatClick: String get() = when (lang) {
        AppLanguage.CHINESE -> "重复点击"
        AppLanguage.ENGLISH -> "Repeat Click"
        AppLanguage.ARABIC -> "تكرار النقر"
    }
    val templateFormFiller: String get() = when (lang) {
        AppLanguage.CHINESE -> "表单自动填充"
        AppLanguage.ENGLISH -> "Form Auto-Fill"
        AppLanguage.ARABIC -> "الملء التلقائي للنموذج"
    }
    val templateFormFillerDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "自动填充表单字段"
        AppLanguage.ENGLISH -> "Auto-fill form fields"
        AppLanguage.ARABIC -> "ملء حقول النموذج تلقائياً"
    }
    val templateFieldSelector: String get() = when (lang) {
        AppLanguage.CHINESE -> "字段选择器"
        AppLanguage.ENGLISH -> "Field Selector"
        AppLanguage.ARABIC -> "محدد الحقل"
    }
    val templateFieldValue: String get() = when (lang) {
        AppLanguage.CHINESE -> "填充值"
        AppLanguage.ENGLISH -> "Fill Value"
        AppLanguage.ARABIC -> "قيمة الملء"
    }
    val templatePageModifier: String get() = when (lang) {
        AppLanguage.CHINESE -> "页面内容修改"
        AppLanguage.ENGLISH -> "Page Content Modifier"
        AppLanguage.ARABIC -> "معدل محتوى الصفحة"
    }
    val templatePageModifierDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "修改页面文本或属性"
        AppLanguage.ENGLISH -> "Modify page text or attributes"
        AppLanguage.ARABIC -> "تعديل نص الصفحة أو السمات"
    }
    val templateTargetSelector: String get() = when (lang) {
        AppLanguage.CHINESE -> "目标选择器"
        AppLanguage.ENGLISH -> "Target Selector"
        AppLanguage.ARABIC -> "محدد الهدف"
    }
    val templateNewText: String get() = when (lang) {
        AppLanguage.CHINESE -> "新文本"
        AppLanguage.ENGLISH -> "New Text"
        AppLanguage.ARABIC -> "نص جديد"
    }
    val templateNewStyle: String get() = when (lang) {
        AppLanguage.CHINESE -> "新样式"
        AppLanguage.ENGLISH -> "New Style"
        AppLanguage.ARABIC -> "نمط جديد"
    }
    val templateCustomButton: String get() = when (lang) {
        AppLanguage.CHINESE -> "自定义悬浮按钮"
        AppLanguage.ENGLISH -> "Custom Floating Button"
        AppLanguage.ARABIC -> "زر عائم مخصص"
    }
    val templateCustomButtonDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "添加可自定义功能的悬浮按钮"
        AppLanguage.ENGLISH -> "Add a floating button with customizable function"
        AppLanguage.ARABIC -> "إضافة زر عائم بوظيفة قابلة للتخصيص"
    }
    val templateButtonText: String get() = when (lang) {
        AppLanguage.CHINESE -> "按钮文字"
        AppLanguage.ENGLISH -> "Button Text"
        AppLanguage.ARABIC -> "نص الزر"
    }
    val templateClickAction: String get() = when (lang) {
        AppLanguage.CHINESE -> "点击动作"
        AppLanguage.ENGLISH -> "Click Action"
        AppLanguage.ARABIC -> "إجراء النقر"
    }
    val templatePosition: String get() = when (lang) {
        AppLanguage.CHINESE -> "位置"
        AppLanguage.ENGLISH -> "Position"
        AppLanguage.ARABIC -> "الموضع"
    }
    val templateKeyboardShortcuts: String get() = when (lang) {
        AppLanguage.CHINESE -> "键盘快捷键"
        AppLanguage.ENGLISH -> "Keyboard Shortcuts"
        AppLanguage.ARABIC -> "اختصارات لوحة المفاتيح"
    }
    val templateKeyboardShortcutsDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "添加自定义键盘快捷键"
        AppLanguage.ENGLISH -> "Add custom keyboard shortcuts"
        AppLanguage.ARABIC -> "إضافة اختصارات لوحة مفاتيح مخصصة"
    }
    val templateShortcutsConfig: String get() = when (lang) {
        AppLanguage.CHINESE -> "快捷键配置"
        AppLanguage.ENGLISH -> "Shortcuts Config"
        AppLanguage.ARABIC -> "تكوين الاختصارات"
    }
    val templateAutoRefresh: String get() = when (lang) {
        AppLanguage.CHINESE -> "自动刷新"
        AppLanguage.ENGLISH -> "Auto Refresh"
        AppLanguage.ARABIC -> "التحديث التلقائي"
    }
    val templateAutoRefreshDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "定时自动刷新页面"
        AppLanguage.ENGLISH -> "Auto-refresh page at intervals"
        AppLanguage.ARABIC -> "تحديث الصفحة تلقائياً على فترات"
    }
    val templateRefreshInterval: String get() = when (lang) {
        AppLanguage.CHINESE -> "刷新间隔(秒)"
        AppLanguage.ENGLISH -> "Refresh Interval (sec)"
        AppLanguage.ARABIC -> "فترة التحديث (ثانية)"
    }
    val templateShowCountdown: String get() = when (lang) {
        AppLanguage.CHINESE -> "显示倒计时"
        AppLanguage.ENGLISH -> "Show Countdown"
        AppLanguage.ARABIC -> "إظهار العد التنازلي"
    }
    val templateScrollToTop: String get() = when (lang) {
        AppLanguage.CHINESE -> "返回顶部按钮"
        AppLanguage.ENGLISH -> "Scroll to Top Button"
        AppLanguage.ARABIC -> "زر العودة للأعلى"
    }
    val templateScrollToTopDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "添加返回顶部悬浮按钮"
        AppLanguage.ENGLISH -> "Add a floating scroll-to-top button"
        AppLanguage.ARABIC -> "إضافة زر عائم للعودة للأعلى"
    }
    val templateShowAfterScroll: String get() = when (lang) {
        AppLanguage.CHINESE -> "滚动多少后显示(px)"
        AppLanguage.ENGLISH -> "Show After Scroll (px)"
        AppLanguage.ARABIC -> "إظهار بعد التمرير (بكسل)"
    }
    val templateDataExtractor: String get() = when (lang) {
        AppLanguage.CHINESE -> "数据提取器"
        AppLanguage.ENGLISH -> "Data Extractor"
        AppLanguage.ARABIC -> "مستخرج البيانات"
    }
    val templateDataExtractorDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "提取页面数据并显示"
        AppLanguage.ENGLISH -> "Extract and display page data"
        AppLanguage.ARABIC -> "استخراج وعرض بيانات الصفحة"
    }
    val templateDataSelector: String get() = when (lang) {
        AppLanguage.CHINESE -> "数据选择器"
        AppLanguage.ENGLISH -> "Data Selector"
        AppLanguage.ARABIC -> "محدد البيانات"
    }
    val templateExtractAttribute: String get() = when (lang) {
        AppLanguage.CHINESE -> "提取属性"
        AppLanguage.ENGLISH -> "Extract Attribute"
        AppLanguage.ARABIC -> "استخراج السمة"
    }
    val templateLinkCollector: String get() = when (lang) {
        AppLanguage.CHINESE -> "链接收集器"
        AppLanguage.ENGLISH -> "Link Collector"
        AppLanguage.ARABIC -> "جامع الروابط"
    }
    val templateLinkCollectorDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "收集页面上的所有链接"
        AppLanguage.ENGLISH -> "Collect all links on the page"
        AppLanguage.ARABIC -> "جمع جميع الروابط في الصفحة"
    }
    val templateFilterKeyword: String get() = when (lang) {
        AppLanguage.CHINESE -> "过滤关键词"
        AppLanguage.ENGLISH -> "Filter Keyword"
        AppLanguage.ARABIC -> "كلمة التصفية"
    }
    val templateImageGrabber: String get() = when (lang) {
        AppLanguage.CHINESE -> "图片抓取器"
        AppLanguage.ENGLISH -> "Image Grabber"
        AppLanguage.ARABIC -> "جامع الصور"
    }
    val templateImageGrabberDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "收集页面上的所有图片"
        AppLanguage.ENGLISH -> "Collect all images on the page"
        AppLanguage.ARABIC -> "جمع جميع الصور في الصفحة"
    }
    val templateMinSize: String get() = when (lang) {
        AppLanguage.CHINESE -> "最小尺寸(px)"
        AppLanguage.ENGLISH -> "Min Size (px)"
        AppLanguage.ARABIC -> "الحد الأدنى للحجم (بكسل)"
    }
    val templateVideoEnhancer: String get() = when (lang) {
        AppLanguage.CHINESE -> "视频增强器"
        AppLanguage.ENGLISH -> "Video Enhancer"
        AppLanguage.ARABIC -> "محسن الفيديو"
    }
    val templateVideoEnhancerDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "为视频添加倍速控制、画中画等功能"
        AppLanguage.ENGLISH -> "Add speed control, picture-in-picture, etc. for videos"
        AppLanguage.ARABIC -> "إضافة التحكم في السرعة والصورة داخل الصورة للفيديو"
    }
    val templateDefaultSpeed: String get() = when (lang) {
        AppLanguage.CHINESE -> "默认倍速"
        AppLanguage.ENGLISH -> "Default Speed"
        AppLanguage.ARABIC -> "السرعة الافتراضية"
    }
    val templateShowControlPanel: String get() = when (lang) {
        AppLanguage.CHINESE -> "显示控制面板"
        AppLanguage.ENGLISH -> "Show Control Panel"
        AppLanguage.ARABIC -> "إظهار لوحة التحكم"
    }
    val templateImageZoomer: String get() = when (lang) {
        AppLanguage.CHINESE -> "图片放大镜"
        AppLanguage.ENGLISH -> "Image Zoomer"
        AppLanguage.ARABIC -> "مكبر الصور"
    }
    val templateImageZoomerDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "点击图片放大查看"
        AppLanguage.ENGLISH -> "Click image to zoom"
        AppLanguage.ARABIC -> "انقر على الصورة للتكبير"
    }
    val templateAudioController: String get() = when (lang) {
        AppLanguage.CHINESE -> "音频控制器"
        AppLanguage.ENGLISH -> "Audio Controller"
        AppLanguage.ARABIC -> "متحكم الصوت"
    }
    val templateAudioControllerDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "统一控制页面上的所有音频"
        AppLanguage.ENGLISH -> "Unified control of all audio on the page"
        AppLanguage.ARABIC -> "تحكم موحد في جميع الصوتيات في الصفحة"
    }
    val templateDefaultVolume: String get() = when (lang) {
        AppLanguage.CHINESE -> "默认音量(%)"
        AppLanguage.ENGLISH -> "Default Volume (%)"
        AppLanguage.ARABIC -> "مستوى الصوت الافتراضي (%)"
    }
    val templateNotificationBlocker: String get() = when (lang) {
        AppLanguage.CHINESE -> "通知拦截器"
        AppLanguage.ENGLISH -> "Notification Blocker"
        AppLanguage.ARABIC -> "حاجب الإشعارات"
    }
    val templateNotificationBlockerDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "阻止网站请求通知权限"
        AppLanguage.ENGLISH -> "Block website notification permission requests"
        AppLanguage.ARABIC -> "حظر طلبات إذن الإشعارات من المواقع"
    }
    val templateTrackingBlocker: String get() = when (lang) {
        AppLanguage.CHINESE -> "追踪拦截器"
        AppLanguage.ENGLISH -> "Tracking Blocker"
        AppLanguage.ARABIC -> "حاجب التتبع"
    }
    val templateTrackingBlockerDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "阻止常见的追踪脚本"
        AppLanguage.ENGLISH -> "Block common tracking scripts"
        AppLanguage.ARABIC -> "حظر نصوص التتبع الشائعة"
    }
    val templateFingerprintProtector: String get() = when (lang) {
        AppLanguage.CHINESE -> "指纹保护器"
        AppLanguage.ENGLISH -> "Fingerprint Protector"
        AppLanguage.ARABIC -> "حامي البصمة"
    }
    val templateFingerprintProtectorDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "防止浏览器指纹追踪"
        AppLanguage.ENGLISH -> "Prevent browser fingerprint tracking"
        AppLanguage.ARABIC -> "منع تتبع بصمة المتصفح"
    }
    val templateConsoleLogger: String get() = when (lang) {
        AppLanguage.CHINESE -> "控制台日志"
        AppLanguage.ENGLISH -> "Console Logger"
        AppLanguage.ARABIC -> "مسجل وحدة التحكم"
    }
    val templateConsoleLoggerDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "在页面上显示控制台日志"
        AppLanguage.ENGLISH -> "Display console logs on the page"
        AppLanguage.ARABIC -> "عرض سجلات وحدة التحكم على الصفحة"
    }
    val templateMaxLogs: String get() = when (lang) {
        AppLanguage.CHINESE -> "最大日志数"
        AppLanguage.ENGLISH -> "Max Logs"
        AppLanguage.ARABIC -> "الحد الأقصى للسجلات"
    }
    val templateNetworkMonitor: String get() = when (lang) {
        AppLanguage.CHINESE -> "网络监控器"
        AppLanguage.ENGLISH -> "Network Monitor"
        AppLanguage.ARABIC -> "مراقب الشبكة"
    }
    val templateNetworkMonitorDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "监控页面的网络请求"
        AppLanguage.ENGLISH -> "Monitor page network requests"
        AppLanguage.ARABIC -> "مراقبة طلبات شبكة الصفحة"
    }
    val templateDomInspector: String get() = when (lang) {
        AppLanguage.CHINESE -> "DOM检查器"
        AppLanguage.ENGLISH -> "DOM Inspector"
        AppLanguage.ARABIC -> "فاحص DOM"
    }
    val templateDomInspectorDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "悬停查看元素信息"
        AppLanguage.ENGLISH -> "Hover to view element info"
        AppLanguage.ARABIC -> "تمرير لعرض معلومات العنصر"
    }
    
    // ==================== 内置模块 ====================
    val builtinVideoDownloader: String get() = when (lang) {
        AppLanguage.CHINESE -> "视频下载"
        AppLanguage.ENGLISH -> "Video Download"
        AppLanguage.ARABIC -> "تحميل الفيديو"
    }
    val builtinVideoDownloaderDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "自动检测网页视频，支持 MP4 和 Blob 流下载"
        AppLanguage.ENGLISH -> "Auto-detect web videos, supports MP4 and Blob stream download"
        AppLanguage.ARABIC -> "الكشف التلقائي عن الفيديو، يدعم تحميل MP4 وBlob"
    }
    val builtinDouyinExtractor: String get() = when (lang) {
        AppLanguage.CHINESE -> "抖音视频"
        AppLanguage.ENGLISH -> "Douyin Video"
        AppLanguage.ARABIC -> "فيديو دوين"
    }
    val builtinDouyinExtractorDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "提取抖音无水印视频地址"
        AppLanguage.ENGLISH -> "Extract Douyin watermark-free video URL"
        AppLanguage.ARABIC -> "استخراج رابط فيديو دوين بدون علامة مائية"
    }
    val builtinXiaohongshuExtractor: String get() = when (lang) {
        AppLanguage.CHINESE -> "小红书"
        AppLanguage.ENGLISH -> "Xiaohongshu"
        AppLanguage.ARABIC -> "شياوهونغشو"
    }
    val builtinXiaohongshuExtractorDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "提取小红书图片和视频"
        AppLanguage.ENGLISH -> "Extract Xiaohongshu images and videos"
        AppLanguage.ARABIC -> "استخراج صور وفيديوهات شياوهونغشو"
    }
    val builtinVideoEnhancer: String get() = when (lang) {
        AppLanguage.CHINESE -> "视频增强"
        AppLanguage.ENGLISH -> "Video Enhance"
        AppLanguage.ARABIC -> "تحسين الفيديو"
    }
    val builtinVideoEnhancerDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "倍速播放、画中画、后台播放"
        AppLanguage.ENGLISH -> "Speed control, picture-in-picture, background play"
        AppLanguage.ARABIC -> "التحكم في السرعة، صورة داخل صورة، التشغيل في الخلفية"
    }
    val builtinWebAnalyzer: String get() = when (lang) {
        AppLanguage.CHINESE -> "网页分析"
        AppLanguage.ENGLISH -> "Web Analyzer"
        AppLanguage.ARABIC -> "محلل الويب"
    }
    val builtinWebAnalyzerDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "查看页面元素、网络请求、性能数据"
        AppLanguage.ENGLISH -> "View page elements, network requests, performance data"
        AppLanguage.ARABIC -> "عرض عناصر الصفحة، طلبات الشبكة، بيانات الأداء"
    }
    val builtinDarkMode: String get() = when (lang) {
        AppLanguage.CHINESE -> "深色模式"
        AppLanguage.ENGLISH -> "Dark Mode"
        AppLanguage.ARABIC -> "الوضع الداكن"
    }
    val builtinDarkModeDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "智能反色，护眼阅读"
        AppLanguage.ENGLISH -> "Smart inversion, eye-friendly reading"
        AppLanguage.ARABIC -> "عكس ذكي، قراءة مريحة للعين"
    }
    val builtinPrivacyProtection: String get() = when (lang) {
        AppLanguage.CHINESE -> "隐私保护"
        AppLanguage.ENGLISH -> "Privacy Protection"
        AppLanguage.ARABIC -> "حماية الخصوصية"
    }
    val builtinPrivacyProtectionDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "阻止追踪、清理指纹、保护隐私"
        AppLanguage.ENGLISH -> "Block tracking, clear fingerprints, protect privacy"
        AppLanguage.ARABIC -> "حظر التتبع، مسح البصمات، حماية الخصوصية"
    }
    val builtinContentEnhancer: String get() = when (lang) {
        AppLanguage.CHINESE -> "内容增强"
        AppLanguage.ENGLISH -> "Content Enhance"
        AppLanguage.ARABIC -> "تحسين المحتوى"
    }
    val builtinContentEnhancerDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "解除复制限制、翻译、长截图"
        AppLanguage.ENGLISH -> "Remove copy restrictions, translate, long screenshot"
        AppLanguage.ARABIC -> "إزالة قيود النسخ، الترجمة، لقطة شاشة طويلة"
    }
    val builtinElementBlocker: String get() = when (lang) {
        AppLanguage.CHINESE -> "元素屏蔽器"
        AppLanguage.ENGLISH -> "Element Blocker"
        AppLanguage.ARABIC -> "مانع العناصر"
    }
    val builtinElementBlockerDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "单击选择元素，双击屏蔽，去除页面烦人元素"
        AppLanguage.ENGLISH -> "Click to select, double-click to block annoying elements"
        AppLanguage.ARABIC -> "انقر للتحديد، انقر مرتين لحظر العناصر المزعجة"
    }
    
    // ==================== 模块触发条件 ====================
    val triggerAuto: String get() = when (lang) {
        AppLanguage.CHINESE -> "自动执行"
        AppLanguage.ENGLISH -> "Auto Execute"
        AppLanguage.ARABIC -> "تنفيذ تلقائي"
    }
    val triggerAutoDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "页面加载时自动执行"
        AppLanguage.ENGLISH -> "Execute automatically when page loads"
        AppLanguage.ARABIC -> "التنفيذ تلقائياً عند تحميل الصفحة"
    }
    val triggerManual: String get() = when (lang) {
        AppLanguage.CHINESE -> "手动触发"
        AppLanguage.ENGLISH -> "Manual Trigger"
        AppLanguage.ARABIC -> "تشغيل يدوي"
    }
    val triggerManualDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "需要用户手动触发执行"
        AppLanguage.ENGLISH -> "Requires manual trigger by user"
        AppLanguage.ARABIC -> "يتطلب تشغيل يدوي من المستخدم"
    }
    val triggerInterval: String get() = when (lang) {
        AppLanguage.CHINESE -> "定时执行"
        AppLanguage.ENGLISH -> "Interval Execute"
        AppLanguage.ARABIC -> "تنفيذ دوري"
    }
    val triggerIntervalDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "按设定间隔定时执行"
        AppLanguage.ENGLISH -> "Execute at set intervals"
        AppLanguage.ARABIC -> "التنفيذ على فترات محددة"
    }
    val triggerMutation: String get() = when (lang) {
        AppLanguage.CHINESE -> "DOM变化"
        AppLanguage.ENGLISH -> "DOM Mutation"
        AppLanguage.ARABIC -> "تغيير DOM"
    }
    val triggerMutationDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "检测到DOM变化时执行"
        AppLanguage.ENGLISH -> "Execute when DOM changes detected"
        AppLanguage.ARABIC -> "التنفيذ عند اكتشاف تغييرات DOM"
    }
    val triggerScroll: String get() = when (lang) {
        AppLanguage.CHINESE -> "滚动触发"
        AppLanguage.ENGLISH -> "Scroll Trigger"
        AppLanguage.ARABIC -> "تشغيل بالتمرير"
    }
    val triggerScrollDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "页面滚动时执行"
        AppLanguage.ENGLISH -> "Execute when page scrolls"
        AppLanguage.ARABIC -> "التنفيذ عند تمرير الصفحة"
    }
    val triggerClick: String get() = when (lang) {
        AppLanguage.CHINESE -> "点击触发"
        AppLanguage.ENGLISH -> "Click Trigger"
        AppLanguage.ARABIC -> "تشغيل بالنقر"
    }
    val triggerClickDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "点击指定元素时执行"
        AppLanguage.ENGLISH -> "Execute when element clicked"
        AppLanguage.ARABIC -> "التنفيذ عند النقر على العنصر"
    }
    val triggerHover: String get() = when (lang) {
        AppLanguage.CHINESE -> "悬停触发"
        AppLanguage.ENGLISH -> "Hover Trigger"
        AppLanguage.ARABIC -> "تشغيل بالتمرير"
    }
    val triggerHoverDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "鼠标悬停时执行"
        AppLanguage.ENGLISH -> "Execute on mouse hover"
        AppLanguage.ARABIC -> "التنفيذ عند تمرير الماوس"
    }
    val triggerFocus: String get() = when (lang) {
        AppLanguage.CHINESE -> "聚焦触发"
        AppLanguage.ENGLISH -> "Focus Trigger"
        AppLanguage.ARABIC -> "تشغيل بالتركيز"
    }
    val triggerFocusDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "元素获得焦点时执行"
        AppLanguage.ENGLISH -> "Execute when element focused"
        AppLanguage.ARABIC -> "التنفيذ عند تركيز العنصر"
    }
    val triggerInput: String get() = when (lang) {
        AppLanguage.CHINESE -> "输入触发"
        AppLanguage.ENGLISH -> "Input Trigger"
        AppLanguage.ARABIC -> "تشغيل بالإدخال"
    }
    val triggerInputDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "用户输入时执行"
        AppLanguage.ENGLISH -> "Execute on user input"
        AppLanguage.ARABIC -> "التنفيذ عند إدخال المستخدم"
    }
    val triggerVisibility: String get() = when (lang) {
        AppLanguage.CHINESE -> "可见性变化"
        AppLanguage.ENGLISH -> "Visibility Change"
        AppLanguage.ARABIC -> "تغيير الرؤية"
    }
    val triggerVisibilityDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "元素可见性变化时执行"
        AppLanguage.ENGLISH -> "Execute when visibility changes"
        AppLanguage.ARABIC -> "التنفيذ عند تغيير الرؤية"
    }
    
    // ==================== 模块权限 ====================
    val permDomAccess: String get() = when (lang) {
        AppLanguage.CHINESE -> "DOM 访问"
        AppLanguage.ENGLISH -> "DOM Access"
        AppLanguage.ARABIC -> "وصول DOM"
    }
    val permDomAccessDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "读取和修改页面元素"
        AppLanguage.ENGLISH -> "Read and modify page elements"
        AppLanguage.ARABIC -> "قراءة وتعديل عناصر الصفحة"
    }
    val permDomObserve: String get() = when (lang) {
        AppLanguage.CHINESE -> "DOM 监听"
        AppLanguage.ENGLISH -> "DOM Observe"
        AppLanguage.ARABIC -> "مراقبة DOM"
    }
    val permDomObserveDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "监听页面元素变化"
        AppLanguage.ENGLISH -> "Listen for page element changes"
        AppLanguage.ARABIC -> "الاستماع لتغييرات عناصر الصفحة"
    }
    val permCssInject: String get() = when (lang) {
        AppLanguage.CHINESE -> "CSS 注入"
        AppLanguage.ENGLISH -> "CSS Inject"
        AppLanguage.ARABIC -> "حقن CSS"
    }
    val permCssInjectDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "向页面注入样式"
        AppLanguage.ENGLISH -> "Inject styles into page"
        AppLanguage.ARABIC -> "حقن الأنماط في الصفحة"
    }
    val permStorage: String get() = when (lang) {
        AppLanguage.CHINESE -> "本地存储"
        AppLanguage.ENGLISH -> "Local Storage"
        AppLanguage.ARABIC -> "التخزين المحلي"
    }
    val permStorageDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "读写 localStorage/sessionStorage"
        AppLanguage.ENGLISH -> "Read/write localStorage/sessionStorage"
        AppLanguage.ARABIC -> "قراءة/كتابة التخزين المحلي"
    }
    val permCookie: String get() = when (lang) {
        AppLanguage.CHINESE -> "Cookie"
        AppLanguage.ENGLISH -> "Cookie"
        AppLanguage.ARABIC -> "ملفات تعريف الارتباط"
    }
    val permCookieDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "读写 Cookie"
        AppLanguage.ENGLISH -> "Read/write Cookie"
        AppLanguage.ARABIC -> "قراءة/كتابة ملفات تعريف الارتباط"
    }
    val permIndexedDb: String get() = when (lang) {
        AppLanguage.CHINESE -> "IndexedDB"
        AppLanguage.ENGLISH -> "IndexedDB"
        AppLanguage.ARABIC -> "IndexedDB"
    }
    val permIndexedDbDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "访问 IndexedDB 数据库"
        AppLanguage.ENGLISH -> "Access IndexedDB database"
        AppLanguage.ARABIC -> "الوصول إلى قاعدة بيانات IndexedDB"
    }
    val permCache: String get() = when (lang) {
        AppLanguage.CHINESE -> "缓存控制"
        AppLanguage.ENGLISH -> "Cache Control"
        AppLanguage.ARABIC -> "التحكم في التخزين المؤقت"
    }
    val permCacheDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "管理浏览器缓存"
        AppLanguage.ENGLISH -> "Manage browser cache"
        AppLanguage.ARABIC -> "إدارة ذاكرة التخزين المؤقت"
    }
    val permNetwork: String get() = when (lang) {
        AppLanguage.CHINESE -> "网络请求"
        AppLanguage.ENGLISH -> "Network Request"
        AppLanguage.ARABIC -> "طلب الشبكة"
    }
    val permNetworkDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "发送 HTTP 请求"
        AppLanguage.ENGLISH -> "Send HTTP requests"
        AppLanguage.ARABIC -> "إرسال طلبات HTTP"
    }
    val permWebsocket: String get() = when (lang) {
        AppLanguage.CHINESE -> "WebSocket"
        AppLanguage.ENGLISH -> "WebSocket"
        AppLanguage.ARABIC -> "WebSocket"
    }
    val permWebsocketDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "建立 WebSocket 连接"
        AppLanguage.ENGLISH -> "Establish WebSocket connection"
        AppLanguage.ARABIC -> "إنشاء اتصال WebSocket"
    }
    val permFetchIntercept: String get() = when (lang) {
        AppLanguage.CHINESE -> "请求拦截"
        AppLanguage.ENGLISH -> "Request Intercept"
        AppLanguage.ARABIC -> "اعتراض الطلبات"
    }
    val permFetchInterceptDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "拦截和修改网络请求"
        AppLanguage.ENGLISH -> "Intercept and modify network requests"
        AppLanguage.ARABIC -> "اعتراض وتعديل طلبات الشبكة"
    }
    val permClipboard: String get() = when (lang) {
        AppLanguage.CHINESE -> "剪贴板"
        AppLanguage.ENGLISH -> "Clipboard"
        AppLanguage.ARABIC -> "الحافظة"
    }
    val permClipboardDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "读写剪贴板内容"
        AppLanguage.ENGLISH -> "Read/write clipboard content"
        AppLanguage.ARABIC -> "قراءة/كتابة محتوى الحافظة"
    }
    val permNotification: String get() = when (lang) {
        AppLanguage.CHINESE -> "通知"
        AppLanguage.ENGLISH -> "Notification"
        AppLanguage.ARABIC -> "الإشعارات"
    }
    val permNotificationDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "显示通知消息"
        AppLanguage.ENGLISH -> "Show notification messages"
        AppLanguage.ARABIC -> "عرض رسائل الإشعارات"
    }
    val permAlert: String get() = when (lang) {
        AppLanguage.CHINESE -> "弹窗"
        AppLanguage.ENGLISH -> "Alert"
        AppLanguage.ARABIC -> "تنبيه"
    }
    val permAlertDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "显示 alert/confirm/prompt"
        AppLanguage.ENGLISH -> "Show alert/confirm/prompt"
        AppLanguage.ARABIC -> "عرض تنبيه/تأكيد/مطالبة"
    }
    val permKeyboard: String get() = when (lang) {
        AppLanguage.CHINESE -> "键盘监听"
        AppLanguage.ENGLISH -> "Keyboard Listen"
        AppLanguage.ARABIC -> "الاستماع للوحة المفاتيح"
    }
    val permKeyboardDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "监听键盘事件"
        AppLanguage.ENGLISH -> "Listen for keyboard events"
        AppLanguage.ARABIC -> "الاستماع لأحداث لوحة المفاتيح"
    }
    val permMouse: String get() = when (lang) {
        AppLanguage.CHINESE -> "鼠标监听"
        AppLanguage.ENGLISH -> "Mouse Listen"
        AppLanguage.ARABIC -> "الاستماع للماوس"
    }
    val permMouseDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "监听鼠标事件"
        AppLanguage.ENGLISH -> "Listen for mouse events"
        AppLanguage.ARABIC -> "الاستماع لأحداث الماوس"
    }
    val permTouch: String get() = when (lang) {
        AppLanguage.CHINESE -> "触摸监听"
        AppLanguage.ENGLISH -> "Touch Listen"
        AppLanguage.ARABIC -> "الاستماع للمس"
    }
    val permTouchDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "监听触摸事件"
        AppLanguage.ENGLISH -> "Listen for touch events"
        AppLanguage.ARABIC -> "الاستماع لأحداث اللمس"
    }
    val permLocation: String get() = when (lang) {
        AppLanguage.CHINESE -> "位置信息"
        AppLanguage.ENGLISH -> "Location"
        AppLanguage.ARABIC -> "الموقع"
    }
    val permLocationDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "获取地理位置"
        AppLanguage.ENGLISH -> "Get geolocation"
        AppLanguage.ARABIC -> "الحصول على الموقع الجغرافي"
    }
    val permCamera: String get() = when (lang) {
        AppLanguage.CHINESE -> "摄像头"
        AppLanguage.ENGLISH -> "Camera"
        AppLanguage.ARABIC -> "الكاميرا"
    }
    val permCameraDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "访问摄像头"
        AppLanguage.ENGLISH -> "Access camera"
        AppLanguage.ARABIC -> "الوصول إلى الكاميرا"
    }
    val permMicrophone: String get() = when (lang) {
        AppLanguage.CHINESE -> "麦克风"
        AppLanguage.ENGLISH -> "Microphone"
        AppLanguage.ARABIC -> "الميكروفون"
    }
    val permMicrophoneDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "访问麦克风"
        AppLanguage.ENGLISH -> "Access microphone"
        AppLanguage.ARABIC -> "الوصول إلى الميكروفون"
    }
    val permDeviceInfo: String get() = when (lang) {
        AppLanguage.CHINESE -> "设备信息"
        AppLanguage.ENGLISH -> "Device Info"
        AppLanguage.ARABIC -> "معلومات الجهاز"
    }
    val permDeviceInfoDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "获取设备信息"
        AppLanguage.ENGLISH -> "Get device information"
        AppLanguage.ARABIC -> "الحصول على معلومات الجهاز"
    }
    val permMedia: String get() = when (lang) {
        AppLanguage.CHINESE -> "媒体控制"
        AppLanguage.ENGLISH -> "Media Control"
        AppLanguage.ARABIC -> "التحكم في الوسائط"
    }
    val permMediaDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "控制音视频播放"
        AppLanguage.ENGLISH -> "Control audio/video playback"
        AppLanguage.ARABIC -> "التحكم في تشغيل الصوت/الفيديو"
    }
    val permFullscreen: String get() = when (lang) {
        AppLanguage.CHINESE -> "全屏控制"
        AppLanguage.ENGLISH -> "Fullscreen Control"
        AppLanguage.ARABIC -> "التحكم في ملء الشاشة"
    }
    val permFullscreenDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "控制全屏模式"
        AppLanguage.ENGLISH -> "Control fullscreen mode"
        AppLanguage.ARABIC -> "التحكم في وضع ملء الشاشة"
    }
    val permPip: String get() = when (lang) {
        AppLanguage.CHINESE -> "画中画"
        AppLanguage.ENGLISH -> "Picture-in-Picture"
        AppLanguage.ARABIC -> "صورة داخل صورة"
    }
    val permPipDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "启用画中画模式"
        AppLanguage.ENGLISH -> "Enable picture-in-picture mode"
        AppLanguage.ARABIC -> "تفعيل وضع الصورة داخل الصورة"
    }
    val permScreenCapture: String get() = when (lang) {
        AppLanguage.CHINESE -> "屏幕截图"
        AppLanguage.ENGLISH -> "Screen Capture"
        AppLanguage.ARABIC -> "لقطة الشاشة"
    }
    val permScreenCaptureDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "截取页面内容"
        AppLanguage.ENGLISH -> "Capture page content"
        AppLanguage.ARABIC -> "التقاط محتوى الصفحة"
    }
    val permDownload: String get() = when (lang) {
        AppLanguage.CHINESE -> "下载"
        AppLanguage.ENGLISH -> "Download"
        AppLanguage.ARABIC -> "تحميل"
    }
    val permDownloadDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "触发文件下载"
        AppLanguage.ENGLISH -> "Trigger file download"
        AppLanguage.ARABIC -> "تشغيل تحميل الملف"
    }
    val permFileAccess: String get() = when (lang) {
        AppLanguage.CHINESE -> "文件访问"
        AppLanguage.ENGLISH -> "File Access"
        AppLanguage.ARABIC -> "الوصول إلى الملفات"
    }
    val permFileAccessDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "访问本地文件"
        AppLanguage.ENGLISH -> "Access local files"
        AppLanguage.ARABIC -> "الوصول إلى الملفات المحلية"
    }
    val permEval: String get() = when (lang) {
        AppLanguage.CHINESE -> "动态执行"
        AppLanguage.ENGLISH -> "Dynamic Eval"
        AppLanguage.ARABIC -> "التنفيذ الديناميكي"
    }
    val permEvalDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "执行动态代码"
        AppLanguage.ENGLISH -> "Execute dynamic code"
        AppLanguage.ARABIC -> "تنفيذ الكود الديناميكي"
    }
    val permIframe: String get() = when (lang) {
        AppLanguage.CHINESE -> "iframe 访问"
        AppLanguage.ENGLISH -> "iframe Access"
        AppLanguage.ARABIC -> "وصول iframe"
    }
    val permIframeDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "访问 iframe 内容"
        AppLanguage.ENGLISH -> "Access iframe content"
        AppLanguage.ARABIC -> "الوصول إلى محتوى iframe"
    }
    val permWindowOpen: String get() = when (lang) {
        AppLanguage.CHINESE -> "新窗口"
        AppLanguage.ENGLISH -> "New Window"
        AppLanguage.ARABIC -> "نافذة جديدة"
    }
    val permWindowOpenDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "打开新窗口/标签页"
        AppLanguage.ENGLISH -> "Open new window/tab"
        AppLanguage.ARABIC -> "فتح نافذة/علامة تبويب جديدة"
    }
    val permHistory: String get() = when (lang) {
        AppLanguage.CHINESE -> "历史记录"
        AppLanguage.ENGLISH -> "History"
        AppLanguage.ARABIC -> "السجل"
    }
    val permHistoryDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "访问浏览历史"
        AppLanguage.ENGLISH -> "Access browsing history"
        AppLanguage.ARABIC -> "الوصول إلى سجل التصفح"
    }
    val permNavigation: String get() = when (lang) {
        AppLanguage.CHINESE -> "页面导航"
        AppLanguage.ENGLISH -> "Navigation"
        AppLanguage.ARABIC -> "التنقل"
    }
    val permNavigationDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "控制页面跳转"
        AppLanguage.ENGLISH -> "Control page navigation"
        AppLanguage.ARABIC -> "التحكم في تنقل الصفحة"
    }
    
    // ==================== 配置项类型 ====================
    val configTypeText: String get() = when (lang) {
        AppLanguage.CHINESE -> "文本"
        AppLanguage.ENGLISH -> "Text"
        AppLanguage.ARABIC -> "نص"
    }
    val configTypeTextDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "单行文本输入"
        AppLanguage.ENGLISH -> "Single-line text input"
        AppLanguage.ARABIC -> "إدخال نص من سطر واحد"
    }
    val configTypeTextarea: String get() = when (lang) {
        AppLanguage.CHINESE -> "多行文本"
        AppLanguage.ENGLISH -> "Textarea"
        AppLanguage.ARABIC -> "نص متعدد الأسطر"
    }
    val configTypeTextareaDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "多行文本输入，适合代码或长文本"
        AppLanguage.ENGLISH -> "Multi-line text input, for code or long text"
        AppLanguage.ARABIC -> "إدخال نص متعدد الأسطر، للكود أو النص الطويل"
    }
    val configTypeNumber: String get() = when (lang) {
        AppLanguage.CHINESE -> "数字"
        AppLanguage.ENGLISH -> "Number"
        AppLanguage.ARABIC -> "رقم"
    }
    val configTypeNumberDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "数字输入，支持整数和小数"
        AppLanguage.ENGLISH -> "Number input, supports integers and decimals"
        AppLanguage.ARABIC -> "إدخال رقم، يدعم الأعداد الصحيحة والعشرية"
    }
    val configTypeBoolean: String get() = when (lang) {
        AppLanguage.CHINESE -> "开关"
        AppLanguage.ENGLISH -> "Switch"
        AppLanguage.ARABIC -> "مفتاح"
    }
    val configTypeBooleanDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "是/否 开关选择"
        AppLanguage.ENGLISH -> "Yes/No switch selection"
        AppLanguage.ARABIC -> "اختيار نعم/لا"
    }
    val configTypeSelect: String get() = when (lang) {
        AppLanguage.CHINESE -> "单选"
        AppLanguage.ENGLISH -> "Select"
        AppLanguage.ARABIC -> "اختيار"
    }
    val configTypeSelectDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "下拉单选列表"
        AppLanguage.ENGLISH -> "Dropdown single-select list"
        AppLanguage.ARABIC -> "قائمة منسدلة للاختيار الفردي"
    }
    val configTypeMultiSelect: String get() = when (lang) {
        AppLanguage.CHINESE -> "多选"
        AppLanguage.ENGLISH -> "Multi-Select"
        AppLanguage.ARABIC -> "اختيار متعدد"
    }
    val configTypeMultiSelectDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "多选列表"
        AppLanguage.ENGLISH -> "Multi-select list"
        AppLanguage.ARABIC -> "قائمة اختيار متعدد"
    }
    val configTypeRadio: String get() = when (lang) {
        AppLanguage.CHINESE -> "单选按钮"
        AppLanguage.ENGLISH -> "Radio"
        AppLanguage.ARABIC -> "زر راديو"
    }
    val configTypeRadioDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "单选按钮组"
        AppLanguage.ENGLISH -> "Radio button group"
        AppLanguage.ARABIC -> "مجموعة أزرار راديو"
    }
    val configTypeCheckbox: String get() = when (lang) {
        AppLanguage.CHINESE -> "复选框"
        AppLanguage.ENGLISH -> "Checkbox"
        AppLanguage.ARABIC -> "مربع اختيار"
    }
    val configTypeCheckboxDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "复选框组"
        AppLanguage.ENGLISH -> "Checkbox group"
        AppLanguage.ARABIC -> "مجموعة مربعات اختيار"
    }
    val configTypeColor: String get() = when (lang) {
        AppLanguage.CHINESE -> "颜色"
        AppLanguage.ENGLISH -> "Color"
        AppLanguage.ARABIC -> "لون"
    }
    val configTypeColorDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "颜色选择器"
        AppLanguage.ENGLISH -> "Color picker"
        AppLanguage.ARABIC -> "منتقي الألوان"
    }
    val configTypeUrl: String get() = when (lang) {
        AppLanguage.CHINESE -> "网址"
        AppLanguage.ENGLISH -> "URL"
        AppLanguage.ARABIC -> "رابط"
    }
    val configTypeUrlDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "URL 输入，带格式验证"
        AppLanguage.ENGLISH -> "URL input with format validation"
        AppLanguage.ARABIC -> "إدخال رابط مع التحقق من التنسيق"
    }
    val configTypeEmail: String get() = when (lang) {
        AppLanguage.CHINESE -> "邮箱"
        AppLanguage.ENGLISH -> "Email"
        AppLanguage.ARABIC -> "بريد إلكتروني"
    }
    val configTypeEmailDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "邮箱输入，带格式验证"
        AppLanguage.ENGLISH -> "Email input with format validation"
        AppLanguage.ARABIC -> "إدخال بريد إلكتروني مع التحقق من التنسيق"
    }
    val configTypePassword: String get() = when (lang) {
        AppLanguage.CHINESE -> "密码"
        AppLanguage.ENGLISH -> "Password"
        AppLanguage.ARABIC -> "كلمة مرور"
    }
    val configTypePasswordDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "密码输入，内容隐藏"
        AppLanguage.ENGLISH -> "Password input, content hidden"
        AppLanguage.ARABIC -> "إدخال كلمة مرور، المحتوى مخفي"
    }
    val configTypeRegex: String get() = when (lang) {
        AppLanguage.CHINESE -> "正则表达式"
        AppLanguage.ENGLISH -> "Regex"
        AppLanguage.ARABIC -> "تعبير نمطي"
    }
    val configTypeRegexDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "正则表达式输入"
        AppLanguage.ENGLISH -> "Regular expression input"
        AppLanguage.ARABIC -> "إدخال تعبير نمطي"
    }
    val configTypeCssSelector: String get() = when (lang) {
        AppLanguage.CHINESE -> "CSS选择器"
        AppLanguage.ENGLISH -> "CSS Selector"
        AppLanguage.ARABIC -> "محدد CSS"
    }
    val configTypeCssSelectorDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "CSS 选择器输入"
        AppLanguage.ENGLISH -> "CSS selector input"
        AppLanguage.ARABIC -> "إدخال محدد CSS"
    }
    val configTypeJavascript: String get() = when (lang) {
        AppLanguage.CHINESE -> "JavaScript"
        AppLanguage.ENGLISH -> "JavaScript"
        AppLanguage.ARABIC -> "جافا سكريبت"
    }
    val configTypeJavascriptDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "JavaScript 代码输入"
        AppLanguage.ENGLISH -> "JavaScript code input"
        AppLanguage.ARABIC -> "إدخال كود جافا سكريبت"
    }
    val configTypeJson: String get() = when (lang) {
        AppLanguage.CHINESE -> "JSON"
        AppLanguage.ENGLISH -> "JSON"
        AppLanguage.ARABIC -> "JSON"
    }
    val configTypeJsonDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "JSON 格式数据输入"
        AppLanguage.ENGLISH -> "JSON format data input"
        AppLanguage.ARABIC -> "إدخال بيانات بتنسيق JSON"
    }
    val configTypeRange: String get() = when (lang) {
        AppLanguage.CHINESE -> "滑块"
        AppLanguage.ENGLISH -> "Range"
        AppLanguage.ARABIC -> "شريط تمرير"
    }
    val configTypeRangeDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "数值范围滑块"
        AppLanguage.ENGLISH -> "Numeric range slider"
        AppLanguage.ARABIC -> "شريط تمرير نطاق رقمي"
    }
    val configTypeDate: String get() = when (lang) {
        AppLanguage.CHINESE -> "日期"
        AppLanguage.ENGLISH -> "Date"
        AppLanguage.ARABIC -> "تاريخ"
    }
    val configTypeDateDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "日期选择"
        AppLanguage.ENGLISH -> "Date picker"
        AppLanguage.ARABIC -> "منتقي التاريخ"
    }
    val configTypeTime: String get() = when (lang) {
        AppLanguage.CHINESE -> "时间"
        AppLanguage.ENGLISH -> "Time"
        AppLanguage.ARABIC -> "وقت"
    }
    val configTypeTimeDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "时间选择"
        AppLanguage.ENGLISH -> "Time picker"
        AppLanguage.ARABIC -> "منتقي الوقت"
    }
    val configTypeDatetime: String get() = when (lang) {
        AppLanguage.CHINESE -> "日期时间"
        AppLanguage.ENGLISH -> "DateTime"
        AppLanguage.ARABIC -> "تاريخ ووقت"
    }
    val configTypeDatetimeDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "日期时间选择"
        AppLanguage.ENGLISH -> "DateTime picker"
        AppLanguage.ARABIC -> "منتقي التاريخ والوقت"
    }
    val configTypeFile: String get() = when (lang) {
        AppLanguage.CHINESE -> "文件"
        AppLanguage.ENGLISH -> "File"
        AppLanguage.ARABIC -> "ملف"
    }
    val configTypeFileDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "文件选择"
        AppLanguage.ENGLISH -> "File picker"
        AppLanguage.ARABIC -> "منتقي الملفات"
    }
    val configTypeImage: String get() = when (lang) {
        AppLanguage.CHINESE -> "图片"
        AppLanguage.ENGLISH -> "Image"
        AppLanguage.ARABIC -> "صورة"
    }
    val configTypeImageDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "图片选择/上传"
        AppLanguage.ENGLISH -> "Image picker/upload"
        AppLanguage.ARABIC -> "منتقي/رفع الصور"
    }
    
    // ==================== LRC 主题 ====================
    val lrcThemeDefault: String get() = when (lang) {
        AppLanguage.CHINESE -> "默认"
        AppLanguage.ENGLISH -> "Default"
        AppLanguage.ARABIC -> "افتراضي"
    }
    val lrcThemeKaraoke: String get() = when (lang) {
        AppLanguage.CHINESE -> "卡拉OK"
        AppLanguage.ENGLISH -> "Karaoke"
        AppLanguage.ARABIC -> "كاريوكي"
    }
    val lrcThemeNeon: String get() = when (lang) {
        AppLanguage.CHINESE -> "霓虹"
        AppLanguage.ENGLISH -> "Neon"
        AppLanguage.ARABIC -> "نيون"
    }
    val lrcThemeMinimal: String get() = when (lang) {
        AppLanguage.CHINESE -> "极简"
        AppLanguage.ENGLISH -> "Minimal"
        AppLanguage.ARABIC -> "بسيط"
    }
    val lrcThemeClassic: String get() = when (lang) {
        AppLanguage.CHINESE -> "经典"
        AppLanguage.ENGLISH -> "Classic"
        AppLanguage.ARABIC -> "كلاسيكي"
    }
    val lrcThemeDark: String get() = when (lang) {
        AppLanguage.CHINESE -> "暗夜"
        AppLanguage.ENGLISH -> "Dark"
        AppLanguage.ARABIC -> "داكن"
    }
    val lrcThemeRomantic: String get() = when (lang) {
        AppLanguage.CHINESE -> "浪漫"
        AppLanguage.ENGLISH -> "Romantic"
        AppLanguage.ARABIC -> "رومانسي"
    }
    val lrcThemeEnergetic: String get() = when (lang) {
        AppLanguage.CHINESE -> "活力"
        AppLanguage.ENGLISH -> "Energetic"
        AppLanguage.ARABIC -> "نشط"
    }
    
    // ==================== 测试页面 ====================
    val testPageBasicHtml: String get() = when (lang) {
        AppLanguage.CHINESE -> "基础HTML页面"
        AppLanguage.ENGLISH -> "Basic HTML Page"
        AppLanguage.ARABIC -> "صفحة HTML أساسية"
    }
    val testPageBasicHtmlDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "包含常见HTML元素的测试页面"
        AppLanguage.ENGLISH -> "Test page with common HTML elements"
        AppLanguage.ARABIC -> "صفحة اختبار مع عناصر HTML شائعة"
    }
    val testPageForm: String get() = when (lang) {
        AppLanguage.CHINESE -> "表单测试页"
        AppLanguage.ENGLISH -> "Form Test Page"
        AppLanguage.ARABIC -> "صفحة اختبار النموذج"
    }
    val testPageFormDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "包含各种表单元素的测试页面"
        AppLanguage.ENGLISH -> "Test page with various form elements"
        AppLanguage.ARABIC -> "صفحة اختبار مع عناصر نموذج متنوعة"
    }
    val testPageMedia: String get() = when (lang) {
        AppLanguage.CHINESE -> "媒体测试页"
        AppLanguage.ENGLISH -> "Media Test Page"
        AppLanguage.ARABIC -> "صفحة اختبار الوسائط"
    }
    val testPageMediaDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "包含图片、视频、音频的测试页面"
        AppLanguage.ENGLISH -> "Test page with images, videos, audio"
        AppLanguage.ARABIC -> "صفحة اختبار مع صور وفيديو وصوت"
    }
    val testPageAdSimulator: String get() = when (lang) {
        AppLanguage.CHINESE -> "广告模拟页"
        AppLanguage.ENGLISH -> "Ad Simulator Page"
        AppLanguage.ARABIC -> "صفحة محاكاة الإعلانات"
    }
    val testPageAdSimulatorDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "模拟各种广告元素，用于测试广告拦截"
        AppLanguage.ENGLISH -> "Simulate various ad elements for testing ad blocking"
        AppLanguage.ARABIC -> "محاكاة عناصر إعلانية متنوعة لاختبار حظر الإعلانات"
    }
    val testPagePopup: String get() = when (lang) {
        AppLanguage.CHINESE -> "弹窗测试页"
        AppLanguage.ENGLISH -> "Popup Test Page"
        AppLanguage.ARABIC -> "صفحة اختبار النوافذ المنبثقة"
    }
    val testPagePopupDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "测试各种弹窗和对话框"
        AppLanguage.ENGLISH -> "Test various popups and dialogs"
        AppLanguage.ARABIC -> "اختبار النوافذ المنبثقة والحوارات المتنوعة"
    }
    val testPageScroll: String get() = when (lang) {
        AppLanguage.CHINESE -> "滚动测试页"
        AppLanguage.ENGLISH -> "Scroll Test Page"
        AppLanguage.ARABIC -> "صفحة اختبار التمرير"
    }
    val testPageScrollDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "长页面，用于测试滚动相关功能"
        AppLanguage.ENGLISH -> "Long page for testing scroll-related features"
        AppLanguage.ARABIC -> "صفحة طويلة لاختبار ميزات التمرير"
    }
    val testPageStyle: String get() = when (lang) {
        AppLanguage.CHINESE -> "样式测试页"
        AppLanguage.ENGLISH -> "Style Test Page"
        AppLanguage.ARABIC -> "صفحة اختبار الأنماط"
    }
    val testPageStyleDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "测试CSS样式修改效果"
        AppLanguage.ENGLISH -> "Test CSS style modification effects"
        AppLanguage.ARABIC -> "اختبار تأثيرات تعديل أنماط CSS"
    }
    
    // ==================== 模块方案预设 ====================
    val presetReading: String get() = when (lang) {
        AppLanguage.CHINESE -> "阅读增强"
        AppLanguage.ENGLISH -> "Reading Enhance"
        AppLanguage.ARABIC -> "تحسين القراءة"
    }
    val presetReadingDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "适合阅读文章、小说的模块组合"
        AppLanguage.ENGLISH -> "Module combination for reading articles and novels"
        AppLanguage.ARABIC -> "مجموعة وحدات لقراءة المقالات والروايات"
    }
    val presetAdblock: String get() = when (lang) {
        AppLanguage.CHINESE -> "广告净化"
        AppLanguage.ENGLISH -> "Ad Blocking"
        AppLanguage.ARABIC -> "حظر الإعلانات"
    }
    val presetAdblockDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "屏蔽广告和干扰元素"
        AppLanguage.ENGLISH -> "Block ads and distracting elements"
        AppLanguage.ARABIC -> "حظر الإعلانات والعناصر المشتتة"
    }
    val presetMedia: String get() = when (lang) {
        AppLanguage.CHINESE -> "媒体增强"
        AppLanguage.ENGLISH -> "Media Enhance"
        AppLanguage.ARABIC -> "تحسين الوسائط"
    }
    val presetMediaDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "视频倍速、图片下载等媒体功能"
        AppLanguage.ENGLISH -> "Video speed control, image download, etc."
        AppLanguage.ARABIC -> "التحكم في سرعة الفيديو، تحميل الصور، إلخ"
    }
    val presetUtility: String get() = when (lang) {
        AppLanguage.CHINESE -> "实用工具"
        AppLanguage.ENGLISH -> "Utility Tools"
        AppLanguage.ARABIC -> "أدوات مساعدة"
    }
    val presetUtilityDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "复制解锁、翻译助手等实用功能"
        AppLanguage.ENGLISH -> "Copy unlock, translation assistant, etc."
        AppLanguage.ARABIC -> "فتح النسخ، مساعد الترجمة، إلخ"
    }
    val presetNight: String get() = when (lang) {
        AppLanguage.CHINESE -> "夜间模式"
        AppLanguage.ENGLISH -> "Night Mode"
        AppLanguage.ARABIC -> "الوضع الليلي"
    }
    val presetNightDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "深色主题 + 护眼功能"
        AppLanguage.ENGLISH -> "Dark theme + eye protection"
        AppLanguage.ARABIC -> "سمة داكنة + حماية العين"
    }
    
    // ==================== Agent 工具描述 ====================
    val agentToolSyntaxCheck: String get() = when (lang) {
        AppLanguage.CHINESE -> "检查 JavaScript 或 CSS 代码的语法错误。返回错误列表和修复建议。"
        AppLanguage.ENGLISH -> "Check JavaScript or CSS code for syntax errors. Returns error list and fix suggestions."
        AppLanguage.ARABIC -> "فحص أخطاء بناء الجملة في كود JavaScript أو CSS. يُرجع قائمة الأخطاء واقتراحات الإصلاح."
    }
    val agentToolLintCode: String get() = when (lang) {
        AppLanguage.CHINESE -> "检查代码风格和最佳实践，提供优化建议。"
        AppLanguage.ENGLISH -> "Check code style and best practices, provide optimization suggestions."
        AppLanguage.ARABIC -> "فحص نمط الكود وأفضل الممارسات، تقديم اقتراحات التحسين."
    }
    val agentToolSecurityScan: String get() = when (lang) {
        AppLanguage.CHINESE -> "扫描代码中的安全问题，如 XSS、不安全的 eval 使用等。"
        AppLanguage.ENGLISH -> "Scan code for security issues like XSS, unsafe eval usage, etc."
        AppLanguage.ARABIC -> "فحص الكود بحثاً عن مشاكل أمنية مثل XSS واستخدام eval غير الآمن."
    }
    val agentToolGenerateCode: String get() = when (lang) {
        AppLanguage.CHINESE -> "根据需求描述生成 JavaScript/CSS 代码。"
        AppLanguage.ENGLISH -> "Generate JavaScript/CSS code based on requirement description."
        AppLanguage.ARABIC -> "إنشاء كود JavaScript/CSS بناءً على وصف المتطلبات."
    }
    val agentToolFixError: String get() = when (lang) {
        AppLanguage.CHINESE -> "自动修复代码中检测到的错误。"
        AppLanguage.ENGLISH -> "Automatically fix detected errors in code."
        AppLanguage.ARABIC -> "إصلاح الأخطاء المكتشفة في الكود تلقائياً."
    }
    val agentToolRefactorCode: String get() = when (lang) {
        AppLanguage.CHINESE -> "重构和优化代码，提高可读性和性能。"
        AppLanguage.ENGLISH -> "Refactor and optimize code, improve readability and performance."
        AppLanguage.ARABIC -> "إعادة هيكلة وتحسين الكود، تحسين قابلية القراءة والأداء."
    }
    val agentToolTestModule: String get() = when (lang) {
        AppLanguage.CHINESE -> "在测试页面运行模块代码，返回执行结果。"
        AppLanguage.ENGLISH -> "Run module code on test page, return execution results."
        AppLanguage.ARABIC -> "تشغيل كود الوحدة على صفحة الاختبار، إرجاع نتائج التنفيذ."
    }
    val agentToolValidateConfig: String get() = when (lang) {
        AppLanguage.CHINESE -> "验证模块配置项的完整性和正确性。"
        AppLanguage.ENGLISH -> "Validate completeness and correctness of module configuration items."
        AppLanguage.ARABIC -> "التحقق من اكتمال وصحة عناصر تكوين الوحدة."
    }
    val agentToolGetTemplates: String get() = when (lang) {
        AppLanguage.CHINESE -> "获取与需求相关的代码模板。"
        AppLanguage.ENGLISH -> "Get code templates related to requirements."
        AppLanguage.ARABIC -> "الحصول على قوالب الكود المتعلقة بالمتطلبات."
    }
    val agentToolGetSnippets: String get() = when (lang) {
        AppLanguage.CHINESE -> "搜索可用的代码片段。"
        AppLanguage.ENGLISH -> "Search for available code snippets."
        AppLanguage.ARABIC -> "البحث عن مقتطفات الكود المتاحة."
    }
    val agentToolCreateModule: String get() = when (lang) {
        AppLanguage.CHINESE -> "创建新的扩展模块。"
        AppLanguage.ENGLISH -> "Create a new extension module."
        AppLanguage.ARABIC -> "إنشاء وحدة امتداد جديدة."
    }
    val agentToolPreviewModule: String get() = when (lang) {
        AppLanguage.CHINESE -> "预览模块在指定页面的效果。"
        AppLanguage.ENGLISH -> "Preview module effect on specified page."
        AppLanguage.ARABIC -> "معاينة تأثير الوحدة على الصفحة المحددة."
    }
    
    // Agent 工具类型显示名称
    val toolTypeSyntaxCheck: String get() = when (lang) {
        AppLanguage.CHINESE -> "语法检查"
        AppLanguage.ENGLISH -> "Syntax Check"
        AppLanguage.ARABIC -> "فحص بناء الجملة"
    }
    val toolTypeSyntaxCheckDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "检查 JavaScript/CSS 代码语法错误"
        AppLanguage.ENGLISH -> "Check JavaScript/CSS code syntax errors"
        AppLanguage.ARABIC -> "فحص أخطاء بناء الجملة في كود JavaScript/CSS"
    }
    val toolTypeLintCode: String get() = when (lang) {
        AppLanguage.CHINESE -> "代码规范检查"
        AppLanguage.ENGLISH -> "Code Lint"
        AppLanguage.ARABIC -> "فحص معايير الكود"
    }
    val toolTypeLintCodeDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "检查代码风格和最佳实践"
        AppLanguage.ENGLISH -> "Check code style and best practices"
        AppLanguage.ARABIC -> "فحص نمط الكود وأفضل الممارسات"
    }
    val toolTypeSecurityScan: String get() = when (lang) {
        AppLanguage.CHINESE -> "安全扫描"
        AppLanguage.ENGLISH -> "Security Scan"
        AppLanguage.ARABIC -> "فحص الأمان"
    }
    val toolTypeSecurityScanDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "检查潜在的安全问题"
        AppLanguage.ENGLISH -> "Check for potential security issues"
        AppLanguage.ARABIC -> "فحص المشاكل الأمنية المحتملة"
    }
    val toolTypeGenerateCode: String get() = when (lang) {
        AppLanguage.CHINESE -> "生成代码"
        AppLanguage.ENGLISH -> "Generate Code"
        AppLanguage.ARABIC -> "إنشاء الكود"
    }
    val toolTypeGenerateCodeDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "根据需求生成代码"
        AppLanguage.ENGLISH -> "Generate code based on requirements"
        AppLanguage.ARABIC -> "إنشاء الكود بناءً على المتطلبات"
    }
    val toolTypeRefactorCode: String get() = when (lang) {
        AppLanguage.CHINESE -> "重构代码"
        AppLanguage.ENGLISH -> "Refactor Code"
        AppLanguage.ARABIC -> "إعادة هيكلة الكود"
    }
    val toolTypeRefactorCodeDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "优化和重构现有代码"
        AppLanguage.ENGLISH -> "Optimize and refactor existing code"
        AppLanguage.ARABIC -> "تحسين وإعادة هيكلة الكود الحالي"
    }
    val toolTypeFixError: String get() = when (lang) {
        AppLanguage.CHINESE -> "修复错误"
        AppLanguage.ENGLISH -> "Fix Error"
        AppLanguage.ARABIC -> "إصلاح الخطأ"
    }
    val toolTypeFixErrorDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "自动修复检测到的错误"
        AppLanguage.ENGLISH -> "Automatically fix detected errors"
        AppLanguage.ARABIC -> "إصلاح الأخطاء المكتشفة تلقائياً"
    }
    val toolTypeTestModule: String get() = when (lang) {
        AppLanguage.CHINESE -> "测试模块"
        AppLanguage.ENGLISH -> "Test Module"
        AppLanguage.ARABIC -> "اختبار الوحدة"
    }
    val toolTypeTestModuleDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "在测试页面运行模块"
        AppLanguage.ENGLISH -> "Run module on test page"
        AppLanguage.ARABIC -> "تشغيل الوحدة على صفحة الاختبار"
    }
    val toolTypeValidateConfig: String get() = when (lang) {
        AppLanguage.CHINESE -> "验证配置"
        AppLanguage.ENGLISH -> "Validate Config"
        AppLanguage.ARABIC -> "التحقق من التكوين"
    }
    val toolTypeValidateConfigDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "验证模块配置项"
        AppLanguage.ENGLISH -> "Validate module configuration items"
        AppLanguage.ARABIC -> "التحقق من عناصر تكوين الوحدة"
    }
    val toolTypeGetTemplates: String get() = when (lang) {
        AppLanguage.CHINESE -> "获取模板"
        AppLanguage.ENGLISH -> "Get Templates"
        AppLanguage.ARABIC -> "الحصول على القوالب"
    }
    val toolTypeGetTemplatesDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "获取相关代码模板"
        AppLanguage.ENGLISH -> "Get related code templates"
        AppLanguage.ARABIC -> "الحصول على قوالب الكود ذات الصلة"
    }
    val toolTypeGetSnippets: String get() = when (lang) {
        AppLanguage.CHINESE -> "获取代码片段"
        AppLanguage.ENGLISH -> "Get Snippets"
        AppLanguage.ARABIC -> "الحصول على مقتطفات الكود"
    }
    val toolTypeGetSnippetsDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "获取可用的代码片段"
        AppLanguage.ENGLISH -> "Get available code snippets"
        AppLanguage.ARABIC -> "الحصول على مقتطفات الكود المتاحة"
    }
    val toolTypeSearchDocs: String get() = when (lang) {
        AppLanguage.CHINESE -> "搜索文档"
        AppLanguage.ENGLISH -> "Search Docs"
        AppLanguage.ARABIC -> "البحث في المستندات"
    }
    val toolTypeSearchDocsDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "搜索相关文档和示例"
        AppLanguage.ENGLISH -> "Search related docs and examples"
        AppLanguage.ARABIC -> "البحث عن المستندات والأمثلة ذات الصلة"
    }
    val toolTypeCreateModule: String get() = when (lang) {
        AppLanguage.CHINESE -> "创建模块"
        AppLanguage.ENGLISH -> "Create Module"
        AppLanguage.ARABIC -> "إنشاء وحدة"
    }
    val toolTypeCreateModuleDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "创建新的扩展模块"
        AppLanguage.ENGLISH -> "Create a new extension module"
        AppLanguage.ARABIC -> "إنشاء وحدة امتداد جديدة"
    }
    val toolTypeUpdateModule: String get() = when (lang) {
        AppLanguage.CHINESE -> "更新模块"
        AppLanguage.ENGLISH -> "Update Module"
        AppLanguage.ARABIC -> "تحديث الوحدة"
    }
    val toolTypeUpdateModuleDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "更新现有模块"
        AppLanguage.ENGLISH -> "Update existing module"
        AppLanguage.ARABIC -> "تحديث الوحدة الحالية"
    }
    val toolTypePreviewModule: String get() = when (lang) {
        AppLanguage.CHINESE -> "预览模块"
        AppLanguage.ENGLISH -> "Preview Module"
        AppLanguage.ARABIC -> "معاينة الوحدة"
    }
    val toolTypePreviewModuleDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "预览模块效果"
        AppLanguage.ENGLISH -> "Preview module effect"
        AppLanguage.ARABIC -> "معاينة تأثير الوحدة"
    }
    
    // ==================== 分类分组 ====================
    val categoryGroupContent: String get() = when (lang) {
        AppLanguage.CHINESE -> "内容处理"
        AppLanguage.ENGLISH -> "Content"
        AppLanguage.ARABIC -> "المحتوى"
    }
    val categoryGroupAppearance: String get() = when (lang) {
        AppLanguage.CHINESE -> "外观样式"
        AppLanguage.ENGLISH -> "Appearance"
        AppLanguage.ARABIC -> "المظهر"
    }
    val categoryGroupFunction: String get() = when (lang) {
        AppLanguage.CHINESE -> "功能增强"
        AppLanguage.ENGLISH -> "Function"
        AppLanguage.ARABIC -> "الوظائف"
    }
    val categoryGroupData: String get() = when (lang) {
        AppLanguage.CHINESE -> "数据工具"
        AppLanguage.ENGLISH -> "Data Tools"
        AppLanguage.ARABIC -> "أدوات البيانات"
    }
    val categoryGroupMedia: String get() = when (lang) {
        AppLanguage.CHINESE -> "媒体处理"
        AppLanguage.ENGLISH -> "Media"
        AppLanguage.ARABIC -> "الوسائط"
    }
    val categoryGroupSecurity: String get() = when (lang) {
        AppLanguage.CHINESE -> "安全隐私"
        AppLanguage.ENGLISH -> "Security"
        AppLanguage.ARABIC -> "الأمان"
    }
    val categoryGroupLife: String get() = when (lang) {
        AppLanguage.CHINESE -> "生活工具"
        AppLanguage.ENGLISH -> "Life Tools"
        AppLanguage.ARABIC -> "أدوات الحياة"
    }
    val categoryGroupDeveloper: String get() = when (lang) {
        AppLanguage.CHINESE -> "开发调试"
        AppLanguage.ENGLISH -> "Developer"
        AppLanguage.ARABIC -> "المطور"
    }
    val categoryGroupOther: String get() = when (lang) {
        AppLanguage.CHINESE -> "其他"
        AppLanguage.ENGLISH -> "Other"
        AppLanguage.ARABIC -> "أخرى"
    }
    
    // ==================== 权限分组 ====================
    val permGroupBasic: String get() = when (lang) {
        AppLanguage.CHINESE -> "基础权限"
        AppLanguage.ENGLISH -> "Basic Permissions"
        AppLanguage.ARABIC -> "الأذونات الأساسية"
    }
    val permGroupStorage: String get() = when (lang) {
        AppLanguage.CHINESE -> "存储权限"
        AppLanguage.ENGLISH -> "Storage Permissions"
        AppLanguage.ARABIC -> "أذونات التخزين"
    }
    val permGroupNetwork: String get() = when (lang) {
        AppLanguage.CHINESE -> "网络权限"
        AppLanguage.ENGLISH -> "Network Permissions"
        AppLanguage.ARABIC -> "أذونات الشبكة"
    }
    val permGroupInteraction: String get() = when (lang) {
        AppLanguage.CHINESE -> "用户交互"
        AppLanguage.ENGLISH -> "User Interaction"
        AppLanguage.ARABIC -> "تفاعل المستخدم"
    }
    val permGroupDevice: String get() = when (lang) {
        AppLanguage.CHINESE -> "设备权限"
        AppLanguage.ENGLISH -> "Device Permissions"
        AppLanguage.ARABIC -> "أذونات الجهاز"
    }
    val permGroupMediaPerm: String get() = when (lang) {
        AppLanguage.CHINESE -> "媒体权限"
        AppLanguage.ENGLISH -> "Media Permissions"
        AppLanguage.ARABIC -> "أذونات الوسائط"
    }
    val permGroupFile: String get() = when (lang) {
        AppLanguage.CHINESE -> "文件权限"
        AppLanguage.ENGLISH -> "File Permissions"
        AppLanguage.ARABIC -> "أذونات الملفات"
    }
    val permGroupAdvanced: String get() = when (lang) {
        AppLanguage.CHINESE -> "高级权限"
        AppLanguage.ENGLISH -> "Advanced Permissions"
        AppLanguage.ARABIC -> "الأذونات المتقدمة"
    }
    
    // ==================== AI 供应商描述 ====================
    val providerOpenaiDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "文本表现出色，推理能力强，支持文本、视觉和图像生成"
        AppLanguage.ENGLISH -> "Excellent text performance, strong reasoning, supports text, vision and image generation"
        AppLanguage.ARABIC -> "أداء نصي ممتاز، قدرة استدلال قوية، يدعم النص والرؤية وإنشاء الصور"
    }
    val providerOpenaiPricing: String get() = when (lang) {
        AppLanguage.CHINESE -> "GPT 5.1 系列约 $10/ 百万token"
        AppLanguage.ENGLISH -> "GPT 5.1 series ~$10/million tokens"
        AppLanguage.ARABIC -> "سلسلة GPT 5.1 حوالي $10/مليون رمز"
    }
    val providerOpenrouterDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "聚合多家 AI 供应商，统一接口调用。可用同一 API Key 调用 OpenAI、Claude、Gemini 等多种模型"
        AppLanguage.ENGLISH -> "Aggregates multiple AI providers with unified API. Use one API Key for OpenAI, Claude, Gemini and more"
        AppLanguage.ARABIC -> "يجمع مزودي AI متعددين مع واجهة موحدة. استخدم مفتاح API واحد لـ OpenAI وClaude وGemini والمزيد"
    }
    val providerOpenrouterPricing: String get() = when (lang) {
        AppLanguage.CHINESE -> "按模型不同计费，价格透明，有免费模型，强烈推荐"
        AppLanguage.ENGLISH -> "Pay per model, transparent pricing, free models available, highly recommended"
        AppLanguage.ARABIC -> "الدفع حسب النموذج، أسعار شفافة، نماذج مجانية متاحة، موصى به بشدة"
    }
    val providerAnthropicDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "Claude 系列模型，擅长文本理解和代码生成且有视觉支持，编程能力强。"
        AppLanguage.ENGLISH -> "Claude models, excellent at text understanding and code generation with vision support, strong coding"
        AppLanguage.ARABIC -> "نماذج Claude، ممتازة في فهم النص وإنشاء الكود مع دعم الرؤية، قدرة برمجة قوية"
    }
    val providerAnthropicPricing: String get() = when (lang) {
        AppLanguage.CHINESE -> "Claude 4.5 Sonnet 约 $15/百万 token"
        AppLanguage.ENGLISH -> "Claude 4.5 Sonnet ~$15/million tokens"
        AppLanguage.ARABIC -> "Claude 4.5 Sonnet حوالي $15/مليون رمز"
    }
    val providerGoogleDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "★推荐★ Gemini 3.0 Pro 前端表现出色，原生多模态支持，全面顶配支持。"
        AppLanguage.ENGLISH -> "★Recommended★ Gemini 3.0 Pro excellent frontend performance, native multimodal support"
        AppLanguage.ARABIC -> "★موصى به★ Gemini 3.0 Pro أداء أمامي ممتاز، دعم متعدد الوسائط أصلي"
    }
    val providerGooglePricing: String get() = when (lang) {
        AppLanguage.CHINESE -> "有免费额度，超出后按 token 计费"
        AppLanguage.ENGLISH -> "Free tier available, pay per token after"
        AppLanguage.ARABIC -> "مستوى مجاني متاح، الدفع لكل رمز بعد ذلك"
    }
    val providerDeepseekDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "国家队，性价比高。目前仅支持文本和图像文本生成"
        AppLanguage.ENGLISH -> "High value Chinese AI. Currently supports text and image-text generation only"
        AppLanguage.ARABIC -> "ذكاء اصطناعي صيني عالي القيمة. يدعم حالياً إنشاء النص والصور فقط"
    }
    val providerDeepseekPricing: String get() = when (lang) {
        AppLanguage.CHINESE -> "极低价格，约 ¥0.4/百万 token"
        AppLanguage.ENGLISH -> "Very low price, ~¥0.4/million tokens"
        AppLanguage.ARABIC -> "سعر منخفض جداً، حوالي ¥0.4/مليون رمز"
    }
    val providerMinimaxDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "国产，支持高音质人声语音克隆/合成。文本模型性能优秀，代码agent能力较强"
        AppLanguage.ENGLISH -> "Chinese AI with high-quality voice cloning/synthesis. Excellent text model, strong code agent"
        AppLanguage.ARABIC -> "ذكاء اصطناعي صيني مع استنساخ/توليف صوتي عالي الجودة. نموذج نصي ممتاز، وكيل كود قوي"
    }
    val providerMinimaxPricing: String get() = when (lang) {
        AppLanguage.CHINESE -> "价格较低，约 $1/百万 token"
        AppLanguage.ENGLISH -> "Low price, ~$1/million tokens"
        AppLanguage.ARABIC -> "سعر منخفض، حوالي $1/مليون رمز"
    }
    val providerGlmDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "国产，GLM-4.6 系列性能优秀，编码能力强，支持多模态"
        AppLanguage.ENGLISH -> "Chinese AI, GLM-4.6 series excellent performance, strong coding, multimodal support"
        AppLanguage.ARABIC -> "ذكاء اصطناعي صيني، سلسلة GLM-4.6 أداء ممتاز، قدرة برمجة قوية، دعم متعدد الوسائط"
    }
    val providerGlmPricing: String get() = when (lang) {
        AppLanguage.CHINESE -> "价格较低，约 $2/百万 token"
        AppLanguage.ENGLISH -> "Low price, ~$2/million tokens"
        AppLanguage.ARABIC -> "سعر منخفض، حوالي $2/مليون رمز"
    }
    val providerGrokDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "马斯克旗下 xAI 的 Grok 系列，支持文本和视觉"
        AppLanguage.ENGLISH -> "Elon Musk's xAI Grok series, supports text and vision"
        AppLanguage.ARABIC -> "سلسلة Grok من xAI التابعة لإيلون ماسك، تدعم النص والرؤية"
    }
    val providerGrokPricing: String get() = when (lang) {
        AppLanguage.CHINESE -> "价格便宜，Grok-4.1-fast 约 $0.5/百万 token"
        AppLanguage.ENGLISH -> "Cheap, Grok-4.1-fast ~$0.5/million tokens"
        AppLanguage.ARABIC -> "رخيص، Grok-4.1-fast حوالي $0.5/مليون رمز"
    }
    val providerVolcanoDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "字节跳动旗下，豆包大模型生态均衡。推荐模型：doubao-1.6-pro-256k"
        AppLanguage.ENGLISH -> "ByteDance's Volcano, balanced Doubao model ecosystem. Recommended: doubao-1.6-pro-256k"
        AppLanguage.ARABIC -> "Volcano من ByteDance، نظام نموذج Doubao متوازن. موصى به: doubao-1.6-pro-256k"
    }
    val providerVolcanoPricing: String get() = when (lang) {
        AppLanguage.CHINESE -> "有免费额度，价格便宜"
        AppLanguage.ENGLISH -> "Free tier available, cheap pricing"
        AppLanguage.ARABIC -> "مستوى مجاني متاح، أسعار رخيصة"
    }
    val providerSiliconflowDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "国产 AI 平台，聚合多种开源模型。"
        AppLanguage.ENGLISH -> "Chinese AI platform, aggregates multiple open-source models"
        AppLanguage.ARABIC -> "منصة ذكاء اصطناعي صينية، تجمع نماذج مفتوحة المصدر متعددة"
    }
    val providerSiliconflowPricing: String get() = when (lang) {
        AppLanguage.CHINESE -> "有免费额度，价格便宜"
        AppLanguage.ENGLISH -> "Free tier available, cheap pricing"
        AppLanguage.ARABIC -> "مستوى مجاني متاح، أسعار رخيصة"
    }
    val providerQwenDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "阿里云通义千问，支持文本、视觉、音频等多模态。Qwen3 系列推理能力强"
        AppLanguage.ENGLISH -> "Alibaba Qwen, supports text, vision, audio multimodal. Qwen3 series strong reasoning"
        AppLanguage.ARABIC -> "Qwen من علي بابا، يدعم النص والرؤية والصوت متعدد الوسائط. سلسلة Qwen3 قدرة استدلال قوية"
    }
    val providerQwenPricing: String get() = when (lang) {
        AppLanguage.CHINESE -> "有免费额度，价格便宜，约 ¥0.5/百万 token"
        AppLanguage.ENGLISH -> "Free tier available, cheap ~¥0.5/million tokens"
        AppLanguage.ARABIC -> "مستوى مجاني متاح، رخيص حوالي ¥0.5/مليون رمز"
    }
    val providerCustomDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "兼容 OpenAI API 格式的自定义服务。需要填写完整的 Base URL"
        AppLanguage.ENGLISH -> "Custom service compatible with OpenAI API format. Requires full Base URL"
        AppLanguage.ARABIC -> "خدمة مخصصة متوافقة مع تنسيق OpenAI API. يتطلب عنوان URL كاملاً"
    }
    val providerCustomPricing: String get() = when (lang) {
        AppLanguage.CHINESE -> "取决于服务商"
        AppLanguage.ENGLISH -> "Depends on provider"
        AppLanguage.ARABIC -> "يعتمد على المزود"
    }
    
    // ==================== AI 功能场景 ====================
    val featureHtmlCoding: String get() = when (lang) {
        AppLanguage.CHINESE -> "HTML 编程"
        AppLanguage.ENGLISH -> "HTML Coding"
        AppLanguage.ARABIC -> "برمجة HTML"
    }
    val featureHtmlCodingDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "AI 辅助生成和修改 HTML/CSS/JS 代码"
        AppLanguage.ENGLISH -> "AI-assisted HTML/CSS/JS code generation and modification"
        AppLanguage.ARABIC -> "إنشاء وتعديل كود HTML/CSS/JS بمساعدة الذكاء الاصطناعي"
    }
    val featureHtmlCodingImage: String get() = when (lang) {
        AppLanguage.CHINESE -> "HTML 编程（图像）"
        AppLanguage.ENGLISH -> "HTML Coding (Image)"
        AppLanguage.ARABIC -> "برمجة HTML (صورة)"
    }
    val featureHtmlCodingImageDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "HTML 编程中的图像生成功能"
        AppLanguage.ENGLISH -> "Image generation for HTML coding"
        AppLanguage.ARABIC -> "إنشاء الصور لبرمجة HTML"
    }
    val featureIconGen: String get() = when (lang) {
        AppLanguage.CHINESE -> "图标生成"
        AppLanguage.ENGLISH -> "Icon Generation"
        AppLanguage.ARABIC -> "إنشاء الأيقونات"
    }
    val featureIconGenDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "使用 AI 生成应用图标"
        AppLanguage.ENGLISH -> "Generate app icons using AI"
        AppLanguage.ARABIC -> "إنشاء أيقونات التطبيق باستخدام الذكاء الاصطناعي"
    }
    val featureModuleDev: String get() = when (lang) {
        AppLanguage.CHINESE -> "模块开发"
        AppLanguage.ENGLISH -> "Module Development"
        AppLanguage.ARABIC -> "تطوير الوحدات"
    }
    val featureModuleDevDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "AI Agent 辅助开发扩展模块"
        AppLanguage.ENGLISH -> "AI Agent-assisted extension module development"
        AppLanguage.ARABIC -> "تطوير وحدات الامتداد بمساعدة وكيل الذكاء الاصطناعي"
    }
    val featureLrcGen: String get() = when (lang) {
        AppLanguage.CHINESE -> "歌词生成"
        AppLanguage.ENGLISH -> "LRC Generation"
        AppLanguage.ARABIC -> "إنشاء كلمات الأغاني"
    }
    val featureLrcGenDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "AI 生成 LRC 歌词文件"
        AppLanguage.ENGLISH -> "AI-generated LRC lyrics files"
        AppLanguage.ARABIC -> "ملفات كلمات LRC بالذكاء الاصطناعي"
    }
    val featureTranslate: String get() = when (lang) {
        AppLanguage.CHINESE -> "翻译"
        AppLanguage.ENGLISH -> "Translation"
        AppLanguage.ARABIC -> "ترجمة"
    }
    val featureTranslateDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "网页内容翻译"
        AppLanguage.ENGLISH -> "Web content translation"
        AppLanguage.ARABIC -> "ترجمة محتوى الويب"
    }
    val featureGeneral: String get() = when (lang) {
        AppLanguage.CHINESE -> "通用对话"
        AppLanguage.ENGLISH -> "General Chat"
        AppLanguage.ARABIC -> "محادثة عامة"
    }
    val featureGeneralDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "通用 AI 对话功能"
        AppLanguage.ENGLISH -> "General AI chat functionality"
        AppLanguage.ARABIC -> "وظيفة محادثة الذكاء الاصطناعي العامة"
    }
    
    // ==================== 模型能力 ====================
    val capabilityText: String get() = when (lang) {
        AppLanguage.CHINESE -> "文本生成"
        AppLanguage.ENGLISH -> "Text Generation"
        AppLanguage.ARABIC -> "إنشاء النص"
    }
    val capabilityTextDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "基础文本对话和生成"
        AppLanguage.ENGLISH -> "Basic text dialogue and generation"
        AppLanguage.ARABIC -> "حوار وإنشاء النص الأساسي"
    }
    val capabilityAudio: String get() = when (lang) {
        AppLanguage.CHINESE -> "音频理解"
        AppLanguage.ENGLISH -> "Audio Understanding"
        AppLanguage.ARABIC -> "فهم الصوت"
    }
    val capabilityAudioDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "理解和转录音频内容"
        AppLanguage.ENGLISH -> "Understand and transcribe audio content"
        AppLanguage.ARABIC -> "فهم ونسخ محتوى الصوت"
    }
    val capabilityImage: String get() = when (lang) {
        AppLanguage.CHINESE -> "图像理解"
        AppLanguage.ENGLISH -> "Image Understanding"
        AppLanguage.ARABIC -> "فهم الصور"
    }
    val capabilityImageDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "理解和分析图像内容"
        AppLanguage.ENGLISH -> "Understand and analyze image content"
        AppLanguage.ARABIC -> "فهم وتحليل محتوى الصور"
    }
    val capabilityImageGen: String get() = when (lang) {
        AppLanguage.CHINESE -> "图像生成"
        AppLanguage.ENGLISH -> "Image Generation"
        AppLanguage.ARABIC -> "إنشاء الصور"
    }
    val capabilityImageGenDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "生成图像和图标"
        AppLanguage.ENGLISH -> "Generate images and icons"
        AppLanguage.ARABIC -> "إنشاء الصور والأيقونات"
    }
    val capabilityVideo: String get() = when (lang) {
        AppLanguage.CHINESE -> "视频理解"
        AppLanguage.ENGLISH -> "Video Understanding"
        AppLanguage.ARABIC -> "فهم الفيديو"
    }
    val capabilityVideoDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "理解视频内容"
        AppLanguage.ENGLISH -> "Understand video content"
        AppLanguage.ARABIC -> "فهم محتوى الفيديو"
    }
    val capabilityCode: String get() = when (lang) {
        AppLanguage.CHINESE -> "代码生成"
        AppLanguage.ENGLISH -> "Code Generation"
        AppLanguage.ARABIC -> "إنشاء الكود"
    }
    val capabilityCodeDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "生成和理解代码"
        AppLanguage.ENGLISH -> "Generate and understand code"
        AppLanguage.ARABIC -> "إنشاء وفهم الكود"
    }
    val capabilityFunctionCall: String get() = when (lang) {
        AppLanguage.CHINESE -> "函数调用"
        AppLanguage.ENGLISH -> "Function Call"
        AppLanguage.ARABIC -> "استدعاء الوظائف"
    }
    val capabilityFunctionCallDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "支持工具调用"
        AppLanguage.ENGLISH -> "Support tool calling"
        AppLanguage.ARABIC -> "دعم استدعاء الأدوات"
    }
    val capabilityLongContext: String get() = when (lang) {
        AppLanguage.CHINESE -> "长上下文"
        AppLanguage.ENGLISH -> "Long Context"
        AppLanguage.ARABIC -> "سياق طويل"
    }
    val capabilityLongContextDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "支持超长文本输入"
        AppLanguage.ENGLISH -> "Support extra long text input"
        AppLanguage.ARABIC -> "دعم إدخال النص الطويل جداً"
    }
    
    // ==================== 模块配置项 ====================
    val configCssSelector: String get() = when (lang) {
        AppLanguage.CHINESE -> "CSS 选择器"
        AppLanguage.ENGLISH -> "CSS Selector"
        AppLanguage.ARABIC -> "محدد CSS"
    }
    val configCssSelectorDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "要隐藏的元素选择器，每行一个"
        AppLanguage.ENGLISH -> "Element selectors to hide, one per line"
        AppLanguage.ARABIC -> "محددات العناصر للإخفاء، واحد لكل سطر"
    }
    val configCssSelectorPlaceholder: String get() = when (lang) {
        AppLanguage.CHINESE -> "输入 CSS 选择器，每行一个"
        AppLanguage.ENGLISH -> "Enter CSS selectors, one per line"
        AppLanguage.ARABIC -> "أدخل محددات CSS، واحد لكل سطر"
    }
    val configHideMethod: String get() = when (lang) {
        AppLanguage.CHINESE -> "隐藏方式"
        AppLanguage.ENGLISH -> "Hide Method"
        AppLanguage.ARABIC -> "طريقة الإخفاء"
    }
    val configBlockPopups: String get() = when (lang) {
        AppLanguage.CHINESE -> "拦截弹窗"
        AppLanguage.ENGLISH -> "Block Popups"
        AppLanguage.ARABIC -> "حظر النوافذ المنبثقة"
    }
    val configBlockOverlays: String get() = when (lang) {
        AppLanguage.CHINESE -> "拦截遮罩层"
        AppLanguage.ENGLISH -> "Block Overlays"
        AppLanguage.ARABIC -> "حظر الطبقات المتراكبة"
    }
    val configAutoCloseDelay: String get() = when (lang) {
        AppLanguage.CHINESE -> "自动关闭延迟(ms)"
        AppLanguage.ENGLISH -> "Auto Close Delay (ms)"
        AppLanguage.ARABIC -> "تأخير الإغلاق التلقائي (مللي ثانية)"
    }
    val configCssCode: String get() = when (lang) {
        AppLanguage.CHINESE -> "CSS代码"
        AppLanguage.ENGLISH -> "CSS Code"
        AppLanguage.ARABIC -> "كود CSS"
    }
    val configBrightness: String get() = when (lang) {
        AppLanguage.CHINESE -> "亮度(%)"
        AppLanguage.ENGLISH -> "Brightness (%)"
        AppLanguage.ARABIC -> "السطوع (%)"
    }
    val configContrast: String get() = when (lang) {
        AppLanguage.CHINESE -> "对比度(%)"
        AppLanguage.ENGLISH -> "Contrast (%)"
        AppLanguage.ARABIC -> "التباين (%)"
    }
    val configFont: String get() = when (lang) {
        AppLanguage.CHINESE -> "字体"
        AppLanguage.ENGLISH -> "Font"
        AppLanguage.ARABIC -> "الخط"
    }
    val configFontSize: String get() = when (lang) {
        AppLanguage.CHINESE -> "字号(px)"
        AppLanguage.ENGLISH -> "Font Size (px)"
        AppLanguage.ARABIC -> "حجم الخط (بكسل)"
    }
    
    // ==================== 风格参考分类 ====================
    val styleMovie: String get() = when (lang) {
        AppLanguage.CHINESE -> "电影"
        AppLanguage.ENGLISH -> "Movie"
        AppLanguage.ARABIC -> "فيلم"
    }
    
    val styleBook: String get() = when (lang) {
        AppLanguage.CHINESE -> "书籍"
        AppLanguage.ENGLISH -> "Book"
        AppLanguage.ARABIC -> "كتاب"
    }
    
    val styleAnime: String get() = when (lang) {
        AppLanguage.CHINESE -> "动画"
        AppLanguage.ENGLISH -> "Anime"
        AppLanguage.ARABIC -> "أنمي"
    }
    
    val styleGame: String get() = when (lang) {
        AppLanguage.CHINESE -> "游戏"
        AppLanguage.ENGLISH -> "Game"
        AppLanguage.ARABIC -> "لعبة"
    }
    
    val styleBrand: String get() = when (lang) {
        AppLanguage.CHINESE -> "品牌"
        AppLanguage.ENGLISH -> "Brand"
        AppLanguage.ARABIC -> "علامة تجارية"
    }
    
    val styleArt: String get() = when (lang) {
        AppLanguage.CHINESE -> "艺术流派"
        AppLanguage.ENGLISH -> "Art Style"
        AppLanguage.ARABIC -> "أسلوب فني"
    }
    
    val styleEra: String get() = when (lang) {
        AppLanguage.CHINESE -> "时代风格"
        AppLanguage.ENGLISH -> "Era Style"
        AppLanguage.ARABIC -> "أسلوب العصر"
    }
    
    val styleCulture: String get() = when (lang) {
        AppLanguage.CHINESE -> "文化风格"
        AppLanguage.ENGLISH -> "Cultural Style"
        AppLanguage.ARABIC -> "أسلوب ثقافي"
    }
    
    // ==================== 主题设置页面 ====================
    val colorScheme: String get() = when (lang) {
        AppLanguage.CHINESE -> "配色方案"
        AppLanguage.ENGLISH -> "Color Scheme"
        AppLanguage.ARABIC -> "نظام الألوان"
    }
    
    val themeFeatures: String get() = when (lang) {
        AppLanguage.CHINESE -> "主题特性"
        AppLanguage.ENGLISH -> "Theme Features"
        AppLanguage.ARABIC -> "ميزات السمة"
    }
    
    val applyTheme: String get() = when (lang) {
        AppLanguage.CHINESE -> "应用主题"
        AppLanguage.ENGLISH -> "Apply Theme"
        AppLanguage.ARABIC -> "تطبيق السمة"
    }
    
    // ==================== 启动画面设置 ====================
    val allowSkip: String get() = when (lang) {
        AppLanguage.CHINESE -> "允许点击跳过"
        AppLanguage.ENGLISH -> "Allow Skip"
        AppLanguage.ARABIC -> "السماح بالتخطي"
    }
    
    val allowSkipHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "用户可点击屏幕跳过启动画面"
        AppLanguage.ENGLISH -> "User can tap screen to skip splash"
        AppLanguage.ARABIC -> "يمكن للمستخدم النقر على الشاشة لتخطي شاشة البداية"
    }
    
    val showTranslateButton: String get() = when (lang) {
        AppLanguage.CHINESE -> "显示翻译按钮"
        AppLanguage.ENGLISH -> "Show Translate Button"
        AppLanguage.ARABIC -> "إظهار زر الترجمة"
    }
    
    val showTranslateButtonHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "在页面右上角显示语言切换按钮"
        AppLanguage.ENGLISH -> "Show language switch button at top right"
        AppLanguage.ARABIC -> "إظهار زر تبديل اللغة في أعلى اليمين"
    }
    
    val previewAnnouncement: String get() = when (lang) {
        AppLanguage.CHINESE -> "预览公告效果"
        AppLanguage.ENGLISH -> "Preview Announcement"
        AppLanguage.ARABIC -> "معاينة الإعلان"
    }
    
    // ==================== CreateAppScreen 翻译 ====================
    val showStatusBar: String get() = when (lang) {
        AppLanguage.CHINESE -> "显示状态栏"
        AppLanguage.ENGLISH -> "Show Status Bar"
        AppLanguage.ARABIC -> "إظهار شريط الحالة"
    }
    
    val showStatusBarHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "全屏模式下仍显示状态栏，可解决导航栏问题"
        AppLanguage.ENGLISH -> "Show status bar in fullscreen mode, can fix navigation bar issues"
        AppLanguage.ARABIC -> "إظهار شريط الحالة في وضع ملء الشاشة، يمكن أن يحل مشاكل شريط التنقل"
    }
    
    val statusBarStyleConfigLabel: String get() = when (lang) {
        AppLanguage.CHINESE -> "状态栏样式配置"
        AppLanguage.ENGLISH -> "Status Bar Style Config"
        AppLanguage.ARABIC -> "إعدادات نمط شريط الحالة"
    }
    
    val splashHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "设置应用启动时显示的图片或视频"
        AppLanguage.ENGLISH -> "Set image or video to display when app launches"
        AppLanguage.ARABIC -> "تعيين الصورة أو الفيديو لعرضها عند تشغيل التطبيق"
    }
    
    val clickToSelectImageOrVideo: String get() = when (lang) {
        AppLanguage.CHINESE -> "点击下方按钮选择图片或视频"
        AppLanguage.ENGLISH -> "Click button below to select image or video"
        AppLanguage.ARABIC -> "انقر على الزر أدناه لاختيار صورة أو فيديو"
    }
    
    val displayDuration: String get() = when (lang) {
        AppLanguage.CHINESE -> "显示时长"
        AppLanguage.ENGLISH -> "Display Duration"
        AppLanguage.ARABIC -> "مدة العرض"
    }
    
    val displayDurationSeconds: String get() = when (lang) {
        AppLanguage.CHINESE -> "显示时长：%d 秒"
        AppLanguage.ENGLISH -> "Display duration: %d seconds"
        AppLanguage.ARABIC -> "مدة العرض: %d ثانية"
    }
    
    val exportAppTheme: String get() = when (lang) {
        AppLanguage.CHINESE -> "导出应用主题"
        AppLanguage.ENGLISH -> "Export App Theme"
        AppLanguage.ARABIC -> "تصدير سمة التطبيق"
    }
    
    val exportAppThemeHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "设置导出 APK 后应用的 UI 主题风格（激活码验证、公告弹窗等界面）"
        AppLanguage.ENGLISH -> "Set UI theme style for exported APK (activation code, announcement dialogs, etc.)"
        AppLanguage.ARABIC -> "تعيين نمط سمة واجهة المستخدم لـ APK المُصدَّر (رمز التفعيل، نوافذ الإعلانات، إلخ)"
    }
    
    val autoTranslateHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "页面加载完成后自动翻译为指定语言（使用 Google 翻译）"
        AppLanguage.ENGLISH -> "Auto translate to specified language after page loads (using Google Translate)"
        AppLanguage.ARABIC -> "ترجمة تلقائية إلى اللغة المحددة بعد تحميل الصفحة (باستخدام ترجمة Google)"
    }
    
    val videoCrop: String get() = when (lang) {
        AppLanguage.CHINESE -> "视频裁剪"
        AppLanguage.ENGLISH -> "Video Crop"
        AppLanguage.ARABIC -> "قص الفيديو"
    }
    
    val splashPreview: String get() = when (lang) {
        AppLanguage.CHINESE -> "启动画面预览"
        AppLanguage.ENGLISH -> "Splash Screen Preview"
        AppLanguage.ARABIC -> "معاينة شاشة البداية"
    }
    
    val landscapeDisplay: String get() = when (lang) {
        AppLanguage.CHINESE -> "横屏显示"
        AppLanguage.ENGLISH -> "Landscape Display"
        AppLanguage.ARABIC -> "عرض أفقي"
    }
    
    val landscapeDisplayHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "启动画面以横屏方式展示"
        AppLanguage.ENGLISH -> "Display splash screen in landscape orientation"
        AppLanguage.ARABIC -> "عرض شاشة البداية بالاتجاه الأفقي"
    }
    
    // ==================== 自启动设置 ====================
    val autoStartSettings: String get() = when (lang) {
        AppLanguage.CHINESE -> "自启动设置"
        AppLanguage.ENGLISH -> "Auto Start Settings"
        AppLanguage.ARABIC -> "إعدادات التشغيل التلقائي"
    }
    
    val configured: String get() = when (lang) {
        AppLanguage.CHINESE -> "已配置"
        AppLanguage.ENGLISH -> "Configured"
        AppLanguage.ARABIC -> "تم التكوين"
    }
    
    val bootAutoStart: String get() = when (lang) {
        AppLanguage.CHINESE -> "开机自启动"
        AppLanguage.ENGLISH -> "Boot Auto Start"
        AppLanguage.ARABIC -> "التشغيل التلقائي عند الإقلاع"
    }
    
    val bootAutoStartHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "设备开机后自动启动此应用"
        AppLanguage.ENGLISH -> "Auto start this app after device boots"
        AppLanguage.ARABIC -> "تشغيل هذا التطبيق تلقائيًا بعد إقلاع الجهاز"
    }
    
    val scheduledAutoStart: String get() = when (lang) {
        AppLanguage.CHINESE -> "定时自启动"
        AppLanguage.ENGLISH -> "Scheduled Auto Start"
        AppLanguage.ARABIC -> "التشغيل التلقائي المجدول"
    }
    
    val scheduledAutoStartHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "在指定时间自动启动此应用"
        AppLanguage.ENGLISH -> "Auto start this app at specified time"
        AppLanguage.ARABIC -> "تشغيل هذا التطبيق تلقائيًا في الوقت المحدد"
    }
    
    val launchDate: String get() = when (lang) {
        AppLanguage.CHINESE -> "启动日期"
        AppLanguage.ENGLISH -> "Launch Date"
        AppLanguage.ARABIC -> "تاريخ التشغيل"
    }
    
    val autoStartNote: String get() = when (lang) {
        AppLanguage.CHINESE -> "自启动功能仅在导出的 APK 中生效。部分手机需要在系统设置中授予自启动权限。"
        AppLanguage.ENGLISH -> "Auto start only works in exported APK. Some phones require granting auto start permission in system settings."
        AppLanguage.ARABIC -> "يعمل التشغيل التلقائي فقط في APK المُصدَّر. تتطلب بعض الهواتف منح إذن التشغيل التلقائي في إعدادات النظام."
    }
    
    // ==================== 公告模板 ====================
    val selectAnnouncementStyle: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择公告样式"
        AppLanguage.ENGLISH -> "Select Announcement Style"
        AppLanguage.ARABIC -> "اختيار نمط الإعلان"
    }
    
    val okGood: String get() = when (lang) {
        AppLanguage.CHINESE -> "好的 👍"
        AppLanguage.ENGLISH -> "OK 👍"
        AppLanguage.ARABIC -> "حسنًا 👍"
    }
    
    val understood: String get() = when (lang) {
        AppLanguage.CHINESE -> "了解了"
        AppLanguage.ENGLISH -> "Understood"
        AppLanguage.ARABIC -> "مفهوم"
    }
    
    val newMessage: String get() = when (lang) {
        AppLanguage.CHINESE -> "新消息"
        AppLanguage.ENGLISH -> "New Message"
        AppLanguage.ARABIC -> "رسالة جديدة"
    }
    
    val learnMore: String get() = when (lang) {
        AppLanguage.CHINESE -> "了解更多"
        AppLanguage.ENGLISH -> "Learn More"
        AppLanguage.ARABIC -> "اعرف المزيد"
    }
    
    // ==================== 公告模板名称 ====================
    
    val templateMinimalDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "简约清爽的设计风格"
        AppLanguage.ENGLISH -> "Clean and simple design style"
        AppLanguage.ARABIC -> "نمط تصميم نظيف وبسيط"
    }
    
    val templateXiaohongshu: String get() = when (lang) {
        AppLanguage.CHINESE -> "小红书"
        AppLanguage.ENGLISH -> "Xiaohongshu"
        AppLanguage.ARABIC -> "شياوهونغشو"
    }
    
    val templateXiaohongshuDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "精美卡片风格"
        AppLanguage.ENGLISH -> "Beautiful card style"
        AppLanguage.ARABIC -> "نمط بطاقة جميل"
    }
    
    val templateGradientDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "炫彩渐变背景"
        AppLanguage.ENGLISH -> "Colorful gradient background"
        AppLanguage.ARABIC -> "خلفية متدرجة ملونة"
    }
    
    val templateGlassmorphismDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "现代毛玻璃效果"
        AppLanguage.ENGLISH -> "Modern frosted glass effect"
        AppLanguage.ARABIC -> "تأثير الزجاج المصنفر الحديث"
    }
    
    val templateNeon: String get() = when (lang) {
        AppLanguage.CHINESE -> "霓虹"
        AppLanguage.ENGLISH -> "Neon"
        AppLanguage.ARABIC -> "نيون"
    }
    
    val templateNeonDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "赛博朋克风格"
        AppLanguage.ENGLISH -> "Cyberpunk style"
        AppLanguage.ARABIC -> "نمط سايبربانك"
    }
    
    val templateCute: String get() = when (lang) {
        AppLanguage.CHINESE -> "可爱"
        AppLanguage.ENGLISH -> "Cute"
        AppLanguage.ARABIC -> "لطيف"
    }
    
    val templateCuteDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "萌系卡通风格"
        AppLanguage.ENGLISH -> "Cute cartoon style"
        AppLanguage.ARABIC -> "نمط كرتوني لطيف"
    }
    
    val templateElegant: String get() = when (lang) {
        AppLanguage.CHINESE -> "优雅"
        AppLanguage.ENGLISH -> "Elegant"
        AppLanguage.ARABIC -> "أنيق"
    }
    
    val templateElegantDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "高端商务风格"
        AppLanguage.ENGLISH -> "Premium business style"
        AppLanguage.ARABIC -> "نمط أعمال راقي"
    }
    
    val templateFestive: String get() = when (lang) {
        AppLanguage.CHINESE -> "节日"
        AppLanguage.ENGLISH -> "Festive"
        AppLanguage.ARABIC -> "احتفالي"
    }
    
    val templateFestiveDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "喜庆节日风格"
        AppLanguage.ENGLISH -> "Festive celebration style"
        AppLanguage.ARABIC -> "نمط احتفالي"
    }
    
    val templateDarkDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "深色主题风格"
        AppLanguage.ENGLISH -> "Dark theme style"
        AppLanguage.ARABIC -> "نمط السمة الداكنة"
    }
    
    val templateNatureDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "清新自然风格"
        AppLanguage.ENGLISH -> "Fresh natural style"
        AppLanguage.ARABIC -> "نمط طبيعي منعش"
    }
    
    // ==================== 语言选项 ====================
    val langChinese: String get() = when (lang) {
        AppLanguage.CHINESE -> "中文"
        AppLanguage.ENGLISH -> "Chinese"
        AppLanguage.ARABIC -> "الصينية"
    }
    
    val langEnglish: String get() = when (lang) {
        AppLanguage.CHINESE -> "英文"
        AppLanguage.ENGLISH -> "English"
        AppLanguage.ARABIC -> "الإنجليزية"
    }
    
    val langJapanese: String get() = when (lang) {
        AppLanguage.CHINESE -> "日文"
        AppLanguage.ENGLISH -> "Japanese"
        AppLanguage.ARABIC -> "اليابانية"
    }
    
    val langArabic: String get() = when (lang) {
        AppLanguage.CHINESE -> "阿拉伯语"
        AppLanguage.ENGLISH -> "Arabic"
        AppLanguage.ARABIC -> "العربية"
    }
    
    // ==================== 公告模板额外翻译 ====================
    val systemNotification: String get() = when (lang) {
        AppLanguage.CHINESE -> "系统通知"
        AppLanguage.ENGLISH -> "System Notification"
        AppLanguage.ARABIC -> "إشعار النظام"
    }
    
    val justNow: String get() = when (lang) {
        AppLanguage.CHINESE -> "刚刚"
        AppLanguage.ENGLISH -> "Just now"
        AppLanguage.ARABIC -> "الآن"
    }
    
    val details: String get() = when (lang) {
        AppLanguage.CHINESE -> "详情"
        AppLanguage.ENGLISH -> "Details"
        AppLanguage.ARABIC -> "التفاصيل"
    }
    
    val clickToSelectOrUseButton: String get() = when (lang) {
        AppLanguage.CHINESE -> "点击选择或使用下方按钮"
        AppLanguage.ENGLISH -> "Click to select or use button below"
        AppLanguage.ARABIC -> "انقر للاختيار أو استخدم الزر أدناه"
    }
    
    // ==================== AI 设置页面 ====================
    val aiSettings: String get() = when (lang) {
        AppLanguage.CHINESE -> "AI 设置"
        AppLanguage.ENGLISH -> "AI Settings"
        AppLanguage.ARABIC -> "إعدادات AI"
    }
    
    val apiKeys: String get() = when (lang) {
        AppLanguage.CHINESE -> "API 密钥"
        AppLanguage.ENGLISH -> "API Keys"
        AppLanguage.ARABIC -> "مفاتيح API"
    }
    
    val noApiKeysHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "暂无 API 密钥，点击右上角添加"
        AppLanguage.ENGLISH -> "No API keys yet, click top right to add"
        AppLanguage.ARABIC -> "لا توجد مفاتيح API بعد، انقر في الأعلى للإضافة"
    }
    
    val testing: String get() = when (lang) {
        AppLanguage.CHINESE -> "测试中..."
        AppLanguage.ENGLISH -> "Testing..."
        AppLanguage.ARABIC -> "جاري الاختبار..."
    }
    
    val connectionSuccess: String get() = when (lang) {
        AppLanguage.CHINESE -> "✓ 连接成功"
        AppLanguage.ENGLISH -> "✓ Connection successful"
        AppLanguage.ARABIC -> "✓ الاتصال ناجح"
    }
    
    val test: String get() = when (lang) {
        AppLanguage.CHINESE -> "测试"
        AppLanguage.ENGLISH -> "Test"
        AppLanguage.ARABIC -> "اختبار"
    }
    
    val savedModels: String get() = when (lang) {
        AppLanguage.CHINESE -> "已保存的模型"
        AppLanguage.ENGLISH -> "Saved Models"
        AppLanguage.ARABIC -> "النماذج المحفوظة"
    }
    
    val configModelCapabilities: String get() = when (lang) {
        AppLanguage.CHINESE -> "配置模型能力标签，用于不同场景"
        AppLanguage.ENGLISH -> "Configure model capability tags for different scenarios"
        AppLanguage.ARABIC -> "تكوين علامات قدرات النموذج لسيناريوهات مختلفة"
    }
    
    val pleaseAddApiKeyFirst: String get() = when (lang) {
        AppLanguage.CHINESE -> "请先添加 API 密钥"
        AppLanguage.ENGLISH -> "Please add API key first"
        AppLanguage.ARABIC -> "يرجى إضافة مفتاح API أولاً"
    }
    
    val noSavedModelsHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "暂无已保存的模型，点击右上角添加"
        AppLanguage.ENGLISH -> "No saved models yet, click top right to add"
        AppLanguage.ARABIC -> "لا توجد نماذج محفوظة بعد، انقر في الأعلى للإضافة"
    }
    
    val defaultLabel: String get() = when (lang) {
        AppLanguage.CHINESE -> "默认"
        AppLanguage.ENGLISH -> "Default"
        AppLanguage.ARABIC -> "افتراضي"
    }
    
    val setAsDefault: String get() = when (lang) {
        AppLanguage.CHINESE -> "设为默认"
        AppLanguage.ENGLISH -> "Set as Default"
        AppLanguage.ARABIC -> "تعيين كافتراضي"
    }
    
    val editApiKey: String get() = when (lang) {
        AppLanguage.CHINESE -> "编辑 API 密钥"
        AppLanguage.ENGLISH -> "Edit API Key"
        AppLanguage.ARABIC -> "تعديل مفتاح API"
    }
    
    val addApiKey: String get() = when (lang) {
        AppLanguage.CHINESE -> "添加 API 密钥"
        AppLanguage.ENGLISH -> "Add API Key"
        AppLanguage.ARABIC -> "إضافة مفتاح API"
    }
    
    val getApiKey: String get() = when (lang) {
        AppLanguage.CHINESE -> "获取 API Key"
        AppLanguage.ENGLISH -> "Get API Key"
        AppLanguage.ARABIC -> "الحصول على مفتاح API"
    }
    
    val openAiCompatibleHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "OpenAI 兼容接口地址"
        AppLanguage.ENGLISH -> "OpenAI compatible endpoint"
        AppLanguage.ARABIC -> "نقطة نهاية متوافقة مع OpenAI"
    }
    
    val sortByName: String get() = when (lang) {
        AppLanguage.CHINESE -> "按名称"
        AppLanguage.ENGLISH -> "By Name"
        AppLanguage.ARABIC -> "حسب الاسم"
    }
    
    val sortByContext: String get() = when (lang) {
        AppLanguage.CHINESE -> "按上下文"
        AppLanguage.ENGLISH -> "By Context"
        AppLanguage.ARABIC -> "حسب السياق"
    }
    
    val sortByPriceLow: String get() = when (lang) {
        AppLanguage.CHINESE -> "价格低到高"
        AppLanguage.ENGLISH -> "Price Low to High"
        AppLanguage.ARABIC -> "السعر من الأقل للأعلى"
    }
    
    val sortByPriceHigh: String get() = when (lang) {
        AppLanguage.CHINESE -> "价格高到低"
        AppLanguage.ENGLISH -> "Price High to Low"
        AppLanguage.ARABIC -> "السعر من الأعلى للأقل"
    }
    
    val addModel: String get() = when (lang) {
        AppLanguage.CHINESE -> "添加模型"
        AppLanguage.ENGLISH -> "Add Model"
        AppLanguage.ARABIC -> "إضافة نموذج"
    }
    
    val addModelFrom: String get() = when (lang) {
        AppLanguage.CHINESE -> "从以下供应商添加模型："
        AppLanguage.ENGLISH -> "Add model from:"
        AppLanguage.ARABIC -> "إضافة نموذج من:"
    }
    
    val orManualInputModelId: String get() = when (lang) {
        AppLanguage.CHINESE -> "或手动输入模型 ID"
        AppLanguage.ENGLISH -> "Or manually input model ID"
        AppLanguage.ARABIC -> "أو أدخل معرف النموذج يدويًا"
    }
    
    val modelIdPlaceholder: String get() = when (lang) {
        AppLanguage.CHINESE -> "例如: gpt-4o-mini"
        AppLanguage.ENGLISH -> "e.g. gpt-4o-mini"
        AppLanguage.ARABIC -> "مثال: gpt-4o-mini"
    }
    
    val capabilityTags: String get() = when (lang) {
        AppLanguage.CHINESE -> "能力标签"
        AppLanguage.ENGLISH -> "Capability Tags"
        AppLanguage.ARABIC -> "علامات القدرات"
    }
    
    val selectCapabilitiesHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择此模型支持的能力"
        AppLanguage.ENGLISH -> "Select capabilities this model supports"
        AppLanguage.ARABIC -> "اختر القدرات التي يدعمها هذا النموذج"
    }
    
    val editModel: String get() = when (lang) {
        AppLanguage.CHINESE -> "编辑模型"
        AppLanguage.ENGLISH -> "Edit Model"
        AppLanguage.ARABIC -> "تعديل النموذج"
    }
    
    val featureSceneConfig: String get() = when (lang) {
        AppLanguage.CHINESE -> "功能场景配置"
        AppLanguage.ENGLISH -> "Feature Scene Config"
        AppLanguage.ARABIC -> "تكوين سيناريو الميزة"
    }
    
    val selectFeaturesForCapability: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择此能力适用的功能场景"
        AppLanguage.ENGLISH -> "Select feature scenes for this capability"
        AppLanguage.ARABIC -> "اختر سيناريوهات الميزات لهذه القدرة"
    }

    // ==================== 主题设置相关字符串 ====================
    
    val animationDisabled: String get() = when (lang) {
        AppLanguage.CHINESE -> "动画已禁用"
        AppLanguage.ENGLISH -> "Animation disabled"
        AppLanguage.ARABIC -> "الرسوم المتحركة معطلة"
    }
    
    val holdToExperience: String get() = when (lang) {
        AppLanguage.CHINESE -> "按住体验"
        AppLanguage.ENGLISH -> "Hold to experience"
        AppLanguage.ARABIC -> "اضغط مع الاستمرار للتجربة"
    }
    
    val enhancedVersion: String get() = when (lang) {
        AppLanguage.CHINESE -> "强化版"
        AppLanguage.ENGLISH -> "Enhanced"
        AppLanguage.ARABIC -> "محسّن"
    }
    
    val primaryColor: String get() = when (lang) {
        AppLanguage.CHINESE -> "主色"
        AppLanguage.ENGLISH -> "Primary"
        AppLanguage.ARABIC -> "اللون الأساسي"
    }
    
    val secondaryColor: String get() = when (lang) {
        AppLanguage.CHINESE -> "次色"
        AppLanguage.ENGLISH -> "Secondary"
        AppLanguage.ARABIC -> "اللون الثانوي"
    }
    
    val accentColor: String get() = when (lang) {
        AppLanguage.CHINESE -> "强调"
        AppLanguage.ENGLISH -> "Accent"
        AppLanguage.ARABIC -> "لون التمييز"
    }
    
    val animationStyle: String get() = when (lang) {
        AppLanguage.CHINESE -> "动画风格"
        AppLanguage.ENGLISH -> "Animation Style"
        AppLanguage.ARABIC -> "نمط الرسوم المتحركة"
    }
    
    val interactionMethod: String get() = when (lang) {
        AppLanguage.CHINESE -> "交互方式"
        AppLanguage.ENGLISH -> "Interaction Method"
        AppLanguage.ARABIC -> "طريقة التفاعل"
    }
    
    val cornerRadius: String get() = when (lang) {
        AppLanguage.CHINESE -> "圆角大小"
        AppLanguage.ENGLISH -> "Corner Radius"
        AppLanguage.ARABIC -> "نصف قطر الزاوية"
    }
    
    val glowEffect: String get() = when (lang) {
        AppLanguage.CHINESE -> "发光效果"
        AppLanguage.ENGLISH -> "Glow Effect"
        AppLanguage.ARABIC -> "تأثير التوهج"
    }
    
    val particleEffect: String get() = when (lang) {
        AppLanguage.CHINESE -> "粒子效果"
        AppLanguage.ENGLISH -> "Particle Effect"
        AppLanguage.ARABIC -> "تأثير الجسيمات"
    }
    
    val glassmorphism: String get() = when (lang) {
        AppLanguage.CHINESE -> "玻璃拟态"
        AppLanguage.ENGLISH -> "Glassmorphism"
        AppLanguage.ARABIC -> "تأثير الزجاج"
    }

    // ==================== BGM 相关字符串 ====================
    
    val bgmTitle: String get() = when (lang) {
        AppLanguage.CHINESE -> "背景音乐"
        AppLanguage.ENGLISH -> "Background Music"
        AppLanguage.ARABIC -> "موسيقى الخلفية"
    }
    
    val bgmDescription: String get() = when (lang) {
        AppLanguage.CHINESE -> "为应用添加背景音乐，支持循环或顺序播放"
        AppLanguage.ENGLISH -> "Add background music to app, supports loop or sequential playback"
        AppLanguage.ARABIC -> "إضافة موسيقى خلفية للتطبيق، يدعم التشغيل المتكرر أو المتسلسل"
    }
    
    val selectedMusicCount: String get() = when (lang) {
        AppLanguage.CHINESE -> "已选 %d 首音乐"
        AppLanguage.ENGLISH -> "%d music selected"
        AppLanguage.ARABIC -> "تم اختيار %d موسيقى"
    }
    
    val loopPlayback: String get() = when (lang) {
        AppLanguage.CHINESE -> "循环播放"
        AppLanguage.ENGLISH -> "Loop Playback"
        AppLanguage.ARABIC -> "تشغيل متكرر"
    }
    
    val sequentialPlayback: String get() = when (lang) {
        AppLanguage.CHINESE -> "顺序播放"
        AppLanguage.ENGLISH -> "Sequential Playback"
        AppLanguage.ARABIC -> "تشغيل متسلسل"
    }
    
    val shufflePlayback: String get() = when (lang) {
        AppLanguage.CHINESE -> "随机播放"
        AppLanguage.ENGLISH -> "Shuffle Playback"
        AppLanguage.ARABIC -> "تشغيل عشوائي"
    }
    
    val volumePercent: String get() = when (lang) {
        AppLanguage.CHINESE -> "音量: %d%%"
        AppLanguage.ENGLISH -> "Volume: %d%%"
        AppLanguage.ARABIC -> "مستوى الصوت: %d%%"
    }
    
    val modifyConfig: String get() = when (lang) {
        AppLanguage.CHINESE -> "修改配置"
        AppLanguage.ENGLISH -> "Modify Config"
        AppLanguage.ARABIC -> "تعديل الإعدادات"
    }

    // ==================== 扩展模块相关字符串 ====================
    
    val extensionModuleTitle: String get() = when (lang) {
        AppLanguage.CHINESE -> "扩展模块"
        AppLanguage.ENGLISH -> "Extension Modules"
        AppLanguage.ARABIC -> "الوحدات الإضافية"
    }
    
    val noModuleSelected: String get() = when (lang) {
        AppLanguage.CHINESE -> "未选择模块"
        AppLanguage.ENGLISH -> "No module selected"
        AppLanguage.ARABIC -> "لم يتم اختيار وحدة"
    }
    
    val modulesSelected: String get() = when (lang) {
        AppLanguage.CHINESE -> "已选择 %d 个模块"
        AppLanguage.ENGLISH -> "%d modules selected"
        AppLanguage.ARABIC -> "تم اختيار %d وحدات"
    }
    
    val addModule: String get() = when (lang) {
        AppLanguage.CHINESE -> "添加模块"
        AppLanguage.ENGLISH -> "Add Module"
        AppLanguage.ARABIC -> "إضافة وحدة"
    }
    
    val extensionModuleHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "扩展模块可以为应用添加自定义功能，如屏蔽元素、深色模式等"
        AppLanguage.ENGLISH -> "Extension modules can add custom features to apps, such as blocking elements, dark mode, etc."
        AppLanguage.ARABIC -> "يمكن للوحدات الإضافية إضافة ميزات مخصصة للتطبيقات، مثل حظر العناصر والوضع الداكن وما إلى ذلك"
    }
    
    val searchModulesPlaceholder: String get() = when (lang) {
        AppLanguage.CHINESE -> "搜索模块..."
        AppLanguage.ENGLISH -> "Search modules..."
        AppLanguage.ARABIC -> "البحث عن الوحدات..."
    }
    
    val filterAll: String get() = when (lang) {
        AppLanguage.CHINESE -> "全部"
        AppLanguage.ENGLISH -> "All"
        AppLanguage.ARABIC -> "الكل"
    }
    
    val filterContent: String get() = when (lang) {
        AppLanguage.CHINESE -> "过滤"
        AppLanguage.ENGLISH -> "Filter"
        AppLanguage.ARABIC -> "تصفية"
    }
    
    val filterStyle: String get() = when (lang) {
        AppLanguage.CHINESE -> "样式"
        AppLanguage.ENGLISH -> "Style"
        AppLanguage.ARABIC -> "النمط"
    }
    
    val filterFunction: String get() = when (lang) {
        AppLanguage.CHINESE -> "功能"
        AppLanguage.ENGLISH -> "Function"
        AppLanguage.ARABIC -> "الوظيفة"
    }
    
    val clearSelection: String get() = when (lang) {
        AppLanguage.CHINESE -> "清空选择"
        AppLanguage.ENGLISH -> "Clear Selection"
        AppLanguage.ARABIC -> "مسح الاختيار"
    }
    
    val quickEnable: String get() = when (lang) {
        AppLanguage.CHINESE -> "快速启用"
        AppLanguage.ENGLISH -> "Quick Enable"
        AppLanguage.ARABIC -> "تمكين سريع"
    }
    
    val shareModule: String get() = when (lang) {
        AppLanguage.CHINESE -> "分享模块"
        AppLanguage.ENGLISH -> "Share Module"
        AppLanguage.ARABIC -> "مشاركة الوحدة"
    }
    
    val onlyEffectiveOnMatchingSites: String get() = when (lang) {
        AppLanguage.CHINESE -> "仅在 %d 个匹配规则的网站生效"
        AppLanguage.ENGLISH -> "Only effective on %d matching sites"
        AppLanguage.ARABIC -> "فعال فقط على %d مواقع مطابقة"
    }

    // ==================== 示例项目相关字符串 ====================
    
    val sampleProjects: String get() = when (lang) {
        AppLanguage.CHINESE -> "示例项目"
        AppLanguage.ENGLISH -> "Sample Projects"
        AppLanguage.ARABIC -> "مشاريع نموذجية"
    }
    
    val quickExperienceFrontend: String get() = when (lang) {
        AppLanguage.CHINESE -> "快速体验前端项目导入"
        AppLanguage.ENGLISH -> "Quick experience frontend project import"
        AppLanguage.ARABIC -> "تجربة سريعة لاستيراد مشروع الواجهة الأمامية"
    }
    
    val quickExperience: String get() = when (lang) {
        AppLanguage.CHINESE -> "快速体验"
        AppLanguage.ENGLISH -> "Quick Experience"
        AppLanguage.ARABIC -> "تجربة سريعة"
    }
    
    val run: String get() = when (lang) {
        AppLanguage.CHINESE -> "运行"
        AppLanguage.ENGLISH -> "Run"
        AppLanguage.ARABIC -> "تشغيل"
    }

    // ==================== 图片处理相关字符串 ====================
    
    val cannotParseImage: String get() = when (lang) {
        AppLanguage.CHINESE -> "无法解析图片"
        AppLanguage.ENGLISH -> "Cannot parse image"
        AppLanguage.ARABIC -> "لا يمكن تحليل الصورة"
    }
    
    val cannotOpenImage: String get() = when (lang) {
        AppLanguage.CHINESE -> "无法打开图片"
        AppLanguage.ENGLISH -> "Cannot open image"
        AppLanguage.ARABIC -> "لا يمكن فتح الصورة"
    }
    
    val loadImageFailed: String get() = when (lang) {
        AppLanguage.CHINESE -> "加载图片失败: %s"
        AppLanguage.ENGLISH -> "Failed to load image: %s"
        AppLanguage.ARABIC -> "فشل تحميل الصورة: %s"
    }
    
    val originalImage: String get() = when (lang) {
        AppLanguage.CHINESE -> "原始图片"
        AppLanguage.ENGLISH -> "Original Image"
        AppLanguage.ARABIC -> "الصورة الأصلية"
    }

    // ==================== 视频处理相关字符串 ====================
    
    val videoFileNotExist: String get() = when (lang) {
        AppLanguage.CHINESE -> "视频文件不存在"
        AppLanguage.ENGLISH -> "Video file does not exist"
        AppLanguage.ARABIC -> "ملف الفيديو غير موجود"
    }
    
    val videoPreview: String get() = when (lang) {
        AppLanguage.CHINESE -> "视频预览"
        AppLanguage.ENGLISH -> "Video Preview"
        AppLanguage.ARABIC -> "معاينة الفيديو"
    }
    
    val selectedDuration: String get() = when (lang) {
        AppLanguage.CHINESE -> "已选择: %.1f 秒"
        AppLanguage.ENGLISH -> "Selected: %.1f seconds"
        AppLanguage.ARABIC -> "المحدد: %.1f ثانية"
    }
    
    val totalDuration: String get() = when (lang) {
        AppLanguage.CHINESE -> "总时长: %.1f 秒"
        AppLanguage.ENGLISH -> "Total duration: %.1f seconds"
        AppLanguage.ARABIC -> "المدة الإجمالية: %.1f ثانية"
    }
    
    val trimRangeHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "裁剪范围（拖动选择播放片段）"
        AppLanguage.ENGLISH -> "Trim range (drag to select playback segment)"
        AppLanguage.ARABIC -> "نطاق القص (اسحب لتحديد مقطع التشغيل)"
    }

    // ==================== APK 导出相关字符串 ====================
    
    val apkExportConfig: String get() = when (lang) {
        AppLanguage.CHINESE -> "APK 导出配置"
        AppLanguage.ENGLISH -> "APK Export Config"
        AppLanguage.ARABIC -> "إعدادات تصدير APK"
    }

    // ==================== HTML 编辑相关字符串 ====================
    
    val encodingAndSize: String get() = when (lang) {
        AppLanguage.CHINESE -> "编码: %s | 大小: %s"
        AppLanguage.ENGLISH -> "Encoding: %s | Size: %s"
        AppLanguage.ARABIC -> "الترميز: %s | الحجم: %s"
    }
    
    val fileLabel: String get() = when (lang) {
        AppLanguage.CHINESE -> "文件: %s"
        AppLanguage.ENGLISH -> "File: %s"
        AppLanguage.ARABIC -> "الملف: %s"
    }
    
    val clickToSelectFile: String get() = when (lang) {
        AppLanguage.CHINESE -> "点击选择文件"
        AppLanguage.ENGLISH -> "Click to select file"
        AppLanguage.ARABIC -> "انقر لاختيار الملف"
    }
    
    val clearFile: String get() = when (lang) {
        AppLanguage.CHINESE -> "清除"
        AppLanguage.ENGLISH -> "Clear"
        AppLanguage.ARABIC -> "مسح"
    }

    // ==================== 主题设置相关字符串（补充） ====================
    
    val selectUiStyleHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "选择界面视觉风格"
        AppLanguage.ENGLISH -> "Select UI visual style"
        AppLanguage.ARABIC -> "اختر نمط واجهة المستخدم المرئي"
    }
    
    val particle: String get() = when (lang) {
        AppLanguage.CHINESE -> "粒子"
        AppLanguage.ENGLISH -> "Particle"
        AppLanguage.ARABIC -> "جسيمات"
    }
    
    val autoSwitchBySystem: String get() = when (lang) {
        AppLanguage.CHINESE -> "根据系统设置自动切换"
        AppLanguage.ENGLISH -> "Auto switch based on system settings"
        AppLanguage.ARABIC -> "التبديل التلقائي بناءً على إعدادات النظام"
    }
    
    val alwaysUseLightTheme: String get() = when (lang) {
        AppLanguage.CHINESE -> "始终使用浅色主题"
        AppLanguage.ENGLISH -> "Always use light theme"
        AppLanguage.ARABIC -> "استخدام السمة الفاتحة دائمًا"
    }
    
    val alwaysUseDarkTheme: String get() = when (lang) {
        AppLanguage.CHINESE -> "始终使用深色主题"
        AppLanguage.ENGLISH -> "Always use dark theme"
        AppLanguage.ARABIC -> "استخدام السمة الداكنة دائمًا"
    }
    
    val interactionStyleLabel: String get() = when (lang) {
        AppLanguage.CHINESE -> "交互风格: %s"
        AppLanguage.ENGLISH -> "Interaction Style: %s"
        AppLanguage.ARABIC -> "نمط التفاعل: %s"
    }
    
    val clickButtonToExperience: String get() = when (lang) {
        AppLanguage.CHINESE -> "点击下方按钮体验效果"
        AppLanguage.ENGLISH -> "Click button below to experience"
        AppLanguage.ARABIC -> "انقر على الزر أدناه للتجربة"
    }

    // ==================== 星期相关字符串 ====================
    
    val dayMon: String get() = when (lang) {
        AppLanguage.CHINESE -> "一"
        AppLanguage.ENGLISH -> "Mon"
        AppLanguage.ARABIC -> "الإثنين"
    }
    
    val dayTue: String get() = when (lang) {
        AppLanguage.CHINESE -> "二"
        AppLanguage.ENGLISH -> "Tue"
        AppLanguage.ARABIC -> "الثلاثاء"
    }
    
    val dayWed: String get() = when (lang) {
        AppLanguage.CHINESE -> "三"
        AppLanguage.ENGLISH -> "Wed"
        AppLanguage.ARABIC -> "الأربعاء"
    }
    
    val dayThu: String get() = when (lang) {
        AppLanguage.CHINESE -> "四"
        AppLanguage.ENGLISH -> "Thu"
        AppLanguage.ARABIC -> "الخميس"
    }
    
    val dayFri: String get() = when (lang) {
        AppLanguage.CHINESE -> "五"
        AppLanguage.ENGLISH -> "Fri"
        AppLanguage.ARABIC -> "الجمعة"
    }
    
    val daySat: String get() = when (lang) {
        AppLanguage.CHINESE -> "六"
        AppLanguage.ENGLISH -> "Sat"
        AppLanguage.ARABIC -> "السبت"
    }
    
    val daySun: String get() = when (lang) {
        AppLanguage.CHINESE -> "日"
        AppLanguage.ENGLISH -> "Sun"
        AppLanguage.ARABIC -> "الأحد"
    }

    // ==================== AI 生成服务相关字符串 ====================
    
    val aiGenerationServiceRunning: String get() = when (lang) {
        AppLanguage.CHINESE -> "AI 生成服务运行中"
        AppLanguage.ENGLISH -> "AI generation service running"
        AppLanguage.ARABIC -> "خدمة توليد الذكاء الاصطناعي قيد التشغيل"
    }
    
    val generatingHtmlCode: String get() = when (lang) {
        AppLanguage.CHINESE -> "正在生成 HTML 代码..."
        AppLanguage.ENGLISH -> "Generating HTML code..."
        AppLanguage.ARABIC -> "جاري إنشاء كود HTML..."
    }
    
    val generatingCodeChars: String get() = when (lang) {
        AppLanguage.CHINESE -> "正在生成代码 (%d 字符)"
        AppLanguage.ENGLISH -> "Generating code (%d chars)"
        AppLanguage.ARABIC -> "جاري إنشاء الكود (%d حرف)"
    }
    
    val newFile: String get() = when (lang) {
        AppLanguage.CHINESE -> "新文件"
        AppLanguage.ENGLISH -> "New file"
        AppLanguage.ARABIC -> "ملف جديد"
    }
    
    val fileCreatedVersion: String get() = when (lang) {
        AppLanguage.CHINESE -> "已创建文件: %s (%s)"
        AppLanguage.ENGLISH -> "File created: %s (%s)"
        AppLanguage.ARABIC -> "تم إنشاء الملف: %s (%s)"
    }
    
    val codeGenerationComplete: String get() = when (lang) {
        AppLanguage.CHINESE -> "代码生成完成"
        AppLanguage.ENGLISH -> "Code generation complete"
        AppLanguage.ARABIC -> "اكتمل إنشاء الكود"
    }
    
    val generationFailed: String get() = when (lang) {
        AppLanguage.CHINESE -> "生成失败: %s"
        AppLanguage.ENGLISH -> "Generation failed: %s"
        AppLanguage.ARABIC -> "فشل الإنشاء: %s"
    }
    
    val generationComplete: String get() = when (lang) {
        AppLanguage.CHINESE -> "生成完成"
        AppLanguage.ENGLISH -> "Generation complete"
        AppLanguage.ARABIC -> "اكتمل الإنشاء"
    }
    
    val generationCancelled: String get() = when (lang) {
        AppLanguage.CHINESE -> "生成已取消"
        AppLanguage.ENGLISH -> "Generation cancelled"
        AppLanguage.ARABIC -> "تم إلغاء الإنشاء"
    }
    
    val aiGenerationService: String get() = when (lang) {
        AppLanguage.CHINESE -> "AI 生成服务"
        AppLanguage.ENGLISH -> "AI Generation Service"
        AppLanguage.ARABIC -> "خدمة توليد الذكاء الاصطناعي"
    }
    
    val aiCodeGenerationNotification: String get() = when (lang) {
        AppLanguage.CHINESE -> "AI 代码生成通知"
        AppLanguage.ENGLISH -> "AI code generation notification"
        AppLanguage.ARABIC -> "إشعار إنشاء كود الذكاء الاصطناعي"
    }

    // ==================== 分享 APK 相关字符串 ====================
    
    val shareApk: String get() = when (lang) {
        AppLanguage.CHINESE -> "分享 APK"
        AppLanguage.ENGLISH -> "Share APK"
        AppLanguage.ARABIC -> "مشاركة APK"
    }
    
    val shareApkBuilding: String get() = when (lang) {
        AppLanguage.CHINESE -> "正在构建 APK..."
        AppLanguage.ENGLISH -> "Building APK..."
        AppLanguage.ARABIC -> "جاري بناء APK..."
    }
    
    val shareApkSuccess: String get() = when (lang) {
        AppLanguage.CHINESE -> "APK 已准备好分享"
        AppLanguage.ENGLISH -> "APK is ready to share"
        AppLanguage.ARABIC -> "APK جاهز للمشاركة"
    }
    
    val shareApkFailed: String get() = when (lang) {
        AppLanguage.CHINESE -> "构建 APK 失败: %s"
        AppLanguage.ENGLISH -> "Failed to build APK: %s"
        AppLanguage.ARABIC -> "فشل بناء APK: %s"
    }
    
    val shareApkTitle: String get() = when (lang) {
        AppLanguage.CHINESE -> "分享 %s 应用"
        AppLanguage.ENGLISH -> "Share %s app"
        AppLanguage.ARABIC -> "مشاركة تطبيق %s"
    }

    // ==================== 强制运行相关字符串 ====================
    
    val forcedRunSettings: String get() = when (lang) {
        AppLanguage.CHINESE -> "强制运行设置"
        AppLanguage.ENGLISH -> "Forced Run Settings"
        AppLanguage.ARABIC -> "إعدادات التشغيل الإجباري"
    }
    
    val enableForcedRun: String get() = when (lang) {
        AppLanguage.CHINESE -> "启用强制运行"
        AppLanguage.ENGLISH -> "Enable Forced Run"
        AppLanguage.ARABIC -> "تمكين التشغيل الإجباري"
    }
    
    val forcedRunHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "在指定时间段内强制运行应用，无法退出"
        AppLanguage.ENGLISH -> "Force app to run during specified time, cannot exit"
        AppLanguage.ARABIC -> "إجبار التطبيق على العمل خلال الوقت المحدد، لا يمكن الخروج"
    }
    
    val forcedRunMode: String get() = when (lang) {
        AppLanguage.CHINESE -> "运行模式"
        AppLanguage.ENGLISH -> "Run Mode"
        AppLanguage.ARABIC -> "وضع التشغيل"
    }
    
    val fixedTimeMode: String get() = when (lang) {
        AppLanguage.CHINESE -> "固定时段"
        AppLanguage.ENGLISH -> "Fixed Time"
        AppLanguage.ARABIC -> "وقت ثابت"
    }
    
    val countdownMode: String get() = when (lang) {
        AppLanguage.CHINESE -> "倒计时"
        AppLanguage.ENGLISH -> "Countdown"
        AppLanguage.ARABIC -> "العد التنازلي"
    }
    
    val durationMode: String get() = when (lang) {
        AppLanguage.CHINESE -> "限时进入"
        AppLanguage.ENGLISH -> "Limited Access"
        AppLanguage.ARABIC -> "وصول محدود"
    }
    
    val fixedTimeModeHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "在固定时间段内强制运行，时间到自动退出"
        AppLanguage.ENGLISH -> "Force run during fixed time period, auto exit when time ends"
        AppLanguage.ARABIC -> "التشغيل الإجباري خلال فترة زمنية محددة، الخروج التلقائي عند انتهاء الوقت"
    }
    
    val countdownModeHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "启动后开始倒计时，时间到自动退出"
        AppLanguage.ENGLISH -> "Start countdown after launch, auto exit when time ends"
        AppLanguage.ARABIC -> "بدء العد التنازلي بعد التشغيل، الخروج التلقائي عند انتهاء الوقت"
    }
    
    val durationModeHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "只能在指定时间段内进入应用，其他时间无法打开"
        AppLanguage.ENGLISH -> "Can only enter app during specified time, cannot open at other times"
        AppLanguage.ARABIC -> "يمكن الدخول للتطبيق فقط خلال الوقت المحدد، لا يمكن الفتح في أوقات أخرى"
    }
    
    val forcedRunStartTime: String get() = when (lang) {
        AppLanguage.CHINESE -> "开始时间"
        AppLanguage.ENGLISH -> "Start Time"
        AppLanguage.ARABIC -> "وقت البدء"
    }
    
    val forcedRunEndTime: String get() = when (lang) {
        AppLanguage.CHINESE -> "结束时间"
        AppLanguage.ENGLISH -> "End Time"
        AppLanguage.ARABIC -> "وقت الانتهاء"
    }
    
    val activeDays: String get() = when (lang) {
        AppLanguage.CHINESE -> "生效日期"
        AppLanguage.ENGLISH -> "Active Days"
        AppLanguage.ARABIC -> "أيام التفعيل"
    }
    
    val countdownDuration: String get() = when (lang) {
        AppLanguage.CHINESE -> "倒计时时长"
        AppLanguage.ENGLISH -> "Countdown Duration"
        AppLanguage.ARABIC -> "مدة العد التنازلي"
    }
    
    val minutes: String get() = when (lang) {
        AppLanguage.CHINESE -> "分钟"
        AppLanguage.ENGLISH -> "minutes"
        AppLanguage.ARABIC -> "دقائق"
    }
    
    val minutesShort: String get() = when (lang) {
        AppLanguage.CHINESE -> "分"
        AppLanguage.ENGLISH -> "min"
        AppLanguage.ARABIC -> "د"
    }
    
    val accessStartTime: String get() = when (lang) {
        AppLanguage.CHINESE -> "可进入开始时间"
        AppLanguage.ENGLISH -> "Access Start Time"
        AppLanguage.ARABIC -> "وقت بدء الوصول"
    }
    
    val accessEndTime: String get() = when (lang) {
        AppLanguage.CHINESE -> "可进入结束时间"
        AppLanguage.ENGLISH -> "Access End Time"
        AppLanguage.ARABIC -> "وقت انتهاء الوصول"
    }
    
    val accessDays: String get() = when (lang) {
        AppLanguage.CHINESE -> "可进入日期"
        AppLanguage.ENGLISH -> "Access Days"
        AppLanguage.ARABIC -> "أيام الوصول"
    }
    
    val blockSystemUI: String get() = when (lang) {
        AppLanguage.CHINESE -> "屏蔽系统UI"
        AppLanguage.ENGLISH -> "Block System UI"
        AppLanguage.ARABIC -> "حظر واجهة النظام"
    }
    
    val blockBackButton: String get() = when (lang) {
        AppLanguage.CHINESE -> "屏蔽返回键"
        AppLanguage.ENGLISH -> "Block Back Button"
        AppLanguage.ARABIC -> "حظر زر الرجوع"
    }
    
    val blockHomeButton: String get() = when (lang) {
        AppLanguage.CHINESE -> "屏蔽Home键"
        AppLanguage.ENGLISH -> "Block Home Button"
        AppLanguage.ARABIC -> "حظر زر الرئيسية"
    }
    
    val showCountdownTimer: String get() = when (lang) {
        AppLanguage.CHINESE -> "显示倒计时"
        AppLanguage.ENGLISH -> "Show Countdown"
        AppLanguage.ARABIC -> "عرض العد التنازلي"
    }
    
    val allowEmergencyExit: String get() = when (lang) {
        AppLanguage.CHINESE -> "允许紧急退出"
        AppLanguage.ENGLISH -> "Allow Emergency Exit"
        AppLanguage.ARABIC -> "السماح بالخروج الطارئ"
    }
    
    val emergencyExitHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "设置密码后可通过密码紧急退出"
        AppLanguage.ENGLISH -> "Set password to allow emergency exit"
        AppLanguage.ARABIC -> "تعيين كلمة مرور للسماح بالخروج الطارئ"
    }
    
    val emergencyPassword: String get() = when (lang) {
        AppLanguage.CHINESE -> "紧急退出密码"
        AppLanguage.ENGLISH -> "Emergency Password"
        AppLanguage.ARABIC -> "كلمة مرور الطوارئ"
    }
    
    val emergencyPasswordHint: String get() = when (lang) {
        AppLanguage.CHINESE -> "输入4-8位数字密码"
        AppLanguage.ENGLISH -> "Enter 4-8 digit password"
        AppLanguage.ARABIC -> "أدخل كلمة مرور من 4-8 أرقام"
    }
    
    val forcedRunWarning: String get() = when (lang) {
        AppLanguage.CHINESE -> "警告：启用强制运行后，应用将在指定时间内无法退出。请确保已设置紧急退出密码以防万一。此功能适用于专注学习、儿童管控等场景。"
        AppLanguage.ENGLISH -> "Warning: After enabling forced run, the app cannot be exited during the specified time. Please set an emergency password just in case. This feature is suitable for focused learning, parental control, etc."
        AppLanguage.ARABIC -> "تحذير: بعد تمكين التشغيل الإجباري، لا يمكن الخروج من التطبيق خلال الوقت المحدد. يرجى تعيين كلمة مرور طوارئ احتياطياً. هذه الميزة مناسبة للتعلم المركز والرقابة الأبوية وما إلى ذلك."
    }
    
    val forcedRunActive: String get() = when (lang) {
        AppLanguage.CHINESE -> "强制运行中"
        AppLanguage.ENGLISH -> "Forced Run Active"
        AppLanguage.ARABIC -> "التشغيل الإجباري نشط"
    }
    
    val cannotExitDuringForcedRun: String get() = when (lang) {
        AppLanguage.CHINESE -> "强制运行期间无法退出"
        AppLanguage.ENGLISH -> "Cannot exit during forced run"
        AppLanguage.ARABIC -> "لا يمكن الخروج أثناء التشغيل الإجباري"
    }
    
    val enterEmergencyPassword: String get() = when (lang) {
        AppLanguage.CHINESE -> "输入紧急退出密码"
        AppLanguage.ENGLISH -> "Enter emergency password"
        AppLanguage.ARABIC -> "أدخل كلمة مرور الطوارئ"
    }
    
    val wrongPassword: String get() = when (lang) {
        AppLanguage.CHINESE -> "密码错误"
        AppLanguage.ENGLISH -> "Wrong password"
        AppLanguage.ARABIC -> "كلمة مرور خاطئة"
    }
    
    val appNotAccessibleNow: String get() = when (lang) {
        AppLanguage.CHINESE -> "当前时间无法进入应用"
        AppLanguage.ENGLISH -> "App not accessible at this time"
        AppLanguage.ARABIC -> "التطبيق غير متاح في هذا الوقت"
    }
    
    val nextAccessTime: String get() = when (lang) {
        AppLanguage.CHINESE -> "下次可进入时间: %s"
        AppLanguage.ENGLISH -> "Next access time: %s"
        AppLanguage.ARABIC -> "وقت الوصول التالي: %s"
    }
    
    // ==================== 黑科技功能 ====================
    val blackTechFeatures: String get() = when (lang) {
        AppLanguage.CHINESE -> "⚡ 黑科技功能"
        AppLanguage.ENGLISH -> "⚡ Advanced Features"
        AppLanguage.ARABIC -> "⚡ ميزات متقدمة"
    }
    
    val blackTechWarning: String get() = when (lang) {
        AppLanguage.CHINESE -> "以下功能可能对设备造成影响，请谨慎使用\n⚠️ 仅部分设备支持，效果因设备而异"
        AppLanguage.ENGLISH -> "The following features may affect the device, use with caution\n⚠️ Only supported on some devices, effects vary"
        AppLanguage.ARABIC -> "قد تؤثر الميزات التالية على الجهاز، استخدمها بحذر\n⚠️ مدعومة فقط على بعض الأجهزة، تختلف النتائج"
    }
    
    val forceMaxVolume: String get() = when (lang) {
        AppLanguage.CHINESE -> "🔊 强制最大音量"
        AppLanguage.ENGLISH -> "🔊 Force Max Volume"
        AppLanguage.ARABIC -> "🔊 فرض أقصى صوت"
    }
    
    val forceMaxVolumeDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "将所有音量调至最大"
        AppLanguage.ENGLISH -> "Set all volumes to maximum"
        AppLanguage.ARABIC -> "ضبط جميع مستويات الصوت على الحد الأقصى"
    }
    
    val forceMaxVibration: String get() = when (lang) {
        AppLanguage.CHINESE -> "📳 强制持续震动"
        AppLanguage.ENGLISH -> "📳 Force Continuous Vibration"
        AppLanguage.ARABIC -> "📳 فرض الاهتزاز المستمر"
    }
    
    val forceMaxVibrationDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "持续最大强度震动"
        AppLanguage.ENGLISH -> "Continuous maximum vibration"
        AppLanguage.ARABIC -> "اهتزاز مستمر بأقصى قوة"
    }
    
    val forceFlashlight: String get() = when (lang) {
        AppLanguage.CHINESE -> "🔦 强制闪光灯"
        AppLanguage.ENGLISH -> "🔦 Force Flashlight"
        AppLanguage.ARABIC -> "🔦 فرض الفلاش"
    }
    
    val forceFlashlightDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "持续开启闪光灯"
        AppLanguage.ENGLISH -> "Keep flashlight on"
        AppLanguage.ARABIC -> "إبقاء الفلاش مضاءً"
    }
    
    val strobeMode: String get() = when (lang) {
        AppLanguage.CHINESE -> "⚡ 爆闪模式"
        AppLanguage.ENGLISH -> "⚡ Strobe Mode"
        AppLanguage.ARABIC -> "⚡ وضع الوميض"
    }
    
    val strobeModeDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "高频闪烁（可能引起不适）"
        AppLanguage.ENGLISH -> "High frequency flashing (may cause discomfort)"
        AppLanguage.ARABIC -> "وميض عالي التردد (قد يسبب إزعاج)"
    }
    
    val forceMaxPerformance: String get() = when (lang) {
        AppLanguage.CHINESE -> "🔥 强制最大性能"
        AppLanguage.ENGLISH -> "🔥 Force Max Performance"
        AppLanguage.ARABIC -> "🔥 فرض أقصى أداء"
    }
    
    val forceMaxPerformanceDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "高CPU占用，耗电发热"
        AppLanguage.ENGLISH -> "High CPU usage, drains battery and heats up"
        AppLanguage.ARABIC -> "استخدام عالي للمعالج، يستنزف البطارية ويسخن"
    }
    
    val forceMuteMode: String get() = when (lang) {
        AppLanguage.CHINESE -> "🔇 强制静音模式"
        AppLanguage.ENGLISH -> "🔇 Force Mute Mode"
        AppLanguage.ARABIC -> "🔇 فرض وضع الصامت"
    }
    
    val forceMuteModeDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "静音所有音频"
        AppLanguage.ENGLISH -> "Mute all audio"
        AppLanguage.ARABIC -> "كتم جميع الأصوات"
    }
    
    val forceBlockVolumeKeys: String get() = when (lang) {
        AppLanguage.CHINESE -> "🔊 屏蔽音量键"
        AppLanguage.ENGLISH -> "🔊 Block Volume Keys"
        AppLanguage.ARABIC -> "🔊 حظر أزرار الصوت"
    }
    
    val forceBlockVolumeKeysDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "禁止调节音量"
        AppLanguage.ENGLISH -> "Disable volume adjustment"
        AppLanguage.ARABIC -> "تعطيل ضبط الصوت"
    }
    
    val forceBlockPowerKey: String get() = when (lang) {
        AppLanguage.CHINESE -> "⚡ 屏蔽电源键"
        AppLanguage.ENGLISH -> "⚡ Block Power Key"
        AppLanguage.ARABIC -> "⚡ حظر زر الطاقة"
    }
    
    val forceBlockPowerKeyDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "需要辅助功能权限"
        AppLanguage.ENGLISH -> "Requires accessibility permission"
        AppLanguage.ARABIC -> "يتطلب إذن إمكانية الوصول"
    }
    
    val forceBlackScreen: String get() = when (lang) {
        AppLanguage.CHINESE -> "⬛ 强制全黑屏"
        AppLanguage.ENGLISH -> "⬛ Force Black Screen"
        AppLanguage.ARABIC -> "⬛ فرض الشاشة السوداء"
    }
    
    val forceBlackScreenDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "屏幕全黑且禁止滑动"
        AppLanguage.ENGLISH -> "Screen goes black and touch disabled"
        AppLanguage.ARABIC -> "الشاشة سوداء واللمس معطل"
    }
    
    val forceScreenRotation: String get() = when (lang) {
        AppLanguage.CHINESE -> "🔄 强制屏幕翻转"
        AppLanguage.ENGLISH -> "🔄 Force Screen Rotation"
        AppLanguage.ARABIC -> "🔄 فرض تدوير الشاشة"
    }
    
    val forceScreenRotationDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "屏幕持续横竖切换"
        AppLanguage.ENGLISH -> "Screen continuously rotates"
        AppLanguage.ARABIC -> "الشاشة تدور باستمرار"
    }
    
    val forceBlockTouch: String get() = when (lang) {
        AppLanguage.CHINESE -> "👆 屏蔽触摸"
        AppLanguage.ENGLISH -> "👆 Block Touch"
        AppLanguage.ARABIC -> "👆 حظر اللمس"
    }
    
    val forceBlockTouchDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "禁止所有触摸操作"
        AppLanguage.ENGLISH -> "Disable all touch operations"
        AppLanguage.ARABIC -> "تعطيل جميع عمليات اللمس"
    }
    
    // 应用伪装功能
    val disguiseAsSystemApp: String get() = when (lang) {
        AppLanguage.CHINESE -> "🛡️ 伪装系统应用"
        AppLanguage.ENGLISH -> "🛡️ Disguise as System App"
        AppLanguage.ARABIC -> "🛡️ التنكر كتطبيق نظام"
    }
    
    val disguiseAsSystemAppDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "伪装为系统应用，无法通过正常方式卸载"
        AppLanguage.ENGLISH -> "Disguise as system app, cannot be uninstalled normally"
        AppLanguage.ARABIC -> "التنكر كتطبيق نظام، لا يمكن إلغاء تثبيته بشكل طبيعي"
    }
    
    val multiLauncherIcons: String get() = when (lang) {
        AppLanguage.CHINESE -> "📱 多桌面图标"
        AppLanguage.ENGLISH -> "📱 Multi Launcher Icons"
        AppLanguage.ARABIC -> "📱 أيقونات متعددة"
    }
    
    val multiLauncherIconsDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "创建多个桌面快捷方式，删除任意一个则全部消失"
        AppLanguage.ENGLISH -> "Create multiple launcher shortcuts, deleting any one removes all"
        AppLanguage.ARABIC -> "إنشاء اختصارات متعددة، حذف أي واحد يزيل الكل"
    }
    
    val multiLauncherIconsCount: String get() = when (lang) {
        AppLanguage.CHINESE -> "图标数量"
        AppLanguage.ENGLISH -> "Icon Count"
        AppLanguage.ARABIC -> "عدد الأيقونات"
    }
    
    val appDisguiseSection: String get() = when (lang) {
        AppLanguage.CHINESE -> "应用伪装"
        AppLanguage.ENGLISH -> "App Disguise"
        AppLanguage.ARABIC -> "تنكر التطبيق"
    }
    
    val blackTechFinalWarning: String get() = when (lang) {
        AppLanguage.CHINESE -> "⚠️ 警告：启用以上功能可能导致设备发热、电量快速消耗等问题。请确保了解风险后再启用。部分功能需要特殊权限才能生效。"
        AppLanguage.ENGLISH -> "⚠️ Warning: Enabling the above features may cause device heating, rapid battery drain, etc. Please understand the risks before enabling. Some features require special permissions to work."
        AppLanguage.ARABIC -> "⚠️ تحذير: قد يؤدي تمكين الميزات أعلاه إلى تسخين الجهاز واستنزاف البطارية بسرعة وما إلى ذلك. يرجى فهم المخاطر قبل التمكين. تتطلب بعض الميزات أذونات خاصة للعمل."
    }
    
    // ==================== 后台运行 ====================
    val backgroundRunTitle: String get() = when (lang) {
        AppLanguage.CHINESE -> "后台运行"
        AppLanguage.ENGLISH -> "Background Run"
        AppLanguage.ARABIC -> "التشغيل في الخلفية"
    }
    
    val backgroundRunDescription: String get() = when (lang) {
        AppLanguage.CHINESE -> "退出应用后继续在后台运行"
        AppLanguage.ENGLISH -> "Keep running in background after exit"
        AppLanguage.ARABIC -> "الاستمرار في العمل في الخلفية بعد الخروج"
    }
    
    val backgroundRunShowNotification: String get() = when (lang) {
        AppLanguage.CHINESE -> "显示通知"
        AppLanguage.ENGLISH -> "Show Notification"
        AppLanguage.ARABIC -> "عرض الإشعار"
    }
    
    val backgroundRunShowNotificationDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "在通知栏显示运行状态"
        AppLanguage.ENGLISH -> "Show running status in notification bar"
        AppLanguage.ARABIC -> "عرض حالة التشغيل في شريط الإشعارات"
    }
    
    val backgroundRunKeepCpuAwake: String get() = when (lang) {
        AppLanguage.CHINESE -> "保持CPU唤醒"
        AppLanguage.ENGLISH -> "Keep CPU Awake"
        AppLanguage.ARABIC -> "إبقاء المعالج نشطًا"
    }
    
    val backgroundRunKeepCpuAwakeDesc: String get() = when (lang) {
        AppLanguage.CHINESE -> "防止系统休眠，保持后台任务运行"
        AppLanguage.ENGLISH -> "Prevent system sleep, keep background tasks running"
        AppLanguage.ARABIC -> "منع سكون النظام والحفاظ على تشغيل المهام في الخلفية"
    }
    
    val backgroundRunNotificationTitle: String get() = when (lang) {
        AppLanguage.CHINESE -> "通知标题"
        AppLanguage.ENGLISH -> "Notification Title"
        AppLanguage.ARABIC -> "عنوان الإشعار"
    }
    
    val backgroundRunNotificationTitlePlaceholder: String get() = when (lang) {
        AppLanguage.CHINESE -> "留空使用默认标题"
        AppLanguage.ENGLISH -> "Leave empty for default title"
        AppLanguage.ARABIC -> "اتركه فارغًا للعنوان الافتراضي"
    }
    
    val backgroundRunNotificationContent: String get() = when (lang) {
        AppLanguage.CHINESE -> "通知内容"
        AppLanguage.ENGLISH -> "Notification Content"
        AppLanguage.ARABIC -> "محتوى الإشعار"
    }
    
    val backgroundRunNotificationContentPlaceholder: String get() = when (lang) {
        AppLanguage.CHINESE -> "留空使用默认内容"
        AppLanguage.ENGLISH -> "Leave empty for default content"
        AppLanguage.ARABIC -> "اتركه فارغًا للمحتوى الافتراضي"
    }
    
    val showAdvanced: String get() = when (lang) {
        AppLanguage.CHINESE -> "显示高级设置"
        AppLanguage.ENGLISH -> "Show Advanced"
        AppLanguage.ARABIC -> "عرض الإعدادات المتقدمة"
    }
    
    val hideAdvanced: String get() = when (lang) {
        AppLanguage.CHINESE -> "隐藏高级设置"
        AppLanguage.ENGLISH -> "Hide Advanced"
        AppLanguage.ARABIC -> "إخفاء الإعدادات المتقدمة"
    }
    
    // ==================== 更新日志 v1.8.0 ====================
    val isolatedBrowserEnvironment: String get() = when (lang) {
        AppLanguage.CHINESE -> "独立浏览器环境：支持指纹伪装、多开隔离"
        AppLanguage.ENGLISH -> "Isolated browser environment: fingerprint spoofing, multi-instance isolation"
        AppLanguage.ARABIC -> "بيئة متصفح معزولة: تزوير البصمات وعزل النسخ المتعددة"
    }
    
    val backgroundRunFeature: String get() = when (lang) {
        AppLanguage.CHINESE -> "后台运行：退出应用后继续在后台运行"
        AppLanguage.ENGLISH -> "Background running: keep running after exit"
        AppLanguage.ARABIC -> "التشغيل في الخلفية: الاستمرار في العمل بعد الخروج"
    }
}


/**
 * Composable 函数用于初始化语言
 */
@Composable
fun InitializeLanguage() {
    val context = LocalContext.current
    val languageManager = remember { LanguageManager.getInstance(context) }
    val language by languageManager.currentLanguageFlow.collectAsState(initial = AppLanguage.CHINESE)
    
    LaunchedEffect(language) {
        Strings.setLanguage(language)
    }
}

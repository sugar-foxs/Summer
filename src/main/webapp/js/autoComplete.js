/**
 * Created by xin on 16-11-3.
 */
$(function() {
    $("#auto-complete-email").completer({
        separator: "@",
        source: ["163.com", "qq.com", "126.com", "139.com", "gmail.com", "hotmail.com", "icloud.com"]
    });
});
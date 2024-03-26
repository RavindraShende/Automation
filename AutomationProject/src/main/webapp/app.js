/**
 * 
 */
 //console.log("HelloWorld");
 //console.warn("this is warnning");
//console.error("this is error");

 Ext.application({
    extends:app.Ext.application,  //extend app.Application class
    requires: ['Ext.container.Viewport', 'app.view.TabView'],   // Define your requirements thats you call in this file
    name: 'app',
    launch: function () {
        Ext.create('Ext.container.Viewport', {
            layout: 'anchor',
            items: [{
                xtype: 'TabView'  //Define your type of component,Its define in alias of TabView class
            }]
        });
    }
});
